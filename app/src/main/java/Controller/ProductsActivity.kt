package Controller

import Adapters.ProductsAdapter
import Model.Product
import Services.DataServices
import Utilities.EXTRA_CATEGORY
import Utilities.EXTRA_PRODUCT
import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import app.coderswag.R
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val catType = intent.getStringExtra(EXTRA_CATEGORY)

        adapter = ProductsAdapter(this, DataServices.getProducts(catType)){ product ->
            val detailsIntent = Intent(this, ProductDetails::class.java)
            //val prodType = DataServices.getProducts(catType)[]
            //detailsIntent.putExtra(EXTRA_CATEGORY, product.title)
            detailsIntent.putExtra(EXTRA_PRODUCT, product)
            startActivity(detailsIntent)
        }

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }
        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720){
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, 2)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter
    }
}

