package com.google.codelabs.mdc.kotlin.shrine

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * Dekorasi item khusus untuk [ProductGridFragment] [RecyclerView] vertikal. Menambahkan a
 * sejumlah kecil padding di sebelah kiri item grid, dan sejumlah besar padding di sebelah kanan.
 */
class ProductGridItemDecoration(private val largePadding: Int, private val smallPadding: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View,
                                parent: RecyclerView, state: RecyclerView.State) {
        outRect.left = smallPadding
        outRect.right = largePadding
    }
}
