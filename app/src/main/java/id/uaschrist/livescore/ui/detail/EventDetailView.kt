package id.uaschrist.livescore.ui.detail


import id.uaschrist.livescore.data.model.EventDetail

interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showEventDetail(data: List<EventDetail>)
}