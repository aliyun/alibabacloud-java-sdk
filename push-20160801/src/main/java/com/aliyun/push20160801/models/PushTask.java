// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushTask extends TeaModel {
    /**
     * <p>The push method. This parameter is optional. Default value: PUSH_IMMEDIATELY (push immediately).</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>The MassPushV2 batch push API supports only the following push methods:</p>
     * <ul>
     * <li>PUSH_IMMEDIATELY (push immediately)</li>
     * <li>SCHEDULED_PUSH (scheduled push)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUSH_IMMEDIATELY</p>
     */
    @NameInMap("Action")
    public String action;

    /**
     * <p>The pass-through message data sent to the device. The total length cannot exceed 4,000 bytes.</p>
     * <blockquote>
     * <p>Length calculation rules</p>
     * <ul>
     * <li>The length is calculated based on the byte length of the UTF-8 encoded string after the Message object is serialized into JSON.</li>
     * <li>A Chinese character typically occupies 3 bytes in UTF-8 encoding.</li>
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
     * <p>If both Message and Notification are configured, the device receives only one of them based on the following rules:</p>
     * <ul>
     * <li>If the device is online, the pass-through message data is sent.</li>
     * <li>If the device is offline, the system notification is sent.</li>
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
     * <p>The target object for the message push. This parameter is optional when the Action parameter is set to CREATE_CONTINUOUS_PUSH (create a continuous push task).</p>
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
         * <p>The body of the message to be sent.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;: &quot;value&quot;}</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>The title of the message to be sent.</p>
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
         * <p>The client must complete the style preset configuration. References: <a href="https://help.aliyun.com/document_detail/2834944.html">Custom notification style API</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CustomStyle")
        public Integer customStyle;

        /**
         * <p>The reminder method for the notification. Valid values:</p>
         * <ul>
         * <li>VIBRATE: Vibration (default).</li>
         * <li>SOUND: Sound.</li>
         * <li>BOTH: Sound and vibration.</li>
         * <li>NONE: Silent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("NotifyType")
        public String notifyType;

        /**
         * <p>Specifies the activity to open when the notification is clicked. Valid only when OpenType is set to ACTIVITY.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.cloudpushdemo.bizactivity</p>
         */
        @NameInMap("OpenActivity")
        public String openActivity;

        /**
         * <p>The action to perform when the notification is clicked. Valid values:</p>
         * <ul>
         * <li>APPLICATION: Open the application (default).</li>
         * <li>ACTIVITY: Open the specified activity OpenActivity.</li>
         * <li>URL: Open a URL.</li>
         * <li>NONE: No redirection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APPLICATION</p>
         */
        @NameInMap("OpenType")
        public String openType;

        /**
         * <p>The URL to open when the notification is clicked after an Android device receives the push message. Valid only when OpenType is set to URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("OpenUrl")
        public String openUrl;

        /**
         * <p>The priority of the display position for Android notifications in the notification bar. Valid values: -2, -1, 0, 1, and 2.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The message group. Messages in the same group are collapsed and can be expanded in the notification bar. Notifications from different groups are displayed separately.</p>
         * <blockquote>
         * <p>Supported by Android SDK 3.9.2 or later.</p>
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
         * <p>Sets the importance parameter for Honor notification message classification, which determines the notification behavior on user devices. Valid values:</p>
         * <ul>
         * <li>0: Information and marketing messages.</li>
         * <li>1: Service and communication messages.</li>
         * </ul>
         * <p>You must apply on the Honor platform. See <a href="https://developer.honor.com/cn/docs/11002/guides/notification-class#%E8%87%AA%E5%88%86%E7%B1%BB%E6%9D%83%E7%9B%8A%E7%94%B3%E8%AF%B7">Application link</a>.</p>
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
         * <p>Sets the Huawei fast notification parameter. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Send standard Huawei notifications (default).</li>
         * <li><strong>1</strong>: Send Huawei fast notifications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BusinessType")
        public Integer businessType;

        /**
         * <p>Purpose 1: After applying for <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835?#section3410731125514">self-classification benefits</a>, this parameter is used to identify the message type, determine the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#ZH-CN_TOPIC_0000001149358835__p3850133955718">message reminder method</a>, and accelerate the delivery of specific types of messages. For valid values, refer to the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section1076611477914">message classification standards</a> in the official Huawei push documentation, and fill in the &quot;Cloud notification category value&quot; or &quot;Local notification category value&quot; from the documentation table.</p>
         * <p>Purpose 2: After <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">applying for special permissions</a>, this parameter is used to identify high-priority pass-through scenarios. Valid values:</p>
         * <ul>
         * <li>VOIP: Audio and video calls.</li>
         * <li>PLAY_VOICE: Voice broadcast.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If the &quot;Cloud notification category value&quot; is &quot;Not applicable&quot;, the message is sent through the Alibaba Cloud proprietary channel.</li>
         * <li>If the &quot;Local notification category value&quot; is &quot;Not applicable&quot;, the message is sent through the Huawei channel.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>VOIP</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Sets the importance parameter for Huawei notification message classification, which determines the notification behavior on user devices. Valid values:</p>
         * <ul>
         * <li>0: Information and marketing messages.</li>
         * <li>1: Service and communication messages.</li>
         * </ul>
         * <blockquote>
         * <p>We recommend that you use Category for notification classification. You must apply on the Huawei platform. See <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section893184112272">Application link</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Importance")
        public Integer importance;

        /**
         * <p>The JSON string of the Huawei Android Live Window data structure <a href="https://developer.huawei.com/consumer/cn/doc/HMSCore-References/rest-live-0000001562939968#ZH-CN_TOPIC_0000001700850537__p195121620102511">LiveNotificationPayload</a>. For development and integration, refer to the <a href="https://help.aliyun.com/document_detail/2983768.html">Huawei Live Window push guide</a>.</p>
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
         * <p>The receipt ID of the Huawei channel. You can view this receipt ID in the receipt parameter settings of the Huawei channel push operations platform.</p>
         * <blockquote>
         * <p>If the default receipt configuration on the Huawei channel push operations platform is set to Alibaba Cloud receipt, you do not need to provide this parameter. Otherwise, we recommend that you configure the default receipt ID for the Huawei channel in the Alibaba Cloud EMAS shift push console first.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RCP4C123456</p>
         */
        @NameInMap("ReceiptId")
        public String receiptId;

        /**
         * <p>The delivery priority for Huawei channel notifications. Valid values:</p>
         * <ul>
         * <li>HIGH</li>
         * <li>NORMAL</li>
         * </ul>
         * <p>You must apply for permissions. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">Application link</a>.</p>
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
         * <p>The Meizu message type. Valid values:</p>
         * <ul>
         * <li>0: Public message (default).</li>
         * <li>1: Private message.</li>
         * </ul>
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
         * <p>OPPO message categorization includes two categories for management: communication and service, and content and marketing. </p>
         * <p><strong>Communication and service (requires permission application):</strong></p>
         * <ul>
         * <li>IM: Instant messages.</li>
         * <li>ACCOUNT: Accounts and assets.</li>
         * <li>TODO: Schedules and to-do lists.</li>
         * <li>DEVICE_REMINDER: Device information.</li>
         * <li>ORDER: Orders and logistics.</li>
         * <li>SUBSCRIPTION: subscribe reminders.</li>
         * </ul>
         * <p><strong>Content and marketing:</strong></p>
         * <ul>
         * <li>NEWS: News.</li>
         * <li>CONTENT: Content recommendations.</li>
         * <li>MARKETING: operational activity.</li>
         * <li>SOCIAL: Social updates.</li>
         * </ul>
         * <p>For more information, see the <a href="https://open.oppomobile.com/new/developmentDoc/info?id=13189">OPPO categorization description</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>NEWS</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The JSON character string of the OPPO Fluid Cloud intent delete data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13578">data</a>. This parameter is invalid if the AndroidOppoIntelligentIntent parameter is already specified. For development and integration, References: <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud push guide</a>.</p>
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
         * <p>The JSON character string of the OPPO Fluid Cloud intent sharing data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13565">IntelligentIntent</a>. For development and integration, References: <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud push guide</a>.</p>
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
         * <p>The reminder level for OPPO channel notification bar messages. Valid values:</p>
         * <ul>
         * <li>1: Notification bar.</li>
         * <li>2: Notification bar, lock screen, ringtone, and vibration (default notification level for communication and service messages).</li>
         * <li>16: Notification bar, lock screen, ringtone, vibration, and banner (requires permission application).</li>
         * </ul>
         * <blockquote>
         * <p>When you use the NotifyLevel parameter, you must also pass the Category parameter.</p>
         * </blockquote>
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
         * <p>{&quot;name&quot;: &quot;Zhang San&quot;}</p>
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
        /**
         * <p>Sets the increment value for the vivo channel badge.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AddBadge")
        public Boolean addBadge;

        /**
         * <p>vivo message categorization includes two categories for management: system messages and operation messages. </p>
         * <p><strong>System messages:</strong></p>
         * <ul>
         * <li>IM: Instant messages.</li>
         * <li>ACCOUNT: Accounts and assets.</li>
         * <li>TODO: Schedules and to-do lists.</li>
         * <li>DEVICE_REMINDER: Device information.</li>
         * <li>ORDER: Orders and logistics.</li>
         * <li>SUBSCRIPTION: subscribe reminders.</li>
         * </ul>
         * <p><strong>Operation messages:</strong></p>
         * <ul>
         * <li>NEWS: News.</li>
         * <li>CONTENT: Content recommendations.</li>
         * <li>MARKETING: operational activity.</li>
         * <li>SOCIAL: Social updates.</li>
         * </ul>
         * <p>For more information, see <a href="https://dev.vivo.com.cn/documentCenter/doc/359#s-ef3qugc3">vivo categorization description</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>MARKETING</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Sets the vivo notification message classification. Valid values:</p>
         * <ul>
         * <li>0: Operation messages (default).</li>
         * <li>1: System messages.</li>
         * </ul>
         * <blockquote>
         * <p>We recommend that you use Category for notification classification. You must apply on the vivo platform. For more information, see <a href="https://dev.vivo.com.cn/documentCenter/doc/359">Application link</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Importance")
        public Integer importance;

        /**
         * <p>The JSON character string of the vivo Atomic Island data structure <a href="https://dev.vivo.com.cn/documentCenter/doc/896#s-fdagzbd4">liveMessage</a>. For development and integration, References: <a href="https://www.alibabacloud.com/help/en/document_detail/3030718.html">vivo Atomic Island push guide</a>.</p>
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
         * <p>The message receipt identifier for the vivo vendor push channel, used to receive callback notifications for push results.</p>
         * <blockquote>
         * <ul>
         * <li>Location: vivo Open Platform &gt; Push Service &gt; Application Information &gt; Receipt Configuration.</li>
         * <li>Configuration recommendation: Configure the default receipt ID in the Alibaba Cloud EMAS console first.</li>
         * <li>Usage condition: Required only when the default receipt on the vivo platform is not the Alibaba Cloud receipt.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1232221</p>
         */
        @NameInMap("ReceiptId")
        public String receiptId;

        /**
         * <strong>example:</strong>
         * <p>t1-ge3-lq</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;keywords1&quot;:&quot;S123&quot;}</p>
         */
        @NameInMap("TemplateParams")
        public String templateParams;

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

        public PushTaskNotificationAndroidOptionsVivo setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public PushTaskNotificationAndroidOptionsVivo setTemplateParams(String templateParams) {
            this.templateParams = templateParams;
            return this;
        }
        public String getTemplateParams() {
            return this.templateParams;
        }

    }

    public static class PushTaskNotificationAndroidOptionsXiaomi extends TeaModel {
        /**
         * <p>Sets the channel ID for the Xiaomi notification type. You must apply on the Xiaomi platform. For more information, see <a href="https://dev.mi.com/console/doc/detail?pId=2422#_4">Application link</a>.</p>
         * <blockquote>
         * <p>A single application can apply for a maximum of eight channels on the Xiaomi channel. Plan accordingly in advance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>michannel</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The JSON character string of the Xiaomi Super Island data structure <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.param</a>. For development and integration, References: <a href="https://www.alibabacloud.com/help/en/document_detail/3037956.html">Xiaomi Super Island push guide</a>.</p>
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
         * <p>The JSON character string of the Xiaomi Super Island data images <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.pic_xxx</a>. For development and integration, References: <a href="https://www.alibabacloud.com/help/en/document_detail/3037956.html">Xiaomi Super Island push guide</a>.</p>
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
         * <p>The Xiaomi private message template parameters, as a JSON string.</p>
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
         * <p>The Alibaba Cloud proprietary configuration.</p>
         * <blockquote>
         * <p>Valid only when the Alibaba Cloud proprietary channel is used.</p>
         * </blockquote>
         */
        @NameInMap("Accs")
        public PushTaskNotificationAndroidOptionsAccs accs;

        /**
         * <p>The Honor configuration.</p>
         */
        @NameInMap("Honor")
        public PushTaskNotificationAndroidOptionsHonor honor;

        /**
         * <p>The Huawei configuration.</p>
         */
        @NameInMap("Huawei")
        public PushTaskNotificationAndroidOptionsHuawei huawei;

        /**
         * <p>The Meizu configuration.</p>
         */
        @NameInMap("Meizu")
        public PushTaskNotificationAndroidOptionsMeizu meizu;

        /**
         * <p>The OPPO configuration.</p>
         */
        @NameInMap("Oppo")
        public PushTaskNotificationAndroidOptionsOppo oppo;

        /**
         * <p>The vivo configuration.</p>
         */
        @NameInMap("Vivo")
        public PushTaskNotificationAndroidOptionsVivo vivo;

        /**
         * <p>The Xiaomi configuration.</p>
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
         * <p>The fully qualified class name of the application entry activity for badge settings.</p>
         * <blockquote>
         * <p>Valid only for Huawei and Honor vendor channel pushes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.cloudpushdemo.bizactivity</p>
         */
        @NameInMap("BadgeActivity")
        public String badgeActivity;

        /**
         * <p>Sets the increment value for the badge, which is added to the original badge number.</p>
         * <blockquote>
         * <ul>
         * <li>Supported by Huawei and Honor channels.</li>
         * <li>If both BadgeAddNum and BadgeSetNum are specified, BadgeSetNum takes precedence.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BadgeAddNum")
        public Integer badgeAddNum;

        /**
         * <p>Sets a fixed value for the badge number. Valid values: 1 to 99.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only for Huawei and Honor vendor channel pushes. </li>
         * <li>For Alibaba Cloud proprietary channel pushes, this parameter takes effect only on Huawei, Honor, and vivo devices.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("BadgeSetNum")
        public Integer badgeSetNum;

        /**
         * <p>Sets the channel ID of the Android application. The channel ID must match the channel ID in the vendor application.</p>
         * <blockquote>
         * <ul>
         * <li>Because the channel_id of the OPPO private message channel is the same as the channel ID of the application, this value is used as the channel_id when pushing through the OPPO channel.</li>
         * <li>This value is also used as the channel_id for Huawei, FCM, and Alibaba Cloud proprietary channel pushes.</li>
         * <li>For specific use cases, see the FAQ: <a href="https://help.aliyun.com/document_detail/67398.html">Notifications are not received on devices running Android 8.0 or later</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8.0up</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The custom extension attributes for Android notifications.</p>
         * <blockquote>
         * <ul>
         * <li>The parameter must be passed in standard JSON map format. Incorrect formats will cause parsing failures.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;:&quot;value1&quot;}</p>
         */
        @NameInMap("ExtParameters")
        public String extParameters;

        /**
         * <p>The message group. For messages in the same group, only the latest message and the total number of received messages in the group are displayed in the notification bar. All messages are not displayed and cannot be expanded. Currently supported by:</p>
         * <ul>
         * <li>Huawei vendor channel.</li>
         * <li>Honor vendor channel.</li>
         * <li>Proprietary channels with Android SDK 3.9.1 or earlier.</li>
         * </ul>
         * <blockquote>
         * <p>Proprietary channels no longer support this parameter in Android SDK 3.9.2 or later.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>group-1</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The URL of the icon on the right side. Currently supported by:</p>
         * <ul>
         * <li>Huawei EMUI (applicable only in long text mode and Inbox mode).</li>
         * <li>Honor Magic UI (applicable only in long text mode).</li>
         * <li>Proprietary channels (Android SDK 3.5.0 or later).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The body text in Inbox mode. The content must be a valid JSON array with a maximum of five elements. Currently supported by:</p>
         * <ul>
         * <li>Huawei: EMUI 9 or later.</li>
         * <li>Honor: Magic UI 4.0 or later.</li>
         * <li>Xiaomi: MIUI 10 or later.</li>
         * <li>OPPO: ColorOS 5.0 or later.</li>
         * <li>Proprietary channels: Android SDK 3.6.0 or later.</li>
         * </ul>
         */
        @NameInMap("InboxContent")
        public java.util.List<String> inboxContent;

        /**
         * <p>The notification sound for the Huawei vendor channel. Specify the audio file name stored in the <code>app/src/main/res/raw/</code> directory of the client project. Do not include the file format extension. If not set, the default ringtone is used.</p>
         * 
         * <strong>example:</strong>
         * <p>alicloud_notification_sound</p>
         */
        @NameInMap("Music")
        public String music;

        /**
         * <p>The unique identifier of the Android notification bar message, used to control the override and replacement behavior of notifications. A new notification with the same NotifyId automatically overrides the old notification.</p>
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
         * <p>The image URL in large image mode. Currently supported by proprietary channels with Android SDK 3.6.0 or later.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
         */
        @NameInMap("PictureUrl")
        public String pictureUrl;

        /**
         * <p>The notification style. Valid values:</p>
         * <ul>
         * <li>0: Standard mode (default).</li>
         * <li>1: Long text mode (supported by Huawei, Honor, Xiaomi, OPPO, Meizu, and proprietary channels).</li>
         * <li>2: Large image mode (supported by proprietary channels).</li>
         * <li>3: List mode (supported by Huawei, Honor, Xiaomi, OPPO, and proprietary channels).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RenderStyle")
        public String renderStyle;

        /**
         * <p>Sets the notification type for vendor channels. Valid values:</p>
         * <ul>
         * <li>false: Formal notification (default).</li>
         * <li>true: Test notification.</li>
         * </ul>
         * <blockquote>
         * <p>Currently supported by Huawei channel, Honor channel, vivo channel, and OPPO Fluid Cloud.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TestMessage")
        public Boolean testMessage;

        /**
         * <p>Specifies the activity to open when the notification is clicked.</p>
         * <blockquote>
         * <p>Warning: This parameter is required when you use Android vendor channels.</warning></p>
         * </blockquote>
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
         * <p>The action corresponding to the ability of the in-app page.</p>
         * <blockquote>
         * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.action</a> on the HarmonyOS official website.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>com.example.action</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The number to add to the HarmonyOS application badge.</p>
         * <blockquote>
         * <ul>
         * <li>Supported by HarmonyOS SDK 1.2.0 and later.</li>
         * <li>For more information, see the <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">addNum field description</a> for HarmonyOS badges.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BadgeAddNum")
        public Integer badgeAddNum;

        /**
         * <p>The number to set for the HarmonyOS application badge.</p>
         * <blockquote>
         * <ul>
         * <li>For more information, see the <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">setNum field</a> description for HarmonyOS badges.</li>
         * <li>Supported by HarmonyOS SDK 1.2.0 and later.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BadgeSetNum")
        public Integer badgeSetNum;

        /**
         * <p>The category of the notification message. This parameter is optional. Default value: MARKETING.</p>
         * <blockquote>
         * <p>After you apply for the notification message auto-classification permission, this parameter is used to identify the message type. Different notification message types affect the message display and reminder methods. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.category</a> on the HarmonyOS official website.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>IM</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Sets the custom extension attributes of the notification message to pass additional business data.</p>
         * <blockquote>
         * <p>The parameter must be passed in standard JSON map format. Incorrect formats will cause parsing failures.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;: &quot;value&quot;}</p>
         */
        @NameInMap("ExtParameters")
        public String extParameters;

        /**
         * <p>The additional data for notification extension messages.</p>
         * <blockquote>
         * <ul>
         * <li>Valid only when sending HarmonyOS notification extension messages.</li>
         * <li>Conceptually equivalent to the extraData field of HarmonyOS notification extension messages. For specific definitions, see the <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section161192514234">ExtensionPayload</a> description in HarmonyOS.</li>
         * <li>Supported by HarmonyOS SDK 1.2.0 and later.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("ExtensionExtraData")
        public String extensionExtraData;

        /**
         * <p>Enables HarmonyOS notification extensions.</p>
         * <blockquote>
         * <ul>
         * <li>To send notification extension messages, you must first apply for permissions on the HarmonyOS official website. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-guides-V5/push-send-extend-noti-V5">HarmonyOS documentation</a>.</li>
         * <li>Supported by HarmonyOS SDK 1.2.0 and later.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ExtensionPush")
        public Boolean extensionPush;

        /**
         * <p>The URL of the large icon on the right side of the notification. The URL must use the HTTPS protocol.</p>
         * <blockquote>
         * <ul>
         * <li>Supported image formats: PNG, JPG, JPEG, HEIF, GIF, and BMP. The total number of pixels (width × height) must be less than 25,000.</li>
         * <li>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.image</a> on the HarmonyOS official website.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/xxx.png">https://example.com/xxx.png</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>When RenderStyle is set to MULTI_LINE, this field is required to define the content for the multi-line text style. A maximum of three content items are supported.</p>
         */
        @NameInMap("InboxContent")
        public java.util.List<String> inboxContent;

        /**
         * <p>The JSON string of the HarmonyOS Live View data structure <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V13/push-scenariozed-api-request-param-V13#section66881469306">LiveViewPayload</a>. For development and integration, refer to the <a href="https://help.aliyun.com/document_detail/2982112.html">HarmonyOS Live View push guide</a>.</p>
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
         * <p>The unique identifier (notifyId) for each message displayed in the notification bar. If this parameter is not provided, the push service automatically generates a unique identifier. Different notification messages can use the same notifyId to allow new messages to overwrite old ones. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.notifyId</a> on the HarmonyOS official website.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("NotifyId")
        public Integer notifyId;

        /**
         * <p>The receipt ID of the HarmonyOS channel. You can view this receipt ID in the receipt parameter settings of the HarmonyOS channel push operations platform.</p>
         * <blockquote>
         * <ul>
         * <li>If the default receipt configuration on the HarmonyOS channel push operations platform is set to Alibaba Cloud receipt, you do not need to provide this parameter. Otherwise, we recommend that you configure the default receipt ID for the HarmonyOS channel in the Alibaba Cloud EMAS shift push console first.</li>
         * <li>For details, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">pushOptions.receiptId</a> on the HarmonyOS official website.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RCPB***DFD5</p>
         */
        @NameInMap("ReceiptId")
        public String receiptId;

        /**
         * <p>The notification message style. This parameter is optional. Default value: NORMAL.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("RenderStyle")
        public String renderStyle;

        /**
         * <p>Uses a notification channel of the specified type.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is valid only for Alibaba Cloud proprietary channels.</li>
         * <li>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/js-apis-notificationmanager-V5#slottype">SlotType</a> on the HarmonyOS official website.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SOCIAL_COMMUNICATION</p>
         */
        @NameInMap("SlotType")
        public String slotType;

        /**
         * <p>The custom ringtone file name for HarmonyOS.</p>
         * 
         * <strong>example:</strong>
         * <p>music.mp3</p>
         */
        @NameInMap("Sound")
        public String sound;

        /**
         * <p>The duration of the custom message notification ringtone, in seconds. Valid values: 1 to 60. If the ringtone duration is shorter than the notification display time, the ringtone loops.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SoundDuration")
        public Integer soundDuration;

        /**
         * <p>Enables test messages.</p>
         * <blockquote>
         * <ul>
         * <li>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">TestMessage</a> in the HarmonyOS push parameters.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TestMessage")
        public Boolean testMessage;

        /**
         * <p>The URI corresponding to the ability of the built-in app page.</p>
         * <blockquote>
         * <ul>
         * <li>If multiple abilities exist, specify the action and URI for each ability. The action is prioritized when searching for the corresponding built-in app page.</li>
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
         * <p>The static pass-through parameters for iOS Live Activity push, which are used to pass unchanged business identification information.</p>
         * <blockquote>
         * <p>This parameter is required when Event is set to start.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;orderId&quot;: &quot;ORD20231201001&quot;,
         *   &quot;restaurantName&quot;: &quot;Tasty Restaurant&quot;,
         *   &quot;customerAddress&quot;: &quot;No. xx, xx Road, xx District&quot;,
         *   &quot;orderType&quot;: &quot;delivery&quot;
         * }</p>
         */
        @NameInMap("Attributes")
        public String attributes;

        /**
         * <p>The type of the Live Activity to be started.</p>
         * <blockquote>
         * <p>This parameter is required when Event is set to start.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>OrderActivityAttributes</p>
         */
        @NameInMap("AttributesType")
        public String attributesType;

        /**
         * <p>The dynamic pass-through parameters for the Live Activity, which contain status information and changing data that can be updated in real time.</p>
         * <blockquote>
         * <ul>
         * <li>Avoid excessively frequent updates. An interval of 5 seconds or more is recommended.</li>
         * <li>Update multiple fields in batches to reduce the number of pushes.</li>
         * <li>Consider the user experience and avoid interface flickering.</li>
         * <li>Must be a valid JSON string.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;status&quot;: &quot;delivering&quot;,
         *     &quot;estimatedTime&quot;: &quot;10 minutes&quot;,
         *     &quot;progress&quot;: 80,
         *     &quot;driverName&quot;: &quot;Driver Li&quot;,
         *     &quot;currentStep&quot;: &quot;The courier is on the way&quot;
         * }</p>
         */
        @NameInMap("ContentState")
        public String contentState;

        /**
         * <p>The retention time of a completed Live Activity on the Lock Screen, which allows users to view the information after the activity ends. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1701439800</p>
         */
        @NameInMap("DismissalDate")
        public Long dismissalDate;

        /**
         * <p>Starts, updates, or ends a live activity.</p>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The unique identifier of the Live Activity, which is used to associate the activity instance on the device with the push target on the server.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li><p>The ID must be the same as the forActivityId parameter in the registerLiveActivityPushToken method of the client SDK.</p>
         * </li>
         * <li><p>The server uses this ID to locate the specific activity instance during a push.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FOOD_DELIVERY_ORD20231201001</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The expiration timestamp for the content of the iOS Live Activity. The value is a UNIX timestamp in seconds.</p>
         * <blockquote>
         * <ul>
         * <li>After the specified time is reached, the system automatically marks the activity as stale.</li>
         * <li>Stale activities are removed from the Dynamic Island and the Lock Screen.</li>
         * <li>This prevents outdated information from occupying the user interface for a long time.</li>
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
         * <p>To send iOS notifications through the APNs center, you must specify the corresponding environment context. This parameter is optional. Default value: production environment.</p>
         * <ul>
         * <li>DEV: the development environment, which applies to applications directly installed and debugged by using Xcode.</li>
         * <li>PRODUCT: the production environment, which applies to applications distributed through the App Store, TestFlight, Ad Hoc, and enterprise distribution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("ApnsEnv")
        public String apnsEnv;

        /**
         * <p>The badge of the iOS application.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Badge")
        public Integer badge;

        /**
         * <p>Specifies whether to enable the automatic badge increment feature. This parameter is optional. Default value: false.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter cannot be used together with the badge setting parameter.</li>
         * <li>The automatic badge increment feature maintains the badge count for each device on the Alibaba Cloud push server. You must use SDK version 1.9.5 or later to actively synchronize the badge count to the server.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BadgeAutoIncrement")
        public Boolean badgeAutoIncrement;

        /**
         * <p>The category identifier of the iOS notification, which is used to define the interactive behavior and display style of the notification.</p>
         * <blockquote>
         * <ul>
         * <li>The category must be pre-registered in the application to take effect.</li>
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
         * <p>The unique identifier used to control notification grouping. Notifications with the same identifier are overwritten.</p>
         * 
         * <strong>example:</strong>
         * <p>order_status_update_12345</p>
         */
        @NameInMap("CollapseId")
        public String collapseId;

        /**
         * <p>The custom extension attributes of the iOS notification.</p>
         * <blockquote>
         * <ul>
         * <li>The parameter must be passed in standard JSON map format. Incorrect formats cause parsing failures.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;attachment&quot;: &quot;<a href="https://www.example.com/notification_pic.png%22%7D">https://www.example.com/notification_pic.png&quot;}</a></p>
         */
        @NameInMap("ExtParameters")
        public String extParameters;

        /**
         * <p>The interruption level. This parameter is optional. Valid values:</p>
         * <ul>
         * <li>passive: The system adds the notification to the notification list without lighting up the screen or playing a sound.</li>
         * <li>active: The system displays the notification immediately, lights up the screen, and may play a sound.</li>
         * <li>time-sensitive: The system presents the notification immediately, lights up the screen, and may play a sound, but does not bypass the system notification controls.</li>
         * <li>critical: The system displays the notification immediately, lights up the screen, and plays a sound bypassing the silent switch.</li>
         * </ul>
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
         * <li>Live Activity push supports pushing to a <strong>single device</strong> only by using the DEVICE type.</li>
         * <li>When pushing to a Live Activity, you do not need to specify the title and body parameters.</li>
         * </ul>
         */
        @NameInMap("LiveActivity")
        public PushTaskNotificationIosLiveActivity liveActivity;

        /**
         * <p>The sound of the iOS notification. Specify the name of the audio file stored in the app bundle or the Library/Sounds directory of the sandbox. For more information, see <a href="https://help.aliyun.com/document_detail/48906.html">How to set the notification sound for iOS push</a>.</p>
         * <blockquote>
         * <ul>
         * <li>If an empty string (&quot;&quot;) is specified, the notification is silent.</li>
         * <li>If this parameter is not set, the default value default is used, which indicates the system prompt sound.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Music")
        public String music;

        /**
         * <p>Specifies whether to enable extended notifications and allow iOS notifications to be processed by the Notification Service Extension.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter must be set to true when sending silent notifications.</li>
         * <li>The processing time of the extension cannot exceed 30 seconds.</li>
         * <li>A timeout causes the notification to display the original content.</li>
         * <li>You must add the Notification Service Extension to your application.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Mutable")
        public Boolean mutable;

        /**
         * <p>The relevance score of the notification message, which is used to control the priority and display strategy of the notification.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("RelevanceScore")
        public Double relevanceScore;

        /**
         * <p>Specifies whether to enable the silent push mode.</p>
         * <blockquote>
         * <ul>
         * <li>When sending a silent notification, you do not need to specify the title and body parameters.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Silent")
        public Boolean silent;

        /**
         * <p>The subtitle of the iOS notification.</p>
         * 
         * <strong>example:</strong>
         * <p>Please check your order</p>
         */
        @NameInMap("Subtitle")
        public String subtitle;

        /**
         * <p>The thread identifier for iOS notification grouping, which is used to group and collapse related notifications.</p>
         * <blockquote>
         * <ul>
         * <li>Notifications with the same thread ID are automatically grouped.</li>
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
         * <p>The body of the notification to be pushed.</p>
         * <blockquote>
         * <p>Length limits:</p>
         * <ul>
         * <li>iOS/HarmonyOS/Android: the <strong>character length</strong> cannot exceed 200.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Dear customer, your reservation has been successfully canceled</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>HarmonyOS notification configuration.</p>
         */
        @NameInMap("Hmos")
        public PushTaskNotificationHmos hmos;

        /**
         * <p>iOS notification configuration.</p>
         */
        @NameInMap("Ios")
        public PushTaskNotificationIos ios;

        /**
         * <p>The title of the notification to be pushed.</p>
         * <blockquote>
         * <p>Length limits:</p>
         * <ul>
         * <li>iOS/HarmonyOS: the <strong>byte length</strong> cannot exceed 200.</li>
         * <li>Android: the <strong>character length</strong> cannot exceed 50.</li>
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
         * <p>The delay time before the SMS message is triggered. Unit: seconds.</p>
         * <p>If you use SMS linkage, this parameter is required. Set this parameter to at least 15 seconds and no more than 3 days to avoid duplicate SMS and push messages.</p>
         * <blockquote>
         * <p>When SMS linkage is used, the ExpireTime parameter becomes invalid. The expiration time of the notification is calculated based on the DelaySecs parameter. The expiration time is the current time plus the DelaySecs value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("DelaySecs")
        public Long delaySecs;

        /**
         * <p>The key-value pairs of the variables in the SMS template.</p>
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
         * <p>The name of the SMS template. You can obtain the name from the SMS template management page. The name is assigned by the system, not specified by the developer.</p>
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
         * <p>The expiration time of the message. The message is not sent after it expires. The maximum retention period is 72 hours.</p>
         * <blockquote>
         * <ul>
         * <li>The time must follow the ISO 8601 standard and use UTC time in the YYYY-MM-DDThh:mm:ssZ format.</li>
         * <li>The expiration time must meet the following condition: ExpireTime &gt; PushTime + 3 seconds. The 3 seconds are reserved for network and system latency.</li>
         * <li>Set the expiration time to at least 1 minute for single-target push tasks and at least 10 minutes for full or batch push tasks.</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>Notice: For pass-through messages, if the expiration time is not set, the message is sent only to online devices. If the device is offline, the message is discarded.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-06-21T12:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The custom identifier of the push task. If JobKey is not empty, this field is included in the receipt log. For more information, see <a href="https://help.aliyun.com/document_detail/434651.html">Receipt logs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>jobkey1727749697913</p>
         */
        @NameInMap("JobKey")
        public String jobKey;

        /**
         * <p>The unique identity of the message. This parameter is valid only when the Action parameter is set to CONTINUOUS_PUSH.</p>
         * 
         * <strong>example:</strong>
         * <p>1174754033128****</p>
         */
        @NameInMap("MessageId")
        public Long messageId;

        /**
         * <p>Specifies the sending time of the message, which can be up to seven days later. Valid only when the Action parameter is set to SCHEDULED_PUSH.</p>
         * <blockquote>
         * <p>The time must follow the ISO 8601 standard and use UTC time in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-06-19T12:00:00Z</p>
         */
        @NameInMap("PushTime")
        public String pushTime;

        /**
         * <p>The fallback SMS message configuration.</p>
         * <blockquote>
         * <p>Currently, only Android and HarmonyOS devices are supported.</p>
         * </blockquote>
         */
        @NameInMap("Sms")
        public PushTaskOptionsSms sms;

        /**
         * <p>Specifies whether to automatically truncate excessively long titles and content.</p>
         * <blockquote>
         * <p>This parameter applies only to vendor channels that explicitly limit the title and content length. It does not apply to channels such as APNs, Huawei, and Honor, which do not limit the title and content length but only limit the total request body size.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Trim")
        public Boolean trim;

        /**
         * <p>Specifies the sending channels. Valid values:</p>
         * <ul>
         * <li>accs: Alibaba Cloud proprietary channel.</li>
         * <li>huawei: Huawei channel.</li>
         * <li>honor: Honor channel.</li>
         * <li>xiaomi: Xiaomi channel.</li>
         * <li>oppo: OPPO channel.</li>
         * <li>vivo: vivo channel.</li>
         * <li>meizu: Meizu channel.</li>
         * <li>fcm: Google Firebase channel (HTTP v1 API).</li>
         * <li>apns: APNs channel.</li>
         * <li>harmony: HarmonyOS channel.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If this parameter is not configured, all channels are available.</li>
         * <li>If this parameter is configured, only the specified channels are used.</li>
         * <li>If the configured channels conflict with the sending policy (for example, iOS notifications only use the APNs channel, but apns is not included in this parameter), the message is not sent.</li>
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
         * <p>The platform type. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>IOS</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The type of the push target.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>The MassPushV2 batch push API and the CONTINUOUS_PUSH continuous push support only the following three target types:</p>
         * <ul>
         * <li>DEVICE (device)</li>
         * <li>ACCOUNT (account)</li>
         * <li>ALIAS (alias)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEVICE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The push targets based on Target.Type. Separate multiple targets with commas. The following section describes the target types and target values in detail:</p>
         * <blockquote>
         * <ul>
         * <li>DEVICE: device IDs, such as deviceid1,deviceid2. Maximum of 1,000.</li>
         * <li>ACCOUNT: account IDs, such as account1,account2. Maximum of 1,000.</li>
         * <li>ALIAS: aliases, such as alias1,alias2. Maximum of 1,000.</li>
         * <li>TAG: one or more tags. For the format, see <a href="https://help.aliyun.com/document_detail/434847.html">Tag format specifications</a>.</li>
         * <li>ALL: all targets. No value is required. Pushing to all targets may increase costs. Use this option with caution.</li>
         * </ul>
         * </blockquote>
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
