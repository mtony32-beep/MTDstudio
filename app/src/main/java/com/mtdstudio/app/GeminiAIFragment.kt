package com.mtdstudio.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

class GeminiAIFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val layout = LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 60, 40, 40)
            setBackgroundColor(0xFFF5F5F5.toInt())
        }

        val tvTitle = TextView(requireContext()).apply {
            text = "🤖 AI Gemini — Auto-Fix Kode"
            textSize = 28f
            setTextColor(0xFF6200EE.toInt())
            setPadding(0, 0, 0, 20)
        }

        val etToken = EditText(requireContext()).apply {
            hint = "Masukkan API Key Gemini..."
            setPadding(20, 15, 20, 15)
            setBackgroundColor(0xFFFFFFFF.toInt())
            inputType = android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
        }

        val etError = EditText(requireContext()).apply {
            hint = "Paste pesan error / masalah di sini..."
            setPadding(20, 15, 20, 15)
            setBackgroundColor(0xFFFFFFFF.toInt())
            minLines = 5
        }

        val btnFix = Button(requireContext()).apply {
            text = "🔍 AI Perbaiki Otomatis → GitHub"
            setBackgroundColor(0xFF2196F3.toInt())
            setTextColor(0xFFFFFFFF.toInt())
            setOnClickListener {
                Toast.makeText(requireContext(), "🤖 AI sedang menganalisis...\nHasil akan dikirim ke GitHub!", Toast.LENGTH_LONG).show()
            }
        }

        val tvInfo = TextView(requireContext()).apply {
            text = """
💡 Cara Pakai:
1. Dapatkan API Key di: aistudio.google.com
2. Masukkan Key di atas
3. Paste pesan error / log build
4. Klik tombol → AI akan perbaiki kode
5. Otomatis update file di GitHub!
            """.trimIndent()
            textSize = 13f
            setPadding(0, 20, 0, 0)
        }

        layout.addView(tvTitle)
        layout.addView(etToken)
        layout.addView(etError)
        layout.addView(btnFix)
        layout.addView(tvInfo)
        return layout
    }
}
