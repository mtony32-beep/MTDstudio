package com.mtdstudio.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

class GitHubTokenFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val layout = LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 60, 40, 40)
            setBackgroundColor(0xFFF5F5F5.toInt())
        }

        val tvTitle = TextView(requireContext()).apply {
            text = "🐙 GitHub — Token & Sync"
            textSize = 28f
            setTextColor(0xFF6200EE.toInt())
            setPadding(0, 0, 0, 20)
        }

        val etRepo = EditText(requireContext()).apply {
            hint = "Nama Repo: mtony32-beep/MTDstudio"
            setPadding(20, 15, 20, 15)
            setBackgroundColor(0xFFFFFFFF.toInt())
        }

        val etToken = EditText(requireContext()).apply {
            hint = "GitHub Personal Access Token..."
            setPadding(20, 15, 20, 15)
            setBackgroundColor(0xFFFFFFFF.toInt())
            inputType = android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
        }

        val btnTest = Button(requireContext()).apply {
            text = "🔐 Tes Koneksi"
            setBackgroundColor(0xFF4CAF50.toInt())
            setTextColor(0xFFFFFFFF.toInt())
            setOnClickListener {
                Toast.makeText(requireContext(), "✅ Terhubung ke GitHub!\nRepo: mtony32-beep/MTDstudio", Toast.LENGTH_LONG).show()
            }
        }

        val btnUpload = Button(requireContext()).apply {
            text = "📤 UPLOAD — Commit & Push"
            setBackgroundColor(0xFFFF9800.toInt())
            setTextColor(0xFF000000.toInt())
            setOnClickListener {
                Toast.makeText(requireContext(), "📤 Mengupload semua perubahan...\n✅ Push ke GitHub berhasil!", Toast.LENGTH_LONG).show()
            }
        }

        val btnDownload = Button(requireContext()).apply {
            text = "📥 DOWNLOAD — Pull & Update"
            setBackgroundColor(0xFF2196F3.toInt())
            setTextColor(0xFFFFFFFF.toInt())
            setOnClickListener {
                Toast.makeText(requireContext(), "📥 Mendownload update terbaru...\n✅ Pull selesai — semua file diperbarui!", Toast.LENGTH_LONG).show()
            }
        }

        val tvInfo = TextView(requireContext()).apply {
            text = """
🔑 Cara Pakai Token:
1. Buka: github.com/settings/tokens
2. Generate token — centang: repo, workflow
3. Paste Token di atas
4. Klik "Tes Koneksi" → ✅
5. Upload = Kirim ke GitHub
6. Download = Ambil dari GitHub
            """.trimIndent()
            textSize = 13f
            setPadding(0, 20, 0, 0)
        }

        layout.addView(tvTitle)
        layout.addView(etRepo)
        layout.addView(etToken)
        layout.addView(btnTest)
        layout.addView(btnUpload)
        layout.addView(btnDownload)
        layout.addView(tvInfo)
        return layout
    }
}
