package com.takasfz.gitcommithash

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.takasfz.gitcommithash.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentMainBinding.inflate(inflater, container!!, false)
        binding.packageInfo = context!!.packageManager.getPackageInfo(context!!.packageName, 0)
        return binding.root
    }
}