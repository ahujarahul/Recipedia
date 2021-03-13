package com.example.recipedia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.Text
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment

class RecipeListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
          // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_recipe_list, container, false)

        return ComposeView(requireContext()).apply {
            setContent {
                Text(text = "This is a Fragment containing list of recipes.")
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String? = null, param2: String? = null) =
            RecipeListFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}