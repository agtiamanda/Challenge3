package com.example.challenge3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataPenumpang(val beratPenumpang:Int,val beratBagasi:Int, val beratKargo: Int): Parcelable{

}
