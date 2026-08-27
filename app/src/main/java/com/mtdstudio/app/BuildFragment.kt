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
            setPadding(40, 60, 40, 40)
            setBackgroundColor(0xFFF5F5F5.toInt())
        }

        val tvTitle = TextView(requireContext()).apply {
            text = "🔨 Build APK — GitHub Actions"
            textSize = 28f
            setTextColor(0xFF6200EE.toInt())
            setPadding(0, 0, 0, 20)
        }

        val tvInfo = TextView(requireContext()).apply {
            text = """
🚀 CARA BUILD APK:
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
1. Buka → GitHub → Actions
2. Pilih → "Build APK"
3. Klik → "Run workflow"
4. Tunggu ± 3 menit
5. Scroll ke bawah → Artifacts
6. Download → app-debug.apk
7. Install → Selesai! ✅

📋 SPESIFIKASI BUILD:
• Gradle: 9.3.1
• Kotlin: 1.9.22
• compileSdk: 34
• minSdk: 24
• targetSdk: 34
• Output: app-debug.apk
            """.trimIndent()
            textSize = 15f
            setLineSpacing(5f, 1f)
        }

        val btnOpen = Button(requireContext()).apply {
            text = "🌐 Buka GitHub Actions"
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
