package com.mtdstudio.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val layout = LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 80, 40, 40)
            setBackgroundColor(0xFFF5F5F5.toInt())
        }

        val tvTitle = TextView(requireContext()).apply {
            text = "🏆 MTDstudio"
            textSize = 28f
            setTextColor(0xFF6200EE.toInt())
            setPadding(0, 0, 0, 10)
        }

        val tvSub = TextView(requireContext()).apply {
            text = "Selamat Datang di Aplikasi Pembuat APK\n100% Kotlin — Siap Digunakan!"
            textSize = 16f
            setPadding(0, 0, 0, 40)
        }

        val btnEditor = Button(requireContext()).apply {
            text = "📂 Buka Editor Kode"
            setBackgroundColor(0xFF6200EE.toInt())
            setTextColor(0xFFFFFFFF.toInt())
            setPadding(30, 20, 30, 20)
            setOnClickListener {
                parentFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, EditorFragment())
                    .commit()
            }
        }

        val btnGitHub = Button(requireContext()).apply {
            text = "🐙 Buka GitHub"
            setBackgroundColor(0xFF03DAC6.toInt())
            setTextColor(0xFF000000.toInt())
            setPadding(30, 20, 30, 20)
            setOnClickListener {
                parentFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, GithubFragment())
                    .commit()
            }
        }

        val btnBuild = Button(requireContext()).apply {
            text = "🔨 Mulai Build APK"
            setBackgroundColor(0xFFFF9800.toInt())
            setTextColor(0xFF000000.toInt())
            setPadding(30, 20, 30, 20)
            setOnClickListener {
                parentFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, BuildFragment())
                    .commit()
            }
        }

        layout.addView(tvTitle)
        layout.addView(tvSub)
        layout.addView(btnEditor)
        layout.addView(btnGitHub)
        layout.addView(btnBuild)
        return layout
    }
}
