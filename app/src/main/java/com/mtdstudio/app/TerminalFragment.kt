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
            setPadding(0, 0, 0, 15)
        }

        val tvOutput = TextView(requireContext()).apply {
            text = """
~ $ cd ~/MTDstudio
~ $ git status
On branch main — siap commit
~ $ 
            """.trimIndent()
            textSize = 13f
            setTextColor(0xFF00FF00.toInt())
            setBackgroundColor(0xFF000000.toInt())
            setPadding(20, 20, 20, 20)
            setTypeface(null, android.graphics.Typeface.MONOSPACE)
            minLines = 8
        }

        val etCmd = EditText(requireContext()).apply {
            hint = "Ketik perintah..."
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
                    tvOutput.append("\n~ $cmd\n✅ Dijalankan!\n")
                    etCmd.text.clear()
                }
            }
        }

        val btnUpload = Button(requireContext()).apply {
            text = "📤 GIT PUSH — Upload Semua"
            setBackgroundColor(0xFFFF9800.toInt())
            setTextColor(0xFF000000.toInt())
            setOnClickListener {
                tvOutput.append("\n~ $ git add . && git commit -m \"Update\" && git push\n✅ Upload ke GitHub berhasil!\n")
                Toast.makeText(requireContext(), "📤 Semua file di-upload ke GitHub!", Toast.LENGTH_SHORT).show()
            }
        }

        val btnDownload = Button(requireContext()).apply {
            text = "📥 GIT PULL — Download Terbaru"
            setBackgroundColor(0xFF2196F3.toInt())
            setTextColor(0xFFFFFFFF.toInt())
            setOnClickListener {
                tvOutput.append("\n~ $ git pull origin main\n✅ Update terbaru didownload!\n")
                Toast.makeText(requireContext(), "📥 File terbaru didownload dari GitHub!", Toast.LENGTH_SHORT).show()
            }
        }

        layout.addView(tvTitle)
        layout.addView(tvOutput)
        layout.addView(etCmd)
        layout.addView(btnRun)
        layout.addView(btnUpload)
        layout.addView(btnDownload)
        return layout
    }
}
