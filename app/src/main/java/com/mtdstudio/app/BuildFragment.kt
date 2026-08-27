package com.mtdstudio.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class BuildFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val tv = TextView(requireContext())
        tv.text = "🔨 Build APK — GitHub Actions\n\nKlik Actions → Build APK → Run workflow"
        tv.textSize = 20f
        tv.setPadding(40, 80, 40, 40)
        return tv
    }
}
