-keepattributes SourceFile,LineNumberTable
-keepattributes *Annotation*
-keepattributes Signature
-keepattributes EnclosingMethod
-keepattributes InnerClasses

#Picasso
-dontwarn com.squareup.picasso.**
-dontwarn com.squareup.okhttp.**

# Okio
#-keep class sun.misc.Unsafe { *; }
#-dontwarn java.nio.file.*
#-dontwarn org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
#-dontwarn okio.**

-dontnote android.net.http.HttpResponseCache
-dontnote android.net.http.SslCertificate
-dontnote android.net.http.SslError
-dontnote android.net.http.SslCertificate$DName
-dontnote org.apache.http.params.CoreConnectionPNames
-dontnote org.apache.http.params.HttpConnectionParams
-dontnote org.apache.http.params.HttpParams
-dontnote org.apache.http.conn.scheme.SocketFactory
-dontnote org.apache.http.conn.scheme.LayeredSocketFactory
-dontnote org.apache.http.conn.scheme.HostNameResolver
-dontnote org.apache.http.conn.ConnectTimeoutException


-dontnote com.google.gson.internal.UnsafeAllocator
-dontnote com.squareup.picasso.Utils
-dontnote kotlin.internal.PlatformImplementationsKt
-dontnote kotlin.jvm.internal.Reflection
-dontnote okhttp3.internal.platform.AndroidPlatform
-dontnote okhttp3.internal.platform.Platform
-dontnote okhttp3.internal.platform.AndroidPlatform$CloseGuard
-dontnote com.google.android.gms.dynamite.DynamiteModule


-keep class com.google.gson.internal.UnsafeAllocator
-keep class com.google.android.gms.ads.mediation.MediationAdRequest
-keep class com.google.android.gms.ads.mediation.MediationBannerListener
-keep class com.google.android.gms.ads.AdSize
-keep class com.google.android.gms.ads.mediation.MediationAdRequest
-keep class com.google.android.gms.ads.mediation.MediationInterstitialListener
-keep class com.google.android.gms.ads.mediation.MediationAdRequest
-keep class com.google.android.gms.ads.mediation.MediationNativeListener
-keep class com.google.android.gms.ads.mediation.NativeMediationAdRequest
-keep class com.google.android.gms.ads.mediation.MediationAdRequest
-keep class com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
-keep class com.google.ads.mediation.AbstractAdViewAdapter
-keep class com.google.android.gms.ads.InterstitialAd
-keep class com.google.android.gms.ads.purchase.InAppPurchaseListener
-keep class com.google.android.gms.ads.AdSize
-keep class com.google.android.gms.ads.AdListener
-keep class com.google.android.gms.ads.VideoOptions
-keep class com.google.android.gms.ads.doubleclick.AppEventListener
-keep class com.google.android.gms.ads.Correlator
-keep class com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener
-keep class com.google.android.gms.ads.formats.AdChoicesView
-keep class com.google.android.gms.ads.formats.NativeAd
-keep class com.google.android.gms.ads.formats.MediaView
-keep class com.google.android.gms.common.zza
-keep class com.google.android.gms.dynamic.IObjectWrapper
-keep class com.google.android.gms.internal.zzeg
-keep class com.google.android.gms.internal.zzka
-keep class com.google.android.gms.internal.zzeg
-keep class com.google.android.gms.plus.PlusOneButton$OnPlusOneClickListener

-keep class com.facebook.login.DefaultAudience
-keep class com.facebook.login.LoginBehavior
-keep class com.facebook.login.LoginManager
-keep class com.facebook.login.widget.LoginButton
-keep class com.facebook.login.widget.ToolTipPopup$Style
-keep class com.facebook.login.widget.LoginButton$ToolTipMode
-keep class com.facebook.login.widget.LoginButton$LoginButtonProperties
-keep class com.facebook.login.widget.ProfilePictureView$OnErrorListener
-keep class com.facebook.share.model.ShareContent
-keep class com.facebook.share.widget.LikeView$HorizontalAlignment
-keep class com.facebook.share.widget.LikeView$OnErrorListener
-keep class com.facebook.share.widget.LikeView$Style
-keep class com.facebook.share.widget.LikeView$AuxiliaryViewPosition
-keep class com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition



-keep class org.adw.library.widgets.discreteseekbar.DiscreteSeekBar$OnProgressChangeListener
-keep class org.adw.library.widgets.discreteseekbar.DiscreteSeekBar$NumericTransformer






