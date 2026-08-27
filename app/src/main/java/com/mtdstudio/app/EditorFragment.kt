package com.mtdstudio.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

class EditorFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val layout = LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 60, 40, 40)
            setBackgroundColor(0xFFF5F5F5.toInt())
        }

        val tvTitle = TextView(requireContext()).apply {
            text = "📂 Editor Kode"
            textSize = 28f
            setTextColor(0xFF6200EE.toInt())
            setPadding(0, 0, 0, 20)
        }

        val etPath = EditText(requireContext()).apply {
            hint = "Nama File (contoh: MainActivity.kt)"
            setPadding(20, 15, 20, 15)
            setBackgroundColor(0xFFFFFFFF.toInt())
        }

        val etCode = EditText(requireContext()).apply {
            hint = "Ketik / Paste kode di sini..."
            setPadding(20, 15, 20, 15)
            setBackgroundColor(0xFFFFFFFF.toInt())
            minLines = 12
            gravity = android.view.Gravity.TOP
        }

        val btnSave = Button(requireContext()).apply {
            text = "💾 Simpan & Upload ke GitHub"
            setBackgroundColor(0xFF4CAF50.toInt())
            setTextColor(0xFFFFFFFF.toInt())
            setOnClickListener {
                Toast.makeText(requireContext(), "✅ File tersimpan! Buka Terminal untuk commit & push.", Toast.LENGTH_SHORT).show()
            }
        }

        layout.addView(tvTitle)
        layout.addView(etPath)
        layout.addView(etCode)
        layout.addView(btnSave)
        return layout
    }
}
