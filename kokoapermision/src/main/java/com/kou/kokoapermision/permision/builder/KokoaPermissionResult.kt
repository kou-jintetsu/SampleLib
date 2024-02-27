package com.kou.kokoapermision.permision.builder

import com.kou.kokoapermision.util.ObjectUtils

class KokoaPermissionResult(private val deniedPermissions: List<String>) {
    val isGranKokoa: Boolean

    init {
        isGranKokoa = ObjectUtils.isEmpty(deniedPermissions)
    }
}