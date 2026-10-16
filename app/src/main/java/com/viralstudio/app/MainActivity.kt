package com.viralstudio.app
import android.app.Activity
import android.os.Bundle
import android.webkit.*
import android.view.ViewGroup
class MainActivity:Activity(){
 private lateinit var w:WebView
 override fun onCreate(b:Bundle?){super.onCreate(b);w=WebView(this)
 w.settings.javaScriptEnabled=true;w.settings.domStorageEnabled=true;w.settings.allowFileAccess=true
 w.settings.mediaPlaybackRequiresUserGesture=false
 w.webChromeClient=object:WebChromeClient(){override fun onPermissionRequest(r:PermissionRequest){runOnUiThread{r.grant(r.resources)}}}
 w.webViewClient=WebViewClient();setContentView(w,ViewGroup.LayoutParams(-1,-1));w.loadUrl("file:///android_asset/index.html")}
}