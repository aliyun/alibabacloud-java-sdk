// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class MassPushRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

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
        public String androidRenderStyle;

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
