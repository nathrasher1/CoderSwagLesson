package Controller

import Adapters.ProductsAdapter
import Services.DataServices
import Utilities.EXTRA_CATEGORY
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

        }

        val layoutManager = GridLayoutManager(this, 2)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter
    }
}