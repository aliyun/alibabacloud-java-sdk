// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushTask extends TeaModel {
    /**
     * <p>The push method. Optional parameter. Default value: <code>PUSH_IMMEDIATELY</code> (push immediately).</p>
     * 
     * <strong>example:</strong>
     * <p>PUSH_IMMEDIATELY</p>
     */
    @NameInMap("Action")
    public String action;

    /**
     * <p>The pass-through message data sent to the device. The total length cannot exceed 4,000 bytes.</p>
     * <blockquote>
     * <p>Length calculation notes</p>
     * <ul>
     * <li>The length is calculated based on the byte length of the UTF-8 encoded string after the Message object is serialized to JSON.</li>
     * <li>Chinese characters typically occupy 3 bytes in UTF-8 encoding.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("Message")
    public PushTaskMessage message;

    /**
     * <p>The vendor notification data sent to the device.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>When both <code>Message</code> and <code>Notification</code> are set, the device receives only one of them. The delivery rules are as follows:</p>
     * <ul>
     * <li>When the device is online, the pass-through message data is delivered.</li>
     * <li>When the device is offline, the system notification is sent.</li>
     * </ul>
     */
    @NameInMap("Notification")
    public PushTaskNotification notification;

    /**
     * <p>The push options.</p>
     */
    @NameInMap("Options")
    public PushTaskOptions options;

    /**
     * <p>Specifies the target object for message push. This parameter is optional when the operation type <code>Action</code> is set to <code>CREATE_CONTINUOUS_PUSH</code> (create a continuous push task).</p>
     */
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
        /**
         * <p>The body of the message to send.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;: &quot;value&quot;}</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>The title of the message to send.</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
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
        /**
         * <p>The custom notification bar style for Android. Valid values: 1 to 100.</p>
         * <blockquote>
         * <p>The style preset must be configured on the client. For more information, see <a href="https://help.aliyun.com/document_detail/2834944.html">Custom notification style API</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CustomStyle")
        public Integer customStyle;

        /**
         * <p>The notification alert type. Valid values:</p>
         * <ul>
         * <li><code>VIBRATE</code>: vibration (default)</li>
         * <li><code>SOUND</code>: sound</li>
         * <li><code>BOTH</code>: sound and vibration</li>
         * <li><code>NONE</code>: silent</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("NotifyType")
        public String notifyType;

        /**
         * <p>The activity to open when the notification is tapped. This parameter takes effect only when <code>OpenType</code> is set to <code>ACTIVITY</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.cloudpushdemo.bizactivity</p>
         */
        @NameInMap("OpenActivity")
        public String openActivity;

        /**
         * <p>The action after tapping the notification. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>APPLICATION</p>
         */
        @NameInMap("OpenType")
        public String openType;

        /**
         * <p>The URL to open when the notification is tapped on Android. This is valid when <code>OpenType</code> is set to <code>URL</code>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("OpenUrl")
        public String openUrl;

        /**
         * <p>The priority of the Android notification position in the notification bar. Valid values: -2, -1, 0, 1, 2.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The message group. Messages in the same group are collapsed in the notification bar and can be expanded. Messages in different groups are displayed separately.</p>
         * <blockquote>
         * <p>Android SDK 3.9.2 and later</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>order_ORD20231201001</p>
         */
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
        /**
         * <p>Specifies the importance parameter for Honor notification message classification, which determines the notification behavior on the user\&quot;s device. Valid values:</p>
         * <ul>
         * <li><code>0</code>: informational and marketing messages</li>
         * <li><code>1</code>: service and communication messages</li>
         * </ul>
         * <p>You must apply for this on the Honor platform. <a href="https://developer.honor.com/cn/docs/11002/guides/notification-class#%E8%87%AA%E5%88%86%E7%B1%BB%E6%9D%83%E7%9B%8A%E7%94%B3%E8%AF%B7">Application link</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <p>The Huawei quick notification parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BusinessType")
        public Integer businessType;

        /**
         * <p>Purpose 1: After completing the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835?#section3410731125514">self-classification privilege</a> application, this parameter identifies the message type, determines the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#ZH-CN_TOPIC_0000001149358835__p3850133955718">notification method</a>, and accelerates delivery for specific message types. For valid values, refer to the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section1076611477914">message classification standard</a> in the official Huawei Push documentation. Use the value from the &quot;Cloud notification category value&quot; or &quot;Local notification category value&quot; column in the table.</p>
         * <p>Purpose 2: After <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">applying for special permissions</a>, this parameter identifies high-priority pass-through scenarios. Valid values:</p>
         * <ul>
         * <li><code>VOIP</code>: audio and video calls</li>
         * <li><code>PLAY_VOICE</code>: voice broadcast</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For messages where the &quot;Cloud notification category value&quot; is &quot;Not applicable&quot;, messages are sent through the Alibaba Cloud proprietary channel.</li>
         * <li>For messages where the &quot;Local notification category value&quot; is &quot;Not applicable&quot;, messages are sent through the Huawei channel.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>VOIP</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The importance parameter for Huawei notification message classification, which determines the notification behavior on the user device. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Importance")
        public Integer importance;

        /**
         * <p>The JSON string of the Huawei Android Live Notification data structure <a href="https://developer.huawei.com/consumer/cn/doc/HMSCore-References/rest-live-0000001562939968#ZH-CN_TOPIC_0000001700850537__p195121620102511">LiveNotificationPayload</a>. For development and integration, refer to <a href="https://help.aliyun.com/document_detail/2983768.html">Huawei Live Notification Push Guide</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;activityId&quot;: 1,
         *   &quot;operation&quot;: 1,
         *   &quot;event&quot;: &quot;TAXI&quot;,
         *   &quot;activityData&quot;: {
         *     &quot;notificationData&quot;: {
         *       &quot;type&quot;: 3
         *     }
         *   }
         * }</p>
         */
        @NameInMap("LiveNotificationPayload")
        public String liveNotificationPayload;

        /**
         * <p>The receipt ID of the Huawei channel. You can view this receipt ID in the receipt parameter configuration on the Huawei channel push operation platform.</p>
         * <blockquote>
         * <p>If the default receipt configuration on the Huawei channel push operation platform is set to Alibaba Cloud receipt, you do not need to provide this parameter. If not, configure the default Huawei channel receipt ID in the Alibaba Cloud EMAS Mobile Push console first.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RCP4C123456</p>
         */
        @NameInMap("ReceiptId")
        public String receiptId;

        /**
         * <p>The delivery priority of the Huawei channel notification. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
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
        /**
         * <p>The Meizu message type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <p>OPPO categorizes messages into two types for management: Communication &amp; Service, and Content &amp; Marketing.</p>
         * 
         * <strong>example:</strong>
         * <p>NEWS</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The JSON character string of the OPPO Fluid Cloud intent delete data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13578">data</a>. This parameter is invalid when the AndroidOppoIntelligentIntent parameter is already specified. References: <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud Push Guide</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;intentName&quot;: &quot;Example.Progress&quot;,
         *     &quot;entityIds&quot;: [
         *         &quot;A580202509130712&quot;
         *     ],
         *     &quot;serviceId&quot;: {
         *         &quot;launcher&quot;: &quot;999800001&quot;,
         *         &quot;fluidCloud&quot;: &quot;999900001&quot;
         *     }
         * }</p>
         */
        @NameInMap("DeleteIntentData")
        public String deleteIntentData;

        /**
         * <p>The JSON character string of the OPPO Fluid Cloud intent sharing data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13565">IntelligentIntent</a>. References: <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud Push Guide</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;intentName&quot;: &quot;Example.Progress&quot;,
         *     &quot;identifier&quot;: &quot;d71ebd3119877b12ecdb6c4fe96b068e&quot;,
         *     &quot;timestamp&quot;: 1729485000989,
         *     &quot;serviceId&quot;: {
         *         &quot;launcher&quot;: &quot;999800001&quot;,
         *         &quot;fluidCloud&quot;: &quot;999900001&quot;
         *     },
         *     &quot;intentAction&quot;: {
         *         &quot;actionStatus&quot;: 0
         *     },
         *     &quot;intentEntity&quot;: {
         *         &quot;entityName&quot;: &quot;TAXI&quot;
         *     }
         * }</p>
         */
        @NameInMap("IntelligentIntent")
        public String intelligentIntent;

        /**
         * <p>The notification bar message alert level for the OPPO channel. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NotifyLevel")
        public Long notifyLevel;

        /**
         * <p>The OPPO private message template content parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;key1&quot;: &quot;value1&quot;,
         * &quot;key2&quot;: &quot;value2&quot;
         * }</p>
         */
        @NameInMap("PrivateContentParameters")
        public String privateContentParameters;

        /**
         * <p>The OPPO private message template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>687557242b1634hzefs3d5013</p>
         */
        @NameInMap("PrivateMsgTemplateId")
        public String privateMsgTemplateId;

        /**
         * <p>The OPPO private message template title parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;: &quot;John&quot;}</p>
         */
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
        @NameInMap("AddBadge")
        public Boolean addBadge;

        /**
         * <p>vivo categorizes messages into two types: system messages and operational messages.</p>
         * <p><strong>System messages:</strong></p>
         * <ul>
         * <li>IM: instant messaging</li>
         * <li>ACCOUNT: accounts and assets</li>
         * <li>TODO: schedules and to-do items</li>
         * <li>DEVICE_REMINDER: device information</li>
         * <li>ORDER: orders and logistics</li>
         * <li>SUBSCRIPTION: subscription reminders</li>
         * </ul>
         * <p><strong>Operational messages:</strong></p>
         * <ul>
         * <li>NEWS: news</li>
         * <li>CONTENT: content recommendation</li>
         * <li>MARKETING: operational activity</li>
         * <li>SOCIAL: social updates</li>
         * </ul>
         * <p>For more information, refer to <a href="https://dev.vivo.com.cn/documentCenter/doc/359#s-ef3qugc3">vivo category description</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>MARKETING</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies the vivo notification message category. Valid values:</p>
         * <ul>
         * <li><code>0</code>: Operational message (default).</li>
         * <li><code>1</code>: System message.</li>
         * </ul>
         * <blockquote>
         * <p>Use <code>Category</code> for notification classification. You need to apply on the vivo platform. For more information, see <a href="https://dev.vivo.com.cn/documentCenter/doc/359">Application link</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Importance")
        public Integer importance;

        /**
         * <p>The JSON character string of the vivo Atomic Island data structure <a href="https://dev.vivo.com.cn/documentCenter/doc/896#s-fdagzbd4">liveMessage</a>. References: <a href="https://www.alibabacloud.com/help/en/document_detail/3030718.html">vivo Atomic Island Push Guide</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;operation&quot;: 0,
         *     &quot;scene&quot;: &quot;HEALTH_REGISTER&quot;,
         *     &quot;templateType&quot;: 1,
         *     &quot;showNotify&quot;: true,
         *     &quot;changeRecord&quot;: 999,
         *     &quot;capsuleData&quot;: {
         *         &quot;bgColor&quot;: &quot;#32d4d4&quot;
         *     }
         * }</p>
         */
        @NameInMap("LiveMessage")
        public String liveMessage;

        /**
         * <p>The message receipt identifier for the vivo vendor push channel, used to receive push result callback notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>1232221</p>
         */
        @NameInMap("ReceiptId")
        public String receiptId;

        public static PushTaskNotificationAndroidOptionsVivo build(java.util.Map<String, ?> map) throws Exception {
            PushTaskNotificationAndroidOptionsVivo self = new PushTaskNotificationAndroidOptionsVivo();
            return TeaModel.build(map, self);
        }

        public PushTaskNotificationAndroidOptionsVivo setAddBadge(Boolean addBadge) {
            this.addBadge = addBadge;
            return this;
        }
        public Boolean getAddBadge() {
            return this.addBadge;
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

        public PushTaskNotificationAndroidOptionsVivo setLiveMessage(String liveMessage) {
            this.liveMessage = liveMessage;
            return this;
        }
        public String getLiveMessage() {
            return this.liveMessage;
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
        /**
         * <p>The channel ID for Xiaomi notification types. You must apply for this on the Xiaomi platform. For more information, see <a href="https://dev.mi.com/console/doc/detail?pId=2422#_4">Application link</a>.</p>
         * <blockquote>
         * <p>A single application can apply for a maximum of 8 channels on the Xiaomi channel. Plan ahead.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>michannel</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The JSON character string of the Xiaomi Super Island data structure <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.param</a>. References: <a href="https://www.alibabacloud.com/help/en/document_detail/3037956.html">Xiaomi Super Island Push Guide</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;param_v2&quot;: {
         *         &quot;business&quot;: &quot;taxi&quot;,
         *         &quot;updatable&quot;: true,
         *         &quot;orderId&quot;: &quot;A580202509130712&quot;,
         *         &quot;param_island&quot;: {
         *             &quot;islandProperty&quot;: 1,
         *             &quot;bigIslandArea&quot;: {
         *                 &quot;imageTextInfoLeft&quot;: {
         *                     &quot;type&quot;: 1
         *                 }
         *             }
         *         }
         *     }
         * }</p>
         */
        @NameInMap("FocusParam")
        public String focusParam;

        /**
         * <p>The JSON character string of the Xiaomi Super Island image data <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.pic_xxx</a>. References: <a href="https://www.alibabacloud.com/help/en/document_detail/3037956.html">Xiaomi Super Island Push Guide</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;miui.focus.pic_ticker&quot;: &quot;<a href="https://example.com/ticker.jpg">https://example.com/ticker.jpg</a>&quot;,
         *     &quot;miui.focus.pic_aod&quot;: &quot;<a href="https://example.com/aod.jpg">https://example.com/aod.jpg</a>&quot;,
         *     &quot;miui.focus.pic_imageText&quot;: &quot;<a href="https://example.com/imageText.jpg">https://example.com/imageText.jpg</a>&quot;
         * }</p>
         */
        @NameInMap("FocusPics")
        public String focusPics;

        /**
         * <p>The Xiaomi private message template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>P10645</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The Xiaomi private message template parameters in JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;keywords1&quot;:&quot;Tom&quot;,&quot;keywords2&quot;:&quot;phone&quot;}</p>
         */
        @NameInMap("TemplateParams")
        public String templateParams;

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

        public PushTaskNotificationAndroidOptionsXiaomi setFocusParam(String focusParam) {
            this.focusParam = focusParam;
            return this;
        }
        public String getFocusParam() {
            return this.focusParam;
        }

        public PushTaskNotificationAndroidOptionsXiaomi setFocusPics(String focusPics) {
            this.focusPics = focusPics;
            return this;
        }
        public String getFocusPics() {
            return this.focusPics;
        }

        public PushTaskNotificationAndroidOptionsXiaomi setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public PushTaskNotificationAndroidOptionsXiaomi setTemplateParams(String templateParams) {
            this.templateParams = templateParams;
            return this;
        }
        public String getTemplateParams() {
            return this.templateParams;
        }

    }

    public static class PushTaskNotificationAndroidOptions extends TeaModel {
        /**
         * <p>The Alibaba Cloud proprietary channel configuration.</p>
         */
        @NameInMap("Accs")
        public PushTaskNotificationAndroidOptionsAccs accs;

        /**
         * <p>The Honor channel configuration.</p>
         */
        @NameInMap("Honor")
        public PushTaskNotificationAndroidOptionsHonor honor;

        /**
         * <p>The Huawei channel configuration.</p>
         */
        @NameInMap("Huawei")
        public PushTaskNotificationAndroidOptionsHuawei huawei;

        /**
         * <p>The Meizu channel configuration.</p>
         */
        @NameInMap("Meizu")
        public PushTaskNotificationAndroidOptionsMeizu meizu;

        /**
         * <p>The OPPO channel configuration.</p>
         */
        @NameInMap("Oppo")
        public PushTaskNotificationAndroidOptionsOppo oppo;

        /**
         * <p>The vivo channel configuration.</p>
         */
        @NameInMap("Vivo")
        public PushTaskNotificationAndroidOptionsVivo vivo;

        /**
         * <p>The Xiaomi channel configuration.</p>
         */
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
        /**
         * <p>The full class name of the Activity for the badge setting application entry.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.cloudpushdemo.bizactivity</p>
         */
        @NameInMap("BadgeActivity")
        public String badgeActivity;

        /**
         * <p>The incremental badge count value, which is added to the current badge count.</p>
         * <blockquote>
         * <ul>
         * <li>Supported on <code>Huawei</code> and <code>Honor</code> channels.</li>
         * <li>If both <code>BadgeAddNum</code> and <code>BadgeSetNum</code> are specified, <code>BadgeSetNum</code> takes precedence.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BadgeAddNum")
        public Integer badgeAddNum;

        /**
         * <p>The fixed badge number. Valid values: 1 to 99.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("BadgeSetNum")
        public Integer badgeSetNum;

        /**
         * <p>The channelId of the Android app. This must match the channelId configured in the vendor app.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0up</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The custom extension attributes of the Android notification.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;:&quot;value1&quot;}</p>
         */
        @NameInMap("ExtParameters")
        public String extParameters;

        /**
         * <p>The message group. Only the latest message and the total number of messages received in the group are displayed in the notification bar. All messages are not displayed and cannot be expanded. Currently supported channels:</p>
         * <ul>
         * <li>Huawei channel</li>
         * <li>Honor channel</li>
         * <li>Chinese domestic channel with Android SDK 3.9.1 and earlier</li>
         * </ul>
         * <blockquote>
         * <p>The Chinese domestic channel no longer supports this parameter in Android SDK 3.9.2 and later.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>group-1</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The URL of the right-side icon. Currently supported:</p>
         * <ul>
         * <li><code>Huawei EMUI</code> (applicable only in long text mode and Inbox mode).</li>
         * <li><code>Honor Magic UI</code> (applicable only in long text mode).</li>
         * <li><code>Custom channel</code> (Android SDK 3.5.0 and later).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The body content in Inbox mode. The value must be a valid JSON array with no more than 5 elements. Currently supported on:</p>
         * <ul>
         * <li>Huawei: EMUI 9 and later</li>
         * <li>Honor: Magic UI 4.0 and later</li>
         * <li>Xiaomi: MIUI 10 and later</li>
         * <li>OPPO: ColorOS later than 5.0</li>
         * <li>Custom channel: Android SDK 3.6.0 and later</li>
         * </ul>
         */
        @NameInMap("InboxContent")
        public java.util.List<String> inboxContent;

        /**
         * <p>The notification sound for the Huawei vendor channel. Specify the audio file name stored in the client project directory <code>app/src/main/res/raw/</code> without the file format extension. If not set, the default ringtone is used.</p>
         * 
         * <strong>example:</strong>
         * <p>alicloud_notification_sound</p>
         */
        @NameInMap("Music")
        public String music;

        /**
         * <p>The unique identifier of the Android notification bar message, used to control notification override and replacement behavior. A new notification with the same NotifyId automatically overrides the old notification.</p>
         * 
         * <strong>example:</strong>
         * <p>233856727</p>
         */
        @NameInMap("NotifyId")
        public Integer notifyId;

        /**
         * <p>The detailed channel configuration.</p>
         */
        @NameInMap("Options")
        public PushTaskNotificationAndroidOptions options;

        /**
         * <p>The image URL in big picture mode. Currently supported: proprietary channel: Android SDK 3.6.0 and later.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
         */
        @NameInMap("PictureUrl")
        public String pictureUrl;

        /**
         * <p>The notification style. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RenderStyle")
        public String renderStyle;

        /**
         * <p>Specifies the notification type for the manufacturer channel. Valid values:</p>
         * <ul>
         * <li><code>false</code>: Production notification. This is the default value.</li>
         * <li><code>true</code>: Test notification.</li>
         * </ul>
         * <blockquote>
         * <p>Currently supported: Huawei channel, Honor channel, vivo channel, and OPPO Fluid Cloud.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TestMessage")
        public Boolean testMessage;

        /**
         * <p>The Activity to open when the notification is tapped.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.cloudpushdemo.bizactivity</p>
         */
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
        /**
         * <p>The action that corresponds to the ability of the in-app page.</p>
         * <blockquote>
         * <p>For more information, refer to <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.action</a> on the HarmonyOS official website.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>com.example.action</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The incremental badge number for HarmonyOS applications.</p>
         * <blockquote>
         * <ul>
         * <li>Supported since HarmonyOS SDK 1.2.0.</li>
         * <li>Refer to the HarmonyOS badge <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">addNum field description</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BadgeAddNum")
        public Integer badgeAddNum;

        /**
         * <p>The number to set for the HarmonyOS app badge.</p>
         * <blockquote>
         * <ul>
         * <li>Refer to the HarmonyOS badge <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">setNum field</a> description.</li>
         * <li>Supported since HarmonyOS SDK version 1.2.0.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BadgeSetNum")
        public Integer badgeSetNum;

        /**
         * <p>The category of the notification message. This is an optional parameter. Default value: <code>MARKETING</code>.</p>
         * <blockquote>
         * <p>After you complete the application for the notification message self-classification privilege, this parameter identifies the message type. Different notification message types affect how messages are displayed and how reminders are triggered. For more information, refer to <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.category</a> on the HarmonyOS official website.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>IM</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The custom extension attributes of the notification message, used to pass additional business data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;: &quot;value&quot;}</p>
         */
        @NameInMap("ExtParameters")
        public String extParameters;

        /**
         * <p>The extra data of the notification extension message.</p>
         * <blockquote>
         * <ul>
         * <li>Valid when sending HarmonyOS notification extension messages.</li>
         * <li>Conceptually equivalent to the extraData field of HarmonyOS notification extension messages. For the specific definition, refer to the HarmonyOS <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section161192514234">ExtensionPayload</a> documentation.</li>
         * <li>Supported since HarmonyOS SDK 1.2.0.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("ExtensionExtraData")
        public String extensionExtraData;

        /**
         * <p>Enables HarmonyOS notification extension.</p>
         * <blockquote>
         * <ul>
         * <li>To send notification extension messages, you must first apply for permissions on the HarmonyOS official website. For more information, refer to <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-guides-V5/push-send-extend-noti-V5">HarmonyOS documentation</a> on sending notification extension messages.</li>
         * <li>Supported starting from HarmonyOS SDK 1.2.0.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ExtensionPush")
        public Boolean extensionPush;

        /**
         * <p>The URL of the large icon displayed on the right side of the notification. The URL must use the HTTPS protocol.</p>
         * <blockquote>
         * <ul>
         * <li>Supported image formats include png, jpg, jpeg, heif, gif, and bmp. The image length × width must be less than 25000 pixels.</li>
         * <li>For more information, refer to the HarmonyOS official documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.image</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/xxx.png">https://example.com/xxx.png</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>When <code>RenderStyle</code> is set to <code>MULTI_LINE</code>, this field is required to define the content in multi-line text style. A maximum of 3 items are supported.</p>
         */
        @NameInMap("InboxContent")
        public java.util.List<String> inboxContent;

        /**
         * <p>The JSON string of the HarmonyOS Live View data structure <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V13/push-scenariozed-api-request-param-V13#section66881469306">LiveViewPayload</a>. For development and integration, refer to <a href="https://help.aliyun.com/document_detail/2982112.html">HarmonyOS Live View Push Guide</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;activityId&quot;: 1,
         *   &quot;operation&quot;: 0,
         *   &quot;event&quot;: &quot;TAXI&quot;,
         *   &quot;status&quot;: &quot;DRIVER_ON_THE_WAY&quot;,
         *   &quot;activityData&quot;: {
         *     &quot;notificationData&quot;: {
         *       &quot;type&quot;: 3
         *     }
         *   }
         * }</p>
         */
        @NameInMap("LiveViewPayload")
        public String liveViewPayload;

        /**
         * <p>The unique identifier (notifyId) for each message displayed in the notification bar. If not provided, the push service automatically generates a unique identifier. Different notification messages can use the same notifyId to enable new messages to overwrite old messages. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.notifyId</a> on the HarmonyOS official website.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("NotifyId")
        public Integer notifyId;

        /**
         * <p>The receipt ID of the HarmonyOS channel. You can view this receipt ID in the receipt parameter settings on the HarmonyOS channel push operation platform.</p>
         * 
         * <strong>example:</strong>
         * <p>RCPB***DFD5</p>
         */
        @NameInMap("ReceiptId")
        public String receiptId;

        /**
         * <p>The notification message style. This is an optional parameter. Default value: normal notification.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("RenderStyle")
        public String renderStyle;

        /**
         * <p>Specifies the notification channel type to use.</p>
         * <blockquote>
         * <ul>
         * <li>Valid only for the Alibaba Cloud proprietary channel.</li>
         * <li>For more information, refer to the HarmonyOS official documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/js-apis-notificationmanager-V5#slottype">SlotType</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SOCIAL_COMMUNICATION</p>
         */
        @NameInMap("SlotType")
        public String slotType;

        /**
         * <p>The HarmonyOS custom ringtone file name.</p>
         * 
         * <strong>example:</strong>
         * <p>music.mp3</p>
         */
        @NameInMap("Sound")
        public String sound;

        /**
         * <p>The custom notification ringtone duration in seconds. Valid values: 1 to 60. The ringtone loops if its duration is shorter than the specified value.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SoundDuration")
        public Integer soundDuration;

        /**
         * <p>Enables the test message.</p>
         * <blockquote>
         * <ul>
         * <li>For more information, refer to the HarmonyOS push parameter <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">TestMessage</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TestMessage")
        public Boolean testMessage;

        /**
         * <p>The URI that corresponds to the in-app page ability.</p>
         * <blockquote>
         * <ul>
         * <li>When multiple Abilities exist, specify the action and URI for each Ability separately. The action is used first to find the corresponding in-app page.</li>
         * <li>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.uri</a> on the HarmonyOS official website.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com:8080/push/example">https://www.example.com:8080/push/example</a></p>
         */
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
        /**
         * <p>The static pass-through parameter for iOS Live Activities push notifications, used to pass immutable business identifier information.</p>
         * <blockquote>
         * <p>Required when <code>Event</code> is set to start.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;orderId&quot;: &quot;ORD20231201001&quot;,
         *   &quot;restaurantName&quot;: &quot;Delicious Restaurant&quot;,
         *   &quot;customerAddress&quot;: &quot;No. xx, xx Road, xx District&quot;,
         *   &quot;orderType&quot;: &quot;delivery&quot;
         * }</p>
         */
        @NameInMap("Attributes")
        public String attributes;

        /**
         * <p>The type of the Live Activity to start.</p>
         * 
         * <strong>example:</strong>
         * <p>OrderActivityAttributes</p>
         */
        @NameInMap("AttributesType")
        public String attributesType;

        /**
         * <p>The dynamic pass-through parameters of the Live Activity, containing real-time updatable status information and changing data.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;status&quot;: &quot;delivering&quot;,
         *     &quot;estimatedTime&quot;: &quot;10 minutes&quot;,
         *     &quot;progress&quot;: 80,
         *     &quot;driverName&quot;: &quot;Driver Li&quot;,
         *     &quot;currentStep&quot;: &quot;The delivery driver is on the way&quot;}
         * }</p>
         */
        @NameInMap("ContentState")
        public String contentState;

        /**
         * <p>The retention time of an ended Live Activity on the lock screen, allowing users to view information after the activity ends. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1701439800</p>
         */
        @NameInMap("DismissalDate")
        public Long dismissalDate;

        /**
         * <p>Starts, updates, or ends a Live Activity.</p>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The unique identifier of the Live Activity, used to associate the device-side activity instance with the server-side push target.</p>
         * 
         * <strong>example:</strong>
         * <p>FOOD_DELIVERY_ORD20231201001</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The expiration timestamp for the iOS Live Activity content, specified as a Unix timestamp in seconds.</p>
         * <blockquote>
         * <ul>
         * <li>After the specified time is reached, the system automatically marks the activity as expired.</li>
         * <li>Expired activities are removed from the Dynamic Island and Lock Screen.</li>
         * <li>This prevents outdated information from occupying the user interface for an extended period.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1701425400</p>
         */
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
        /**
         * <p>iOS notifications are sent through the APNs center. You need to specify the corresponding environment information. Optional parameter. Default value: production environment.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("ApnsEnv")
        public String apnsEnv;

        /**
         * <p>The iOS application badge number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Badge")
        public Integer badge;

        /**
         * <p>Specifies whether to enable the badge auto-increment feature. Optional parameter. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BadgeAutoIncrement")
        public Boolean badgeAutoIncrement;

        /**
         * <p>The category identifier for the iOS notification, which defines the interaction behavior and display style of the notification.</p>
         * <blockquote>
         * <ul>
         * <li>The category must be pre-registered in the app to take effect.</li>
         * <li>Different categories can define different sets of actions.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MESSAGE_REPLY</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The unique identifier for notification collapsing. Notifications with the same identifier are overwritten and displayed as one.</p>
         * 
         * <strong>example:</strong>
         * <p>order_status_update_12345</p>
         */
        @NameInMap("CollapseId")
        public String collapseId;

        /**
         * <p>The custom extension attributes of the iOS notification.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;attachment&quot;: &quot;<a href="https://xxxx.xxx/notification_pic.png%22%7D">https://xxxx.xxx/notification_pic.png&quot;}</a></p>
         */
        @NameInMap("ExtParameters")
        public String extParameters;

        /**
         * <p>The interruption level. Optional parameter. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("InterruptionLevel")
        public String interruptionLevel;

        /**
         * <p>The Live Activity parameter object.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li>Live Activity push notifications can only be sent to a <strong>single device</strong> by specifying the <code>DEVICE</code> type.</li>
         * <li>When pushing Live Activity notifications, the title and body parameters are optional.</li>
         * </ul>
         */
        @NameInMap("LiveActivity")
        public PushTaskNotificationIosLiveActivity liveActivity;

        /**
         * <p>The notification sound for iOS. Specify the name of an audio file stored in the app bundle or the Library/Sounds directory of the sandbox. For more information, see <a href="https://help.aliyun.com/document_detail/48906.html">How to set notification sounds for iOS push</a>.</p>
         * <blockquote>
         * <ul>
         * <li>If set to an empty string (&quot;&quot;), the notification is silent.</li>
         * <li>If not specified, the value defaults to &quot;default&quot;, which plays the system alert sound.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Music")
        public String music;

        /**
         * <p>Specifies whether to enable the notification extension, which controls whether iOS notifications support processing by Notification Service Extension.</p>
         * <blockquote>
         * <ul>
         * <li>When sending silent notifications, this parameter must be set to true.</li>
         * <li>The Extension processing time cannot exceed 30 seconds.</li>
         * <li>A timeout causes the notification to display the original content.</li>
         * <li>You must add a Notification Service Extension to your application.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Mutable")
        public Boolean mutable;

        /**
         * <p>The relevance score of the notification message, used to control the priority and display strategy of the notification.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("RelevanceScore")
        public Double relevanceScore;

        /**
         * <p>Specifies whether to enable silent push mode.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Silent")
        public Boolean silent;

        /**
         * <p>The subtitle content of the iOS notification.</p>
         * 
         * <strong>example:</strong>
         * <p>Please check your order</p>
         */
        @NameInMap("Subtitle")
        public String subtitle;

        /**
         * <p>The thread identifier for iOS notification grouping, which is used to categorize and collapse related notifications.</p>
         * <blockquote>
         * <ul>
         * <li>Notifications with the same thread-id are automatically grouped together.</li>
         * <li>Multiple related notifications are collapsed into a single notification group.</li>
         * <li>Users can expand the group to view all notifications within it.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>news_category_tech</p>
         */
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
        /**
         * <p>The Android notification configuration.</p>
         */
        @NameInMap("Android")
        public PushTaskNotificationAndroid android;

        /**
         * <p>The body of the push notification.</p>
         * 
         * <strong>example:</strong>
         * <p>Dear customer, your reservation order has been successfully canceled</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>The HarmonyOS notification configuration.</p>
         */
        @NameInMap("Hmos")
        public PushTaskNotificationHmos hmos;

        /**
         * <p>The iOS notification configuration.</p>
         */
        @NameInMap("Ios")
        public PushTaskNotificationIos ios;

        /**
         * <p>The title of the push notification.</p>
         * <blockquote>
         * <p>Length limits:</p>
         * <ul>
         * <li>iOS/Harmony: The <strong>byte length</strong> cannot exceed 200.</li>
         * <li>Android: The <strong>character length</strong> cannot exceed 50.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>You have a new message</p>
         */
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
        /**
         * <p>The delay before triggering the SMS message. Unit: seconds.</p>
         * <p>This parameter is required when SMS linkage is used. We recommend that you set this parameter to at least 15 seconds and no more than 3 days to avoid duplicate notifications from both SMS and push.</p>
         * <blockquote>
         * <p>When SMS linkage is used, the ExpireTime parameter does not take effect. The notification expiration time is calculated based on the DelaySecs parameter. The expiration time is the current time plus the DelaySecs value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("DelaySecs")
        public Long delaySecs;

        /**
         * <p>The key-value pairs of variable names in the SMS template.</p>
         * 
         * <strong>example:</strong>
         * <p>key1=value1&amp;key2=value2</p>
         */
        @NameInMap("Params")
        public String params;

        /**
         * <p>The SMS sending policy.</p>
         * 
         * <strong>example:</strong>
         * <p>PUSH_NOT_RECEIVED</p>
         */
        @NameInMap("SendPolicy")
        public String sendPolicy;

        /**
         * <p>The SMS signature.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleTech</p>
         */
        @NameInMap("SignName")
        public String signName;

        /**
         * <p>The SMS template name. You can obtain this name from the SMS template management page. This is the system-assigned name, not the name set by the developer.</p>
         * 
         * <strong>example:</strong>
         * <p>SMS_123456789</p>
         */
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
        /**
         * <p>The expiration time of the message. The message will not be sent after it expires. Messages can be retained for up to 72 hours.</p>
         * <blockquote>
         * <ul>
         * <li>The time follows the ISO 8601 standard in UTC. Format: YYYY-MM-DDThh:mm:ssZ.</li>
         * <li>The expiration time must meet the following condition: ExpireTime &gt; PushTime + 3 seconds (3 seconds is the redundancy for network and system latency).</li>
         * <li>Recommendation: Set the expiration time to at least 1 minute for single push notifications and at least 10 minutes for full push or batch push notifications.</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>Notice: For pass-through messages, if no expiration time is set, the message is sent only to online devices. When the device is offline, the message is discarded.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-06-21T12:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The custom identifier for the push task. When JobKey is not empty, this field is included in the receipt log. For more information about receipt logs, see <a href="https://help.aliyun.com/document_detail/434651.html">Receipt logs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>jobkey1727749697913</p>
         */
        @NameInMap("JobKey")
        public String jobKey;

        /**
         * <p>The unique ID used to identify the message. This parameter is valid only when the <code>Action</code> parameter is set to <code>CONTINUOUS_PUSH</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1174754033128****</p>
         */
        @NameInMap("MessageId")
        public Long messageId;

        /**
         * <p>The scheduled time to send the message. The value cannot be later than 7 days from the current time. This parameter takes effect only when <code>Action</code> is set to <code>SCHEDULED_PUSH</code>.</p>
         * <blockquote>
         * <p>The time follows the ISO 8601 standard in UTC in the format of yyyy-MM-ddTHH:mm:ssZ.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-06-19T12:00:00Z</p>
         */
        @NameInMap("PushTime")
        public String pushTime;

        /**
         * <p>The supplementary SMS settings.</p>
         */
        @NameInMap("Sms")
        public PushTaskOptionsSms sms;

        /**
         * <p>Specifies whether to automatically truncate titles and content that exceed the length limit.</p>
         * <blockquote>
         * <p>This parameter applies only to vendor channels that explicitly limit the title and content length. It does not apply to channels such as APNs, Huawei, and Honor that do not limit the title or content length but only limit the total request body size.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Trim")
        public Boolean trim;

        /**
         * <p>Specifies the delivery channels. Valid values:</p>
         * <ul>
         * <li><code>accs</code>: Alibaba Cloud proprietary channel</li>
         * <li><code>huawei</code>: Huawei channel</li>
         * <li><code>honor</code>: Honor channel</li>
         * <li><code>xiaomi</code>: Xiaomi channel</li>
         * <li><code>oppo</code>: OPPO channel</li>
         * <li><code>vivo</code>: vivo channel</li>
         * <li><code>meizu</code>: Meizu channel</li>
         * <li><code>fcm</code>: Google Firebase channel (HTTP v1 API)</li>
         * <li><code>apns</code>: APNs channel</li>
         * <li><code>harmony</code>: HarmonyOS channel</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If this parameter is not specified, all channels are available.</li>
         * <li>If this parameter is specified, only the specified channels are used.</li>
         * <li>If the specified channels conflict with the delivery policy (for example, iOS notifications can only be delivered through the APNs channel, but apns is not included in this parameter), the message is not delivered.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>accs,apns</p>
         */
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
        /**
         * <p>The platform type. Optional parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>IOS</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The push target type.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>The batch push operation <code>MassPushV2</code> and continuous push <code>CONTINUOUS_PUSH</code> support only the following three target types:</p>
         * <ul>
         * <li><code>DEVICE</code></li>
         * <li><code>ACCOUNT</code></li>
         * <li><code>ALIAS</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEVICE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The push target based on <code>Target.Type</code>. Separate multiple targets with commas. The following describes the target types and target values:</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
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
