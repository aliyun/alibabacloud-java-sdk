// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushTask extends TeaModel {
    /**
     * <p>The push method. This is an optional parameter. The default value is <code>PUSH_IMMEDIATELY</code> (immediate push).</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>The <code>MassPushV2</code> batch push API supports only the following push methods:</p>
     * <ul>
     * <li><p><code>PUSH_IMMEDIATELY</code> (immediate push)</p>
     * </li>
     * <li><p><code>SCHEDULED_PUSH</code> (scheduled push)</p>
     * </li>
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
     * <p>Length calculation</p>
     * <ul>
     * <li><p>The length is calculated based on the byte length of the UTF-8 encoded string after the Message object is serialized into JSON.</p>
     * </li>
     * <li><p>A Chinese character typically occupies 3 bytes in UTF-8 encoding.</p>
     * </li>
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
     * <p>If you set both <code>Message</code> and <code>Notification</code>, the device receives only one. The sending rules are as follows:</p>
     * <ul>
     * <li><p>If the device is online, pass-through message data is sent.</p>
     * </li>
     * <li><p>If the device is offline, a system notification is sent.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Notification")
    public PushTaskNotification notification;

    /**
     * <p>Push options</p>
     */
    @NameInMap("Options")
    public PushTaskOptions options;

    /**
     * <p>The target object for the message push. This parameter is optional when the <code>Action</code> operation type is <code>CREATE_CONTINUOUS_PUSH</code> (create a continuous push task).</p>
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
         * <p>The content of the message to send.</p>
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
         * <p>The custom Android notification bar style. The value can be from 1 to 100.</p>
         * <blockquote>
         * <p>The client must complete the style preset configuration. For more information, see the <a href="https://help.aliyun.com/document_detail/2834944.html">Custom Notification Style API</a> document.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CustomStyle")
        public Integer customStyle;

        /**
         * <p>The notification reminder method. Valid values:</p>
         * <ul>
         * <li><p><code>VIBRATE</code>: Vibrate (default)</p>
         * </li>
         * <li><p><code>SOUND</code>: Sound</p>
         * </li>
         * <li><p><code>BOTH</code>: Sound and vibration</p>
         * </li>
         * <li><p><code>NONE</code>: Silent</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("NotifyType")
        public String notifyType;

        /**
         * <p>Sets the activity to open when the notification is clicked. This is valid when <code>OpenType</code> is <code>ACTIVITY</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.cloudpushdemo.bizactivity</p>
         */
        @NameInMap("OpenActivity")
        public String openActivity;

        /**
         * <p>The action to take after the notification is clicked. Valid values:</p>
         * <ul>
         * <li><p><code>APPLICATION</code>: Open the application (default).</p>
         * </li>
         * <li><p><code>ACTIVITY</code>: Open the specified page <code>OpenActivity</code>.</p>
         * </li>
         * <li><p><code>URL</code>: Open a URL.</p>
         * </li>
         * <li><p><code>NONE</code>: No action.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APPLICATION</p>
         */
        @NameInMap("OpenType")
        public String openType;

        /**
         * <p>After an Android device receives a push, clicking the notification opens the corresponding URL. This is valid when <code>OpenType</code> is <code>URL</code>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("OpenUrl")
        public String openUrl;

        /**
         * <p>The priority of the Android notification\&quot;s position in the notification bar. Valid values: -2, -1, 0, 1, 2.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>Message grouping. Messages in the same group are displayed collapsed in the notification bar and can be expanded. Different groups of notifications are displayed separately.</p>
         * <blockquote>
         * <p>This is for Android SDK 3.9.2 and later.</p>
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
         * <p>Sets the importance parameter for Honor notification message classification, which determines the notification behavior on the user\&quot;s device. Valid values are:</p>
         * <ul>
         * <li><p><code>0</code>: Marketing message</p>
         * </li>
         * <li><p><code>1</code>: Service and communication message</p>
         * </li>
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
         * <p>Sets the Huawei quick notification parameters.</p>
         * <ul>
         * <li><p><strong>0</strong>: Send a normal Huawei notification (default).</p>
         * </li>
         * <li><p><strong>1</strong>: Send a Huawei quick notification.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BusinessType")
        public Integer businessType;

        /**
         * <p>Function 1: After you apply for <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835?#section3410731125514">self-classification rights</a>, this is used to identify the message type and determine the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#ZH-CN_TOPIC_0000001149358835__p3850133955718">message reminder method</a>. It speeds up the sending of specific types of messages. For valid values, see the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section1076611477914">message classification standards</a> in the official Huawei Push documentation. Fill in the &quot;Cloud notification category value&quot; or &quot;Local notification category value&quot; from the document\&quot;s table.</p>
         * <p>Function 2: After <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">applying for special permissions</a>, this is used to identify high-priority pass-through scenarios. Valid values are:</p>
         * <ul>
         * <li><p><code>VOIP</code>: Video call</p>
         * </li>
         * <li><p><code>PLAY_VOICE</code>: Voice playback</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>For &quot;Cloud notification category value&quot; that is &quot;Not applicable,&quot; all messages go through Alibaba Cloud\&quot;s proprietary channel.</p>
         * </li>
         * <li><p>For &quot;Local notification category value&quot; that is &quot;Not applicable,&quot; all messages go through the Huawei channel.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>VOIP</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Sets the importance parameter for Huawei notification message classification, which determines the notification behavior on the user\&quot;s device. Valid values are:</p>
         * <ul>
         * <li><p><code>0</code>: Marketing message</p>
         * </li>
         * <li><p><code>1</code>: Service and communication message</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>We recommend using <code>Category</code> for notification classification. You must apply for this on the Huawei platform. <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section893184112272">Application link</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Importance")
        public Integer importance;

        /**
         * <p>The JSON string of the Huawei Android Live Window data structure <a href="https://developer.huawei.com/consumer/cn/doc/HMSCore-References/rest-live-0000001562939968#ZH-CN_TOPIC_0000001700850537__p195121620102511">LiveNotificationPayload</a>. For developer integration, see the document <a href="https://help.aliyun.com/document_detail/2983768.html">Huawei Live Window Push Guide</a>.</p>
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
         * <p>The receipt ID for the Huawei channel. This ID can be found in the receipt parameter settings on the Huawei channel push operations platform.</p>
         * <blockquote>
         * <p>If the default receipt configuration on the Huawei channel push operations platform is the Alibaba Cloud receipt, you do not need to provide this. If not, we recommend that you first configure the default Huawei channel receipt ID in the Alibaba Cloud EMAS Mobile Push console.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RCP4C123456</p>
         */
        @NameInMap("ReceiptId")
        public String receiptId;

        /**
         * <p>The Huawei channel notification delivery priority. Valid values are:</p>
         * <ul>
         * <li><p><code>HIGH</code></p>
         * </li>
         * <li><p><code>NORMAL</code></p>
         * </li>
         * </ul>
         * <p>You must apply for permission. For more information, see: <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">Application link</a>.</p>
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
         * <ul>
         * <li><p>0 Public message (default)</p>
         * </li>
         * <li><p>1 Private message</p>
         * </li>
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
         * <p>OPPO classifies messages into two categories for management: communication and services, and content and marketing.</p>
         * <p><strong>Communication and services (requires permission application):</strong></p>
         * <ul>
         * <li><p>IM: Instant messages</p>
         * </li>
         * <li><p>ACCOUNT: Account and asset</p>
         * </li>
         * <li><p>TODO: To-do list</p>
         * </li>
         * <li><p>DEVICE_REMINDER: Device information</p>
         * </li>
         * <li><p>ORDER: Order and logistics</p>
         * </li>
         * <li><p>SUBSCRIPTION: Subscription reminder</p>
         * </li>
         * </ul>
         * <p><strong>Content and marketing:</strong></p>
         * <ul>
         * <li><p>NEWS: News</p>
         * </li>
         * <li><p>CONTENT: Content recommendation</p>
         * </li>
         * <li><p>MARKETING: Operational activity</p>
         * </li>
         * <li><p>SOCIAL: Social dynamics</p>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://open.oppomobile.com/new/developmentDoc/info?id=13189">vivo classification description</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>NEWS</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The JSON string of the OPPO Fluid Cloud\&quot;s intent deletion data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13578">data</a>. This parameter is invalid if the AndroidOppoIntelligentIntent parameter is already filled. For developer integration, see the document <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud Push Guide</a>.</p>
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
         * <p>The JSON string of the OPPO Fluid Cloud\&quot;s intent sharing data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13565">IntelligentIntent</a>. For developer integration, see the document <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud Push Guide</a>.</p>
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
         * <p>The OPPO channel notification bar message reminder level. Valid values are:</p>
         * <ul>
         * <li><p><code>1</code>: Notification bar</p>
         * </li>
         * <li><p><code>2</code>: Notification bar, lock screen, ringtone, vibration (default notification level for communication and service messages)</p>
         * </li>
         * <li><p><code>16</code>: Notification bar, lock screen, ringtone, vibration, banner (requires permission application)</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When you use the <code>NotifyLevel</code> parameter, you must also pass the <code>Category</code> parameter.</p>
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
         * <p>{&quot;name&quot;: &quot;张三&quot;}</p>
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
         * <p>vivo classifies messages into two categories for management: system messages and operational messages.</p>
         * <p><strong>System messages:</strong></p>
         * <ul>
         * <li><p>IM: Instant messages</p>
         * </li>
         * <li><p>ACCOUNT: Account and asset</p>
         * </li>
         * <li><p>TODO: To-do list</p>
         * </li>
         * <li><p>DEVICE_REMINDER: Device information</p>
         * </li>
         * <li><p>ORDER: Order and logistics</p>
         * </li>
         * <li><p>SUBSCRIPTION: Subscription reminder</p>
         * </li>
         * </ul>
         * <p><strong>Operational messages:</strong></p>
         * <ul>
         * <li><p>NEWS: News</p>
         * </li>
         * <li><p>CONTENT: Content recommendation</p>
         * </li>
         * <li><p>MARKETING: Operational activity</p>
         * </li>
         * <li><p>SOCIAL: Social dynamics</p>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://dev.vivo.com.cn/documentCenter/doc/359#s-ef3qugc3">vivo classification description</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>MARKETING</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Sets the vivo notification message classification. Valid values are:</p>
         * <ul>
         * <li><p><code>0</code>: Operational message (default)</p>
         * </li>
         * <li><p><code>1</code>: System message</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>We recommend using <code>Category</code> for notification classification. You must apply for this on the vivo platform. For more information, see: <a href="https://dev.vivo.com.cn/documentCenter/doc/359">Application link</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Importance")
        public Integer importance;

        /**
         * <p>The JSON string of the vivo Atomic Island data structure <a href="https://dev.vivo.com.cn/documentCenter/doc/896#s-fdagzbd4">liveMessage</a>. For developer integration, see the document <a href="https://help.aliyun.com/zh/document_detail/3030718.html">vivo Atomic Island Push Guide</a>.</p>
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
         * <p>The message receipt identifier for the vivo vendor push channel. It is used to receive push result callback notifications.</p>
         * <blockquote>
         * <ul>
         * <li><p>Location: vivo Open Platform → Push Service → Application Information → Receipt Configuration</p>
         * </li>
         * <li><p>Recommendation: First, configure the default receipt ID in the Alibaba Cloud EMAS console.</p>
         * </li>
         * <li><p>Condition: This must be configured only if the default receipt on the vivo platform is not the Alibaba Cloud receipt.</p>
         * </li>
         * </ul>
         * </blockquote>
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
         * <p>Sets the channelId for the Xiaomi notification type. You must apply for this on the Xiaomi platform. For more information, see: <a href="https://dev.mi.com/console/doc/detail?pId=2422#_4">Application link</a>.</p>
         * <blockquote>
         * <p>A single application can apply for a maximum of 8 channels on the Xiaomi channel. Plan accordingly.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>michannel</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The JSON string of the Xiaomi Super Island data structure <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.param</a>. For developer integration, see the document <a href="https://help.aliyun.com/zh/document_detail/3037956.html">Xiaomi Super Island Push Guide</a>.</p>
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
         * <p>The JSON string of the Xiaomi Super Island data image <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.pic_xxx</a>. For developer integration, see the document <a href="https://help.aliyun.com/zh/document_detail/3037956.html">Xiaomi Super Island Push Guide</a>.</p>
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

        @NameInMap("TemplateId")
        public String templateId;

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
         * <p>Alibaba Cloud proprietary configuration</p>
         * <blockquote>
         * <p>This is only valid when using Alibaba Cloud\&quot;s proprietary channel.</p>
         * </blockquote>
         */
        @NameInMap("Accs")
        public PushTaskNotificationAndroidOptionsAccs accs;

        /**
         * <p>Honor configuration</p>
         */
        @NameInMap("Honor")
        public PushTaskNotificationAndroidOptionsHonor honor;

        /**
         * <p>Huawei configuration</p>
         */
        @NameInMap("Huawei")
        public PushTaskNotificationAndroidOptionsHuawei huawei;

        /**
         * <p>Meizu configuration</p>
         */
        @NameInMap("Meizu")
        public PushTaskNotificationAndroidOptionsMeizu meizu;

        /**
         * <p>OPPO configuration</p>
         */
        @NameInMap("Oppo")
        public PushTaskNotificationAndroidOptionsOppo oppo;

        /**
         * <p>vivo configuration</p>
         */
        @NameInMap("Vivo")
        public PushTaskNotificationAndroidOptionsVivo vivo;

        /**
         * <p>Xiaomi configuration</p>
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
         * <p>The full class name of the application entry Activity for badge settings.</p>
         * <blockquote>
         * <p>This is only valid when pushing through the Huawei or Honor vendor channel.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.cloudpushdemo.bizactivity</p>
         */
        @NameInMap("BadgeActivity")
        public String badgeActivity;

        /**
         * <p>Sets a cumulative value for the badge, which is added to the original badge number.</p>
         * <blockquote>
         * <ul>
         * <li><p>This is supported by <code>Huawei</code> and <code>Honor</code> channels.</p>
         * </li>
         * <li><p>If both <code>BadgeAddNum</code> and <code>BadgeSetNum</code> are present, the latter takes precedence.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BadgeAddNum")
        public Integer badgeAddNum;

        /**
         * <p>Sets a fixed value for the badge number. The value range is [1, 99].</p>
         * <blockquote>
         * <ul>
         * <li><p>For vendor channel pushes, this is only effective for Huawei and Honor channels.</p>
         * </li>
         * <li><p>When pushing through Alibaba Cloud\&quot;s proprietary channel, this is only effective on Huawei, Honor, and vivo models.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("BadgeSetNum")
        public Integer badgeSetNum;

        /**
         * <p>Sets the channelId for the Android app. It must correspond to the channelId in the vendor\&quot;s app.</p>
         * <blockquote>
         * <ul>
         * <li><p>Because the channel_id for OPPO\&quot;s private message notification channel is the same as the app\&quot;s channelId, the channel_id takes this value when pushing through the OPPO channel.</p>
         * </li>
         * <li><p>For pushes through Huawei, FCM, and Alibaba Cloud\&quot;s proprietary channels, the channel_id takes this value.</p>
         * </li>
         * <li><p>For specific uses, see the FAQ: <a href="https://help.aliyun.com/document_detail/67398.html">Notifications not received on Android 8.0 and later devices</a>.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8.0up</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>Custom extension properties for Android notifications.</p>
         * <blockquote>
         * <ul>
         * <li>The parameter must be passed in a standard JSON Map format. An incorrect format causes parsing to fail.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;:&quot;value1&quot;}</p>
         */
        @NameInMap("ExtParameters")
        public String extParameters;

        /**
         * <p>Message grouping. For messages in the same group, only the latest one and the total number of messages received in that group are displayed in the notification bar. Not all messages are displayed, and they cannot be expanded. Currently supported by:</p>
         * <ul>
         * <li><p>Huawei vendor channel</p>
         * </li>
         * <li><p>Honor vendor channel</p>
         * </li>
         * <li><p>Proprietary channels with Android SDK 3.9.1 and earlier</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is no longer supported by proprietary channels in Android SDK 3.9.2 and later versions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>group-1</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The URL for the icon on the right. Currently supported by:</p>
         * <ul>
         * <li><p><code>Huawei EMUI</code> (only applicable in long text mode and Inbox mode).</p>
         * </li>
         * <li><p><code>Honor Magic UI</code> (only applicable in long text mode).</p>
         * </li>
         * <li><p><code>Proprietary channels</code> (Android SDK 3.5.0 and later).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The body text in Inbox mode. The content is a valid JSON Array with no more than 5 elements. Currently supported by:</p>
         * <ul>
         * <li><p>Huawei: EMUI 9 and later</p>
         * </li>
         * <li><p>Honor: Magic UI 4.0 and later</p>
         * </li>
         * <li><p>Xiaomi: MIUI 10 and later</p>
         * </li>
         * <li><p>OPPO: ColorOS 5.0 and later</p>
         * </li>
         * <li><p>Proprietary channels: Android SDK 3.6.0 and later</p>
         * </li>
         * </ul>
         */
        @NameInMap("InboxContent")
        public java.util.List<String> inboxContent;

        /**
         * <p>The Huawei vendor channel notification sound. Specify the name of the audio file stored in the <code>app/src/main/res/raw/</code> directory of the client project, without the file format suffix. If not set, the default ringtone is used.</p>
         * 
         * <strong>example:</strong>
         * <p>alicloud_notification_sound</p>
         */
        @NameInMap("Music")
        public String music;

        /**
         * <p>The unique identifier for an Android notification bar message. It controls the overwriting and replacement behavior of notifications. A new notification with the same NotifyId automatically overwrites the old one.</p>
         * 
         * <strong>example:</strong>
         * <p>233856727</p>
         */
        @NameInMap("NotifyId")
        public Integer notifyId;

        /**
         * <p>Detailed channel configuration.</p>
         */
        @NameInMap("Options")
        public PushTaskNotificationAndroidOptions options;

        /**
         * <p>The image URL in large image mode. Currently supported by: proprietary channels with Android SDK 3.6.0 and later.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
         */
        @NameInMap("PictureUrl")
        public String pictureUrl;

        /**
         * <p>The notification style. Valid values are:</p>
         * <ul>
         * <li><p><code>0</code>: Standard mode (default)</p>
         * </li>
         * <li><p><code>1</code>: Long text mode (supported by Huawei, Honor, Xiaomi, OPPO, Meizu, and proprietary channels)</p>
         * </li>
         * <li><p><code>2</code>: Large image mode (supported by proprietary channels)</p>
         * </li>
         * <li><p><code>3</code>: List mode (supported by Huawei, Honor, Xiaomi, OPPO, and proprietary channels)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RenderStyle")
        public String renderStyle;

        /**
         * <p>Sets the vendor channel notification type:</p>
         * <ul>
         * <li><p><code>false</code>: Formal notification (default).</p>
         * </li>
         * <li><p><code>true</code>: Test notification.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Currently supported by: Huawei channel, Honor channel, vivo channel, and OPPO Fluid Cloud.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TestMessage")
        public Boolean testMessage;

        /**
         * <p>Specifies the Activity to open after the notification is clicked.</p>
         * <blockquote>
         * <p>Warning: </p>
         * </blockquote>
         * <p>You must fill in this option when you use an Android vendor channel.</p>
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
         * <p>Specifies the action corresponding to the ability of an in-app page.</p>
         * <blockquote>
         * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.action</a> on the official HarmonyOS website.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>com.example.action</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The HarmonyOS application badge cumulative number.</p>
         * <blockquote>
         * <ul>
         * <li><p>This is supported starting from HarmonyOS SDK 1.2.0.</p>
         * </li>
         * <li><p>See the description of the <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">addNum field</a> for HarmonyOS badges.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BadgeAddNum")
        public Integer badgeAddNum;

        /**
         * <p>The HarmonyOS application badge number setting.</p>
         * <blockquote>
         * <ul>
         * <li><p>See the description of the <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">setNum field</a> for HarmonyOS badges.</p>
         * </li>
         * <li><p>This is supported starting from HarmonyOS SDK 1.2.0.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BadgeSetNum")
        public Integer badgeSetNum;

        /**
         * <p>The notification message category. This is an optional parameter. The default category is <code>MARKETING</code>.</p>
         * <blockquote>
         * <p>After you apply for the right to self-classify notification messages, this parameter is used to identify the message type. Different notification message types affect how messages are displayed and how users are reminded. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.category</a> on the official HarmonyOS website.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>IM</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Sets custom extension properties for the notification message. This is used to pass additional business data.</p>
         * <blockquote>
         * <p>The parameter must be passed in a standard JSON Map format. An incorrect format causes parsing to fail.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;: &quot;value&quot;}</p>
         */
        @NameInMap("ExtParameters")
        public String extParameters;

        /**
         * <p>Extra data for the notification extension message.</p>
         * <blockquote>
         * <ul>
         * <li><p>This is valid when sending a HarmonyOS notification extension message.</p>
         * </li>
         * <li><p>It is conceptually equivalent to the extraData field of a HarmonyOS notification extension message. For a specific definition, see the HarmonyOS <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section161192514234">ExtensionPayload</a> description.</p>
         * </li>
         * <li><p>This is supported starting from HarmonyOS SDK 1.2.0.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("ExtensionExtraData")
        public String extensionExtraData;

        /**
         * <p>Enables the HarmonyOS notification extension.</p>
         * <blockquote>
         * <ul>
         * <li><p>You must first apply for permission on the official HarmonyOS website to send notification extension messages. For related content, see the <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-guides-V5/push-send-extend-noti-V5">HarmonyOS documentation</a> on sending notification extension messages.</p>
         * </li>
         * <li><p>This is supported starting from HarmonyOS SDK 1.2.0.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ExtensionPush")
        public Boolean extensionPush;

        /**
         * <p>The URL for the large icon on the right side of the notification. The URL must use the HTTPS protocol.</p>
         * <blockquote>
         * <ul>
         * <li><p>Supported image formats are png, jpg, jpeg, heif, gif, and bmp. The image dimensions (length × width) must be less than 25,000 pixels.</p>
         * </li>
         * <li><p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.image</a> on the official HarmonyOS website.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/xxx.png">https://example.com/xxx.png</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>When <code>RenderStyle</code> is <code>MULTI_LINE</code>, you must fill in this field to define the content for the multi-line text style. It supports up to 3 lines of content.</p>
         */
        @NameInMap("InboxContent")
        public java.util.List<String> inboxContent;

        /**
         * <p>The JSON string of the HarmonyOS Live Window data structure <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V13/push-scenariozed-api-request-param-V13#section66881469306">LiveViewPayload</a>. For developer integration, see the document <a href="https://help.aliyun.com/document_detail/2982112.html">HarmonyOS Live Window Push Guide</a>.</p>
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
         * <p>Specifies the unique identifier (notifyId) for each message when it is displayed in the notification bar. If not provided, the push service automatically generates a unique identifier. Different notification messages can use the same notifyId to allow new messages to overwrite old ones. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.notifyId</a> on the official HarmonyOS website.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("NotifyId")
        public Integer notifyId;

        /**
         * <p>The receipt ID for the HarmonyOS channel. This ID can be found in the receipt parameter settings on the HarmonyOS channel push operations platform.</p>
         * <blockquote>
         * <ul>
         * <li><p>If the default receipt configuration on the HarmonyOS channel push operations platform is the Alibaba Cloud receipt, you do not need to provide this. If not, we recommend that you first configure the default HarmonyOS channel receipt ID in the Alibaba Cloud EMAS Mobile Push console.</p>
         * </li>
         * <li><p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">pushOptions.receiptId</a> on the official HarmonyOS website.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RCPB***DFD5</p>
         */
        @NameInMap("ReceiptId")
        public String receiptId;

        /**
         * <p>The notification message style. This is an optional parameter. The default is a normal notification.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("RenderStyle")
        public String renderStyle;

        /**
         * <p>Uses the specified type of notification channel.</p>
         * <blockquote>
         * <ul>
         * <li><p>This is only valid for Alibaba Cloud\&quot;s proprietary channels.</p>
         * </li>
         * <li><p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/js-apis-notificationmanager-V5#slottype">SlotType</a> on the official HarmonyOS website.</p>
         * </li>
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
         * <p>The duration of the custom message notification ringtone in seconds. The range is [1, 60]. If the ringtone duration is too short, it will loop.</p>
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
         * <li>For more information, see the HarmonyOS push parameter <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">TestMessage</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TestMessage")
        public Boolean testMessage;

        /**
         * <p>The URI corresponding to the ability of an in-app page.</p>
         * <blockquote>
         * <ul>
         * <li><p>If there are multiple abilities, specify the action and URI for each ability separately. The system prioritizes using the action to find the corresponding in-app page.</p>
         * </li>
         * <li><p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.uri</a> on the official HarmonyOS website.</p>
         * </li>
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
         * <p>Static pass-through parameters for iOS Live Activities push. They are used to transmit immutable business identification information.</p>
         * <blockquote>
         * <p>This is required when <code>Event</code> is \<code>start\\</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;orderId&quot;: &quot;ORD20231201001&quot;,
         *   &quot;restaurantName&quot;: &quot;美味餐厅&quot;,
         *   &quot;customerAddress&quot;: &quot;xx区xx路xx号&quot;,
         *   &quot;orderType&quot;: &quot;delivery&quot;
         * }</p>
         */
        @NameInMap("Attributes")
        public String attributes;

        /**
         * <p>The type of Live Activity to start.</p>
         * <blockquote>
         * <p>This is required when <code>Event</code> is \<code>start\\</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>OrderActivityAttributes</p>
         */
        @NameInMap("AttributesType")
        public String attributesType;

        /**
         * <p>Dynamic pass-through parameters for a Live Activity. They contain real-time updatable status information and changing data.</p>
         * <blockquote>
         * <ul>
         * <li><p>Avoid overly frequent updates. An interval of 5 seconds or more is recommended.</p>
         * </li>
         * <li><p>Update multiple fields in a batch to reduce the number of pushes.</p>
         * </li>
         * <li><p>Consider the user experience and avoid screen flickering.</p>
         * </li>
         * <li><p>Must be a valid JSON string.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;status&quot;: &quot;delivering&quot;,
         *     &quot;estimatedTime&quot;: &quot;10分钟&quot;,
         *     &quot;progress&quot;: 80,
         *     &quot;driverName&quot;: &quot;李师傅&quot;,
         *     &quot;currentStep&quot;: &quot;配送员正在路上&quot;}
         * }</p>
         */
        @NameInMap("ContentState")
        public String contentState;

        /**
         * <p>Sets the retention period for a finished Live Activity on the lock screen. This lets users view information after the activity has ended. It is a Unix timestamp in seconds.</p>
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
         * <p>The unique identifier for a Live Activity. It associates the activity instance on the device with the push target on the server.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li><p>This <code>ID</code> must be the same as the <code>forActivityId</code> parameter of the <code>registerLiveActivityPushToken</code> method in the client SDK.</p>
         * </li>
         * <li><p>The server uses this <code>ID</code> to locate the specific activity instance during a push.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FOOD_DELIVERY_ORD20231201001</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Sets the expiration timestamp for the content of an iOS Live Activity. It is a Unix timestamp in seconds.</p>
         * <blockquote>
         * <ul>
         * <li><p>After the specified time is reached, the system automatically marks the activity as expired.</p>
         * </li>
         * <li><p>Expired activities are removed from the Live Activity and the lock screen.</p>
         * </li>
         * <li><p>This prevents outdated information from occupying the user interface for a long time.</p>
         * </li>
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
         * <p>iOS notifications are sent through the Apple Push Notification service (APNs) center. You must specify the environment information. This is an optional parameter. The default is the production environment.</p>
         * <ul>
         * <li><p>DEV: Development environment, for applications installed and tested directly from Xcode.</p>
         * </li>
         * <li><p>PRODUCT: Production environment, for applications distributed through the App Store, TestFlight, Ad Hoc, and enterprise channels.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("ApnsEnv")
        public String apnsEnv;

        /**
         * <p>The iOS application badge.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Badge")
        public Integer badge;

        /**
         * <p>Specifies whether to enable the badge auto-increment feature. This is an optional parameter. The default value is false.</p>
         * <blockquote>
         * <ul>
         * <li><p>This parameter cannot be used with the badge setting parameter.</p>
         * </li>
         * <li><p>The badge auto-increment feature is maintained by the Alibaba Cloud push server, which counts the badges for each device. You must use SDK version 1.9.5 or later and actively sync the badge number to the server through the SDK.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BadgeAutoIncrement")
        public Boolean badgeAutoIncrement;

        /**
         * <p>Specifies the category identifier for an iOS notification. This defines the notification\&quot;s interactive behavior and display style.</p>
         * <blockquote>
         * <ul>
         * <li><p>The category must be pre-registered in the app to take effect.</p>
         * </li>
         * <li><p>Different categories can define different sets of actions.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MESSAGE_REPLY</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>A unique identifier that controls notification merging. Notifications with the same identifier are overwritten.</p>
         * 
         * <strong>example:</strong>
         * <p>order_status_update_12345</p>
         */
        @NameInMap("CollapseId")
        public String collapseId;

        /**
         * <p>Custom extension properties for iOS notifications.</p>
         * <blockquote>
         * <ul>
         * <li>The parameter must be passed in a standard JSON Map format. An incorrect format causes parsing to fail.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;attachment&quot;: &quot;<a href="https://xxxx.xxx/notification_pic.png%22%7D">https://xxxx.xxx/notification_pic.png&quot;}</a></p>
         */
        @NameInMap("ExtParameters")
        public String extParameters;

        /**
         * <p>The interruption level. This is an optional parameter. Valid values are:</p>
         * <ul>
         * <li><p><code>passive</code>: The system adds the notification to the notification list without lighting up the screen or playing a sound.</p>
         * </li>
         * <li><p><code>active</code>: The system displays the notification immediately, lights up the screen, and can play a sound.</p>
         * </li>
         * <li><p><code>time-sensitive</code>: The system presents the notification immediately, lights up the screen, and can play a sound, but does not override system notification controls.</p>
         * </li>
         * <li><p><code>critical</code>: The system displays the notification immediately, lights up the screen, and plays a sound, bypassing the mute switch.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("InterruptionLevel")
        public String interruptionLevel;

        /**
         * <p>Live Activities parameter object.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li><p>Live Activities push only supports pushing to a single device of the <code>DEVICE</code> type.</p>
         * </li>
         * <li><p>When you push to Live Activities, you can leave the title and body parameters empty.</p>
         * </li>
         * </ul>
         */
        @NameInMap("LiveActivity")
        public PushTaskNotificationIosLiveActivity liveActivity;

        /**
         * <p>The iOS notification sound. Specify the name of the audio file stored in the app bundle or the sandbox Library/Sounds directory. For more information, see <a href="https://help.aliyun.com/document_detail/48906.html">How to set the notification sound for iOS push</a>.</p>
         * <blockquote>
         * <ul>
         * <li><p>If you specify an empty string (&quot;&quot;), the notification is silent.</p>
         * </li>
         * <li><p>If this parameter is not set, the default value is \<code>default\\</code>, which is the system prompt sound.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Music")
        public String music;

        /**
         * <p>Enables extended notifications and controls whether iOS notifications support processing by the Notification Service Extension.</p>
         * <blockquote>
         * <ul>
         * <li><p>This must be set to true when you send a silent notification.</p>
         * </li>
         * <li><p>The extension processing time cannot exceed 30 seconds.</p>
         * </li>
         * <li><p>A timeout causes the notification to display the original content.</p>
         * </li>
         * <li><p>You must add a Notification Service Extension to your application.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Mutable")
        public Boolean mutable;

        /**
         * <p>The relevance score of the notification message. It is used to control the priority and display policy of the notification.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("RelevanceScore")
        public Double relevanceScore;

        /**
         * <p>Controls whether to enable silent push mode.</p>
         * <blockquote>
         * <ul>
         * <li>When you send a silent notification, you can leave the <code>title</code> and <code>body</code> parameters empty.</li>
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
         * <p>请查收订单。</p>
         */
        @NameInMap("Subtitle")
        public String subtitle;

        /**
         * <p>The thread identifier for iOS notification grouping. It is used to classify and collapse related notifications.</p>
         * <blockquote>
         * <ul>
         * <li><p>Notifications with the same thread-id are automatically grouped.</p>
         * </li>
         * <li><p>Multiple related notifications are collapsed into one notification group.</p>
         * </li>
         * <li><p>Users can expand the group to view all notifications within it.</p>
         * </li>
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
         * <p>Android notification configuration</p>
         */
        @NameInMap("Android")
        public PushTaskNotificationAndroid android;

        /**
         * <p>The content of the push notification.</p>
         * <blockquote>
         * <p>The length limits are as follows:</p>
         * <ul>
         * <li>For iOS, HarmonyOS, and Android, the character length cannot exceed 200.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>尊敬的客户，您好！您的预约订单已取消成功。</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>HarmonyOS notification configuration.</p>
         */
        @NameInMap("Hmos")
        public PushTaskNotificationHmos hmos;

        /**
         * <p>iOS notification configuration</p>
         */
        @NameInMap("Ios")
        public PushTaskNotificationIos ios;

        /**
         * <p>The title of the push notification.</p>
         * <blockquote>
         * <p>The length limits are as follows:</p>
         * <ul>
         * <li><p>For iOS/HarmonyOS, the byte length cannot exceed 200.</p>
         * </li>
         * <li><p>For Android, the character length cannot exceed 50.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>您有一条新消息</p>
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
         * <p>The delay time to trigger the text message, in seconds.</p>
         * <p>This must be set if you use SMS filter interaction. We recommend setting it to 15 seconds or more, with a maximum of 3 days, to avoid duplicate text messages and pushes.</p>
         * <blockquote>
         * <p>When you use SMS filter interaction, the ExpireTime parameter is invalid. The notification expiration time is calculated based on the DelaySecs parameter. The expiration time is the current time plus the DelaySecs time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("DelaySecs")
        public Long delaySecs;

        /**
         * <p>Key-value pairs for the variables in the SMS template.</p>
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
         * <p>某某科技</p>
         */
        @NameInMap("SignName")
        public String signName;

        /**
         * <p>The SMS template name. You can get this from the SMS template management interface. It is the name assigned by the system, not the name set by the developer.</p>
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
         * <p>Sets the expiration time of the message. After this time, the message will no longer be sent. The maximum retention period is 72 hours.</p>
         * <blockquote>
         * <ul>
         * <li><p>This uses the ISO 8601 standard and UTC time. The format is YYYY-MM-DDThh:mm:ssZ.</p>
         * </li>
         * <li><p>The expiration time must satisfy: ExpireTime &gt; PushTime + 3 seconds (3 seconds is a buffer for network and system delays).</p>
         * </li>
         * <li><p>Recommendation: The expiration time for a single push should be at least 1 minute. For a push to all or a batch push, it should be at least 10 minutes.</p>
         * </li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>For pass-through messages, if you do not set an expiration time, the message is only sent to online devices. If the device is offline, the message is discarded.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-21T12:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>A custom identifier for the push task. If JobKey is not empty, this field will be included in the receipt log. To view receipt logs, see <a href="https://help.aliyun.com/document_detail/434651.html">Receipt logs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>jobkey1727749697913</p>
         */
        @NameInMap("JobKey")
        public String jobKey;

        /**
         * <p>A unique ID used to identify the message. This is only valid when the <code>Action</code> parameter is <code>CONTINUOUS_PUSH</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1174754033128****</p>
         */
        @NameInMap("MessageId")
        public Long messageId;

        /**
         * <p>Specifies the sending time of the message, up to 7 days in the future. This is only valid when the <code>Action</code> parameter is <code>SCHEDULED_PUSH</code>.</p>
         * <blockquote>
         * <p>This uses the ISO 8601 standard and UTC time. The format is yyyy-MM-ddTHH:mm:ssZ.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-06-19T12:00:00Z</p>
         */
        @NameInMap("PushTime")
        public String pushTime;

        /**
         * <p>Resends the message as a text message.</p>
         * <blockquote>
         * <p>Currently, this is only supported for <code>Android</code> and <code>HarmonyOS</code> devices.</p>
         * </blockquote>
         */
        @NameInMap("Sms")
        public PushTaskOptionsSms sms;

        /**
         * <p>Specifies whether to automatically truncate oversized titles and content.</p>
         * <blockquote>
         * <p>This is only supported for vendor channels that have explicit limits on title and content length. It does not apply to channels like APNs, Huawei, and Honor, which do not limit title and content length but only the total request body size.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Trim")
        public Boolean trim;

        /**
         * <p>Specifies the sending channel. Valid values are:</p>
         * <ul>
         * <li><p><code>accs</code>: Alibaba Cloud proprietary channel</p>
         * </li>
         * <li><p><code>huawei</code>: Huawei channel</p>
         * </li>
         * <li><p><code>honor</code>: Honor channel</p>
         * </li>
         * <li><p><code>xiaomi</code>: Xiaomi channel</p>
         * </li>
         * <li><p><code>oppo</code>: OPPO channel</p>
         * </li>
         * <li><p><code>vivo</code>: vivo channel</p>
         * </li>
         * <li><p><code>meizu</code>: Meizu channel</p>
         * </li>
         * <li><p><code>fcm</code>: Google Firebase channel (HTTP v1 API)</p>
         * </li>
         * <li><p><code>apns</code>: APNs channel</p>
         * </li>
         * <li><p><code>harmony</code>: HarmonyOS channel</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>If this parameter is not configured, all channels can be used.</p>
         * </li>
         * <li><p>If this parameter is configured, only the channels specified in the parameter are used.</p>
         * </li>
         * <li><p>If the configured channel conflicts with the sending policy (for example, iOS notifications only go through the APNs channel, but this parameter does not include \<code>apns\\</code>), the message is not sent.</p>
         * </li>
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
         * <p>The platform type. This is an optional parameter.</p>
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
         * <p>The <code>MassPushV2</code> batch push API and <code>CONTINUOUS_PUSH</code> continuous push support only the following three target types:</p>
         * <ul>
         * <li><p><code>DEVICE</code></p>
         * </li>
         * <li><p><code>ACCOUNT</code></p>
         * </li>
         * <li><p><code>ALIAS</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEVICE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Set the push target based on <code>Target.Type</code>. Separate multiple targets with commas. The target types and their values are described as follows:</p>
         * <blockquote>
         * <ul>
         * <li><p><code>DEVICE</code>: Device ID, such as deviceid1,deviceid2. You can specify up to 1,000 device IDs.</p>
         * </li>
         * <li><p><code>ACCOUNT</code>: Account ID, such as account1,account2. You can specify up to 1,000 account IDs.</p>
         * </li>
         * <li><p><code>ALIAS</code>: Alias, such as alias1,alias2. You can specify up to 1,000 aliases.</p>
         * </li>
         * <li><p><code>TAG</code>: Supports one or more tags. For more information about the format, see <a href="https://help.aliyun.com/document_detail/434847.html">Tag format specifications</a>.</p>
         * </li>
         * <li><p><code>ALL</code>: Push to all devices. You do not need to set a value. Pushing to all devices may increase costs. Use this feature with caution.</p>
         * </li>
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
