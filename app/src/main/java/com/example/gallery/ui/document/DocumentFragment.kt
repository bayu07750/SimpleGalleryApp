package com.example.gallery.ui.document

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gallery.databinding.FragmentDocumentBinding

class DocumentFragment : Fragment() {

    private lateinit var binding: FragmentDocumentBinding
    private lateinit var viewModel: DocumentViewModel
    private lateinit var mAdapter: DocumentContainerAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDocumentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DocumentViewModel::class.java]
        mAdapter = DocumentContainerAdapter()

        with(binding.recyclerView) {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext())
            adapter = mAdapter
        }

        viewModel.getDataDocument().observe(viewLifecycleOwner, {
            mAdapter.submitList(it)
        })
    }
}