package com.atifqamar.helloworldndk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.atifqamar.helloworldndk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //call to a native method
        binding.sampleText.text = helloWorld()
    }

    /**
     * A native method that is implemented by the 'helloworldndk' native library,
     * which is packaged with this application.
     */
    external fun helloWorld(): String

    companion object {
        // Used to load the 'helloworldndk' library on application startup.
        init {
            System.loadLibrary("helloworldndk")
        }
    }
}