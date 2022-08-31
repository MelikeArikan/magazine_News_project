package com.melikearikan.newsletter

import android.content.Intent
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.melikearikan.newsletter.haberlerAdapter.*
import kotlinx.android.synthetic.main.haber_kartlari_row.view.*

class haberlerAdapter(var baslik:ArrayList<String>,var aciklama:ArrayList<String>,var gorsel:ArrayList<Int>,var detayResimler:ArrayList<Int>,var haberDetaylari :ArrayList<String>):RecyclerView.Adapter<haberlerVh>(){
    class haberlerVh(itemView: View):RecyclerView.ViewHolder(itemView) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): haberlerVh {

        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.haber_kartlari_row,parent,false)
        return haberlerVh(itemView)
    }

    override fun onBindViewHolder(holder: haberlerVh, position: Int) {
        holder.itemView.kartAdi.text = baslik.get(position)
        holder.itemView.kartAciklama.text = aciklama.get(position)
        holder.itemView.imageView3.setImageResource(gorsel.get(position))
        holder.itemView.setOnClickListener {
            val intent =Intent(holder.itemView.context,detayliHaberler::class.java)
            intent.putExtra("detayResimler",detayResimler.get(position))
            intent.putExtra("baslık",baslik.get(position))
            intent.putExtra("haberDetaylari",haberDetaylari.get(position))
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return gorsel.size
    }


}