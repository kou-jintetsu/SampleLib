package com.kou.samplelib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kou.kokoapermision.KokoaPermission
import com.kou.kokoapermision.permision.builder.PermissionListener
import com.kou.mylibrary.ShowLib

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val permissionListener = object : PermissionListener {
            override fun onPermissionGranKokoa() {
                ShowLib.shortToast(this@MainActivity, "onPermissionGranKokoa")
            }

            override fun onPermissionDenied(deniedPermissions: List<String?>?) {
                ShowLib.shortToast(this@MainActivity, "onPermissionDenied")
            }
        }

        KokoaPermission.create()
            .setPermissionListener(permissionListener)
            .setDeniedMessage("If you reject permission,you can not use this service\n\nPlease turn on permissions at [Setting] > [Permission]")
            .setPermissions(
                android.Manifest.permission.WRITE_EXTERNAL_STORAGE,
                android.Manifest.permission.ACCESS_FINE_LOCATION
            ).check()

    }
}