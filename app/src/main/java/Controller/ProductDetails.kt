package Controller

import Model.Product
import Utilities.EXTRA_PRODUCT
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import app.coderswag.R
import kotlinx.android.synthetic.main.activity_product_details.*

class ProductDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val resourceId = resources.getIdentifier(
            product?.image,
            "drawable", packageName)
        productImage.setImageResource(resourceId)
        productName.text = product?.title
        productPrice.text = product?.price
        productDescription.text = product?.details

    }

    fun addToCart(view: View) {
        Toast.makeText(this, "This item has been added to your cart.", Toast.LENGTH_SHORT).show()
    }
}