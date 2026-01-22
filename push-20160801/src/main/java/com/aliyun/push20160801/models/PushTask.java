// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushTask extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public PushTaskMessage message;

    @NameInMap("Notification")
    public PushTaskNotification notification;

    @NameInMap("Options")
    public PushTaskOptions options;

    @NameInMap("Target")
    public PushTaskTarget target;

    public static PushTask build(java.util.Map<String, ?> map) throws Exception {
        PushTask self = new PushTask();
        return TeaModel.build(map, self);
    }

    public PushTask setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public PushTask setMessage(PushTaskMessage message) {
        this.message = message;
        return this;
    }
    public PushTaskMessage getMessage() {
        return this.message;
    }

    public PushTask setNotification(PushTaskNotification notification) {
        this.notification = notification;
        return this;
    }
    public PushTaskNotification getNotification() {
        return this.notification;
    }

    public PushTask setOptions(PushTaskOptions options) {
        this.options = options;
        return this;
    }
    public PushTaskOptions getOptions() {
        return this.options;
    }

    public PushTask setTarget(PushTaskTarget target) {
        this.target = target;
        return this;
    }
    public PushTaskTarget getTarget() {
        return this.target;
    }

    public static class PushTaskMessage extends TeaModel {
        @NameInMap("Body")
        public String body;

        @NameInMap("Title")
        public String title;

        public static PushTaskMessage build(java.util.Map<String, ?> map) throws Exception {
            PushTaskMessage self = new PushTaskMessage();
            return TeaModel.build(map, self);
        }

        public PushTaskMessage setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public PushTaskMessage setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class PushTaskNotificationAndroidOptionsAccs extends TeaModel {
        @NameInMap("CustomStyle")
        public Integer customStyle;

        @NameInMap("NotifyType")
        public String notifyType;

        @NameInMap("OpenActivity")
        public String openActivity;

        @NameInMap("OpenType")
        public String openType;

        @NameInMap("OpenUrl")
        public String openUrl;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ThreadId")
        public String threadId;

        public static PushTaskNotificationAndroidOptionsAccs build(java.util.Map<String, ?> map) throws Exception {
            PushTaskNotificationAndroidOptionsAccs self = new PushTaskNotificationAndroidOptionsAccs();
            return TeaModel.build(map, self);
        }

        public PushTaskNotificationAndroidOptionsAccs setCustomStyle(Integer customStyle) {
            this.customStyle = customStyle;
            return this;
        }
        public Integer getCustomStyle() {
            return this.customStyle;
        }

        public PushTaskNotificationAndroidOptionsAccs setNotifyType(String notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public String getNotifyType() {
            return this.notifyType;
        }

        public PushTaskNotificationAndroidOptionsAccs setOpenActivity(String openActivity) {
            this.openActivity = openActivity;
            return this;
        }
        public String getOpenActivity() {
            return this.openActivity;
        }

        public PushTaskNotificationAndroidOptionsAccs setOpenType(String openType) {
            this.openType = openType;
            return this;
        }
        public String getOpenType() {
            return this.openType;
        }

        public PushTaskNotificationAndroidOptionsAccs setOpenUrl(String openUrl) {
            this.openUrl = openUrl;
            return this;
        }
        public String getOpenUrl() {
            return this.openUrl;
        }

        public PushTaskNotificationAndroidOptionsAccs setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public PushTaskNotificationAndroidOptionsAccs setThreadId(String threadId) {
            this.threadId = threadId;
            return this;
        }
        public String getThreadId() {
            return this.threadId;
        }

    }

    public static class PushTaskNotificationAndroidOptionsHonor extends TeaModel {
        @NameInMap("Importance")
        public Integer importance;

        public static PushTaskNotificationAndroidOptionsHonor build(java.util.Map<String, ?> map) throws Exception {
            PushTaskNotificationAndroidOptionsHonor self = new PushTaskNotificationAndroidOptionsHonor();
            return TeaModel.build(map, self);
        }

        public PushTaskNotificationAndroidOptionsHonor setImportance(Integer importance) {
            this.importance = importance;
            return this;
        }
        public Integer getImportance() {
            return this.importance;
        }

    }

    public static class PushTaskNotificationAndroidOptionsHuawei extends TeaModel {
        @NameInMap("BusinessType")
        public Integer businessType;

        @NameInMap("Category")
        public String category;

        @NameInMap("Importance")
        public Integer importance;

        @NameInMap("LiveNotificationPayload")
        public String liveNotificationPayload;

        @NameInMap("ReceiptId")
        public String receiptId;

        @NameInMap("Urgency")
        public String urgency;

        public static PushTaskNotificationAndroidOptionsHuawei build(java.util.Map<String, ?> map) throws Exception {
            PushTaskNotificationAndroidOptionsHuawei self = new PushTaskNotificationAndroidOptionsHuawei();
            return TeaModel.build(map, self);
        }

        public PushTaskNotificationAndroidOptionsHuawei setBusinessType(Integer businessType) {
            this.businessType = businessType;
            return this;
        }
        public Integer getBusinessType() {
            return this.businessType;
        }

        public PushTaskNotificationAndroidOptionsHuawei setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public PushTaskNotificationAndroidOptionsHuawei setImportance(Integer importance) {
            this.importance = importance;
            return this;
        }
        public Integer getImportance() {
            return this.importance;
        }

        public PushTaskNotificationAndroidOptionsHuawei setLiveNotificationPayload(String liveNotificationPayload) {
            this.liveNotificationPayload = liveNotificationPayload;
            return this;
        }
        public String getLiveNotificationPayload() {
            return this.liveNotificationPayload;
        }

        public PushTaskNotificationAndroidOptionsHuawei setReceiptId(String receiptId) {
            this.receiptId = receiptId;
            return this;
        }
        public String getReceiptId() {
            return this.receiptId;
        }

        public PushTaskNotificationAndroidOptionsHuawei setUrgency(String urgency) {
            this.urgency = urgency;
            return this;
        }
        public String getUrgency() {
            return this.urgency;
        }

    }

    public static class PushTaskNotificationAndroidOptionsMeizu extends TeaModel {
        @NameInMap("NoticeMsgType")
        public Integer noticeMsgType;

        public static PushTaskNotificationAndroidOptionsMeizu build(java.util.Map<String, ?> map) throws Exception {
            PushTaskNotificationAndroidOptionsMeizu self = new PushTaskNotificationAndroidOptionsMeizu();
            return TeaModel.build(map, self);
        }

        public PushTaskNotificationAndroidOptionsMeizu setNoticeMsgType(Integer noticeMsgType) {
            this.noticeMsgType = noticeMsgType;
            return this;
        }
        public Integer getNoticeMsgType() {
            return this.noticeMsgType;
        }

    }

    public static class PushTaskNotificationAndroidOptionsOppo extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("DeleteIntentData")
        public String deleteIntentData;

        @NameInMap("IntelligentIntent")
        public String intelligentIntent;

        @NameInMap("NotifyLevel")
        public Long notifyLevel;

        @NameInMap("PrivateContentParameters")
        public String privateContentParameters;

        @NameInMap("PrivateMsgTemplateId")
        public String privateMsgTemplateId;

        @NameInMap("PrivateTitleParameters")
        public String privateTitleParameters;

        public static PushTaskNotificationAndroidOptionsOppo build(java.util.Map<String, ?> map) throws Exception {
            PushTaskNotificationAndroidOptionsOppo self = new PushTaskNotificationAndroidOptionsOppo();
            return TeaModel.build(map, self);
        }

        public PushTaskNotificationAndroidOptionsOppo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public PushTaskNotificationAndroidOptionsOppo setDeleteIntentData(String deleteIntentData) {
            this.deleteIntentData = deleteIntentData;
            return this;
        }
        public String getDeleteIntentData() {
            return this.deleteIntentData;
        }

        public PushTaskNotificationAndroidOptionsOppo setIntelligentIntent(String intelligentIntent) {
            this.intelligentIntent = intelligentIntent;
            return this;
        }
        public String getIntelligentIntent() {
            return this.intelligentIntent;
        }

        public PushTaskNotificationAndroidOptionsOppo setNotifyLevel(Long notifyLevel) {
            this.notifyLevel = notifyLevel;
            return this;
        }
        public Long getNotifyLevel() {
            return this.notifyLevel;
        }

        public PushTaskNotificationAndroidOptionsOppo setPrivateContentParameters(String privateContentParameters) {
            this.privateContentParameters = privateContentParameters;
            return this;
        }
        public String getPrivateContentParameters() {
            return this.privateContentParameters;
        }

        public PushTaskNotificationAndroidOptionsOppo setPrivateMsgTemplateId(String privateMsgTemplateId) {
            this.privateMsgTemplateId = privateMsgTemplateId;
            return this;
        }
        public String getPrivateMsgTemplateId() {
            return this.privateMsgTemplateId;
        }

        public PushTaskNotificationAndroidOptionsOppo setPrivateTitleParameters(String privateTitleParameters) {
            this.privateTitleParameters = privateTitleParameters;
            return this;
        }
        public String getPrivateTitleParameters() {
            return this.privateTitleParameters;
        }

    }

    public static class PushTaskNotificationAndroidOptionsVivo extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Importance")
        public Integer importance;

        @NameInMap("ReceiptId")
        public String receiptId;

        public static PushTaskNotificationAndroidOptionsVivo build(java.util.Map<String, ?> map) throws Exception {
            PushTaskNotificationAndroidOptionsVivo self = new PushTaskNotificationAndroidOptionsVivo();
            return TeaModel.build(map, self);
        }

        public PushTaskNotificationAndroidOptionsVivo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public PushTaskNotificationAndroidOptionsVivo setImportance(Integer importance) {
            this.importance = importance;
            return this;
        }
        public Integer getImportance() {
            return this.importance;
        }

        public PushTaskNotificationAndroidOptionsVivo setReceiptId(String receiptId) {
            this.receiptId = receiptId;
            return this;
        }
        public String getReceiptId() {
            return this.receiptId;
        }

    }

    public static class PushTaskNotificationAndroidOptionsXiaomi extends TeaModel {
        @NameInMap("Channel")
        public String channel;

        public static PushTaskNotificationAndroidOptionsXiaomi build(java.util.Map<String, ?> map) throws Exception {
            PushTaskNotificationAndroidOptionsXiaomi self = new PushTaskNotificationAndroidOptionsXiaomi();
            return TeaModel.build(map, self);
        }

        public PushTaskNotificationAndroidOptionsXiaomi setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

    }

    public static class PushTaskNotificationAndroidOptions extends TeaModel {
        @NameInMap("Accs")
        public PushTaskNotificationAndroidOptionsAccs accs;

        @NameInMap("Honor")
        public PushTaskNotificationAndroidOptionsHonor honor;

        @NameInMap("Huawei")
        public PushTaskNotificationAndroidOptionsHuawei huawei;

        @NameInMap("Meizu")
        public PushTaskNotificationAndroidOptionsMeizu meizu;

        @NameInMap("Oppo")
        public PushTaskNotificationAndroidOptionsOppo oppo;

        @NameInMap("Vivo")
        public PushTaskNotificationAndroidOptionsVivo vivo;

        @NameInMap("Xiaomi")
        public PushTaskNotificationAndroidOptionsXiaomi xiaomi;

        public static PushTaskNotificationAndroidOptions build(java.util.Map<String, ?> map) throws Exception {
            PushTaskNotificationAndroidOptions self = new PushTaskNotificationAndroidOptions();
            return TeaModel.build(map, self);
        }

        public PushTaskNotificationAndroidOptions setAccs(PushTaskNotificationAndroidOptionsAccs accs) {
            this.accs = accs;
            return this;
        }
        public PushTaskNotificationAndroidOptionsAccs getAccs() {
            return this.accs;
        }

        public PushTaskNotificationAndroidOptions setHonor(PushTaskNotificationAndroidOptionsHonor honor) {
            this.honor = honor;
            return this;
        }
        public PushTaskNotificationAndroidOptionsHonor getHonor() {
            return this.honor;
        }

        public PushTaskNotificationAndroidOptions setHuawei(PushTaskNotificationAndroidOptionsHuawei huawei) {
            this.huawei = huawei;
            return this;
        }
        public PushTaskNotificationAndroidOptionsHuawei getHuawei() {
            return this.huawei;
        }

        public PushTaskNotificationAndroidOptions setMeizu(PushTaskNotificationAndroidOptionsMeizu meizu) {
            this.meizu = meizu;
            return this;
        }
        public PushTaskNotificationAndroidOptionsMeizu getMeizu() {
            return this.meizu;
        }

        public PushTaskNotificationAndroidOptions setOppo(PushTaskNotificationAndroidOptionsOppo oppo) {
            this.oppo = oppo;
            return this;
        }
        public PushTaskNotificationAndroidOptionsOppo getOppo() {
            return this.oppo;
        }

        public PushTaskNotificationAndroidOptions setVivo(PushTaskNotificationAndroidOptionsVivo vivo) {
            this.vivo = vivo;
            return this;
        }
        public PushTaskNotificationAndroidOptionsVivo getVivo() {
            return this.vivo;
        }

        public PushTaskNotificationAndroidOptions setXiaomi(PushTaskNotificationAndroidOptionsXiaomi xiaomi) {
            this.xiaomi = xiaomi;
            return this;
        }
        public PushTaskNotificationAndroidOptionsXiaomi getXiaomi() {
            return this.xiaomi;
        }

    }

    public static class PushTaskNotificationAndroid extends TeaModel {
        @NameInMap("BadgeActivity")
        public String badgeActivity;

        @NameInMap("BadgeAddNum")
        public Integer badgeAddNum;

        @NameInMap("BadgeSetNum")
        public Integer badgeSetNum;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ExtParameters")
        public String extParameters;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("InboxContent")
        public java.util.List<String> inboxContent;

        @NameInMap("Music")
        public String music;

        @NameInMap("NotifyId")
        public Integer notifyId;

        @NameInMap("Options")
        public PushTaskNotificationAndroidOptions options;

        @NameInMap("PictureUrl")
        public String pictureUrl;

        @NameInMap("RenderStyle")
        public String renderStyle;

        @NameInMap("TestMessage")
        public Boolean testMessage;

        @NameInMap("VendorChannelActivity")
        public String vendorChannelActivity;

        public static PushTaskNotificationAndroid build(java.util.Map<String, ?> map) throws Exception {
            PushTaskNotificationAndroid self = new PushTaskNotificationAndroid();
            return TeaModel.build(map, self);
        }

        public PushTaskNotificationAndroid setBadgeActivity(String badgeActivity) {
            this.badgeActivity = badgeActivity;
            return this;
        }
        public String getBadgeActivity() {
            return this.badgeActivity;
        }

        public PushTaskNotificationAndroid setBadgeAddNum(Integer badgeAddNum) {
            this.badgeAddNum = badgeAddNum;
            return this;
        }
        public Integer getBadgeAddNum() {
            return this.badgeAddNum;
        }

        public PushTaskNotificationAndroid setBadgeSetNum(Integer badgeSetNum) {
            this.badgeSetNum = badgeSetNum;
            return this;
        }
        public Integer getBadgeSetNum() {
            return this.badgeSetNum;
        }

        public PushTaskNotificationAndroid setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public PushTaskNotificationAndroid setExtParameters(String extParameters) {
            this.extParameters = extParameters;
            return this;
        }
        public String getExtParameters() {
            return this.extParameters;
        }

        public PushTaskNotificationAndroid setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public PushTaskNotificationAndroid setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public PushTaskNotificationAndroid setInboxContent(java.util.List<String> inboxContent) {
            this.inboxContent = inboxContent;
            return this;
        }
        public java.util.List<String> getInboxContent() {
            return this.inboxContent;
        }

        public PushTaskNotificationAndroid setMusic(String music) {
            this.music = music;
            return this;
        }
        public String getMusic() {
            return this.music;
        }

        public PushTaskNotificationAndroid setNotifyId(Integer notifyId) {
            this.notifyId = notifyId;
            return this;
        }
        public Integer getNotifyId() {
            return this.notifyId;
        }

        public PushTaskNotificationAndroid setOptions(PushTaskNotificationAndroidOptions options) {
            this.options = options;
            return this;
        }
        public PushTaskNotificationAndroidOptions getOptions() {
            return this.options;
        }

        public PushTaskNotificationAndroid setPictureUrl(String pictureUrl) {
            this.pictureUrl = pictureUrl;
            return this;
        }
        public String getPictureUrl() {
            return this.pictureUrl;
        }

        public PushTaskNotificationAndroid setRenderStyle(String renderStyle) {
            this.renderStyle = renderStyle;
            return this;
        }
        public String getRenderStyle() {
            return this.renderStyle;
        }

        public PushTaskNotificationAndroid setTestMessage(Boolean testMessage) {
            this.testMessage = testMessage;
            return this;
        }
        public Boolean getTestMessage() {
            return this.testMessage;
        }

        public PushTaskNotificationAndroid setVendorChannelActivity(String vendorChannelActivity) {
            this.vendorChannelActivity = vendorChannelActivity;
            return this;
        }
        public String getVendorChannelActivity() {
            return this.vendorChannelActivity;
        }

    }

    public static class PushTaskNotificationHmos extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("BadgeAddNum")
        public Integer badgeAddNum;

        @NameInMap("BadgeSetNum")
        public Integer badgeSetNum;

        @NameInMap("Category")
        public String category;

        @NameInMap("ExtParameters")
        public String extParameters;

        @NameInMap("ExtensionExtraData")
        public String extensionExtraData;

        @NameInMap("ExtensionPush")
        public Boolean extensionPush;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("InboxContent")
        public java.util.List<String> inboxContent;

        @NameInMap("LiveViewPayload")
        public String liveViewPayload;

        @NameInMap("NotifyId")
        public Integer notifyId;

        @NameInMap("ReceiptId")
        public String receiptId;

        @NameInMap("RenderStyle")
        public String renderStyle;

        @NameInMap("SlotType")
        public String slotType;

        @NameInMap("Sound")
        public String sound;

        @NameInMap("SoundDuration")
        public Integer soundDuration;

        @NameInMap("TestMessage")
        public Boolean testMessage;

        @NameInMap("Uri")
        public String uri;

        public static PushTaskNotificationHmos build(java.util.Map<String, ?> map) throws Exception {
            PushTaskNotificationHmos self = new PushTaskNotificationHmos();
            return TeaModel.build(map, self);
        }

        public PushTaskNotificationHmos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public PushTaskNotificationHmos setBadgeAddNum(Integer badgeAddNum) {
            this.badgeAddNum = badgeAddNum;
            return this;
        }
        public Integer getBadgeAddNum() {
            return this.badgeAddNum;
        }

        public PushTaskNotificationHmos setBadgeSetNum(Integer badgeSetNum) {
            this.badgeSetNum = badgeSetNum;
            return this;
        }
        public Integer getBadgeSetNum() {
            return this.badgeSetNum;
        }

        public PushTaskNotificationHmos setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public PushTaskNotificationHmos setExtParameters(String extParameters) {
            this.extParameters = extParameters;
            return this;
        }
        public String getExtParameters() {
            return this.extParameters;
        }

        public PushTaskNotificationHmos setExtensionExtraData(String extensionExtraData) {
            this.extensionExtraData = extensionExtraData;
            return this;
        }
        public String getExtensionExtraData() {
            return this.extensionExtraData;
        }

        public PushTaskNotificationHmos setExtensionPush(Boolean extensionPush) {
            this.extensionPush = extensionPush;
            return this;
        }
        public Boolean getExtensionPush() {
            return this.extensionPush;
        }

        public PushTaskNotificationHmos setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public PushTaskNotificationHmos setInboxContent(java.util.List<String> inboxContent) {
            this.inboxContent = inboxContent;
            return this;
        }
        public java.util.List<String> getInboxContent() {
            return this.inboxContent;
        }

        public PushTaskNotificationHmos setLiveViewPayload(String liveViewPayload) {
            this.liveViewPayload = liveViewPayload;
            return this;
        }
        public String getLiveViewPayload() {
            return this.liveViewPayload;
        }

        public PushTaskNotificationHmos setNotifyId(Integer notifyId) {
            this.notifyId = notifyId;
            return this;
        }
        public Integer getNotifyId() {
            return this.notifyId;
        }

        public PushTaskNotificationHmos setReceiptId(String receiptId) {
            this.receiptId = receiptId;
            return this;
        }
        public String getReceiptId() {
            return this.receiptId;
        }

        public PushTaskNotificationHmos setRenderStyle(String renderStyle) {
            this.renderStyle = renderStyle;
            return this;
        }
        public String getRenderStyle() {
            return this.renderStyle;
        }

        public PushTaskNotificationHmos setSlotType(String slotType) {
            this.slotType = slotType;
            return this;
        }
        public String getSlotType() {
            return this.slotType;
        }

        public PushTaskNotificationHmos setSound(String sound) {
            this.sound = sound;
            return this;
        }
        public String getSound() {
            return this.sound;
        }

        public PushTaskNotificationHmos setSoundDuration(Integer soundDuration) {
            this.soundDuration = soundDuration;
            return this;
        }
        public Integer getSoundDuration() {
            return this.soundDuration;
        }

        public PushTaskNotificationHmos setTestMessage(Boolean testMessage) {
            this.testMessage = testMessage;
            return this;
        }
        public Boolean getTestMessage() {
            return this.testMessage;
        }

        public PushTaskNotificationHmos setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class PushTaskNotificationIosLiveActivity extends TeaModel {
        @NameInMap("Attributes")
        public String attributes;

        @NameInMap("AttributesType")
        public String attributesType;

        @NameInMap("ContentState")
        public String contentState;

        @NameInMap("DismissalDate")
        public Long dismissalDate;

        @NameInMap("Event")
        public String event;

        @NameInMap("Id")
        public String id;

        @NameInMap("StaleDate")
        public Long staleDate;

        public static PushTaskNotificationIosLiveActivity build(java.util.Map<String, ?> map) throws Exception {
            PushTaskNotificationIosLiveActivity self = new PushTaskNotificationIosLiveActivity();
            return TeaModel.build(map, self);
        }

        public PushTaskNotificationIosLiveActivity setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public PushTaskNotificationIosLiveActivity setAttributesType(String attributesType) {
            this.attributesType = attributesType;
            return this;
        }
        public String getAttributesType() {
            return this.attributesType;
        }

        public PushTaskNotificationIosLiveActivity setContentState(String contentState) {
            this.contentState = contentState;
            return this;
        }
        public String getContentState() {
            return this.contentState;
        }

        public PushTaskNotificationIosLiveActivity setDismissalDate(Long dismissalDate) {
            this.dismissalDate = dismissalDate;
            return this;
        }
        public Long getDismissalDate() {
            return this.dismissalDate;
        }

        public PushTaskNotificationIosLiveActivity setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public PushTaskNotificationIosLiveActivity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PushTaskNotificationIosLiveActivity setStaleDate(Long staleDate) {
            this.staleDate = staleDate;
            return this;
        }
        public Long getStaleDate() {
            return this.staleDate;
        }

    }

    public static class PushTaskNotificationIos extends TeaModel {
        @NameInMap("ApnsEnv")
        public String apnsEnv;

        @NameInMap("Badge")
        public Integer badge;

        @NameInMap("BadgeAutoIncrement")
        public Boolean badgeAutoIncrement;

        @NameInMap("Category")
        public String category;

        @NameInMap("CollapseId")
        public String collapseId;

        @NameInMap("ExtParameters")
        public String extParameters;

        @NameInMap("InterruptionLevel")
        public String interruptionLevel;

        @NameInMap("LiveActivity")
        public PushTaskNotificationIosLiveActivity liveActivity;

        @NameInMap("Music")
        public String music;

        @NameInMap("Mutable")
        public Boolean mutable;

        @NameInMap("RelevanceScore")
        public Double relevanceScore;

        @NameInMap("Silent")
        public Boolean silent;

        @NameInMap("Subtitle")
        public String subtitle;

        @NameInMap("ThreadId")
        public String threadId;

        public static PushTaskNotificationIos build(java.util.Map<String, ?> map) throws Exception {
            PushTaskNotificationIos self = new PushTaskNotificationIos();
            return TeaModel.build(map, self);
        }

        public PushTaskNotificationIos setApnsEnv(String apnsEnv) {
            this.apnsEnv = apnsEnv;
            return this;
        }
        public String getApnsEnv() {
            return this.apnsEnv;
        }

        public PushTaskNotificationIos setBadge(Integer badge) {
            this.badge = badge;
            return this;
        }
        public Integer getBadge() {
            return this.badge;
        }

        public PushTaskNotificationIos setBadgeAutoIncrement(Boolean badgeAutoIncrement) {
            this.badgeAutoIncrement = badgeAutoIncrement;
            return this;
        }
        public Boolean getBadgeAutoIncrement() {
            return this.badgeAutoIncrement;
        }

        public PushTaskNotificationIos setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public PushTaskNotificationIos setCollapseId(String collapseId) {
            this.collapseId = collapseId;
            return this;
        }
        public String getCollapseId() {
            return this.collapseId;
        }

        public PushTaskNotificationIos setExtParameters(String extParameters) {
            this.extParameters = extParameters;
            return this;
        }
        public String getExtParameters() {
            return this.extParameters;
        }

        public PushTaskNotificationIos setInterruptionLevel(String interruptionLevel) {
            this.interruptionLevel = interruptionLevel;
            return this;
        }
        public String getInterruptionLevel() {
            return this.interruptionLevel;
        }

        public PushTaskNotificationIos setLiveActivity(PushTaskNotificationIosLiveActivity liveActivity) {
            this.liveActivity = liveActivity;
            return this;
        }
        public PushTaskNotificationIosLiveActivity getLiveActivity() {
            return this.liveActivity;
        }

        public PushTaskNotificationIos setMusic(String music) {
            this.music = music;
            return this;
        }
        public String getMusic() {
            return this.music;
        }

        public PushTaskNotificationIos setMutable(Boolean mutable) {
            this.mutable = mutable;
            return this;
        }
        public Boolean getMutable() {
            return this.mutable;
        }

        public PushTaskNotificationIos setRelevanceScore(Double relevanceScore) {
            this.relevanceScore = relevanceScore;
            return this;
        }
        public Double getRelevanceScore() {
            return this.relevanceScore;
        }

        public PushTaskNotificationIos setSilent(Boolean silent) {
            this.silent = silent;
            return this;
        }
        public Boolean getSilent() {
            return this.silent;
        }

        public PushTaskNotificationIos setSubtitle(String subtitle) {
            this.subtitle = subtitle;
            return this;
        }
        public String getSubtitle() {
            return this.subtitle;
        }

        public PushTaskNotificationIos setThreadId(String threadId) {
            this.threadId = threadId;
            return this;
        }
        public String getThreadId() {
            return this.threadId;
        }

    }

    public static class PushTaskNotification extends TeaModel {
        @NameInMap("Android")
        public PushTaskNotificationAndroid android;

        @NameInMap("Body")
        public String body;

        @NameInMap("Hmos")
        public PushTaskNotificationHmos hmos;

        @NameInMap("Ios")
        public PushTaskNotificationIos ios;

        @NameInMap("Title")
        public String title;

        public static PushTaskNotification build(java.util.Map<String, ?> map) throws Exception {
            PushTaskNotification self = new PushTaskNotification();
            return TeaModel.build(map, self);
        }

        public PushTaskNotification setAndroid(PushTaskNotificationAndroid android) {
            this.android = android;
            return this;
        }
        public PushTaskNotificationAndroid getAndroid() {
            return this.android;
        }

        public PushTaskNotification setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public PushTaskNotification setHmos(PushTaskNotificationHmos hmos) {
            this.hmos = hmos;
            return this;
        }
        public PushTaskNotificationHmos getHmos() {
            return this.hmos;
        }

        public PushTaskNotification setIos(PushTaskNotificationIos ios) {
            this.ios = ios;
            return this;
        }
        public PushTaskNotificationIos getIos() {
            return this.ios;
        }

        public PushTaskNotification setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class PushTaskOptionsSms extends TeaModel {
        @NameInMap("DelaySecs")
        public Long delaySecs;

        @NameInMap("Params")
        public String params;

        @NameInMap("SendPolicy")
        public String sendPolicy;

        @NameInMap("SignName")
        public String signName;

        @NameInMap("TemplateName")
        public String templateName;

        public static PushTaskOptionsSms build(java.util.Map<String, ?> map) throws Exception {
            PushTaskOptionsSms self = new PushTaskOptionsSms();
            return TeaModel.build(map, self);
        }

        public PushTaskOptionsSms setDelaySecs(Long delaySecs) {
            this.delaySecs = delaySecs;
            return this;
        }
        public Long getDelaySecs() {
            return this.delaySecs;
        }

        public PushTaskOptionsSms setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public PushTaskOptionsSms setSendPolicy(String sendPolicy) {
            this.sendPolicy = sendPolicy;
            return this;
        }
        public String getSendPolicy() {
            return this.sendPolicy;
        }

        public PushTaskOptionsSms setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public PushTaskOptionsSms setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class PushTaskOptions extends TeaModel {
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("JobKey")
        public String jobKey;

        @NameInMap("MessageId")
        public Long messageId;

        @NameInMap("PushTime")
        public String pushTime;

        @NameInMap("Sms")
        public PushTaskOptionsSms sms;

        @NameInMap("Trim")
        public Boolean trim;

        @NameInMap("UseChannels")
        public String useChannels;

        public static PushTaskOptions build(java.util.Map<String, ?> map) throws Exception {
            PushTaskOptions self = new PushTaskOptions();
            return TeaModel.build(map, self);
        }

        public PushTaskOptions setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public PushTaskOptions setJobKey(String jobKey) {
            this.jobKey = jobKey;
            return this;
        }
        public String getJobKey() {
            return this.jobKey;
        }

        public PushTaskOptions setMessageId(Long messageId) {
            this.messageId = messageId;
            return this;
        }
        public Long getMessageId() {
            return this.messageId;
        }

        public PushTaskOptions setPushTime(String pushTime) {
            this.pushTime = pushTime;
            return this;
        }
        public String getPushTime() {
            return this.pushTime;
        }

        public PushTaskOptions setSms(PushTaskOptionsSms sms) {
            this.sms = sms;
            return this;
        }
        public PushTaskOptionsSms getSms() {
            return this.sms;
        }

        public PushTaskOptions setTrim(Boolean trim) {
            this.trim = trim;
            return this;
        }
        public Boolean getTrim() {
            return this.trim;
        }

        public PushTaskOptions setUseChannels(String useChannels) {
            this.useChannels = useChannels;
            return this;
        }
        public String getUseChannels() {
            return this.useChannels;
        }

    }

    public static class PushTaskTarget extends TeaModel {
        @NameInMap("Platform")
        public String platform;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static PushTaskTarget build(java.util.Map<String, ?> map) throws Exception {
            PushTaskTarget self = new PushTaskTarget();
            return TeaModel.build(map, self);
        }

        public PushTaskTarget setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public PushTaskTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PushTaskTarget setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
