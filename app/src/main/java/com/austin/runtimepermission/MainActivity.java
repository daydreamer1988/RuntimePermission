package com.austin.runtimepermission;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeCall(View view) {
        String[] permissions = new String[]{Manifest.permission.CALL_PHONE, Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.CAMERA};
        
        requestRuntimePermission(permissions, new PermissionListener() {
            @Override
            public void onGranted() {
                Toast.makeText(MainActivity.this, "all granted", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onDenied(List<String> deniedPermissions) {

                for (int i = 0; i < deniedPermissions.size(); i++) {
                    Toast.makeText(MainActivity.this, deniedPermissions.get(i) + "被拒绝" +
                            "", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }



}
