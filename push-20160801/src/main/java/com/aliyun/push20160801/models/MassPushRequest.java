// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class MassPushRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PushTask")
    public java.util.List<MassPushRequestPushTask> pushTask;

    public static MassPushRequest build(java.util.Map<String, ?> map) throws Exception {
        MassPushRequest self = new MassPushRequest();
        return TeaModel.build(map, self);
    }

    public MassPushRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public MassPushRequest setPushTask(java.util.List<MassPushRequestPushTask> pushTask) {
        this.pushTask = pushTask;
        return this;
    }
    public java.util.List<MassPushRequestPushTask> getPushTask() {
        return this.pushTask;
    }

    public static class MassPushRequestPushTask extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>com.alibaba.cloudpushdemo.bizactivity</p>
         */
        @NameInMap("AndroidActivity")
        public String androidActivity;

        @NameInMap("AndroidBigBody")
        public String androidBigBody;

        /**
         * <strong>example:</strong>
         * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
         */
        @NameInMap("AndroidBigPictureUrl")
        public String androidBigPictureUrl;

        @NameInMap("AndroidBigTitle")
        public String androidBigTitle;

        /**
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;api_name&quot;:&quot;PushNoticeToAndroidRequest&quot;}</p>
         */
        @NameInMap("AndroidExtParameters")
        public String androidExtParameters;

        @NameInMap("AndroidHonorTargetUserType")
        public Integer androidHonorTargetUserType;

        /**
         * <strong>example:</strong>
         * <p>RCP4C123456</p>
         */
        @NameInMap("AndroidHuaweiReceiptId")
        public String androidHuaweiReceiptId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidHuaweiTargetUserType")
        public Integer androidHuaweiTargetUserType;

        /**
         * <strong>example:</strong>
         * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
         */
        @NameInMap("AndroidImageUrl")
        public String androidImageUrl;

        @NameInMap("AndroidInboxBody")
        public String androidInboxBody;

        /**
         * <strong>example:</strong>
         * <p>VOIP</p>
         */
        @NameInMap("AndroidMessageHuaweiCategory")
        public String androidMessageHuaweiCategory;

        /**
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        @NameInMap("AndroidMessageHuaweiUrgency")
        public String androidMessageHuaweiUrgency;

        /**
         * <strong>example:</strong>
         * <p>TODO</p>
         */
        @NameInMap("AndroidMessageVivoCategory")
        public String androidMessageVivoCategory;

        @NameInMap("AndroidMusic")
        public String androidMusic;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AndroidNotificationBarPriority")
        public Integer androidNotificationBarPriority;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AndroidNotificationBarType")
        public Integer androidNotificationBarType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidNotificationChannel")
        public String androidNotificationChannel;

        /**
         * <strong>example:</strong>
         * <p>group-1</p>
         */
        @NameInMap("AndroidNotificationGroup")
        public String androidNotificationGroup;

        /**
         * <strong>example:</strong>
         * <p>LOW</p>
         */
        @NameInMap("AndroidNotificationHonorChannel")
        public String androidNotificationHonorChannel;

        /**
         * <strong>example:</strong>
         * <p>LOW</p>
         */
        @NameInMap("AndroidNotificationHuaweiChannel")
        public String androidNotificationHuaweiChannel;

        /**
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("AndroidNotificationNotifyId")
        public Integer androidNotificationNotifyId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AndroidNotificationVivoChannel")
        public String androidNotificationVivoChannel;

        /**
         * <strong>example:</strong>
         * <p>michannel</p>
         */
        @NameInMap("AndroidNotificationXiaomiChannel")
        public String androidNotificationXiaomiChannel;

        /**
         * <strong>example:</strong>
         * <p>VIBRATE</p>
         */
        @NameInMap("AndroidNotifyType")
        public String androidNotifyType;

        /**
         * <strong>example:</strong>
         * <p>APPLICATION</p>
         */
        @NameInMap("AndroidOpenType")
        public String androidOpenType;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxx.xxx">https://xxxx.xxx</a></p>
         */
        @NameInMap("AndroidOpenUrl")
        public String androidOpenUrl;

        /**
         * <strong>example:</strong>
         * <p>com.alibaba.cloudpushdemo.bizactivity</p>
         */
        @NameInMap("AndroidPopupActivity")
        public String androidPopupActivity;

        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("AndroidPopupBody")
        public String androidPopupBody;

        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("AndroidPopupTitle")
        public String androidPopupTitle;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AndroidRemind")
        public Boolean androidRemind;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidRenderStyle")
        public String androidRenderStyle;

        @NameInMap("AndroidTargetUserType")
        public Integer androidTargetUserType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidVivoPushMode")
        public Integer androidVivoPushMode;

        @NameInMap("AndroidVivoReceiptId")
        public String androidVivoReceiptId;

        @NameInMap("AndroidXiaoMiActivity")
        @Deprecated
        public String androidXiaoMiActivity;

        @NameInMap("AndroidXiaoMiNotifyBody")
        @Deprecated
        public String androidXiaoMiNotifyBody;

        @NameInMap("AndroidXiaoMiNotifyTitle")
        @Deprecated
        public String androidXiaoMiNotifyTitle;

        /**
         * <strong>example:</strong>
         * <p><a href="https://f6.market.xiaomi.com/download/MiPass/aaa/bbb.png">https://f6.market.xiaomi.com/download/MiPass/aaa/bbb.png</a></p>
         */
        @NameInMap("AndroidXiaomiBigPictureUrl")
        public String androidXiaomiBigPictureUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
         */
        @NameInMap("AndroidXiaomiImageUrl")
        public String androidXiaomiImageUrl;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <strong>example:</strong>
         * <p>2019-02-20T00:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("HarmonyAction")
        public String harmonyAction;

        @NameInMap("HarmonyActionType")
        public String harmonyActionType;

        @NameInMap("HarmonyCategory")
        public String harmonyCategory;

        @NameInMap("HarmonyExtParameters")
        public String harmonyExtParameters;

        @NameInMap("HarmonyImageUrl")
        public String harmonyImageUrl;

        @NameInMap("HarmonyInboxContent")
        public String harmonyInboxContent;

        @NameInMap("HarmonyNotificationSlotType")
        public String harmonyNotificationSlotType;

        @NameInMap("HarmonyNotifyId")
        public Integer harmonyNotifyId;

        @NameInMap("HarmonyReceiptId")
        public String harmonyReceiptId;

        @NameInMap("HarmonyRemind")
        public Boolean harmonyRemind;

        @NameInMap("HarmonyRemindBody")
        public String harmonyRemindBody;

        @NameInMap("HarmonyRemindTitle")
        public String harmonyRemindTitle;

        @NameInMap("HarmonyRenderStyle")
        public String harmonyRenderStyle;

        @NameInMap("HarmonyTestMessage")
        public Boolean harmonyTestMessage;

        @NameInMap("HarmonyUri")
        public String harmonyUri;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("JobKey")
        public String jobKey;

        /**
         * <strong>example:</strong>
         * <p>2019-02-20T00:00:00Z</p>
         */
        @NameInMap("PushTime")
        public String pushTime;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MESSAGE</p>
         */
        @NameInMap("PushType")
        public String pushType;

        /**
         * <strong>example:</strong>
         * <p>accs,huawei,xiaomi</p>
         */
        @NameInMap("SendChannels")
        public String sendChannels;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SendSpeed")
        @Deprecated
        public Integer sendSpeed;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StoreOffline")
        public Boolean storeOffline;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEVICE</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>deviceid1,deviceid2</p>
         */
        @NameInMap("TargetValue")
        public String targetValue;

        /**
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Trim")
        public Boolean trim;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("iOSApnsEnv")
        public String iOSApnsEnv;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("iOSBadge")
        public Integer iOSBadge;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("iOSBadgeAutoIncrement")
        public Boolean iOSBadgeAutoIncrement;

        /**
         * <strong>example:</strong>
         * <p>{“attachment”: “<a href="https://xxxx.xxx/notification_pic.png%22%7D">https://xxxx.xxx/notification_pic.png&quot;}</a></p>
         */
        @NameInMap("iOSExtParameters")
        public String iOSExtParameters;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("iOSInterruptionLevel")
        public String iOSInterruptionLevel;

        /**
         * <strong>example:</strong>
         * <p>””</p>
         */
        @NameInMap("iOSMusic")
        public String iOSMusic;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("iOSMutableContent")
        public Boolean iOSMutableContent;

        /**
         * <strong>example:</strong>
         * <p>ios</p>
         */
        @NameInMap("iOSNotificationCategory")
        public String iOSNotificationCategory;

        /**
         * <strong>example:</strong>
         * <p>ZD2011</p>
         */
        @NameInMap("iOSNotificationCollapseId")
        public String iOSNotificationCollapseId;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("iOSNotificationThreadId")
        public String iOSNotificationThreadId;

        /**
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("iOSRelevanceScore")
        public Double iOSRelevanceScore;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("iOSRemind")
        public Boolean iOSRemind;

        @NameInMap("iOSRemindBody")
        public String iOSRemindBody;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("iOSSilentNotification")
        public Boolean iOSSilentNotification;

        /**
         * <strong>example:</strong>
         * <p>subtitle</p>
         */
        @NameInMap("iOSSubtitle")
        public String iOSSubtitle;

        public static MassPushRequestPushTask build(java.util.Map<String, ?> map) throws Exception {
            MassPushRequestPushTask self = new MassPushRequestPushTask();
            return TeaModel.build(map, self);
        }

        public MassPushRequestPushTask setAndroidActivity(String androidActivity) {
            this.androidActivity = androidActivity;
            return this;
        }
        public String getAndroidActivity() {
            return this.androidActivity;
        }

        public MassPushRequestPushTask setAndroidBigBody(String androidBigBody) {
            this.androidBigBody = androidBigBody;
            return this;
        }
        public String getAndroidBigBody() {
            return this.androidBigBody;
        }

        public MassPushRequestPushTask setAndroidBigPictureUrl(String androidBigPictureUrl) {
            this.androidBigPictureUrl = androidBigPictureUrl;
            return this;
        }
        public String getAndroidBigPictureUrl() {
            return this.androidBigPictureUrl;
        }

        public MassPushRequestPushTask setAndroidBigTitle(String androidBigTitle) {
            this.androidBigTitle = androidBigTitle;
            return this;
        }
        public String getAndroidBigTitle() {
            return this.androidBigTitle;
        }

        public MassPushRequestPushTask setAndroidExtParameters(String androidExtParameters) {
            this.androidExtParameters = androidExtParameters;
            return this;
        }
        public String getAndroidExtParameters() {
            return this.androidExtParameters;
        }

        public MassPushRequestPushTask setAndroidHonorTargetUserType(Integer androidHonorTargetUserType) {
            this.androidHonorTargetUserType = androidHonorTargetUserType;
            return this;
        }
        public Integer getAndroidHonorTargetUserType() {
            return this.androidHonorTargetUserType;
        }

        public MassPushRequestPushTask setAndroidHuaweiReceiptId(String androidHuaweiReceiptId) {
            this.androidHuaweiReceiptId = androidHuaweiReceiptId;
            return this;
        }
        public String getAndroidHuaweiReceiptId() {
            return this.androidHuaweiReceiptId;
        }

        public MassPushRequestPushTask setAndroidHuaweiTargetUserType(Integer androidHuaweiTargetUserType) {
            this.androidHuaweiTargetUserType = androidHuaweiTargetUserType;
            return this;
        }
        public Integer getAndroidHuaweiTargetUserType() {
            return this.androidHuaweiTargetUserType;
        }

        public MassPushRequestPushTask setAndroidImageUrl(String androidImageUrl) {
            this.androidImageUrl = androidImageUrl;
            return this;
        }
        public String getAndroidImageUrl() {
            return this.androidImageUrl;
        }

        public MassPushRequestPushTask setAndroidInboxBody(String androidInboxBody) {
            this.androidInboxBody = androidInboxBody;
            return this;
        }
        public String getAndroidInboxBody() {
            return this.androidInboxBody;
        }

        public MassPushRequestPushTask setAndroidMessageHuaweiCategory(String androidMessageHuaweiCategory) {
            this.androidMessageHuaweiCategory = androidMessageHuaweiCategory;
            return this;
        }
        public String getAndroidMessageHuaweiCategory() {
            return this.androidMessageHuaweiCategory;
        }

        public MassPushRequestPushTask setAndroidMessageHuaweiUrgency(String androidMessageHuaweiUrgency) {
            this.androidMessageHuaweiUrgency = androidMessageHuaweiUrgency;
            return this;
        }
        public String getAndroidMessageHuaweiUrgency() {
            return this.androidMessageHuaweiUrgency;
        }

        public MassPushRequestPushTask setAndroidMessageVivoCategory(String androidMessageVivoCategory) {
            this.androidMessageVivoCategory = androidMessageVivoCategory;
            return this;
        }
        public String getAndroidMessageVivoCategory() {
            return this.androidMessageVivoCategory;
        }

        public MassPushRequestPushTask setAndroidMusic(String androidMusic) {
            this.androidMusic = androidMusic;
            return this;
        }
        public String getAndroidMusic() {
            return this.androidMusic;
        }

        public MassPushRequestPushTask setAndroidNotificationBarPriority(Integer androidNotificationBarPriority) {
            this.androidNotificationBarPriority = androidNotificationBarPriority;
            return this;
        }
        public Integer getAndroidNotificationBarPriority() {
            return this.androidNotificationBarPriority;
        }

        public MassPushRequestPushTask setAndroidNotificationBarType(Integer androidNotificationBarType) {
            this.androidNotificationBarType = androidNotificationBarType;
            return this;
        }
        public Integer getAndroidNotificationBarType() {
            return this.androidNotificationBarType;
        }

        public MassPushRequestPushTask setAndroidNotificationChannel(String androidNotificationChannel) {
            this.androidNotificationChannel = androidNotificationChannel;
            return this;
        }
        public String getAndroidNotificationChannel() {
            return this.androidNotificationChannel;
        }

        public MassPushRequestPushTask setAndroidNotificationGroup(String androidNotificationGroup) {
            this.androidNotificationGroup = androidNotificationGroup;
            return this;
        }
        public String getAndroidNotificationGroup() {
            return this.androidNotificationGroup;
        }

        public MassPushRequestPushTask setAndroidNotificationHonorChannel(String androidNotificationHonorChannel) {
            this.androidNotificationHonorChannel = androidNotificationHonorChannel;
            return this;
        }
        public String getAndroidNotificationHonorChannel() {
            return this.androidNotificationHonorChannel;
        }

        public MassPushRequestPushTask setAndroidNotificationHuaweiChannel(String androidNotificationHuaweiChannel) {
            this.androidNotificationHuaweiChannel = androidNotificationHuaweiChannel;
            return this;
        }
        public String getAndroidNotificationHuaweiChannel() {
            return this.androidNotificationHuaweiChannel;
        }

        public MassPushRequestPushTask setAndroidNotificationNotifyId(Integer androidNotificationNotifyId) {
            this.androidNotificationNotifyId = androidNotificationNotifyId;
            return this;
        }
        public Integer getAndroidNotificationNotifyId() {
            return this.androidNotificationNotifyId;
        }

        public MassPushRequestPushTask setAndroidNotificationVivoChannel(String androidNotificationVivoChannel) {
            this.androidNotificationVivoChannel = androidNotificationVivoChannel;
            return this;
        }
        public String getAndroidNotificationVivoChannel() {
            return this.androidNotificationVivoChannel;
        }

        public MassPushRequestPushTask setAndroidNotificationXiaomiChannel(String androidNotificationXiaomiChannel) {
            this.androidNotificationXiaomiChannel = androidNotificationXiaomiChannel;
            return this;
        }
        public String getAndroidNotificationXiaomiChannel() {
            return this.androidNotificationXiaomiChannel;
        }

        public MassPushRequestPushTask setAndroidNotifyType(String androidNotifyType) {
            this.androidNotifyType = androidNotifyType;
            return this;
        }
        public String getAndroidNotifyType() {
            return this.androidNotifyType;
        }

        public MassPushRequestPushTask setAndroidOpenType(String androidOpenType) {
            this.androidOpenType = androidOpenType;
            return this;
        }
        public String getAndroidOpenType() {
            return this.androidOpenType;
        }

        public MassPushRequestPushTask setAndroidOpenUrl(String androidOpenUrl) {
            this.androidOpenUrl = androidOpenUrl;
            return this;
        }
        public String getAndroidOpenUrl() {
            return this.androidOpenUrl;
        }

        public MassPushRequestPushTask setAndroidPopupActivity(String androidPopupActivity) {
            this.androidPopupActivity = androidPopupActivity;
            return this;
        }
        public String getAndroidPopupActivity() {
            return this.androidPopupActivity;
        }

        public MassPushRequestPushTask setAndroidPopupBody(String androidPopupBody) {
            this.androidPopupBody = androidPopupBody;
            return this;
        }
        public String getAndroidPopupBody() {
            return this.androidPopupBody;
        }

        public MassPushRequestPushTask setAndroidPopupTitle(String androidPopupTitle) {
            this.androidPopupTitle = androidPopupTitle;
            return this;
        }
        public String getAndroidPopupTitle() {
            return this.androidPopupTitle;
        }

        public MassPushRequestPushTask setAndroidRemind(Boolean androidRemind) {
            this.androidRemind = androidRemind;
            return this;
        }
        public Boolean getAndroidRemind() {
            return this.androidRemind;
        }

        public MassPushRequestPushTask setAndroidRenderStyle(String androidRenderStyle) {
            this.androidRenderStyle = androidRenderStyle;
            return this;
        }
        public String getAndroidRenderStyle() {
            return this.androidRenderStyle;
        }

        public MassPushRequestPushTask setAndroidTargetUserType(Integer androidTargetUserType) {
            this.androidTargetUserType = androidTargetUserType;
            return this;
        }
        public Integer getAndroidTargetUserType() {
            return this.androidTargetUserType;
        }

        public MassPushRequestPushTask setAndroidVivoPushMode(Integer androidVivoPushMode) {
            this.androidVivoPushMode = androidVivoPushMode;
            return this;
        }
        public Integer getAndroidVivoPushMode() {
            return this.androidVivoPushMode;
        }

        public MassPushRequestPushTask setAndroidVivoReceiptId(String androidVivoReceiptId) {
            this.androidVivoReceiptId = androidVivoReceiptId;
            return this;
        }
        public String getAndroidVivoReceiptId() {
            return this.androidVivoReceiptId;
        }

        public MassPushRequestPushTask setAndroidXiaoMiActivity(String androidXiaoMiActivity) {
            this.androidXiaoMiActivity = androidXiaoMiActivity;
            return this;
        }
        public String getAndroidXiaoMiActivity() {
            return this.androidXiaoMiActivity;
        }

        public MassPushRequestPushTask setAndroidXiaoMiNotifyBody(String androidXiaoMiNotifyBody) {
            this.androidXiaoMiNotifyBody = androidXiaoMiNotifyBody;
            return this;
        }
        public String getAndroidXiaoMiNotifyBody() {
            return this.androidXiaoMiNotifyBody;
        }

        public MassPushRequestPushTask setAndroidXiaoMiNotifyTitle(String androidXiaoMiNotifyTitle) {
            this.androidXiaoMiNotifyTitle = androidXiaoMiNotifyTitle;
            return this;
        }
        public String getAndroidXiaoMiNotifyTitle() {
            return this.androidXiaoMiNotifyTitle;
        }

        public MassPushRequestPushTask setAndroidXiaomiBigPictureUrl(String androidXiaomiBigPictureUrl) {
            this.androidXiaomiBigPictureUrl = androidXiaomiBigPictureUrl;
            return this;
        }
        public String getAndroidXiaomiBigPictureUrl() {
            return this.androidXiaomiBigPictureUrl;
        }

        public MassPushRequestPushTask setAndroidXiaomiImageUrl(String androidXiaomiImageUrl) {
            this.androidXiaomiImageUrl = androidXiaomiImageUrl;
            return this;
        }
        public String getAndroidXiaomiImageUrl() {
            return this.androidXiaomiImageUrl;
        }

        public MassPushRequestPushTask setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public MassPushRequestPushTask setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public MassPushRequestPushTask setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public MassPushRequestPushTask setHarmonyAction(String harmonyAction) {
            this.harmonyAction = harmonyAction;
            return this;
        }
        public String getHarmonyAction() {
            return this.harmonyAction;
        }

        public MassPushRequestPushTask setHarmonyActionType(String harmonyActionType) {
            this.harmonyActionType = harmonyActionType;
            return this;
        }
        public String getHarmonyActionType() {
            return this.harmonyActionType;
        }

        public MassPushRequestPushTask setHarmonyCategory(String harmonyCategory) {
            this.harmonyCategory = harmonyCategory;
            return this;
        }
        public String getHarmonyCategory() {
            return this.harmonyCategory;
        }

        public MassPushRequestPushTask setHarmonyExtParameters(String harmonyExtParameters) {
            this.harmonyExtParameters = harmonyExtParameters;
            return this;
        }
        public String getHarmonyExtParameters() {
            return this.harmonyExtParameters;
        }

        public MassPushRequestPushTask setHarmonyImageUrl(String harmonyImageUrl) {
            this.harmonyImageUrl = harmonyImageUrl;
            return this;
        }
        public String getHarmonyImageUrl() {
            return this.harmonyImageUrl;
        }

        public MassPushRequestPushTask setHarmonyInboxContent(String harmonyInboxContent) {
            this.harmonyInboxContent = harmonyInboxContent;
            return this;
        }
        public String getHarmonyInboxContent() {
            return this.harmonyInboxContent;
        }

        public MassPushRequestPushTask setHarmonyNotificationSlotType(String harmonyNotificationSlotType) {
            this.harmonyNotificationSlotType = harmonyNotificationSlotType;
            return this;
        }
        public String getHarmonyNotificationSlotType() {
            return this.harmonyNotificationSlotType;
        }

        public MassPushRequestPushTask setHarmonyNotifyId(Integer harmonyNotifyId) {
            this.harmonyNotifyId = harmonyNotifyId;
            return this;
        }
        public Integer getHarmonyNotifyId() {
            return this.harmonyNotifyId;
        }

        public MassPushRequestPushTask setHarmonyReceiptId(String harmonyReceiptId) {
            this.harmonyReceiptId = harmonyReceiptId;
            return this;
        }
        public String getHarmonyReceiptId() {
            return this.harmonyReceiptId;
        }

        public MassPushRequestPushTask setHarmonyRemind(Boolean harmonyRemind) {
            this.harmonyRemind = harmonyRemind;
            return this;
        }
        public Boolean getHarmonyRemind() {
            return this.harmonyRemind;
        }

        public MassPushRequestPushTask setHarmonyRemindBody(String harmonyRemindBody) {
            this.harmonyRemindBody = harmonyRemindBody;
            return this;
        }
        public String getHarmonyRemindBody() {
            return this.harmonyRemindBody;
        }

        public MassPushRequestPushTask setHarmonyRemindTitle(String harmonyRemindTitle) {
            this.harmonyRemindTitle = harmonyRemindTitle;
            return this;
        }
        public String getHarmonyRemindTitle() {
            return this.harmonyRemindTitle;
        }

        public MassPushRequestPushTask setHarmonyRenderStyle(String harmonyRenderStyle) {
            this.harmonyRenderStyle = harmonyRenderStyle;
            return this;
        }
        public String getHarmonyRenderStyle() {
            return this.harmonyRenderStyle;
        }

        public MassPushRequestPushTask setHarmonyTestMessage(Boolean harmonyTestMessage) {
            this.harmonyTestMessage = harmonyTestMessage;
            return this;
        }
        public Boolean getHarmonyTestMessage() {
            return this.harmonyTestMessage;
        }

        public MassPushRequestPushTask setHarmonyUri(String harmonyUri) {
            this.harmonyUri = harmonyUri;
            return this;
        }
        public String getHarmonyUri() {
            return this.harmonyUri;
        }

        public MassPushRequestPushTask setJobKey(String jobKey) {
            this.jobKey = jobKey;
            return this;
        }
        public String getJobKey() {
            return this.jobKey;
        }

        public MassPushRequestPushTask setPushTime(String pushTime) {
            this.pushTime = pushTime;
            return this;
        }
        public String getPushTime() {
            return this.pushTime;
        }

        public MassPushRequestPushTask setPushType(String pushType) {
            this.pushType = pushType;
            return this;
        }
        public String getPushType() {
            return this.pushType;
        }

        public MassPushRequestPushTask setSendChannels(String sendChannels) {
            this.sendChannels = sendChannels;
            return this;
        }
        public String getSendChannels() {
            return this.sendChannels;
        }

        public MassPushRequestPushTask setSendSpeed(Integer sendSpeed) {
            this.sendSpeed = sendSpeed;
            return this;
        }
        public Integer getSendSpeed() {
            return this.sendSpeed;
        }

        public MassPushRequestPushTask setStoreOffline(Boolean storeOffline) {
            this.storeOffline = storeOffline;
            return this;
        }
        public Boolean getStoreOffline() {
            return this.storeOffline;
        }

        public MassPushRequestPushTask setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public MassPushRequestPushTask setTargetValue(String targetValue) {
            this.targetValue = targetValue;
            return this;
        }
        public String getTargetValue() {
            return this.targetValue;
        }

        public MassPushRequestPushTask setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public MassPushRequestPushTask setTrim(Boolean trim) {
            this.trim = trim;
            return this;
        }
        public Boolean getTrim() {
            return this.trim;
        }

        public MassPushRequestPushTask setIOSApnsEnv(String iOSApnsEnv) {
            this.iOSApnsEnv = iOSApnsEnv;
            return this;
        }
        public String getIOSApnsEnv() {
            return this.iOSApnsEnv;
        }

        public MassPushRequestPushTask setIOSBadge(Integer iOSBadge) {
            this.iOSBadge = iOSBadge;
            return this;
        }
        public Integer getIOSBadge() {
            return this.iOSBadge;
        }

        public MassPushRequestPushTask setIOSBadgeAutoIncrement(Boolean iOSBadgeAutoIncrement) {
            this.iOSBadgeAutoIncrement = iOSBadgeAutoIncrement;
            return this;
        }
        public Boolean getIOSBadgeAutoIncrement() {
            return this.iOSBadgeAutoIncrement;
        }

        public MassPushRequestPushTask setIOSExtParameters(String iOSExtParameters) {
            this.iOSExtParameters = iOSExtParameters;
            return this;
        }
        public String getIOSExtParameters() {
            return this.iOSExtParameters;
        }

        public MassPushRequestPushTask setIOSInterruptionLevel(String iOSInterruptionLevel) {
            this.iOSInterruptionLevel = iOSInterruptionLevel;
            return this;
        }
        public String getIOSInterruptionLevel() {
            return this.iOSInterruptionLevel;
        }

        public MassPushRequestPushTask setIOSMusic(String iOSMusic) {
            this.iOSMusic = iOSMusic;
            return this;
        }
        public String getIOSMusic() {
            return this.iOSMusic;
        }

        public MassPushRequestPushTask setIOSMutableContent(Boolean iOSMutableContent) {
            this.iOSMutableContent = iOSMutableContent;
            return this;
        }
        public Boolean getIOSMutableContent() {
            return this.iOSMutableContent;
        }

        public MassPushRequestPushTask setIOSNotificationCategory(String iOSNotificationCategory) {
            this.iOSNotificationCategory = iOSNotificationCategory;
            return this;
        }
        public String getIOSNotificationCategory() {
            return this.iOSNotificationCategory;
        }

        public MassPushRequestPushTask setIOSNotificationCollapseId(String iOSNotificationCollapseId) {
            this.iOSNotificationCollapseId = iOSNotificationCollapseId;
            return this;
        }
        public String getIOSNotificationCollapseId() {
            return this.iOSNotificationCollapseId;
        }

        public MassPushRequestPushTask setIOSNotificationThreadId(String iOSNotificationThreadId) {
            this.iOSNotificationThreadId = iOSNotificationThreadId;
            return this;
        }
        public String getIOSNotificationThreadId() {
            return this.iOSNotificationThreadId;
        }

        public MassPushRequestPushTask setIOSRelevanceScore(Double iOSRelevanceScore) {
            this.iOSRelevanceScore = iOSRelevanceScore;
            return this;
        }
        public Double getIOSRelevanceScore() {
            return this.iOSRelevanceScore;
        }

        public MassPushRequestPushTask setIOSRemind(Boolean iOSRemind) {
            this.iOSRemind = iOSRemind;
            return this;
        }
        public Boolean getIOSRemind() {
            return this.iOSRemind;
        }

        public MassPushRequestPushTask setIOSRemindBody(String iOSRemindBody) {
            this.iOSRemindBody = iOSRemindBody;
            return this;
        }
        public String getIOSRemindBody() {
            return this.iOSRemindBody;
        }

        public MassPushRequestPushTask setIOSSilentNotification(Boolean iOSSilentNotification) {
            this.iOSSilentNotification = iOSSilentNotification;
            return this;
        }
        public Boolean getIOSSilentNotification() {
            return this.iOSSilentNotification;
        }

        public MassPushRequestPushTask setIOSSubtitle(String iOSSubtitle) {
            this.iOSSubtitle = iOSSubtitle;
            return this;
        }
        public String getIOSSubtitle() {
            return this.iOSSubtitle;
        }

    }

}
