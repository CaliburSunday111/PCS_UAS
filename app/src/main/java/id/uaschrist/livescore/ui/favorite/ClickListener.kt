package id.uaschrist.livescore.ui.favorite

import id.uaschrist.livescore.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}