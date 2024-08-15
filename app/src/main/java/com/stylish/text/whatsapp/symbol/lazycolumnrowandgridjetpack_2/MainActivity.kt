package com.stylish.text.whatsapp.symbol.lazycolumnrowandgridjetpack_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.stylish.text.whatsapp.symbol.lazycolumnrowandgridjetpack_2.ui.theme.LazyColumnRowAndGridJetpack2Theme

class MainActivity : ComponentActivity() {

    companion object{
        fun getListOfItems(): MutableList<item>
        {
            val list = mutableListOf<item>()

            list.add(item("1", R.drawable.a))
            list.add(item("2", R.drawable.a))
            list.add(item("3", R.drawable.a))
            list.add(item("4", R.drawable.a))
            list.add(item("5", R.drawable.a))
            list.add(item("6", R.drawable.a))
            list.add(item("7", R.drawable.a))
            list.add(item("8", R.drawable.a))
            list.add(item("9", R.drawable.a))
            list.add(item("10", R.drawable.a))
            list.add(item("11", R.drawable.a))
            list.add(item("12", R.drawable.a))
            list.add(item("13", R.drawable.a))
            list.add(item("14", R.drawable.a))
            list.add(item("15", R.drawable.a))

            return list
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LazyColumnRowAndGridJetpack2Theme {
                    val navHostController = rememberNavController()
                    NavHost(navController = navHostController, startDestination = "home_screen") {
                        composable("home_screen")
                        {
                            HomeScreen(navHostController = navHostController)
                        }
                        composable("lazy_row_screen"){
                            LazyRowScreen()
                        }
                        composable("lazy_column_screen")
                        {
                            LazyRowColumn()
                        }
                        composable("lazy_grid_screen")
                        {
                            showingLazyGrid()
                        }
                    }

            }
        }
    }
}

@Composable
fun HomeScreen(navHostController: NavHostController)
{
    Column(Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        
        Button(onClick = { navHostController.navigate("lazy_row_screen") }) {
            Text(text = "Lazy Row")
        }
        
        Spacer(modifier = Modifier.height(30.dp)) 
        
        Button(onClick = { navHostController.navigate("lazy_column_screen") }) {
            Text(text = "Lazy Column")
        }
        
        Spacer(modifier = Modifier.height(30.dp))
        
        Button(onClick = {navHostController.navigate("lazy_grid_screen")}) {
            Text(text = "Lazy Grid")
            
        }

    }







}