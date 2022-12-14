package com.example.im.utils

import android.content.Intent
import android.util.Log
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.example.im.IMApplication.Companion.mContext
import com.example.im.model.Model
import com.example.im.model.bean.InvitationInfo
import com.example.im.model.bean.UserAccount
import com.example.im.model.dao.InviteDao
import com.google.gson.Gson
import com.hyphenate.chat.EMClient
import kotlin.random.Random

object TestUtils {
    private const val TAG = "TestUtils"
    fun test() {
//        for (i in 0..10)

    }

    fun redPoint() {
        //红点标记
        SpUtils.save(SpUtils.IS_NEW_INVITE, true)
        //发送广播
        val mLBM = LocalBroadcastManager.getInstance(mContext)
        mLBM.sendBroadcast(Intent(Constant.CONTACT_INVITE_CHANGED))
    }
}