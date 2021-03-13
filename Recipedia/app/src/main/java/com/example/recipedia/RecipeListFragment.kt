package com.example.recipedia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class RecipeListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
          // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_recipe_list, container, false)

        return ComposeView(requireContext()).apply {
            setContent {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "This is a Fragment containing list of recipes.",
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        style = TextStyle(fontSize = 24.sp))

                    Spacer(modifier = Modifier.padding(8.dp))

                    // navigation controller - add 'action' from nav_graph in Button click
                    Button(onClick = { findNavController().navigate(R.id.recipeFragment) }) {
                        Text(text = "Show Recipe")
                    }
                }
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