package com.kou.kokoapermision.permision.builder

interface PermissionListener {
    fun onPermissionGranKokoa()
    fun onPermissionDenied(deniedPermissions: List<String?>?)
}