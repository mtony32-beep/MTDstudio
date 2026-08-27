package com.mtdstudio.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment

class EditorFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val layout = LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 80, 40, 40)
            setBackgroundColor(0xFFF5F5F5.toInt())
        }

        val tvTitle = TextView(requireContext()).apply {
            text = "📂 Editor Kode"
            textSize = 28f
            setTextColor(0xFF6200EE.toInt())
            setPadding(0, 0, 0, 20)
        }

        val tvInfo = TextView(requireContext()).apply {
            text = "Fitur Editor:\n\n✅ Buka file .kt / .java / .xml\n✅ Edit & Simpan\n✅ Syntax Highlighting\n✅ Auto-Save\n\nFitur sedang dikembangkan...\n\nSilakan kembali ke Beranda."
            textSize = 16f
            setLineSpacing(4f, 1f)
        }

        layout.addView(tvTitle)
        layout.addView(tvInfo)
        return layout
    }
}
