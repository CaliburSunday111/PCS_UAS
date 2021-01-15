package id.uaschrist.livescore.ui.event

import id.uaschrist.livescore.data.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}