// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class MassPushRequest extends TeaModel {
    /**
     * <p>AppKey information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>An idempotency parameter used to prevent duplicate pushes caused by API caller retries. When calls are made with the same IdempotentToken within 15 minutes, only one push is performed, and subsequent calls return the result of the first successful push.</p>
     * <blockquote>
     * <ul>
     * <li>The parameter format is a standard 36-character UUID (8-4-4-4-12). Each valid character is a hexadecimal digit in the range 0-9 or a-f, case-insensitive.</li>
     * <li>This parameter is only used to prevent duplicate pushes caused by retries and cannot prevent duplicate pushes caused by concurrent calls.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c8016d13-6e76-410c-9bda-769383d11787</p>
     */
    @NameInMap("IdempotentToken")
    public String idempotentToken;

    /**
     * <p>An array of independent push tasks.</p>
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

    public MassPushRequest setIdempotentToken(String idempotentToken) {
        this.idempotentToken = idempotentToken;
        return this;
    }
    public String getIdempotentToken() {
        return this.idempotentToken;
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
         * <p>Specify the Activity to open from the notification.</p>
         * <p>Only applicable when PushTask.N.AndroidOpenType=&quot;Activity&quot;, e.g., <code>com.alibaba.cloudpushdemo.bizactivity</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.cloudpushdemo.bizactivity</p>
         */
        @NameInMap("AndroidActivity")
        public String androidActivity;

        /**
         * <p>Set the badge increment value. The value is added to the existing badge count. Value range: [1-99].</p>
         * <blockquote>
         * <p>Only valid for Huawei/Honor vendor channel pushes. When both AndroidBadgeAddNum and AndroidBadgeSetNum are present, AndroidBadgeSetNum takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidBadgeAddNum")
        public Integer androidBadgeAddNum;

        /**
         * <p>Full class name of the app entry Activity for badge settings.</p>
         * <blockquote>
         * <p>Only valid for Huawei/Honor vendor channel pushes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.cloudpushdemo.bizactivity</p>
         */
        @NameInMap("AndroidBadgeClass")
        public String androidBadgeClass;

        /**
         * <p>Set the badge to a fixed number. Value range: [0-99].</p>
         * <blockquote>
         * <p>For vendor channel pushes, this only takes effect on Huawei and Honor channels. For Alibaba Cloud proprietary channel pushes, this only takes effect on Huawei, Honor, and vivo devices.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AndroidBadgeSetNum")
        public Integer androidBadgeSetNum;

        /**
         * <p>Body in long text mode. Length limit: 1,000 bytes (1 Chinese character counts as 3 bytes). Subject to specific vendor channel restrictions when sending.</p>
         * <p>Currently supported:</p>
         * <ul>
         * <li>Huawei: EMUI 10 and later</li>
         * <li>Honor: Magic UI 4.0 and later</li>
         * <li>Xiaomi: MIUI 10 and later</li>
         * <li>OPPO: ColorOS 5.0 and later</li>
         * <li>Meizu: Flyme</li>
         * <li>Proprietary channel: Android SDK 3.6.0 and later</li>
         * </ul>
         * <p>If this parameter is not provided in long text mode, the first non-empty value from Body and AndroidPopupBody is used.</p>
         * 
         * <strong>example:</strong>
         * <p>示例长文本</p>
         */
        @NameInMap("AndroidBigBody")
        public String androidBigBody;

        /**
         * <p>Image URL in big picture mode. Currently supported: Proprietary channel: Android SDK 3.6.0 and later.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
         */
        @NameInMap("AndroidBigPictureUrl")
        public String androidBigPictureUrl;

        /**
         * <p>Title in long text mode. Length limit: 200 bytes (1 Chinese character counts as 3 bytes).</p>
         * <ul>
         * <li><p>Currently only supported by the Honor channel and Huawei channel EMUI 11 and later.</p>
         * </li>
         * <li><p>If this parameter is not provided in long text mode, the first non-empty value from Title and AndroidPopupTitle is used.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>示例长标题</p>
         */
        @NameInMap("AndroidBigTitle")
        public String androidBigTitle;

        /**
         * <p>Set notification extended properties. This property does not take effect when the push type PushType is set to MESSAGE.</p>
         * <p>This parameter must be passed in JSON map format; otherwise, parsing errors will occur.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;api_name&quot;:&quot;PushNoticeToAndroidRequest&quot;}</p>
         */
        @NameInMap("AndroidExtParameters")
        public String androidExtParameters;

        /**
         * <p>Set the Honor channel notification type:</p>
         * <ul>
         * <li><strong>0</strong>: Production notification (default).</li>
         * <li><strong>1</strong>: Test notification.</li>
         * </ul>
         * <blockquote>
         * <p>Each application can send up to 1,000 test notifications per day, and this is not subject to the daily per-device push limit.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidHonorTargetUserType")
        public Integer androidHonorTargetUserType;

        /**
         * <p>Set the Huawei instant notification parameter:</p>
         * <ul>
         * <li><strong>0</strong>: Send a regular Huawei notification (default).</li>
         * <li><strong>1</strong>: Send a Huawei instant notification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidHuaweiBusinessType")
        public Integer androidHuaweiBusinessType;

        /**
         * <p>JSON string of the Huawei Android Live Notification data structure <a href="https://developer.huawei.com/consumer/cn/doc/HMSCore-References/rest-live-0000001562939968#ZH-CN_TOPIC_0000001700850537__p195121620102511">LiveNotificationPayload</a>. For development integration, see <a href="https://help.aliyun.com/document_detail/2983768.html">Huawei Live Notification Push Guide</a></p>
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
        @NameInMap("AndroidHuaweiLiveNotificationPayload")
        public String androidHuaweiLiveNotificationPayload;

        /**
         * <p>Huawei channel receipt ID. This receipt ID can be found in the receipt parameter configuration on the Huawei channel push operations platform.</p>
         * <blockquote>
         * <p>If the default receipt configuration on the Huawei channel push operations platform is set to Alibaba Cloud receipt, this is not required. If not, we recommend configuring the default Huawei channel receipt ID in the Alibaba Cloud EMAS Mobile Push console first.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RCP4C123456</p>
         */
        @NameInMap("AndroidHuaweiReceiptId")
        public String androidHuaweiReceiptId;

        /**
         * <p>Set the Huawei channel notification type:</p>
         * <ul>
         * <li><strong>0</strong>: Production notification (default).</li>
         * <li><strong>1</strong>: Test notification.</li>
         * </ul>
         * <blockquote>
         * <p>Each application can send up to 500 test notifications per day, and this is not subject to the daily per-device push limit.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidHuaweiTargetUserType")
        public Integer androidHuaweiTargetUserType;

        /**
         * <p>Right-side icon URL. Currently supported:</p>
         * <ul>
         * <li>Huawei EMUI (only applicable in long text mode and Inbox mode)</li>
         * <li>Honor Magic UI (only applicable in long text mode)</li>
         * <li>Proprietary channel: Android SDK 3.5.0 and later</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
         */
        @NameInMap("AndroidImageUrl")
        public String androidImageUrl;

        /**
         * <p>Body content in Inbox mode. The content must be a valid JSON Array with no more than 5 elements. Currently supported:</p>
         * <ul>
         * <li>Huawei: EMUI 9 and later</li>
         * <li>Honor: Magic UI 4.0 and later</li>
         * <li>Xiaomi: MIUI 10 and later</li>
         * <li>OPPO: ColorOS 5.0 and later</li>
         * <li>Proprietary channel: Android SDK 3.6.0 and later</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;第一行&quot;,&quot;第二行&quot;]</p>
         */
        @NameInMap("AndroidInboxBody")
        public String androidInboxBody;

        /**
         * <p>Meizu message type</p>
         * <ul>
         * <li>0: Public message (default)</li>
         * <li>1: Private message</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("AndroidMeizuNoticeMsgType")
        public Integer androidMeizuNoticeMsgType;

        /**
         * <p>Purpose 1: After completing the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835?#section3410731125514">self-classification privilege application</a>, this is used to identify the message type, determine the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#ZH-CN_TOPIC_0000001149358835__p3850133955718">notification alert method</a>, and speed up delivery for specific message types. For valid values, refer to the Huawei Push official documentation\&quot;s <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section1076611477914">Message Classification Standard</a>. Use the &quot;Cloud notification category value&quot; or &quot;Local notification category value&quot; from the documentation table.</p>
         * <p>Purpose 2: After <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">applying for special permissions</a>, this is used to identify high-priority pass-through scenarios. Valid values:</p>
         * <ul>
         * <li>VOIP: Audio/video calls</li>
         * <li>PLAY_VOICE: Voice playback</li>
         * </ul>
         * <blockquote>
         * <p>For &quot;Cloud notification category values&quot; marked as &quot;Not applicable&quot;, the Alibaba Cloud proprietary channel is used. For &quot;Local notification category values&quot; marked as &quot;Not applicable&quot;, the Huawei channel is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SUBSCRIPTION</p>
         */
        @NameInMap("AndroidMessageHuaweiCategory")
        public String androidMessageHuaweiCategory;

        /**
         * <p>Huawei channel notification delivery priority. Valid values:</p>
         * <ul>
         * <li><p>HIGH</p>
         * </li>
         * <li><p>NORMAL</p>
         * </li>
         * </ul>
         * <p>Permission application is required. See: <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">Application link</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        @NameInMap("AndroidMessageHuaweiUrgency")
        public String androidMessageHuaweiUrgency;

        /**
         * <p>OPPO classifies messages into two categories: Communication &amp; Service, and Content &amp; Marketing.</p>
         * <p>Communication &amp; Service (permission application required):</p>
         * <ul>
         * <li>IM: Instant messaging, audio, and video calls</li>
         * <li>ACCOUNT: Personal account and asset changes</li>
         * <li>DEVICE_REMINDER: Personal device reminders</li>
         * <li>ORDER: Personal order/logistics status changes</li>
         * <li>TODO: Personal schedule/to-do items</li>
         * <li>SUBSCRIPTION: Personal subscriptions</li>
         * </ul>
         * <p>Content &amp; Marketing:</p>
         * <ul>
         * <li>NEWS: News and information</li>
         * <li>CONTENT: Content recommendations</li>
         * <li>MARKETING: Platform promotions</li>
         * <li>SOCIAL: Social updates</li>
         * </ul>
         * <p>For details, see <a href="https://open.oppomobile.com/new/developmentDoc/info?id=13189">OPUSH Message Classification Rules</a></p>
         * 
         * <strong>example:</strong>
         * <p>MARKETING</p>
         */
        @NameInMap("AndroidMessageOppoCategory")
        public String androidMessageOppoCategory;

        /**
         * <p>OPPO channel notification bar message alert level. Valid values:</p>
         * <ul>
         * <li>1: Notification bar</li>
         * <li>2: Notification bar, lock screen, ringtone, and vibration (default notification level for Communication &amp; Service messages)</li>
         * <li>16: Notification bar, lock screen, ringtone, vibration, and banner (permission application required)</li>
         * </ul>
         * <blockquote>
         * <p>When using the AndroidMessageOppoNotifyLevel parameter, the AndroidMessageOppoCategory parameter must also be provided.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidMessageOppoNotifyLevel")
        public Integer androidMessageOppoNotifyLevel;

        /**
         * <p>vivo classifies messages into two categories: System messages and Operational messages.</p>
         * <p>System messages:</p>
         * <ul>
         * <li>IM: Instant messages</li>
         * <li>ACCOUNT: Account and assets</li>
         * <li>TODO: Schedule and to-do items</li>
         * <li>DEVICE_REMINDER: Device information</li>
         * <li>ORDER: Orders and logistics</li>
         * <li>SUBSCRIPTION: Subscription reminders</li>
         * </ul>
         * <p>Operational messages:</p>
         * <ul>
         * <li>NEWS: News</li>
         * <li>CONTENT: Content recommendations</li>
         * <li>MARKETING: Operational campaigns</li>
         * <li>SOCIAL: Social updates<blockquote>
         * <p>For details, see <a href="https://dev.vivo.com.cn/documentCenter/doc/359#s-ef3qugc3">Classification Description</a></p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TODO</p>
         */
        @NameInMap("AndroidMessageVivoCategory")
        public String androidMessageVivoCategory;

        /**
         * <p>Huawei vendor channel notification sound. Specify the name of an audio file stored in the client project\&quot;s app/src/main/res/raw/ directory. The file extension is not required.</p>
         * <p>If not set, the default ringtone is used.</p>
         * 
         * <strong>example:</strong>
         * <p>alicloud_notification_sound</p>
         */
        @NameInMap("AndroidMusic")
        public String androidMusic;

        /**
         * <p>Priority of the notification position in the Android notification bar. Valid values: -2, -1, 0, 1, 2.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AndroidNotificationBarPriority")
        public Integer androidNotificationBarPriority;

        /**
         * <p>Android custom notification bar style. Value range: 1-100.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AndroidNotificationBarType")
        public Integer androidNotificationBarType;

        /**
         * <p>The channelId of the Android app. Must match the channelId configured in the app.</p>
         * <ul>
         * <li>Set the NotificationChannel parameter. For specific usage, see <a href="https://help.aliyun.com/document_detail/67398.html">FAQ: Notifications not received on Android 8.0+ devices</a>.</li>
         * <li>Since the OPPO notification private channel\&quot;s channel_id is the same as the app\&quot;s channelId, the channel_id takes this value when pushing through the OPPO channel.</li>
         * <li>For Huawei, FCM, and Alibaba Cloud proprietary channel pushes, the channel_id takes this value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidNotificationChannel")
        public String androidNotificationChannel;

        /**
         * <p>Message grouping. Messages in the same group display only the latest one and the total count of messages received in that group in the notification bar. All messages are not displayed and cannot be expanded. Currently supported:</p>
         * <ul>
         * <li>Huawei vendor channel</li>
         * <li>Honor vendor channel</li>
         * <li>Proprietary channel: Android SDK 3.9.1 and earlier</li>
         * </ul>
         * <blockquote>
         * <p>The proprietary channel no longer supports this parameter on Android SDK 3.9.2 and later.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>group-1</p>
         */
        @NameInMap("AndroidNotificationGroup")
        public String androidNotificationGroup;

        /**
         * <p>Set the Honor notification message classification importance parameter, which determines the notification behavior on user devices. Valid values:</p>
         * <ul>
         * <li><p>LOW: Information and marketing messages</p>
         * </li>
         * <li><p>NORMAL: Service and communication messages</p>
         * </li>
         * </ul>
         * <p>Application is required on the Honor platform. <a href="https://developer.honor.com/cn/docs/11002/guides/notification-class#%E8%87%AA%E5%88%86%E7%B1%BB%E6%9D%83%E7%9B%8A%E7%94%B3%E8%AF%B7">Application link</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>LOW</p>
         */
        @NameInMap("AndroidNotificationHonorChannel")
        public String androidNotificationHonorChannel;

        /**
         * <p>Set the Huawei notification message classification importance parameter, which determines the notification behavior on user devices. Valid values:</p>
         * <ul>
         * <li>LOW: Information and marketing messages</li>
         * <li>NORMAL: Service and communication messages</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The Huawei channel now recommends using AndroidMessageHuaweiCategory for notification classification. AndroidNotificationHuaweiChannel is no longer required.</li>
         * <li>Application is required on the Huawei platform. <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section893184112272">Application link</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>LOW</p>
         */
        @NameInMap("AndroidNotificationHuaweiChannel")
        public String androidNotificationHuaweiChannel;

        /**
         * <p>Unique identifier for each message displayed in the notification bar. Different notification bar messages can share the same NotifyId, allowing new notifications to replace old ones.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("AndroidNotificationNotifyId")
        public Integer androidNotificationNotifyId;

        /**
         * <p>Message grouping. Messages in the same group are displayed collapsed in the notification bar and can be expanded. Notifications from different groups are displayed separately. Currently supported:</p>
         * <ul>
         * <li>Proprietary channel: Android SDK 3.9.2 and later</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>thread-1</p>
         */
        @NameInMap("AndroidNotificationThreadId")
        public String androidNotificationThreadId;

        /**
         * <p>Set the vivo notification message classification. Valid values:</p>
         * <ul>
         * <li>0: Operational messages (default)</li>
         * <li>1: System messages</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The vivo channel now recommends using AndroidMessageVivoCategory for notification classification. AndroidNotificationVivoChannel is no longer required.</li>
         * <li>Application is required on the vivo platform. See: <a href="https://dev.vivo.com.cn/documentCenter/doc/359">Application link</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AndroidNotificationVivoChannel")
        public String androidNotificationVivoChannel;

        /**
         * <p>Set the channelId for Xiaomi notification types. Application is required on the Xiaomi platform. See: <a href="https://dev.mi.com/console/doc/detail?pId=2422#_4">Application link</a>.</p>
         * <blockquote>
         * <ul>
         * <li>A single application on the Xiaomi channel can apply for up to 8 channels. Please plan ahead.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>michannel</p>
         */
        @NameInMap("AndroidNotificationXiaomiChannel")
        public String androidNotificationXiaomiChannel;

        /**
         * <p>Notification alert type. Valid values:</p>
         * <ul>
         * <li><strong>VIBRATE</strong>: Vibration (default)</li>
         * <li><strong>SOUND</strong>: Sound</li>
         * <li><strong>BOTH</strong>: Sound and vibration</li>
         * <li><strong>NONE</strong>: Silent</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VIBRATE</p>
         */
        @NameInMap("AndroidNotifyType")
        public String androidNotifyType;

        /**
         * <p>Action after clicking the notification. Valid values:</p>
         * <ul>
         * <li>APPLICATION: Open the app (default)</li>
         * <li>ACTIVITY: Open an Android Activity</li>
         * <li>URL: Open a URL</li>
         * <li>NONE: No navigation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APPLICATION</p>
         */
        @NameInMap("AndroidOpenType")
        public String androidOpenType;

        /**
         * <p>The URL to open after Android receives the push. Only applicable when PushTask.N.AndroidOpenType=&quot;URL&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx.xxx">https://xxxx.xxx</a></p>
         */
        @NameInMap("AndroidOpenUrl")
        public String androidOpenUrl;

        /**
         * <p>JSON string of the OPPO Fluid Cloud intent deletion data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13578">data</a>. This parameter is ignored when the AndroidOppoIntelligentIntent parameter is already provided. For development integration, see <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud Push Guide</a></p>
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
        @NameInMap("AndroidOppoDeleteIntentData")
        public String androidOppoDeleteIntentData;

        /**
         * <p>JSON string of the OPPO Fluid Cloud intent sharing data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13565">IntelligentIntent</a>. For development integration, see <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud Push Guide</a></p>
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
        @NameInMap("AndroidOppoIntelligentIntent")
        public String androidOppoIntelligentIntent;

        /**
         * <p>Set the OPPO Fluid Cloud push environment:</p>
         * <ul>
         * <li><strong>0</strong>: Production environment (default).</li>
         * <li><strong>1</strong>: Test environment.</li>
         * </ul>
         * <blockquote>
         * <p>The OPPO Fluid Cloud test environment requires client-side setup. See <a href="https://open.oppomobile.com/documentation/page/info?id=13590">Environment Setup</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidOppoIntentEnv")
        public Integer androidOppoIntentEnv;

        /**
         * <p>OPPO private message template content parameters</p>
         */
        @NameInMap("AndroidOppoPrivateContentParameters")
        @Deprecated
        public java.util.Map<String, String> androidOppoPrivateContentParameters;

        /**
         * <p>OPPO private message template ID</p>
         * <blockquote>
         * <p>Warning: The OPPO private message template feature is no longer supported by MaasPush. To use this feature, please use the Push, PushV2, or MassPushV2 API instead.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>687557242b1634hzef3zd5013</p>
         */
        @NameInMap("AndroidOppoPrivateMsgTemplateId")
        @Deprecated
        public String androidOppoPrivateMsgTemplateId;

        /**
         * <p>OPPO private message template title parameters</p>
         */
        @NameInMap("AndroidOppoPrivateTitleParameters")
        @Deprecated
        public java.util.Map<String, String> androidOppoPrivateTitleParameters;

        /**
         * <p>Specify the Activity to navigate to when the notification is clicked.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.cloudpushdemo.bizactivity</p>
         */
        @NameInMap("AndroidPopupActivity")
        public String androidPopupActivity;

        /**
         * <p>Body content in auxiliary popup mode. Required when the AndroidPopupActivity parameter is not empty.</p>
         * <p>Length limit: 200 characters (both Chinese and English characters count as one character each).</p>
         * <p>When using vendor channels, you must also comply with the vendor channel restrictions. For details, see <a href="https://help.aliyun.com/document_detail/165253.html">Android Auxiliary Channel Push Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("AndroidPopupBody")
        public String androidPopupBody;

        /**
         * <p>Title content in auxiliary popup mode. Required when the AndroidPopupActivity parameter is not empty.</p>
         * <p>Length limit: 50 characters (both Chinese and English characters count as one character each).</p>
         * <p>When using vendor channels, you must also comply with the vendor channel restrictions. For details, see <a href="https://help.aliyun.com/document_detail/165253.html">Android Auxiliary Channel Push Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("AndroidPopupTitle")
        public String androidPopupTitle;

        /**
         * <p>When the push type is message and the device is offline, this push will use the auxiliary popup feature. Defaults to false. Only takes effect when PushType=MESSAGE.</p>
         * <p>If the message-to-notification conversion push is successful, the notification displays the data set by the server\&quot;s AndroidPopupTitle and AndroidPopupBody parameter values. The data obtained when clicking the notification in the auxiliary popup\&quot;s onSysNoticeOpened method is the server-set Title and Body parameter values.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AndroidRemind")
        public Boolean androidRemind;

        /**
         * <p>Notification style. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Standard mode (default)</li>
         * <li><strong>1</strong>: Long text mode (supported by Huawei, Honor, Xiaomi, OPPO, Meizu, and proprietary channels)</li>
         * <li><strong>2</strong>: Big picture mode (supported by proprietary channel, not supported on Xiaomi devices)</li>
         * <li><strong>3</strong>: List mode (supported by Huawei, Honor, Xiaomi, OPPO, and proprietary channels)<blockquote>
         * <p>This parameter is required when using non-standard modes.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidRenderStyle")
        public String androidRenderStyle;

        /**
         * <p>Set the vendor channel notification type:</p>
         * <ul>
         * <li><strong>0</strong>: Production notification (default).</li>
         * <li><strong>1</strong>: Test notification.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Configuring this parameter is equivalent to simultaneously configuring the AndroidHuaweiTargetUserType, AndroidHonorTargetUserType, AndroidVivoPushMode, and AndroidOppoIntentEnv parameters. The corresponding parameter for a specific vendor channel can override this parameter.</li>
         * <li>Currently supported: Huawei channel, Honor channel, vivo channel, and OPPO Fluid Cloud.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidTargetUserType")
        public Integer androidTargetUserType;

        /**
         * <p>JSON string of the vivo Atomic Island data structure <a href="https://dev.vivo.com.cn/documentCenter/doc/896#s-fdagzbd4">liveMessage</a>. For development integration, see <a href="https://help.aliyun.com/zh/document_detail/3030718.html">vivo Atomic Island Push Guide</a></p>
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
        @NameInMap("AndroidVivoLiveMessage")
        public String androidVivoLiveMessage;

        /**
         * <p>Set the vivo channel notification type:</p>
         * <ul>
         * <li><strong>0</strong>: Production push (default).</li>
         * <li><strong>1</strong>: Test push.</li>
         * </ul>
         * <blockquote>
         * <p>For test pushes, configure test devices in the vivo console in advance. The test device RegId can be obtained by searching for &quot;onReceiveRegId regId&quot; in the device startup logs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidVivoPushMode")
        public Integer androidVivoPushMode;

        /**
         * <p>vivo channel receipt ID. This receipt ID can be found in the app information section of the push service on the vivo open platform.</p>
         * <blockquote>
         * <p>If the default receipt configuration on the vivo open platform is set to Alibaba Cloud receipt, this is not required. If not, we recommend configuring the default vivo channel receipt ID in the Alibaba Cloud EMAS Mobile Push console first.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AndroidVivoReceiptId")
        public String androidVivoReceiptId;

        /**
         * <p>This parameter has been deprecated. All third-party auxiliary popups are now supported by the new parameter <strong>AndroidPopupActivity</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("AndroidXiaoMiActivity")
        @Deprecated
        public String androidXiaoMiActivity;

        /**
         * <p>This parameter has been deprecated. All third-party auxiliary popups are now supported by the new parameter <strong>AndroidPopupBody</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("AndroidXiaoMiNotifyBody")
        @Deprecated
        public String androidXiaoMiNotifyBody;

        /**
         * <p>This parameter has been deprecated. All third-party auxiliary popups are now supported by the new parameter <strong>AndroidPopupTitle</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("AndroidXiaoMiNotifyTitle")
        @Deprecated
        public String androidXiaoMiNotifyTitle;

        /**
         * <p>This parameter has been deprecated. Since August 2023, Xiaomi has officially discontinued support for dynamically setting small icons, right-side icons, and big pictures during push on new devices/systems.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://f6.market.xiaomi.com/download/MiPass/aaa/bbb.png">https://f6.market.xiaomi.com/download/MiPass/aaa/bbb.png</a></p>
         */
        @NameInMap("AndroidXiaomiBigPictureUrl")
        @Deprecated
        public String androidXiaomiBigPictureUrl;

        /**
         * <p>JSON string of the Xiaomi Super Island data structure <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.param</a>. For development integration, see <a href="https://help.aliyun.com/zh/document_detail/3037956.html">Xiaomi Super Island Push Guide</a></p>
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
        @NameInMap("AndroidXiaomiFocusParam")
        public String androidXiaomiFocusParam;

        /**
         * <p>JSON string of the Xiaomi Super Island images <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.pic_xxx</a>. For development integration, see <a href="https://help.aliyun.com/zh/document_detail/3037956.html">Xiaomi Super Island Push Guide</a></p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;miui.focus.pic_ticker&quot;: &quot;<a href="https://example.com/ticker.jpg">https://example.com/ticker.jpg</a>&quot;,
         *     &quot;miui.focus.pic_aod&quot;: &quot;<a href="https://example.com/aod.jpg">https://example.com/aod.jpg</a>&quot;,
         *     &quot;miui.focus.pic_imageText&quot;: &quot;<a href="https://example.com/imageText.jpg">https://example.com/imageText.jpg</a>&quot;
         * }</p>
         */
        @NameInMap("AndroidXiaomiFocusPics")
        public String androidXiaomiFocusPics;

        /**
         * <p>This parameter has been deprecated. Since August 2023, Xiaomi has officially discontinued support for dynamically setting small icons, right-side icons, and big pictures during push on new devices/systems.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
         */
        @NameInMap("AndroidXiaomiImageUrl")
        @Deprecated
        public String androidXiaomiImageUrl;

        /**
         * <p>Xiaomi private message template ID</p>
         * 
         * <strong>example:</strong>
         * <p>P10645</p>
         */
        @NameInMap("AndroidXiaomiTemplateId")
        public String androidXiaomiTemplateId;

        /**
         * <p>Xiaomi private message template parameters, JSON string</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;keywords1&quot;:&quot;Tom&quot;,&quot;keywords2&quot;:&quot;phone&quot;}</p>
         */
        @NameInMap("AndroidXiaomiTemplateParams")
        public String androidXiaomiTemplateParams;

        /**
         * <p>Content of the notification/message for Android and HarmonyOS pushes; iOS message/notification content. The push content size is limited. See <a href="https://help.aliyun.com/document_detail/92832.html">Product Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>Device type. Valid values:</p>
         * <ul>
         * <li>HARMONY: HarmonyOS device</li>
         * <li>iOS: iOS device</li>
         * <li>ANDROID: Android device</li>
         * <li>ALL: When the AppKey is for a legacy dual-platform app, this pushes to both Android and iOS devices simultaneously. When the AppKey is for a new single-platform app, the effect is the same as specifying the device type corresponding to the app type.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HARMONY</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>Expiration time of offline messages/notifications. Used together with StoreOffline. Expired messages will no longer be sent. The maximum retention period is 72 hours. The default is 72 hours.</p>
         * <p>The time format follows the ISO 8601 standard and must use UTC time in the format YYYY-MM-DDThh:mm:ssZ. The expiration time cannot be earlier than the current time or the scheduled push time plus 3 seconds (<code>ExpireTime &gt; PushTime + 3 seconds</code>). The 3-second buffer accounts for network and system latency. We recommend at least 1 minute for unicast pushes and at least 10 minutes for broadcast and batch pushes.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-20T00:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The action corresponding to the built-in page ability of the app.</p>
         * <blockquote>
         * <p>Notice: When HarmonyActionType is APP_CUSTOM_PAGE, at least one of HarmonyUri and HarmonyAction must be provided.</p>
         * </blockquote>
         * <p>For details, see HarmonyOS official documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.action</a></p>
         * 
         * <strong>example:</strong>
         * <p>com.example.action</p>
         */
        @NameInMap("HarmonyAction")
        public String harmonyAction;

        /**
         * <p>Action after clicking the notification. Valid values:</p>
         * <ul>
         * <li>APP_HOME_PAGE: Open the app home page</li>
         * <li>APP_CUSTOM_PAGE: Open a custom app page</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APP_HOME_PAGE</p>
         */
        @NameInMap("HarmonyActionType")
        public String harmonyActionType;

        /**
         * <p>HarmonyOS app badge increment number. See <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">HarmonyOS badge addNum field description</a>.</br>
         * Supported from HarmonyOS SDK 1.2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HarmonyBadgeAddNum")
        public Integer harmonyBadgeAddNum;

        /**
         * <p>HarmonyOS app badge set number. See <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">HarmonyOS badge setNum field description</a>.</br>
         * Supported from HarmonyOS SDK 1.2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HarmonyBadgeSetNum")
        public Integer harmonyBadgeSetNum;

        /**
         * <p>Notification message category. After completing the notification message self-classification privilege application, this is used to identify the message type. Different notification message types affect the display and alert methods. Valid values:</p>
         * <ul>
         * <li>IM: Instant messaging</li>
         * <li>VOIP: Audio/video calls</li>
         * <li>SUBSCRIPTION: Subscriptions</li>
         * <li>TRAVEL: Travel</li>
         * <li>HEALTH: Health</li>
         * <li>WORK: Work task reminders</li>
         * <li>ACCOUNT: Account updates</li>
         * <li>EXPRESS: Orders &amp; logistics</li>
         * <li>FINANCE: Finance</li>
         * <li>DEVICE_REMINDER: Device reminders</li>
         * <li>MAIL: Email</li>
         * <li>CUSTOMER_SERVICE: Customer service messages</li>
         * <li>MARKETING: News, content recommendations, social updates, product promotions, financial updates, lifestyle information, surveys, feature recommendations, and operational campaigns (only marks the content, does not speed up message delivery), collectively referred to as information and marketing messages</li>
         * </ul>
         * <p>For details, see HarmonyOS official documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.category</a></p>
         * 
         * <strong>example:</strong>
         * <p>IM</p>
         */
        @NameInMap("HarmonyCategory")
        public String harmonyCategory;

        /**
         * <p>Set notification extended properties. This property does not take effect when the push type PushType is set to MESSAGE.</p>
         * <p>This parameter must be passed in JSON map format; otherwise, parsing errors will occur.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;api_name&quot;:&quot;PushNoticeToAndroidRequest&quot;}</p>
         */
        @NameInMap("HarmonyExtParameters")
        public String harmonyExtParameters;

        /**
         * <p>Extra data for notification extension messages.</br>
         * Valid when sending HarmonyOS notification extension messages.</br>
         * Conceptually equivalent to the extraData field of HarmonyOS notification extension messages. For the specific definition, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section161192514234">HarmonyOS ExtensionPayload Description</a>.</br>
         * Supported from HarmonyOS SDK 1.2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>示例额外数据</p>
         */
        @NameInMap("HarmonyExtensionExtraData")
        public String harmonyExtensionExtraData;

        /**
         * <p>When PushType is NOTICE, whether this is a HarmonyOS notification extension message.</p>
         * <ul>
         * <li>true: Send a notification extension message</li>
         * <li>false: Send a regular notification (default)</li>
         * </ul>
         * <p>Notification extension messages require permission to be applied for on the HarmonyOS side before sending. For details, see the HarmonyOS documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-guides-V5/push-send-extend-noti-V5">Send Notification Extension Messages</a>.</br>
         * Supported from HarmonyOS SDK 1.2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HarmonyExtensionPush")
        public Boolean harmonyExtensionPush;

        /**
         * <p>URL for the large icon on the right side of the notification. The URL must use the HTTPS protocol.</p>
         * <blockquote>
         * <p>Supported image formats: png, jpg, jpeg, heif, gif, bmp. Image dimensions must satisfy height × width &lt; 25,000 pixels.</p>
         * </blockquote>
         * <p>For details, see HarmonyOS official documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.image</a></p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/xxx.png">https://example.com/xxx.png</a></p>
         */
        @NameInMap("HarmonyImageUrl")
        public String harmonyImageUrl;

        /**
         * <p>Content for multi-line text style. Required when HarmonyRenderStyle is MULTI_LINE. Up to 3 content items are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1.content1&quot;,&quot;2.content2&quot;,&quot;3.content3&quot;]</p>
         */
        @NameInMap("HarmonyInboxContent")
        public String harmonyInboxContent;

        /**
         * <p>JSON string of the HarmonyOS Live View data structure <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V13/push-scenariozed-api-request-param-V13#section66881469306">LiveViewPayload</a>. For development integration, see <a href="https://help.aliyun.com/document_detail/2982112.html">HarmonyOS Live View Push Guide</a></p>
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
        @NameInMap("HarmonyLiveViewPayload")
        public String harmonyLiveViewPayload;

        /**
         * <p>Use the specified type of notification slot. Only valid when the Alibaba Cloud proprietary channel is online.</p>
         * <ul>
         * <li>SOCIAL_COMMUNICATION: Social communication.</li>
         * <li>SERVICE_INFORMATION: Service reminders.</li>
         * <li>CONTENT_INFORMATION: Content information.</li>
         * <li>CUSTOMER_SERVICE: Customer service messages. This type is used for customer service messages between users and merchants, and must be initiated by the user.</li>
         * <li>OTHER_TYPES: Others.</li>
         * </ul>
         * <p>For details, see HarmonyOS official documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/js-apis-notificationmanager-V5#slottype">SlotType</a></p>
         * 
         * <strong>example:</strong>
         * <p>SOCIAL_COMMUNICATION</p>
         */
        @NameInMap("HarmonyNotificationSlotType")
        public String harmonyNotificationSlotType;

        /**
         * <p>Unique identifier for each message displayed in the notification. When not provided, the push service automatically generates a unique identifier for each message. Different notification messages can share the same notifyId, enabling new messages to replace old ones.</p>
         * <p>For details, see HarmonyOS official documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.notifyId</a></p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HarmonyNotifyId")
        public Integer harmonyNotifyId;

        /**
         * <p>HarmonyOS channel receipt ID. This receipt ID can be found in the receipt parameter configuration on the HarmonyOS channel push operations platform.</p>
         * <blockquote>
         * <p>If the default receipt configuration on the HarmonyOS channel push operations platform is set to Alibaba Cloud receipt, this is not required. If not, we recommend configuring the default HarmonyOS channel receipt ID in the Alibaba Cloud EMAS Mobile Push console first.</p>
         * </blockquote>
         * <p>For details, see HarmonyOS official documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">pushOptions.receiptId</a></p>
         * 
         * <strong>example:</strong>
         * <p>RCPB***DFD5</p>
         */
        @NameInMap("HarmonyReceiptId")
        public String harmonyReceiptId;

        /**
         * <p>When the push type is message and the device is offline, this push will use the auxiliary popup feature. Defaults to false. Only takes effect when PushType=MESSAGE.</p>
         * <p>If the message-to-notification conversion push is successful, the notification displays the data set by the server\&quot;s HarmonyRemindTitle and HarmonyRemindBody parameter values.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HarmonyRemind")
        public Boolean harmonyRemind;

        /**
         * <p>HarmonyOS notification content used when converting HarmonyOS messages to notifications. Only valid when HarmonyRemind is true.</p>
         * 
         * <strong>example:</strong>
         * <p>您有一条新消息，请查收</p>
         */
        @NameInMap("HarmonyRemindBody")
        public String harmonyRemindBody;

        /**
         * <p>HarmonyOS notification title used when converting HarmonyOS messages to notifications. Only valid when HarmonyRemind is true.</p>
         * 
         * <strong>example:</strong>
         * <p>新消息</p>
         */
        @NameInMap("HarmonyRemindTitle")
        public String harmonyRemindTitle;

        /**
         * <p>Notification message style:</p>
         * <ul>
         * <li>NORMAL: Standard notification (default)</li>
         * <li>MULTI_LINE: Multi-line text style</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("HarmonyRenderStyle")
        public String harmonyRenderStyle;

        /**
         * <p>Test message flag:</p>
         * <ul>
         * <li>false: Normal message (default)</li>
         * <li>true: Test message</li>
         * </ul>
         * <p>For details, see HarmonyOS official documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">pushOptions.testMessage</a></p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HarmonyTestMessage")
        public Boolean harmonyTestMessage;

        /**
         * <p>The URI corresponding to the built-in page ability of the app.</p>
         * <blockquote>
         * <p>Notice: When HarmonyActionType is APP_CUSTOM_PAGE, at least one of HarmonyUri and HarmonyAction must be provided. When multiple Abilities exist, provide different action and URI values for each Ability. The action is prioritized when looking up the corresponding built-in app page.</p>
         * </blockquote>
         * <p>For details, see HarmonyOS official documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.uri</a></p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com:8080/push/example">https://www.example.com:8080/push/example</a></p>
         */
        @NameInMap("HarmonyUri")
        public String harmonyUri;

        /**
         * <p>Custom identifier for the push task. When JobKey is not empty, this field will be included in the receipt logs. For receipt log details, see <a href="https://help.aliyun.com/document_detail/434651.html">Receipt Logs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("JobKey")
        public String jobKey;

        /**
         * <p>Used for scheduled sending. If not set, the default is immediate sending.</p>
         * <p>The time format follows the ISO 8601 standard and must use UTC time in the format YYYY-MM-DDThh:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-20T00:00:00Z</p>
         */
        @NameInMap("PushTime")
        public String pushTime;

        /**
         * <p>Push type. Valid values:</p>
         * <ul>
         * <li>MESSAGE: indicates a message.</li>
         * <li>NOTICE: indicates a notification.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MESSAGE</p>
         */
        @NameInMap("PushType")
        public String pushType;

        /**
         * <p>Specify sending channels. Valid values:</p>
         * <ul>
         * <li>accs: Alibaba Cloud proprietary channel</li>
         * <li>huawei: Huawei channel</li>
         * <li>honor: Honor channel</li>
         * <li>xiaomi: Xiaomi channel</li>
         * <li>oppo: OPPO channel</li>
         * <li>vivo: vivo channel</li>
         * <li>meizu: Meizu channel</li>
         * <li>gcm: Google GCM channel (legacy HTTP)</li>
         * <li>fcm: Google Firebase channel (HTTP v1 API)</li>
         * <li>apns: APNs channel</li>
         * <li>harmony: HarmonyOS channel</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If this parameter is not configured, all channels are available.</li>
         * <li>If this parameter is configured, only the specified channels are used.</li>
         * <li>If the configured channels conflict with the sending strategy (e.g., iOS notifications only go through the APNs channel, but this parameter does not include apns), the push will not be sent.</li>
         * <li>If gcm is configured, both Google GCM and FCM channels can be used. If fcm is configured, only the Google FCM channel can be used.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>accs,huawei,xiaomi</p>
         */
        @NameInMap("SendChannels")
        public String sendChannels;

        /**
         * <p>This parameter has been deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SendSpeed")
        @Deprecated
        public Integer sendSpeed;

        /**
         * <p>Whether to store offline messages/notifications. StoreOffline defaults to false.</p>
         * <p>If stored, when the user is offline during push, the message will be resent when the user comes online within the expiration time (ExpireTime). ExpireTime defaults to 72 hours. iOS notifications are delivered through the APNs channel and are not affected by StoreOffline.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StoreOffline")
        public Boolean storeOffline;

        /**
         * <p>Push target. Valid values:</p>
         * <ul>
         * <li>DEVICE: push by device.</li>
         * <li>ACCOUNT: push by account.</li>
         * <li>ALIAS: push by alias.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEVICE</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>Set based on Target. Multiple values are separated by commas. If the limit is exceeded, you need to split the push into multiple calls.</p>
         * <ul>
         * <li>Target=DEVICE: values such as <code>deviceid1,deviceid2</code> (up to 1,000 supported).</li>
         * <li>Target=ACCOUNT: values such as <code>account1,account2</code> (up to 1,000 supported).</li>
         * <li>Target=ALIAS: values such as <code>alias1,alias2</code> (up to 1,000 supported).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>deviceid1,deviceid2</p>
         */
        @NameInMap("TargetValue")
        public String targetValue;

        /**
         * <p>Title of the notification/message during push. Length limit: 200 bytes.
         * Required for Android and HarmonyOS pushes. Optional for iOS push notifications. If provided:</p>
         * <ul>
         * <li>iOS 10+: the notification displays the title.</li>
         * <li>iOS 8.2 &lt;= iOS version &lt; iOS 10: replaces the notification app name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>Whether to automatically truncate titles and content that are too long.
         * Note: This only applies to vendor channels that explicitly limit title and content length. It does not apply to channels like APNs, Huawei, and Honor that do not limit title and content individually but only limit the total request body size.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Trim")
        public Boolean trim;

        /**
         * <p>iOS notifications are sent through the APNs center. You need to specify the corresponding environment information.</p>
         * <ul>
         * <li>DEV: Development environment, applicable to apps installed and debugged directly via Xcode.</li>
         * <li>PRODUCT: Production environment, applicable to apps distributed through App Store, TestFlight, Ad Hoc, and enterprise distribution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("iOSApnsEnv")
        public String iOSApnsEnv;

        /**
         * <p>iOS app icon badge number in the upper-right corner.</p>
         * <blockquote>
         * <p>If iOSBadgeAutoIncrement is set to True, this field must be empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("iOSBadge")
        public Integer iOSBadge;

        /**
         * <p>Whether to enable badge auto-increment. Defaults to false.</p>
         * <blockquote>
         * <p>When this is set to true, iOSBadge must be empty.</p>
         * </blockquote>
         * <p>The badge auto-increment feature is maintained by the push server for each device\&quot;s badge count. Users must use SDK version V1.9.5 or later and actively sync the badge number to the server.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("iOSBadgeAutoIncrement")
        public Boolean iOSBadgeAutoIncrement;

        /**
         * <p>Extended properties of iOS notifications.</p>
         * <p>On iOS 10+, you can specify the resource URL for rich media push notifications here: <code>{&quot;attachment&quot;: &quot;https://xxxx.xxx/notification_pic.png&quot;} </code>. This parameter must be passed in JSON map format; otherwise, parsing errors will occur.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;attachment&quot;: &quot;<a href="https://xxxx.xxx/notification_pic.png%22%7D">https://xxxx.xxx/notification_pic.png&quot;}</a></p>
         */
        @NameInMap("iOSExtParameters")
        public String iOSExtParameters;

        /**
         * <p>Interruption level. Valid values:</p>
         * <ul>
         * <li><p>passive: The system adds the notification to the notification list without lighting up the screen or playing sound.</p>
         * </li>
         * <li><p>active: The system immediately displays the notification, lights up the screen, and can play sound.</p>
         * </li>
         * <li><p>time-sensitive: The system immediately presents the notification, lights up the screen, and can play sound, but does not break through system notification controls.</p>
         * </li>
         * <li><p>critical: The system immediately displays the notification, lights up the screen, and plays sound bypassing the mute switch.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("iOSInterruptionLevel")
        public String iOSInterruptionLevel;

        /**
         * <p>JSON string. Static pass-through parameters for Dynamic Island push. Contains static user-defined information such as product ID and order information.</p>
         * <blockquote>
         * <p>Required when iOSLiveActivityEvent is start.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;orderId&quot;: &quot;12345&quot;, &quot;product&quot;: &quot;Shoes&quot;}</p>
         */
        @NameInMap("iOSLiveActivityAttributes")
        public String iOSLiveActivityAttributes;

        /**
         * <p>The type of Live Activity to start.</p>
         * <blockquote>
         * <p>Required when iOSLiveActivityEvent is start.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>OrderActivityAttributes</p>
         */
        @NameInMap("iOSLiveActivityAttributesType")
        public String iOSLiveActivityAttributesType;

        /**
         * <p>Dynamic pass-through parameters for Dynamic Island push. Contains real-time update information such as price and inventory changes.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;status&quot;: &quot;delivered&quot;, &quot;estimatedArrival&quot;: &quot;2023-12-31T12:00:00Z&quot;}</p>
         */
        @NameInMap("iOSLiveActivityContentState")
        public String iOSLiveActivityContentState;

        /**
         * <p>The ended Live Activity will remain on the lock screen until the specified time, up to a maximum of 4 hours.</p>
         * 
         * <strong>example:</strong>
         * <p>1743131967</p>
         */
        @NameInMap("iOSLiveActivityDismissalDate")
        public Long iOSLiveActivityDismissalDate;

        /**
         * <p>Start, update, or end a Live Activity.</p>
         * <ul>
         * <li>Enum: start | update | end</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        @NameInMap("iOSLiveActivityEvent")
        public String iOSLiveActivityEvent;

        /**
         * <p>The Live Activity ID reported by the device to the user\&quot;s server. A unique identifier for the Live Activity.</p>
         * 
         * <strong>example:</strong>
         * <p>66B94673-B32E-4CA7-863C-3E523054FD46</p>
         */
        @NameInMap("iOSLiveActivityId")
        public String iOSLiveActivityId;

        /**
         * <p>Timestamp in seconds, marking the expiration time of the activity content.</p>
         * 
         * <strong>example:</strong>
         * <p>1743131967</p>
         */
        @NameInMap("iOSLiveActivityStaleDate")
        public Long iOSLiveActivityStaleDate;

        /**
         * <p>iOS notification sound. Specify the name of an audio file stored in the app bundle or the sandbox Library/Sounds directory. See: How to set notification sound for iOS push.</p>
         * <p>If set to an empty string (&quot;&quot;), the notification is silent. If not set, the default system alert sound is used.</p>
         * 
         * <strong>example:</strong>
         * <p>””</p>
         */
        @NameInMap("iOSMusic")
        public String iOSMusic;

        /**
         * <p>iOS notification processing extension flag (iOS 10+). If set to true, APNs push notifications can reach the Extension for processing before being displayed. Must be set to true for silent notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("iOSMutableContent")
        public Boolean iOSMutableContent;

        /**
         * <p>Specify the iOS notification Category (iOS 10+).</p>
         * 
         * <strong>example:</strong>
         * <p>ios</p>
         */
        @NameInMap("iOSNotificationCategory")
        public String iOSNotificationCategory;

        /**
         * <p>When a device receives messages with the same CollapseId, they are merged into one. When the device is offline, consecutive messages with the same CollapseId will show only one notification in the notification bar. Supported on iOS 10+.</p>
         * 
         * <strong>example:</strong>
         * <p>ZD2011</p>
         */
        @NameInMap("iOSNotificationCollapseId")
        public String iOSNotificationCollapseId;

        /**
         * <p>Groups iOS remote notifications using this property, marking the group identifier for collapsed notifications. Only supported on iOS 12.0+.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("iOSNotificationThreadId")
        public String iOSNotificationThreadId;

        /**
         * <p>Summary highlight score. Value range: a floating-point number in [0,1\].</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("iOSRelevanceScore")
        public Double iOSRelevanceScore;

        /**
         * <p>When the device is offline during message push (i.e., the persistent connection channel to the Mobile Push server is disconnected), this push will be delivered as a notification through Apple\&quot;s APNs channel once.</p>
         * <blockquote>
         * <p>Offline message-to-notification conversion only applies to the production environment.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("iOSRemind")
        public Boolean iOSRemind;

        /**
         * <p>iOS notification content used when converting iOS messages to notifications. Only valid when iOSApnsEnv=PRODUCT and iOSRemind is true.</p>
         * 
         * <strong>example:</strong>
         * <p>ios通知body</p>
         */
        @NameInMap("iOSRemindBody")
        public String iOSRemindBody;

        /**
         * <p>Whether to enable iOS silent notification.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("iOSSilentNotification")
        public Boolean iOSSilentNotification;

        /**
         * <p>iOS notification subtitle content (iOS 10+).</p>
         * 
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

        public MassPushRequestPushTask setAndroidBadgeAddNum(Integer androidBadgeAddNum) {
            this.androidBadgeAddNum = androidBadgeAddNum;
            return this;
        }
        public Integer getAndroidBadgeAddNum() {
            return this.androidBadgeAddNum;
        }

        public MassPushRequestPushTask setAndroidBadgeClass(String androidBadgeClass) {
            this.androidBadgeClass = androidBadgeClass;
            return this;
        }
        public String getAndroidBadgeClass() {
            return this.androidBadgeClass;
        }

        public MassPushRequestPushTask setAndroidBadgeSetNum(Integer androidBadgeSetNum) {
            this.androidBadgeSetNum = androidBadgeSetNum;
            return this;
        }
        public Integer getAndroidBadgeSetNum() {
            return this.androidBadgeSetNum;
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

        public MassPushRequestPushTask setAndroidHuaweiBusinessType(Integer androidHuaweiBusinessType) {
            this.androidHuaweiBusinessType = androidHuaweiBusinessType;
            return this;
        }
        public Integer getAndroidHuaweiBusinessType() {
            return this.androidHuaweiBusinessType;
        }

        public MassPushRequestPushTask setAndroidHuaweiLiveNotificationPayload(String androidHuaweiLiveNotificationPayload) {
            this.androidHuaweiLiveNotificationPayload = androidHuaweiLiveNotificationPayload;
            return this;
        }
        public String getAndroidHuaweiLiveNotificationPayload() {
            return this.androidHuaweiLiveNotificationPayload;
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

        public MassPushRequestPushTask setAndroidMeizuNoticeMsgType(Integer androidMeizuNoticeMsgType) {
            this.androidMeizuNoticeMsgType = androidMeizuNoticeMsgType;
            return this;
        }
        public Integer getAndroidMeizuNoticeMsgType() {
            return this.androidMeizuNoticeMsgType;
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

        public MassPushRequestPushTask setAndroidMessageOppoCategory(String androidMessageOppoCategory) {
            this.androidMessageOppoCategory = androidMessageOppoCategory;
            return this;
        }
        public String getAndroidMessageOppoCategory() {
            return this.androidMessageOppoCategory;
        }

        public MassPushRequestPushTask setAndroidMessageOppoNotifyLevel(Integer androidMessageOppoNotifyLevel) {
            this.androidMessageOppoNotifyLevel = androidMessageOppoNotifyLevel;
            return this;
        }
        public Integer getAndroidMessageOppoNotifyLevel() {
            return this.androidMessageOppoNotifyLevel;
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

        public MassPushRequestPushTask setAndroidNotificationThreadId(String androidNotificationThreadId) {
            this.androidNotificationThreadId = androidNotificationThreadId;
            return this;
        }
        public String getAndroidNotificationThreadId() {
            return this.androidNotificationThreadId;
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

        public MassPushRequestPushTask setAndroidOppoDeleteIntentData(String androidOppoDeleteIntentData) {
            this.androidOppoDeleteIntentData = androidOppoDeleteIntentData;
            return this;
        }
        public String getAndroidOppoDeleteIntentData() {
            return this.androidOppoDeleteIntentData;
        }

        public MassPushRequestPushTask setAndroidOppoIntelligentIntent(String androidOppoIntelligentIntent) {
            this.androidOppoIntelligentIntent = androidOppoIntelligentIntent;
            return this;
        }
        public String getAndroidOppoIntelligentIntent() {
            return this.androidOppoIntelligentIntent;
        }

        public MassPushRequestPushTask setAndroidOppoIntentEnv(Integer androidOppoIntentEnv) {
            this.androidOppoIntentEnv = androidOppoIntentEnv;
            return this;
        }
        public Integer getAndroidOppoIntentEnv() {
            return this.androidOppoIntentEnv;
        }

        @Deprecated
        public MassPushRequestPushTask setAndroidOppoPrivateContentParameters(java.util.Map<String, String> androidOppoPrivateContentParameters) {
            this.androidOppoPrivateContentParameters = androidOppoPrivateContentParameters;
            return this;
        }
        public java.util.Map<String, String> getAndroidOppoPrivateContentParameters() {
            return this.androidOppoPrivateContentParameters;
        }

        @Deprecated
        public MassPushRequestPushTask setAndroidOppoPrivateMsgTemplateId(String androidOppoPrivateMsgTemplateId) {
            this.androidOppoPrivateMsgTemplateId = androidOppoPrivateMsgTemplateId;
            return this;
        }
        public String getAndroidOppoPrivateMsgTemplateId() {
            return this.androidOppoPrivateMsgTemplateId;
        }

        @Deprecated
        public MassPushRequestPushTask setAndroidOppoPrivateTitleParameters(java.util.Map<String, String> androidOppoPrivateTitleParameters) {
            this.androidOppoPrivateTitleParameters = androidOppoPrivateTitleParameters;
            return this;
        }
        public java.util.Map<String, String> getAndroidOppoPrivateTitleParameters() {
            return this.androidOppoPrivateTitleParameters;
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

        public MassPushRequestPushTask setAndroidVivoLiveMessage(String androidVivoLiveMessage) {
            this.androidVivoLiveMessage = androidVivoLiveMessage;
            return this;
        }
        public String getAndroidVivoLiveMessage() {
            return this.androidVivoLiveMessage;
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

        @Deprecated
        public MassPushRequestPushTask setAndroidXiaoMiActivity(String androidXiaoMiActivity) {
            this.androidXiaoMiActivity = androidXiaoMiActivity;
            return this;
        }
        public String getAndroidXiaoMiActivity() {
            return this.androidXiaoMiActivity;
        }

        @Deprecated
        public MassPushRequestPushTask setAndroidXiaoMiNotifyBody(String androidXiaoMiNotifyBody) {
            this.androidXiaoMiNotifyBody = androidXiaoMiNotifyBody;
            return this;
        }
        public String getAndroidXiaoMiNotifyBody() {
            return this.androidXiaoMiNotifyBody;
        }

        @Deprecated
        public MassPushRequestPushTask setAndroidXiaoMiNotifyTitle(String androidXiaoMiNotifyTitle) {
            this.androidXiaoMiNotifyTitle = androidXiaoMiNotifyTitle;
            return this;
        }
        public String getAndroidXiaoMiNotifyTitle() {
            return this.androidXiaoMiNotifyTitle;
        }

        @Deprecated
        public MassPushRequestPushTask setAndroidXiaomiBigPictureUrl(String androidXiaomiBigPictureUrl) {
            this.androidXiaomiBigPictureUrl = androidXiaomiBigPictureUrl;
            return this;
        }
        public String getAndroidXiaomiBigPictureUrl() {
            return this.androidXiaomiBigPictureUrl;
        }

        public MassPushRequestPushTask setAndroidXiaomiFocusParam(String androidXiaomiFocusParam) {
            this.androidXiaomiFocusParam = androidXiaomiFocusParam;
            return this;
        }
        public String getAndroidXiaomiFocusParam() {
            return this.androidXiaomiFocusParam;
        }

        public MassPushRequestPushTask setAndroidXiaomiFocusPics(String androidXiaomiFocusPics) {
            this.androidXiaomiFocusPics = androidXiaomiFocusPics;
            return this;
        }
        public String getAndroidXiaomiFocusPics() {
            return this.androidXiaomiFocusPics;
        }

        @Deprecated
        public MassPushRequestPushTask setAndroidXiaomiImageUrl(String androidXiaomiImageUrl) {
            this.androidXiaomiImageUrl = androidXiaomiImageUrl;
            return this;
        }
        public String getAndroidXiaomiImageUrl() {
            return this.androidXiaomiImageUrl;
        }

        public MassPushRequestPushTask setAndroidXiaomiTemplateId(String androidXiaomiTemplateId) {
            this.androidXiaomiTemplateId = androidXiaomiTemplateId;
            return this;
        }
        public String getAndroidXiaomiTemplateId() {
            return this.androidXiaomiTemplateId;
        }

        public MassPushRequestPushTask setAndroidXiaomiTemplateParams(String androidXiaomiTemplateParams) {
            this.androidXiaomiTemplateParams = androidXiaomiTemplateParams;
            return this;
        }
        public String getAndroidXiaomiTemplateParams() {
            return this.androidXiaomiTemplateParams;
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

        public MassPushRequestPushTask setHarmonyBadgeAddNum(Integer harmonyBadgeAddNum) {
            this.harmonyBadgeAddNum = harmonyBadgeAddNum;
            return this;
        }
        public Integer getHarmonyBadgeAddNum() {
            return this.harmonyBadgeAddNum;
        }

        public MassPushRequestPushTask setHarmonyBadgeSetNum(Integer harmonyBadgeSetNum) {
            this.harmonyBadgeSetNum = harmonyBadgeSetNum;
            return this;
        }
        public Integer getHarmonyBadgeSetNum() {
            return this.harmonyBadgeSetNum;
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

        public MassPushRequestPushTask setHarmonyExtensionExtraData(String harmonyExtensionExtraData) {
            this.harmonyExtensionExtraData = harmonyExtensionExtraData;
            return this;
        }
        public String getHarmonyExtensionExtraData() {
            return this.harmonyExtensionExtraData;
        }

        public MassPushRequestPushTask setHarmonyExtensionPush(Boolean harmonyExtensionPush) {
            this.harmonyExtensionPush = harmonyExtensionPush;
            return this;
        }
        public Boolean getHarmonyExtensionPush() {
            return this.harmonyExtensionPush;
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

        public MassPushRequestPushTask setHarmonyLiveViewPayload(String harmonyLiveViewPayload) {
            this.harmonyLiveViewPayload = harmonyLiveViewPayload;
            return this;
        }
        public String getHarmonyLiveViewPayload() {
            return this.harmonyLiveViewPayload;
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

        @Deprecated
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

        public MassPushRequestPushTask setIOSLiveActivityAttributes(String iOSLiveActivityAttributes) {
            this.iOSLiveActivityAttributes = iOSLiveActivityAttributes;
            return this;
        }
        public String getIOSLiveActivityAttributes() {
            return this.iOSLiveActivityAttributes;
        }

        public MassPushRequestPushTask setIOSLiveActivityAttributesType(String iOSLiveActivityAttributesType) {
            this.iOSLiveActivityAttributesType = iOSLiveActivityAttributesType;
            return this;
        }
        public String getIOSLiveActivityAttributesType() {
            return this.iOSLiveActivityAttributesType;
        }

        public MassPushRequestPushTask setIOSLiveActivityContentState(String iOSLiveActivityContentState) {
            this.iOSLiveActivityContentState = iOSLiveActivityContentState;
            return this;
        }
        public String getIOSLiveActivityContentState() {
            return this.iOSLiveActivityContentState;
        }

        public MassPushRequestPushTask setIOSLiveActivityDismissalDate(Long iOSLiveActivityDismissalDate) {
            this.iOSLiveActivityDismissalDate = iOSLiveActivityDismissalDate;
            return this;
        }
        public Long getIOSLiveActivityDismissalDate() {
            return this.iOSLiveActivityDismissalDate;
        }

        public MassPushRequestPushTask setIOSLiveActivityEvent(String iOSLiveActivityEvent) {
            this.iOSLiveActivityEvent = iOSLiveActivityEvent;
            return this;
        }
        public String getIOSLiveActivityEvent() {
            return this.iOSLiveActivityEvent;
        }

        public MassPushRequestPushTask setIOSLiveActivityId(String iOSLiveActivityId) {
            this.iOSLiveActivityId = iOSLiveActivityId;
            return this;
        }
        public String getIOSLiveActivityId() {
            return this.iOSLiveActivityId;
        }

        public MassPushRequestPushTask setIOSLiveActivityStaleDate(Long iOSLiveActivityStaleDate) {
            this.iOSLiveActivityStaleDate = iOSLiveActivityStaleDate;
            return this;
        }
        public Long getIOSLiveActivityStaleDate() {
            return this.iOSLiveActivityStaleDate;
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
