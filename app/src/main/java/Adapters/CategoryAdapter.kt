package Adapters

import Model.Category
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import app.coderswag.R

class CategoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder : ViewHolder
        if (convertView == null){
            //this if statement is creating the view for the first time
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
                // ^^ retrieving and storing the image to be displayed in the view
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
                // ^^ retrieving and storing the text to be displayed in the view
            categoryView.tag = holder
        }else{
            //this recycles views
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }
        val category = categories[position]
            // ^^ tells where to pull item information from
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
            // ^^ sets image to be displayed in view
        holder.categoryName?.text = category.title
            // ^^ sets text to be displayed in view
        return categoryView
    }
    override fun getCount(): Int {
        //this is how many views the adapter will have to create
        return categories.count()
    }
    override fun getItem(position: Int): Any {
        //this is what item is being represented
        return categories[position]
    }
    override fun getItemId(position: Int): Long {
        //this is not needed for this project which is why it is returning zero
        return 0
    }
    private class ViewHolder {
        var categoryImage : ImageView? = null
        var categoryName : TextView? = null
    }
}