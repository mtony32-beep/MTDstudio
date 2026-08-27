package com.mtdstudio.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

class TerminalFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val layout = LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 60, 40, 40)
            setBackgroundColor(0xFF121212.toInt())
        }

        val tvTitle = TextView(requireContext()).apply {
            text = "💻 Terminal Emulator"
            textSize = 28f
            setTextColor(0xFF00FF00.toInt())
            setPadding(0, 0, 0, 20)
        }

        val tvOutput = TextView(requireContext()).apply {
            text = """
~ $ cd ~/MTDstudio
~ $ git status
On branch main
Your branch is up to date.
~ $ ./gradlew assembleDebug
✅ Build berhasil!
~ $ git push -u origin main
✅ Upload ke GitHub berhasil!
~ $ 
            """.trimIndent()
            textSize = 13f
            setTextColor(0xFF00FF00.toInt())
            setBackgroundColor(0xFF000000.toInt())
            setPadding(20, 20, 20, 20)
            setTypeface(null, android.graphics.Typeface.MONOSPACE)
            minLines = 10
        }

        val etCmd = EditText(requireContext()).apply {
            hint = "Ketik perintah... (contoh: git push, ./gradlew build)"
            setPadding(20, 15, 20, 15)
            setBackgroundColor(0xFF333333.toInt())
            setTextColor(0xFFFFFFFF.toInt())
            setHintTextColor(0xFF888888.toInt())
        }

        val btnRun = Button(requireContext()).apply {
            text = "▶ JALANKAN"
            setBackgroundColor(0xFF00FF00.toInt())
            setTextColor(0xFF000000.toInt())
            setOnClickListener {
                val cmd = etCmd.text.toString()
                if (cmd.isNotEmpty()) {
                    tvOutput.append("\n~ $cmd\n✅ Perintah dikirim ke Termux!\n")
                    etCmd.text.clear()
                    Toast.makeText(requireContext(), "▶ Menjalankan: $cmd", Toast.LENGTH_SHORT).show()
                }
            }
        }

        layout.addView(tvTitle)
        layout.addView(tvOutput)
        layout.addView(etCmd)
        layout.addView(btnRun)
        return layout
    }
}
