package zinnur.iot.rockylabs.asphalt.presentation.mvp.views

import com.hannesdorfmann.mosby3.mvp.MvpView
import zinnur.iot.rockylabs.asphalt.data.entity.response.FeedEntity

/**
 * Created by Zinnur on 11.04.17.
 */

interface FeedView : MvpView{
    fun showError()

    fun setFeed(feed: FeedEntity)
}