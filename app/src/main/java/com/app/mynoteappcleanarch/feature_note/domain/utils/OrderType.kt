package com.app.mynoteappcleanarch.feature_note.domain.utils

sealed class OrderType {

    object Ascending : OrderType()
    object Decending : OrderType()


}