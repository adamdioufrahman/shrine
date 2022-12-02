package com.google.codelabs.mdc.kotlin.shrine

import androidx.fragment.app.Fragment


/**
 * Host (biasanya `Activity`} yang dapat menampilkan fragmen dan mengetahui cara merespons
 * acara navigasi.
 */
interface NavigationHost {
    /**
     * Memicu navigasi ke fragmen yang ditentukan, secara opsional menambahkan transaksi ke belakang
     * susun untuk membuat navigasi ini dapat dibalik.
     */
    fun navigateTo(fragment: Fragment, addToBackstack: Boolean)
}
