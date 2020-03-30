package com.darshankomu.covid19.view

import com.darshankomu.covid19.model.Datum
import com.darshankomu.covid19.model.TotalData

interface MainDashboardView {
    fun showLoading()
    fun hideLoading()
    fun getResult(datumModel: List<Datum>)
    fun getAllResult(listTotal: TotalData)
    fun showProgress()
    fun hideProgress()
    fun onRequestSuccess(message: String)
    fun onRequestError(message: String)
}