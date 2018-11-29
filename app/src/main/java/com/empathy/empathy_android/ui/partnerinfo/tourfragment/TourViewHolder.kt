package com.empathy.empathy_android.ui.partnerinfo.tourfragment

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.empathy.empathy_android.repository.model.Tour
import kotlinx.android.synthetic.main.item_tour.view.*

internal class TourViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    init {

    }

    fun bind(tour: Tour) {
        with(itemView) {
            title.text   = tour.title
            address.text = tour.address
        }
    }
}