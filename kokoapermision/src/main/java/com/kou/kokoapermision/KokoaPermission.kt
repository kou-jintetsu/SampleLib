package com.kou.kokoapermision

import com.kou.kokoapermision.permision.builder.PermissionBuilder


object KokoaPermission {
    val TAG = KokoaPermission::class.java.simpleName
    fun create(): Builder {
        return Builder()
    }

    class Builder : PermissionBuilder<Builder>() {
        fun check() {
            checkPermissions()
        }
    }
}