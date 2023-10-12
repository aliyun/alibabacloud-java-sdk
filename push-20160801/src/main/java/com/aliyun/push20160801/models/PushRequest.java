// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushRequest extends TeaModel {
    @NameInMap("AndroidActivity")
    public String androidActivity;

    @NameInMap("AndroidBigBody")
    public String androidBigBody;

    @NameInMap("AndroidBigPictureUrl")
    public String androidBigPictureUrl;

    @NameInMap("AndroidBigTitle")
    public String androidBigTitle;

    @NameInMap("AndroidExtParameters")
    public String androidExtParameters;

    @NameInMap("AndroidHonorTargetUserType")
    public Integer androidHonorTargetUserType;

    @NameInMap("AndroidHuaweiReceiptId")
    public String androidHuaweiReceiptId;

    @NameInMap("AndroidHuaweiTargetUserType")
    public Integer androidHuaweiTargetUserType;

    @NameInMap("AndroidImageUrl")
    public String androidImageUrl;

    @NameInMap("AndroidInboxBody")
    public String androidInboxBody;

    @NameInMap("AndroidMessageHuaweiCategory")
    public String androidMessageHuaweiCategory;

    @NameInMap("AndroidMessageHuaweiUrgency")
    public String androidMessageHuaweiUrgency;

    @NameInMap("AndroidMessageVivoCategory")
    public String androidMessageVivoCategory;

    @NameInMap("AndroidMusic")
    public String androidMusic;

    @NameInMap("AndroidNotificationBarPriority")
    public Integer androidNotificationBarPriority;

    @NameInMap("AndroidNotificationBarType")
    public Integer androidNotificationBarType;

    @NameInMap("AndroidNotificationChannel")
    public String androidNotificationChannel;

    @NameInMap("AndroidNotificationGroup")
    public String androidNotificationGroup;

    @NameInMap("AndroidNotificationHonorChannel")
    public String androidNotificationHonorChannel;

    @NameInMap("AndroidNotificationHuaweiChannel")
    public String androidNotificationHuaweiChannel;

    @NameInMap("AndroidNotificationNotifyId")
    public Integer androidNotificationNotifyId;

    @NameInMap("AndroidNotificationVivoChannel")
    public String androidNotificationVivoChannel;

    @NameInMap("AndroidNotificationXiaomiChannel")
    public String androidNotificationXiaomiChannel;

    @NameInMap("AndroidNotifyType")
    public String androidNotifyType;

    @NameInMap("AndroidOpenType")
    public String androidOpenType;

    @NameInMap("AndroidOpenUrl")
    public String androidOpenUrl;

    @NameInMap("AndroidPopupActivity")
    public String androidPopupActivity;

    @NameInMap("AndroidPopupBody")
    public String androidPopupBody;

    @NameInMap("AndroidPopupTitle")
    public String androidPopupTitle;

    @NameInMap("AndroidRemind")
    public Boolean androidRemind;

    @NameInMap("AndroidRenderStyle")
    public Integer androidRenderStyle;

    @NameInMap("AndroidTargetUserType")
    public Integer androidTargetUserType;

    @NameInMap("AndroidVivoPushMode")
    public Integer androidVivoPushMode;

    @NameInMap("AndroidXiaoMiActivity")
    @Deprecated
    public String androidXiaoMiActivity;

    @NameInMap("AndroidXiaoMiNotifyBody")
    @Deprecated
    public String androidXiaoMiNotifyBody;

    @NameInMap("AndroidXiaoMiNotifyTitle")
    @Deprecated
    public String androidXiaoMiNotifyTitle;

    @NameInMap("AndroidXiaomiBigPictureUrl")
    public String androidXiaomiBigPictureUrl;

    @NameInMap("AndroidXiaomiImageUrl")
    public String androidXiaomiImageUrl;

    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("Body")
    public String body;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("JobKey")
    public String jobKey;

    @NameInMap("PushTime")
    public String pushTime;

    @NameInMap("PushType")
    public String pushType;

    @NameInMap("SendChannels")
    public String sendChannels;

    @NameInMap("SendSpeed")
    @Deprecated
    public Integer sendSpeed;

    @NameInMap("SmsDelaySecs")
    public Integer smsDelaySecs;

    @NameInMap("SmsParams")
    public String smsParams;

    @NameInMap("SmsSendPolicy")
    public Integer smsSendPolicy;

    @NameInMap("SmsSignName")
    public String smsSignName;

    @NameInMap("SmsTemplateName")
    public String smsTemplateName;

    @NameInMap("StoreOffline")
    public Boolean storeOffline;

    @NameInMap("Target")
    public String target;

    @NameInMap("TargetValue")
    public String targetValue;

    @NameInMap("Title")
    public String title;

    @NameInMap("Trim")
    public Boolean trim;

    @NameInMap("iOSApnsEnv")
    public String iOSApnsEnv;

    @NameInMap("iOSBadge")
    public Integer iOSBadge;

    @NameInMap("iOSBadgeAutoIncrement")
    public Boolean iOSBadgeAutoIncrement;

    @NameInMap("iOSExtParameters")
    public String iOSExtParameters;

    @NameInMap("iOSInterruptionLevel")
    public String iOSInterruptionLevel;

    @NameInMap("iOSMusic")
    public String iOSMusic;

    @NameInMap("iOSMutableContent")
    public Boolean iOSMutableContent;

    @NameInMap("iOSNotificationCategory")
    public String iOSNotificationCategory;

    @NameInMap("iOSNotificationCollapseId")
    public String iOSNotificationCollapseId;

    @NameInMap("iOSNotificationThreadId")
    public String iOSNotificationThreadId;

    @NameInMap("iOSRelevanceScore")
    public Double iOSRelevanceScore;

    @NameInMap("iOSRemind")
    public Boolean iOSRemind;

    @NameInMap("iOSRemindBody")
    public String iOSRemindBody;

    @NameInMap("iOSSilentNotification")
    public Boolean iOSSilentNotification;

    @NameInMap("iOSSubtitle")
    public String iOSSubtitle;

    public static PushRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRequest self = new PushRequest();
        return TeaModel.build(map, self);
    }

    public PushRequest setAndroidActivity(String androidActivity) {
        this.androidActivity = androidActivity;
        return this;
    }
    public String getAndroidActivity() {
        return this.androidActivity;
    }

    public PushRequest setAndroidBigBody(String androidBigBody) {
        this.androidBigBody = androidBigBody;
        return this;
    }
    public String getAndroidBigBody() {
        return this.androidBigBody;
    }

    public PushRequest setAndroidBigPictureUrl(String androidBigPictureUrl) {
        this.androidBigPictureUrl = androidBigPictureUrl;
        return this;
    }
    public String getAndroidBigPictureUrl() {
        return this.androidBigPictureUrl;
    }

    public PushRequest setAndroidBigTitle(String androidBigTitle) {
        this.androidBigTitle = androidBigTitle;
        return this;
    }
    public String getAndroidBigTitle() {
        return this.androidBigTitle;
    }

    public PushRequest setAndroidExtParameters(String androidExtParameters) {
        this.androidExtParameters = androidExtParameters;
        return this;
    }
    public String getAndroidExtParameters() {
        return this.androidExtParameters;
    }

    public PushRequest setAndroidHonorTargetUserType(Integer androidHonorTargetUserType) {
        this.androidHonorTargetUserType = androidHonorTargetUserType;
        return this;
    }
    public Integer getAndroidHonorTargetUserType() {
        return this.androidHonorTargetUserType;
    }

    public PushRequest setAndroidHuaweiReceiptId(String androidHuaweiReceiptId) {
        this.androidHuaweiReceiptId = androidHuaweiReceiptId;
        return this;
    }
    public String getAndroidHuaweiReceiptId() {
        return this.androidHuaweiReceiptId;
    }

    public PushRequest setAndroidHuaweiTargetUserType(Integer androidHuaweiTargetUserType) {
        this.androidHuaweiTargetUserType = androidHuaweiTargetUserType;
        return this;
    }
    public Integer getAndroidHuaweiTargetUserType() {
        return this.androidHuaweiTargetUserType;
    }

    public PushRequest setAndroidImageUrl(String androidImageUrl) {
        this.androidImageUrl = androidImageUrl;
        return this;
    }
    public String getAndroidImageUrl() {
        return this.androidImageUrl;
    }

    public PushRequest setAndroidInboxBody(String androidInboxBody) {
        this.androidInboxBody = androidInboxBody;
        return this;
    }
    public String getAndroidInboxBody() {
        return this.androidInboxBody;
    }

    public PushRequest setAndroidMessageHuaweiCategory(String androidMessageHuaweiCategory) {
        this.androidMessageHuaweiCategory = androidMessageHuaweiCategory;
        return this;
    }
    public String getAndroidMessageHuaweiCategory() {
        return this.androidMessageHuaweiCategory;
    }

    public PushRequest setAndroidMessageHuaweiUrgency(String androidMessageHuaweiUrgency) {
        this.androidMessageHuaweiUrgency = androidMessageHuaweiUrgency;
        return this;
    }
    public String getAndroidMessageHuaweiUrgency() {
        return this.androidMessageHuaweiUrgency;
    }

    public PushRequest setAndroidMessageVivoCategory(String androidMessageVivoCategory) {
        this.androidMessageVivoCategory = androidMessageVivoCategory;
        return this;
    }
    public String getAndroidMessageVivoCategory() {
        return this.androidMessageVivoCategory;
    }

    public PushRequest setAndroidMusic(String androidMusic) {
        this.androidMusic = androidMusic;
        return this;
    }
    public String getAndroidMusic() {
        return this.androidMusic;
    }

    public PushRequest setAndroidNotificationBarPriority(Integer androidNotificationBarPriority) {
        this.androidNotificationBarPriority = androidNotificationBarPriority;
        return this;
    }
    public Integer getAndroidNotificationBarPriority() {
        return this.androidNotificationBarPriority;
    }

    public PushRequest setAndroidNotificationBarType(Integer androidNotificationBarType) {
        this.androidNotificationBarType = androidNotificationBarType;
        return this;
    }
    public Integer getAndroidNotificationBarType() {
        return this.androidNotificationBarType;
    }

    public PushRequest setAndroidNotificationChannel(String androidNotificationChannel) {
        this.androidNotificationChannel = androidNotificationChannel;
        return this;
    }
    public String getAndroidNotificationChannel() {
        return this.androidNotificationChannel;
    }

    public PushRequest setAndroidNotificationGroup(String androidNotificationGroup) {
        this.androidNotificationGroup = androidNotificationGroup;
        return this;
    }
    public String getAndroidNotificationGroup() {
        return this.androidNotificationGroup;
    }

    public PushRequest setAndroidNotificationHonorChannel(String androidNotificationHonorChannel) {
        this.androidNotificationHonorChannel = androidNotificationHonorChannel;
        return this;
    }
    public String getAndroidNotificationHonorChannel() {
        return this.androidNotificationHonorChannel;
    }

    public PushRequest setAndroidNotificationHuaweiChannel(String androidNotificationHuaweiChannel) {
        this.androidNotificationHuaweiChannel = androidNotificationHuaweiChannel;
        return this;
    }
    public String getAndroidNotificationHuaweiChannel() {
        return this.androidNotificationHuaweiChannel;
    }

    public PushRequest setAndroidNotificationNotifyId(Integer androidNotificationNotifyId) {
        this.androidNotificationNotifyId = androidNotificationNotifyId;
        return this;
    }
    public Integer getAndroidNotificationNotifyId() {
        return this.androidNotificationNotifyId;
    }

    public PushRequest setAndroidNotificationVivoChannel(String androidNotificationVivoChannel) {
        this.androidNotificationVivoChannel = androidNotificationVivoChannel;
        return this;
    }
    public String getAndroidNotificationVivoChannel() {
        return this.androidNotificationVivoChannel;
    }

    public PushRequest setAndroidNotificationXiaomiChannel(String androidNotificationXiaomiChannel) {
        this.androidNotificationXiaomiChannel = androidNotificationXiaomiChannel;
        return this;
    }
    public String getAndroidNotificationXiaomiChannel() {
        return this.androidNotificationXiaomiChannel;
    }

    public PushRequest setAndroidNotifyType(String androidNotifyType) {
        this.androidNotifyType = androidNotifyType;
        return this;
    }
    public String getAndroidNotifyType() {
        return this.androidNotifyType;
    }

    public PushRequest setAndroidOpenType(String androidOpenType) {
        this.androidOpenType = androidOpenType;
        return this;
    }
    public String getAndroidOpenType() {
        return this.androidOpenType;
    }

    public PushRequest setAndroidOpenUrl(String androidOpenUrl) {
        this.androidOpenUrl = androidOpenUrl;
        return this;
    }
    public String getAndroidOpenUrl() {
        return this.androidOpenUrl;
    }

    public PushRequest setAndroidPopupActivity(String androidPopupActivity) {
        this.androidPopupActivity = androidPopupActivity;
        return this;
    }
    public String getAndroidPopupActivity() {
        return this.androidPopupActivity;
    }

    public PushRequest setAndroidPopupBody(String androidPopupBody) {
        this.androidPopupBody = androidPopupBody;
        return this;
    }
    public String getAndroidPopupBody() {
        return this.androidPopupBody;
    }

    public PushRequest setAndroidPopupTitle(String androidPopupTitle) {
        this.androidPopupTitle = androidPopupTitle;
        return this;
    }
    public String getAndroidPopupTitle() {
        return this.androidPopupTitle;
    }

    public PushRequest setAndroidRemind(Boolean androidRemind) {
        this.androidRemind = androidRemind;
        return this;
    }
    public Boolean getAndroidRemind() {
        return this.androidRemind;
    }

    public PushRequest setAndroidRenderStyle(Integer androidRenderStyle) {
        this.androidRenderStyle = androidRenderStyle;
        return this;
    }
    public Integer getAndroidRenderStyle() {
        return this.androidRenderStyle;
    }

    public PushRequest setAndroidTargetUserType(Integer androidTargetUserType) {
        this.androidTargetUserType = androidTargetUserType;
        return this;
    }
    public Integer getAndroidTargetUserType() {
        return this.androidTargetUserType;
    }

    public PushRequest setAndroidVivoPushMode(Integer androidVivoPushMode) {
        this.androidVivoPushMode = androidVivoPushMode;
        return this;
    }
    public Integer getAndroidVivoPushMode() {
        return this.androidVivoPushMode;
    }

    public PushRequest setAndroidXiaoMiActivity(String androidXiaoMiActivity) {
        this.androidXiaoMiActivity = androidXiaoMiActivity;
        return this;
    }
    public String getAndroidXiaoMiActivity() {
        return this.androidXiaoMiActivity;
    }

    public PushRequest setAndroidXiaoMiNotifyBody(String androidXiaoMiNotifyBody) {
        this.androidXiaoMiNotifyBody = androidXiaoMiNotifyBody;
        return this;
    }
    public String getAndroidXiaoMiNotifyBody() {
        return this.androidXiaoMiNotifyBody;
    }

    public PushRequest setAndroidXiaoMiNotifyTitle(String androidXiaoMiNotifyTitle) {
        this.androidXiaoMiNotifyTitle = androidXiaoMiNotifyTitle;
        return this;
    }
    public String getAndroidXiaoMiNotifyTitle() {
        return this.androidXiaoMiNotifyTitle;
    }

    public PushRequest setAndroidXiaomiBigPictureUrl(String androidXiaomiBigPictureUrl) {
        this.androidXiaomiBigPictureUrl = androidXiaomiBigPictureUrl;
        return this;
    }
    public String getAndroidXiaomiBigPictureUrl() {
        return this.androidXiaomiBigPictureUrl;
    }

    public PushRequest setAndroidXiaomiImageUrl(String androidXiaomiImageUrl) {
        this.androidXiaomiImageUrl = androidXiaomiImageUrl;
        return this;
    }
    public String getAndroidXiaomiImageUrl() {
        return this.androidXiaomiImageUrl;
    }

    public PushRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public PushRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PushRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public PushRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public PushRequest setJobKey(String jobKey) {
        this.jobKey = jobKey;
        return this;
    }
    public String getJobKey() {
        return this.jobKey;
    }

    public PushRequest setPushTime(String pushTime) {
        this.pushTime = pushTime;
        return this;
    }
    public String getPushTime() {
        return this.pushTime;
    }

    public PushRequest setPushType(String pushType) {
        this.pushType = pushType;
        return this;
    }
    public String getPushType() {
        return this.pushType;
    }

    public PushRequest setSendChannels(String sendChannels) {
        this.sendChannels = sendChannels;
        return this;
    }
    public String getSendChannels() {
        return this.sendChannels;
    }

    public PushRequest setSendSpeed(Integer sendSpeed) {
        this.sendSpeed = sendSpeed;
        return this;
    }
    public Integer getSendSpeed() {
        return this.sendSpeed;
    }

    public PushRequest setSmsDelaySecs(Integer smsDelaySecs) {
        this.smsDelaySecs = smsDelaySecs;
        return this;
    }
    public Integer getSmsDelaySecs() {
        return this.smsDelaySecs;
    }

    public PushRequest setSmsParams(String smsParams) {
        this.smsParams = smsParams;
        return this;
    }
    public String getSmsParams() {
        return this.smsParams;
    }

    public PushRequest setSmsSendPolicy(Integer smsSendPolicy) {
        this.smsSendPolicy = smsSendPolicy;
        return this;
    }
    public Integer getSmsSendPolicy() {
        return this.smsSendPolicy;
    }

    public PushRequest setSmsSignName(String smsSignName) {
        this.smsSignName = smsSignName;
        return this;
    }
    public String getSmsSignName() {
        return this.smsSignName;
    }

    public PushRequest setSmsTemplateName(String smsTemplateName) {
        this.smsTemplateName = smsTemplateName;
        return this;
    }
    public String getSmsTemplateName() {
        return this.smsTemplateName;
    }

    public PushRequest setStoreOffline(Boolean storeOffline) {
        this.storeOffline = storeOffline;
        return this;
    }
    public Boolean getStoreOffline() {
        return this.storeOffline;
    }

    public PushRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public PushRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

    public PushRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public PushRequest setTrim(Boolean trim) {
        this.trim = trim;
        return this;
    }
    public Boolean getTrim() {
        return this.trim;
    }

    public PushRequest setIOSApnsEnv(String iOSApnsEnv) {
        this.iOSApnsEnv = iOSApnsEnv;
        return this;
    }
    public String getIOSApnsEnv() {
        return this.iOSApnsEnv;
    }

    public PushRequest setIOSBadge(Integer iOSBadge) {
        this.iOSBadge = iOSBadge;
        return this;
    }
    public Integer getIOSBadge() {
        return this.iOSBadge;
    }

    public PushRequest setIOSBadgeAutoIncrement(Boolean iOSBadgeAutoIncrement) {
        this.iOSBadgeAutoIncrement = iOSBadgeAutoIncrement;
        return this;
    }
    public Boolean getIOSBadgeAutoIncrement() {
        return this.iOSBadgeAutoIncrement;
    }

    public PushRequest setIOSExtParameters(String iOSExtParameters) {
        this.iOSExtParameters = iOSExtParameters;
        return this;
    }
    public String getIOSExtParameters() {
        return this.iOSExtParameters;
    }

    public PushRequest setIOSInterruptionLevel(String iOSInterruptionLevel) {
        this.iOSInterruptionLevel = iOSInterruptionLevel;
        return this;
    }
    public String getIOSInterruptionLevel() {
        return this.iOSInterruptionLevel;
    }

    public PushRequest setIOSMusic(String iOSMusic) {
        this.iOSMusic = iOSMusic;
        return this;
    }
    public String getIOSMusic() {
        return this.iOSMusic;
    }

    public PushRequest setIOSMutableContent(Boolean iOSMutableContent) {
        this.iOSMutableContent = iOSMutableContent;
        return this;
    }
    public Boolean getIOSMutableContent() {
        return this.iOSMutableContent;
    }

    public PushRequest setIOSNotificationCategory(String iOSNotificationCategory) {
        this.iOSNotificationCategory = iOSNotificationCategory;
        return this;
    }
    public String getIOSNotificationCategory() {
        return this.iOSNotificationCategory;
    }

    public PushRequest setIOSNotificationCollapseId(String iOSNotificationCollapseId) {
        this.iOSNotificationCollapseId = iOSNotificationCollapseId;
        return this;
    }
    public String getIOSNotificationCollapseId() {
        return this.iOSNotificationCollapseId;
    }

    public PushRequest setIOSNotificationThreadId(String iOSNotificationThreadId) {
        this.iOSNotificationThreadId = iOSNotificationThreadId;
        return this;
    }
    public String getIOSNotificationThreadId() {
        return this.iOSNotificationThreadId;
    }

    public PushRequest setIOSRelevanceScore(Double iOSRelevanceScore) {
        this.iOSRelevanceScore = iOSRelevanceScore;
        return this;
    }
    public Double getIOSRelevanceScore() {
        return this.iOSRelevanceScore;
    }

    public PushRequest setIOSRemind(Boolean iOSRemind) {
        this.iOSRemind = iOSRemind;
        return this;
    }
    public Boolean getIOSRemind() {
        return this.iOSRemind;
    }

    public PushRequest setIOSRemindBody(String iOSRemindBody) {
        this.iOSRemindBody = iOSRemindBody;
        return this;
    }
    public String getIOSRemindBody() {
        return this.iOSRemindBody;
    }

    public PushRequest setIOSSilentNotification(Boolean iOSSilentNotification) {
        this.iOSSilentNotification = iOSSilentNotification;
        return this;
    }
    public Boolean getIOSSilentNotification() {
        return this.iOSSilentNotification;
    }

    public PushRequest setIOSSubtitle(String iOSSubtitle) {
        this.iOSSubtitle = iOSSubtitle;
        return this;
    }
    public String getIOSSubtitle() {
        return this.iOSSubtitle;
    }

}
