package com.mtdstudio.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment

class GithubFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val layout = LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 80, 40, 40)
            setBackgroundColor(0xFFF5F5F5.toInt())
        }

        val tvTitle = TextView(requireContext()).apply {
            text = "🐙 GitHub Sync"
            textSize = 28f
            setTextColor(0xFF6200EE.toInt())
            setPadding(0, 0, 0, 20)
        }

        val tvInfo = TextView(requireContext()).apply {
            text = "Informasi Repositori:\n\n📌 Nama: MTDstudio\n👤 Pemilik: mtony32-beep\n🌐 Status: Public\n📝 Branch: main\n📦 Total Commit: 40+\n\nFitur:\n✅ Sync Otomatis\n✅ Commit & Push\n✅ Pull & Merge\n✅ Lihat Log Perubahan\n\nBuka di browser:\ngithub.com/mtony32-beep/MTDstudio"
            textSize = 16f
            setLineSpacing(4f, 1f)
        }

        layout.addView(tvTitle)
        layout.addView(tvInfo)
        return layout
    }
}
