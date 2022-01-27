package Adapters

import Model.Category
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getItem(position: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

    }
}