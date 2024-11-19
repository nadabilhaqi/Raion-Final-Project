package com.bilhaqi.raionfinalproject

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
@Preview
fun AppScreen() {
    val productList = listOf(
        ProductObject.smartPhone,
        ProductObject.laptop,
        ProductObject.wirelessEarbuds,
        ProductObject.smartwatch,
        ProductObject.gamingChair,
        ProductObject.bluetoothSpeaker,
        ProductObject.headphones,
        ProductObject.electricKettle,
        ProductObject.airFryer,
        ProductObject.homeRouter
    )
    LazyVerticalGrid(
        modifier = Modifier
            .background(Color.White),
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(20.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        items(productList) { ProductEntity ->
            ProductCard(ProductEntity)
        }
    }
}