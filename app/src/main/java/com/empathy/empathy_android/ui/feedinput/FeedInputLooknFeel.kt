package com.empathy.empathy_android.ui.feedinput

import android.net.Uri

internal sealed class FeedInputLooknFeel {

    data class ShowFeedInputImage(val imageUri: Uri): FeedInputLooknFeel()

    data class ShowInputInfo(val address: String, val date: String) : FeedInputLooknFeel()

}