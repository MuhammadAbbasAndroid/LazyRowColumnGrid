package com.stylish.text.whatsapp.symbol.lazycolumnrowandgridjetpack_2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
@Preview(showSystemUi = true)
fun showingLazyGrid()
{
    LazyVerticalGrid(columns = GridCells.Fixed(2)
    , contentPadding = PaddingValues(16.dp, 16.dp)
    ) {

        itemsIndexed(MainActivity.getListOfItems()){
            index: Int, item: item ->  
            lazyGridItem(item = item)
        }
    }
}


@Composable
fun lazyGridItem(item: item)
{
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .height(250.dp)
            .width(200.dp)
            .padding(8.dp)) {

        Image(painter = painterResource(id = item.img) , contentDescription = item.name,
            Modifier
                .size(200.dp)
                .clip(RoundedCornerShape(30.dp))
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        
        Spacer(modifier = Modifier.height(10.dp))
        
        Text(text = item.name, fontWeight = FontWeight.SemiBold)


    }
}




