package com.labactivity.recyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.labactivity.recyclerview.databinding.ListBinding

class RecipeAdapter(private val context: Context, private val recipeList: ArrayList<Recipe>) :
    RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {

    inner class RecipeViewHolder(private val binding: ListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(recipe: Recipe) {
            binding.foodImg.setImageResource(recipe.image)
            binding.questionTxt.text = recipe.name

            binding.root.setOnClickListener {
                val intent = Intent(context, PreviewRecipe::class.java).apply {
                    putExtra("recipe_name", recipe.name)
                }
                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListBinding.inflate(inflater, parent, false)
        return RecipeViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return recipeList.size
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bind(recipeList[position])
    }
}
