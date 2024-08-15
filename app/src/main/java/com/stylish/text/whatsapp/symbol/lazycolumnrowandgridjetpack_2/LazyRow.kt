package com.stylish.text.whatsapp.symbol.lazycolumnrowandgridjetpack_2

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun LazyRowScreen()
{
    LazyRow(modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        itemsIndexed(MainActivity.getListOfItems()){index, item ->
            RowItem(item)
        }
    }


}

@Composable
fun RowItem(item: item)
{
    Column(modifier = Modifier
        .height(350.dp)
        .width(200.dp)
        .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            modifier = Modifier
                .height(300.dp)
                .fillMaxWidth().clip(RoundedCornerShape(30.dp)),
            painter = painterResource(item.img),
            contentDescription = item.name,
            contentScale = ContentScale.Crop )

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = item.name)


    }
}
