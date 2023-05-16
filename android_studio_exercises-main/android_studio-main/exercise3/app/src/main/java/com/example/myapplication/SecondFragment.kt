package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = listOf(ItemList(R.string.hello), ItemList(R.string.world),
            ItemList(R.string.banana), ItemList(R.string.strawberry), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple), ItemList(R.string.apple))
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = ListAdapter(list)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}