package com.labactivity.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.recyclerview.databinding.ActivityPreviewRecipeBinding

class PreviewRecipe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPreviewRecipeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recipeName = intent.getStringExtra("recipe_name")
        val layoutId = getLayoutIdForRecipe(recipeName)
        layoutId?.let {
            setContentView(it)
        }
    }

    private fun getLayoutIdForRecipe(recipeName: String?): Int? {
        return when (recipeName) {
            "Egg Fried Rice" -> R.layout.activity_preview_recipe
            "Corned Beef with Corn" -> R.layout.activity_preview_bfast4
            "Scrambled Egg with Tomatoes" -> R.layout.activity_preview_bfast3
            "Tinapa Fried Rice" -> R.layout.activity_preview_bfast2
            "Malunggay Soup" -> R.layout.activity_preview_lunch2
            "Stir Fry Tofu" -> R.layout.activity_preview_lunch4
            "Tortang Talong" -> R.layout.activity_preview_lunch1
            "Tuna Sisig" -> R.layout.activity_preview_lunch3
            "Tuna Pasta" -> R.layout.activity_preview_dinner4
            "Crab and Corn Soup" -> R.layout.activity_preview_dinner1
            "Ginisang Repolyo" -> R.layout.activity_preview_dinner3
            "Ginisang Sardinas" -> R.layout.activity_preview_dinner2
            "French Toast" -> R.layout.activity_preview_snack4
            "Graham Balls" -> R.layout.activity_preview_snack1
            "Potato Fritters" -> R.layout.activity_preview_snack2
            "Turon" -> R.layout.activity_preview_snack3
            else -> null
        }
    }
}
