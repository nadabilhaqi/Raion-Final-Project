package com.bilhaqi.raionfinalproject

data class ProductEntity(
    val imgURL: String,
    val name: String,
    val rating: Double
)

object ProductObject {
    val smartPhone = ProductEntity(
        imgURL = "https://static.retailworldvn.com/Products/Images/12220/299344/smartphone-iphone-12-4gb-64gb-black-3.jpg",
        name = "Smartphone",
        rating = 4.8
    )
    val laptop = ProductEntity(
        imgURL = "https://images.tokopedia.net/img/cache/700/VqbcmM/2022/10/24/a09a8fac-e48e-46e0-ae52-24de84d74257.jpg",
        name = "Laptop",
        rating = 4.5
    )
    val wirelessEarbuds = ProductEntity(
        imgURL = "https://m.media-amazon.com/images/I/51fkoZe-K6L.jpg",
        name = "Wireless Earbuds",
        rating = 4.7
    )
    val smartwatch = ProductEntity(
        imgURL = "https://media.dinomarket.com/docs/imgTD/2023-12/_SMine_6CB1B37BB083A22BD4FC16FB4268FED4_151223151215_ll.jpg",
        name = "Smartwatch",
        rating = 4.6
    )
    val gamingChair = ProductEntity(
        imgURL = "https://rexus.id/cdn/shop/files/Daxa_Elco_One_3_bed335c3-d045-4820-ac89-d1313adf853d.png?v=1721979380",
        name = "Gaming Chair",
        rating = 4.4
    )
    val bluetoothSpeaker = ProductEntity(
        imgURL = "https://electroniquehifi.ca/cdn/shop/files/498729_5_800x.jpg?v=1694543017",
        name = "Bluetooth Speaker",
        rating = 4.2
    )
    val headphones = ProductEntity(
        imgURL = "https://cworld.id/wp-content/uploads/2023/10/jbl_tune_510bt_blue_1.jpg",
        name = "Headphones",
        rating = 4.3
    )
    val electricKettle = ProductEntity(
        imgURL = "https://myhartono.com/images/detailed/376/HD9303-03.jpg",
        name = "Electric Kettle",
        rating = 4.0
    )
    val airFryer = ProductEntity(
        imgURL = "https://milex.co.za/cdn/shop/products/Untitleddesign_86_1300x.png?v=1702907271",
        name = "Air Fryer",
        rating = 4.7
    )
    val homeRouter = ProductEntity(
        imgURL = "https://www.smartfren.com/app/uploads/2023/06/Home-Router-TP-Link-eShop-Image.jpg",
        name = "Home Router",
        rating = 4.6
    )
}