package com.mtdstudio.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment

class BuildFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val layout = LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 80, 40, 40)
            setBackgroundColor(0xFFF5F5F5.toInt())
        }

        val tvTitle = TextView(requireContext()).apply {
            text = "🔨 Build APK"
            textSize = 28f
            setTextColor(0xFF6200EE.toInt())
            setPadding(0, 0, 0, 20)
        }

        val tvInfo = TextView(requireContext()).apply {
            text = "Cara Membangun APK:\n\n1. Buka GitHub → Actions\n2. Pilih 'Build APK'\n3. Klik 'Run workflow'\n4. Tunggu ±3 menit\n5. Download app-debug.apk\n\nSpesifikasi:\n✅ Gradle 9.3.1\n✅ Kotlin 1.9.22\n✅ compileSdk 34\n✅ minSdk 24\n✅ targetSdk 34"
            textSize = 16f
            setLineSpacing(4f, 1f)
            setPadding(0, 0, 0, 30)
        }

        val btnOpen = Button(requireContext()).apply {
            text = "🚀 Buka GitHub Actions"
            setBackgroundColor(0xFFFF9800.toInt())
            setTextColor(0xFF000000.toInt())
            setPadding(30, 20, 30, 20)
        }

        layout.addView(tvTitle)
        layout.addView(tvInfo)
        layout.addView(btnOpen)
        return layout
    }
}
