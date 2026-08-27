package com.mtdstudio.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val layout = LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 60, 40, 40)
            setBackgroundColor(0xFFF5F5F5.toInt())
        }

        val tvTitle = TextView(requireContext()).apply {
            text = "🏆 MTDstudio v1.0"
            textSize = 28f
            setTextColor(0xFF6200EE.toInt())
            setPadding(0, 0, 0, 15)
        }

        val tvSpec = TextView(requireContext()).apply {
            text = """
📋 SPESIFIKASI LENGKAP:
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
• Bahasa: Kotlin 1.9.22
• Gradle: 9.3.1
• Android Plugin: 8.3.0
• compileSdk: 34
• minSdk: 24 (Android 7.0+)
• targetSdk: 34 (Android 14)
• UI: Material3 — Bottom Navigation
• Arsitektur: Single Activity + 6 Fragment
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

📱 FITUR LENGKAP:
• 🏠 Beranda — Spesifikasi & Info
• 📂 Edit Kode — Editor file
• 🤖 AI Gemini — Auto-Fix via AI
• 🐙 GitHub Token — Sync & Commit
• 💻 Terminal — Emulator Termux
• 🔨 Build APK — GitHub Actions
            """.trimIndent()
            textSize = 15f
            setLineSpacing(5f, 1f)
        }

        layout.addView(tvTitle)
        layout.addView(tvSpec)
        return layout
    }
}
