package com.example.jagrukjanta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.camera.core.ImageCapture
import androidx.camera.view.CameraController
import androidx.camera.view.LifecycleCameraController
import com.example.jagrukjanta.databinding.ActivityMainBinding

class cameraPage : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding
//    If using cameraController
    private lateinit var CameraController : LifecycleCameraController
//    If using cameraProvider
    private var imageCapture: ImageCapture? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera_page)
    }
}