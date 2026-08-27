package com.mtdstudio.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val tv = TextView(requireContext())
        tv.text = "🏆 MTDstudio v1.0\n\n✅ Berhasil Dibuka!\n\nSiap digunakan."
        tv.textSize = 20f
        tv.setPadding(40, 80, 40, 40)
        return tv
    }
}
