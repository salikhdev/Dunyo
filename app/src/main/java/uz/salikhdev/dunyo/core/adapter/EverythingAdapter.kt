package uz.salikhdev.dunyo.core.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import uz.salikhdev.dunyo.R
import uz.salikhdev.dunyo.core.model.Article
import uz.salikhdev.dunyo.databinding.ItemBottomBinding

class EverythingAdapter : RecyclerView.Adapter<EverythingAdapter.ViewHolder>() {

    private val data = ArrayList<Article>()

    fun setData(data: List<Article>) {
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ItemBottomBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindData(article: Article) {

            binding.image.load(article.urlToImage) {
                placeholder(R.drawable.placeholder)
                error(R.drawable.placeholder)
            }
            binding.type.text = article.author
            binding.title.text = article.title

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemBottomBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(data[position])
    }
}