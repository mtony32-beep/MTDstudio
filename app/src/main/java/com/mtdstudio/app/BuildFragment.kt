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
🚀 CARA BUILD & DOWNLOAD APK:
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
1. Klik → "🔨 MULAI BUILD"
2. Buka GitHub → Actions → Build APK
3. Tunggu ± 3 menit sampai selesai
4. Scroll ke bawah → bagian Artifacts
5. Klik → app-debug.apk
6. File otomatis terdownload!
7. Install → Selesai! ✅

📋 SPESIFIKASI:
• Gradle: 9.3.1 | Kotlin: 1.9.22
• compileSdk: 34 | minSdk: 24
• Output: app-debug.apk (~20MB)
            """.trimIndent()
            textSize = 15f
            setLineSpacing(5f, 1f)
        }

        val btnBuild = Button(requireContext()).apply {
            text = "🔨 MULAI BUILD APK"
            setBackgroundColor(0xFFFF9800.toInt())
            setTextColor(0xFF000000.toInt())
            setPadding(30, 20, 30, 20)
            setOnClickListener {
                Toast.makeText(requireContext(), "🔨 Build dimulai!\nBuka GitHub → Actions untuk melihat proses...", Toast.LENGTH_LONG).show()
            }
        }

        val btnDownload = Button(requireContext()).apply {
            text = "📥 DOWNLOAD APK TERBARU"
            setBackgroundColor(0xFF4CAF50.toInt())
            setTextColor(0xFFFFFFFF.toInt())
            setPadding(30, 20, 30, 20)
            setOnClickListener {
                Toast.makeText(requireContext(), "📥 Membuka halaman download...\n→ GitHub → Actions → Artifacts → app-debug.apk", Toast.LENGTH_LONG).show()
            }
        }

        layout.addView(tvTitle)
        layout.addView(tvInfo)
        layout.addView(btnBuild)
        layout.addView(btnDownload)
        return layout
    }
}
