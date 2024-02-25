package com.kou.kokoapermision.permision.builder

import com.kou.kokoapermision.util.ObjectUtils

class KokoaPermissionResult(val deniedPermissions: List<String>) {
    val isGranKokoa: Boolean

    init {
        isGranKokoa = ObjectUtils.isEmpty(deniedPermissions)
    }
}