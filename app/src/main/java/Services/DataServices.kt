package Services

import Model.Category
import Model.Product

object DataServices {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie","$18","hat1", "this is a beanie"),
        Product("Devslopes Hat Black","$20","hat2", "this is a black hat"),
        Product("Devslopes Hat White","$18","hat3", "this is a white hat"),
        Product("Devslopes Hat Snapback","$22","hat4","this is a snapback hat")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$28","hoodie1","this is a gray hoodie"),
        Product("Devslopes Hoodie Red","$30","hoodie2","this is a red hoodie"),
        Product("Devslopes Gray Hoodie","$28","hoodie3","this is a gray hoodie"),
        Product("Devslopes Black Hoodie","$28","hoodie4", "this is a black hoodie")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black","$18","shirt1","this is a black shirt"),
        Product("Devslopes Badge Light Gray","$20","shirt2", "this is a light gray shirt"),
        Product("Devslopes Logo Shirt Red","$22","shirt3","this is a red shirt"),
        Product("Devslopes Hustle","$22","shirt4", "this is a shirt"),
        Product("Kickflip Studios","$18","shirt5","this is also a shirt. I think it has something to do with skateboarding.")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String?) : List<Product> {
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }
//    fun getItem() : Int {
//
//    }
}