package com.austin.runtimepermission;

import java.util.List;

/**
 * Created by Austin on 2017/1/10.
 */

public interface PermissionListener {
    void onGranted();
    void onDenied(List<String> deniedPermissions);
}
