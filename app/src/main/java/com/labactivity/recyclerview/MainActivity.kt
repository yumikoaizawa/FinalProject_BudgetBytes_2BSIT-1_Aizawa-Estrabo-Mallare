package com.labactivity.recyclerview

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.labactivity.recyclerview.databinding.ActivityMainBinding
import com.labactivity.recyclerview.RecipeAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var recipeList: ArrayList<Recipe>
    private lateinit var recipeAdapter: RecipeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recipeList = ArrayList()
        init()

        binding.userbtn.setOnClickListener {
            val intent = Intent(this, AdminProfile::class.java)
            startActivity(intent)
            Log.d("MainActivity", "AdminProfile activity started successfully")
        }
    }

    private fun init() {
        binding.recipeRecyclerview.setHasFixedSize(true)
        binding.recipeRecyclerview.layoutManager = GridLayoutManager(this, 2)

        recipeList = ArrayList()
        addDataToList()
        recipeAdapter = RecipeAdapter(this, recipeList)
        binding.recipeRecyclerview.adapter = recipeAdapter
    }

    private fun addDataToList() {
        recipeList.add(Recipe(R.drawable.lunch_tunasisig, "Tuna Sisig"))
        recipeList.add(Recipe(R.drawable.dinner_crabcorn_soup, "Crab and Corn Soup"))
        recipeList.add(Recipe(R.drawable.bfast_scrambledeggwtomatoes, "Scrambled Egg with Tomatoes"))
        recipeList.add(Recipe(R.drawable.dinner_ginisangsardinas, "Ginisang Sardinas"))
        recipeList.add(Recipe(R.drawable.snack_potatofritters, "Potato Fritters"))
        recipeList.add(Recipe(R.drawable.bfast_tinaparice, "Tinapa Fried Rice"))
        recipeList.add(Recipe(R.drawable.snack_toast, "French Toast"))
        recipeList.add(Recipe(R.drawable.snack_graham, "Graham Balls"))
        recipeList.add(Recipe(R.drawable.lunch_tortangtalong, "Tortang Talong"))
        recipeList.add(Recipe(R.drawable.dinner_pasta, "Tuna Pasta"))
        recipeList.add(Recipe(R.drawable.lunch_tofu, "Stir Fry Tofu"))
        recipeList.add(Recipe(R.drawable.snack_turon, "Turon"))
        recipeList.add(Recipe(R.drawable.bfast_friedrice, "Egg Fried Rice"))
        recipeList.add(Recipe(R.drawable.lunch_malunggay_soup, "Malunggay Soup"))
        recipeList.add(Recipe(R.drawable.dinner_ginisangrepolyo, "Ginisang Repolyo"))
        recipeList.add(Recipe(R.drawable.bfast_ginilingnamais, "Corned Beef with Corn"))
    }

}
