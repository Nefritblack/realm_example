package com.andrey7mel.realm_examlpe.view.fragments.rx

import com.andrey7mel.realm_examlpe.model.DataObject

interface RxView {
    fun showData(list: List<DataObject>)
    fun showEmpty()
}
