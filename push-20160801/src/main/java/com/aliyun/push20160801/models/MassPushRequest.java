// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class MassPushRequest extends TeaModel {
    /**
     * <p>The AppKey of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>An idempotency parameter that prevents duplicate pushes caused by API client retries. If you make a call with the same IdempotentToken within 15 minutes, only one push is performed, and subsequent calls return the result of the first successful push.</p>
     * <blockquote>
     * <ul>
     * <li><p>The parameter format is a standard 36-character UUID (8-4-4-4-12). Each valid character is a hexadecimal digit from 0-9 or a-f, case-insensitive.</p>
     * </li>
     * <li><p>This parameter only prevents duplicate pushes caused by retries. It cannot prevent duplicate pushes caused by concurrent calls.</p>
     * </li>
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
         * <p>Specifies the activity to open when the notification is tapped.</p>
         * <p>This is required only when PushTask.N.AndroidOpenType is set to &quot;Activity&quot;. For example: <code>com.alibaba.cloudpushdemo.bizactivity</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.cloudpushdemo.bizactivity</p>
         */
        @NameInMap("AndroidActivity")
        public String androidActivity;

        /**
         * <p>Sets the value to add to the badge number. The value is added to the original badge number. The value range is [1, 99].</p>
         * <blockquote>
         * <p>This is effective only for pushes through Huawei or Honor vendor channels. If both AndroidBadgeAddNum and AndroidBadgeSetNum are present, AndroidBadgeSetNum takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidBadgeAddNum")
        public Integer androidBadgeAddNum;

        /**
         * <p>The full class name of the entry Activity of the application for badge settings.</p>
         * <blockquote>
         * <p>This is effective only for pushes through Huawei or Honor vendor channels.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.cloudpushdemo.bizactivity</p>
         */
        @NameInMap("AndroidBadgeClass")
        public String androidBadgeClass;

        /**
         * <p>Sets a fixed number for the badge. The value range is [0, 99].</p>
         * <blockquote>
         * <p>For vendor channel pushes, this is effective only for Huawei and Honor channels. For pushes through Alibaba Cloud\&quot;s proprietary channel, this is effective only on Huawei, Honor, and vivo models.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AndroidBadgeSetNum")
        public Integer androidBadgeSetNum;

        /**
         * <p>The body in long text mode. Length limit: 1,000 bytes (one Chinese character is counted as 3 bytes). The actual limit depends on the specific vendor channel.</p>
         * <p>Currently supported on:</p>
         * <ul>
         * <li><p>Huawei: EMUI 10 and later</p>
         * </li>
         * <li><p>Honor: Magic UI 4.0 and later</p>
         * </li>
         * <li><p>Xiaomi: MIUI 10 and later</p>
         * </li>
         * <li><p>OPPO: ColorOS 5.0 and later</p>
         * </li>
         * <li><p>Meizu: Flyme</p>
         * </li>
         * <li><p>Alibaba Cloud\&quot;s proprietary channel: Android SDK 3.6.0 and later</p>
         * </li>
         * </ul>
         * <p>If this parameter is not provided in long text mode, the first non-empty value from Body or AndroidPopupBody is used.</p>
         * 
         * <strong>example:</strong>
         * <p>示例长文本</p>
         */
        @NameInMap("AndroidBigBody")
        public String androidBigBody;

        /**
         * <p>The image URL in big picture mode. Currently supported on: Alibaba Cloud\&quot;s proprietary channel with Android SDK 3.6.0 or later.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
         */
        @NameInMap("AndroidBigPictureUrl")
        public String androidBigPictureUrl;

        /**
         * <p>The title in long text mode. Length limit: 200 bytes (one Chinese character is counted as 3 bytes).</p>
         * <ul>
         * <li><p>Currently, this is only supported by Honor channels and Huawei channels on EMUI 11 and later.</p>
         * </li>
         * <li><p>If this parameter is not provided in long text mode, the first non-empty value from Title or AndroidPopupTitle is used.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>示例长标题</p>
         */
        @NameInMap("AndroidBigTitle")
        public String androidBigTitle;

        /**
         * <p>Sets the extended properties of the notification. This parameter does not take effect when the push type PushType is set to MESSAGE.</p>
         * <p>This parameter must be passed in JSON map format, or it will fail to parse.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;api_name&quot;:&quot;PushNoticeToAndroidRequest&quot;}</p>
         */
        @NameInMap("AndroidExtParameters")
        public String androidExtParameters;

        /**
         * <p>Sets the Honor channel notification type:</p>
         * <ul>
         * <li><p><strong>0</strong>: Formal notification (default).</p>
         * </li>
         * <li><p><strong>1</strong>: Test notification.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Each application can send 1,000 test notifications per day, and these are not subject to the daily push limit per device.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidHonorTargetUserType")
        public Integer androidHonorTargetUserType;

        /**
         * <p>Sets the parameters for Huawei quick notifications</p>
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
        @NameInMap("AndroidHuaweiBusinessType")
        public Integer androidHuaweiBusinessType;

        /**
         * <p>A JSON string of the Huawei Android Live Notification data structure <a href="https://developer.huawei.com/consumer/cn/doc/HMSCore-References/rest-live-0000001562939968#ZH-CN_TOPIC_0000001700850537__p195121620102511">LiveNotificationPayload</a>. For development and integration, see the <a href="https://help.aliyun.com/document_detail/2983768.html">Huawei Live Notification Push Guide</a>.</p>
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
         * <p>The receipt ID for the Huawei channel. View this receipt ID in the receipt parameter configuration on the Huawei Push operations platform.</p>
         * <blockquote>
         * <p>If the default receipt configuration on the Huawei Push operations platform is the Alibaba Cloud receipt, you do not need to provide this. If not, we recommend that you first configure the default receipt ID for the Huawei channel in the Alibaba Cloud EMAS Mobile Push console.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RCP4C123456</p>
         */
        @NameInMap("AndroidHuaweiReceiptId")
        public String androidHuaweiReceiptId;

        /**
         * <p>Sets the Huawei channel notification type:</p>
         * <ul>
         * <li><p><strong>0</strong>: Formal notification (default).</p>
         * </li>
         * <li><p><strong>1</strong>: Test notification.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Each application can send 500 test notifications per day, and these are not subject to the daily push limit per device.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidHuaweiTargetUserType")
        public Integer androidHuaweiTargetUserType;

        /**
         * <p>The URL for the right-side icon. Currently supported on:</p>
         * <ul>
         * <li><p>Huawei EMUI (applicable only in long text mode and inbox mode)</p>
         * </li>
         * <li><p>Honor Magic UI (applicable only in long text mode)</p>
         * </li>
         * <li><p>Alibaba Cloud\&quot;s proprietary channel: Android SDK 3.5.0 and later</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
         */
        @NameInMap("AndroidImageUrl")
        public String androidImageUrl;

        /**
         * <p>The body in inbox mode. The content must be a valid JSON array with no more than 5 elements. Currently supported on:</p>
         * <ul>
         * <li><p>Huawei: EMUI 9 and later</p>
         * </li>
         * <li><p>Honor: Magic UI 4.0 and later</p>
         * </li>
         * <li><p>Xiaomi: MIUI 10 and later</p>
         * </li>
         * <li><p>OPPO: ColorOS 5.0 and later</p>
         * </li>
         * <li><p>Alibaba Cloud\&quot;s proprietary channel: Android SDK 3.6.0 and later</p>
         * </li>
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
         * <li><p>0 Public message (default)</p>
         * </li>
         * <li><p>1 Private message</p>
         * </li>
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
         * <p>Function 1: After applying for <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835?#section3410731125514">self-classification permissions</a>, use this parameter to identify the message type, determine the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#ZH-CN_TOPIC_0000001149358835__p3850133955718">message reminder method</a>, and expedite the sending of specific message types. For valid values, see the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section1076611477914">message classification standards</a> in the official Huawei Push documentation. Fill in the &quot;Cloud-side notification category value&quot; or &quot;Local notification category value&quot; from the documentation table.</p>
         * <p>Function 2: After applying for <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">special permissions</a>, use this parameter to identify high-priority pass-through scenarios. Valid values:</p>
         * <ul>
         * <li><p>VOIP: Video calls</p>
         * </li>
         * <li><p>PLAY_VOICE: Voice playback</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For &quot;Cloud-side notification category values&quot; that are &quot;Not applicable&quot;, all pushes go through Alibaba Cloud\&quot;s proprietary channel. For &quot;Local notification category values&quot; that are &quot;Not applicable&quot;, all pushes go through the Huawei channel.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SUBSCRIPTION</p>
         */
        @NameInMap("AndroidMessageHuaweiCategory")
        public String androidMessageHuaweiCategory;

        /**
         * <p>The delivery priority for Huawei channel notifications. Valid values:</p>
         * <ul>
         * <li><p>HIGH</p>
         * </li>
         * <li><p>NORMAL</p>
         * </li>
         * </ul>
         * <p>You must apply for permissions. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">Application Link</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        @NameInMap("AndroidMessageHuaweiUrgency")
        public String androidMessageHuaweiUrgency;

        /**
         * <p>OPPO manages messages in two categories: Communication and Services, and Content and Marketing.</p>
         * <p>Communication and Services (requires permission application):</p>
         * <ul>
         * <li><p>IM: Instant messaging, audio, and video calls</p>
         * </li>
         * <li><p>ACCOUNT: Changes in personal accounts and assets</p>
         * </li>
         * <li><p>DEVICE_REMINDER: Personal device reminders</p>
         * </li>
         * <li><p>ORDER: Changes in personal order or logistics status</p>
         * </li>
         * <li><p>TODO: Personal schedules or to-do items</p>
         * </li>
         * <li><p>SUBSCRIPTION: Personal subscriptions</p>
         * </li>
         * </ul>
         * <p>Content and Marketing:</p>
         * <ul>
         * <li><p>NEWS: News and information</p>
         * </li>
         * <li><p>CONTENT: Content recommendations</p>
         * </li>
         * <li><p>MARKETING: Platform activities</p>
         * </li>
         * <li><p>SOCIAL: Social updates</p>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://open.oppomobile.com/new/developmentDoc/info?id=13189">OPUSH Message Classification Rules</a></p>
         * 
         * <strong>example:</strong>
         * <p>MARKETING</p>
         */
        @NameInMap("AndroidMessageOppoCategory")
        public String androidMessageOppoCategory;

        /**
         * <p>The reminder level for OPPO channel notification bar messages. Valid values:</p>
         * <ul>
         * <li><p>1: Notification bar</p>
         * </li>
         * <li><p>2: Notification bar, lock screen, ringtone, vibration (default notification level for Communication and Services messages)</p>
         * </li>
         * <li><p>16: Notification bar, lock screen, ringtone, vibration, banner (requires permission application)</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When using the AndroidMessageOppoNotifyLevel parameter, you must also pass the AndroidMessageOppoCategory parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidMessageOppoNotifyLevel")
        public Integer androidMessageOppoNotifyLevel;

        /**
         * <p>vivo manages messages in two categories: system messages and operational messages.</p>
         * <p>System messages:</p>
         * <ul>
         * <li><p>IM: Instant messages</p>
         * </li>
         * <li><p>ACCOUNT: Account and asset</p>
         * </li>
         * <li><p>TODO: Schedule and to-do</p>
         * </li>
         * <li><p>DEVICE_REMINDER: Device information</p>
         * </li>
         * <li><p>ORDER: Order and logistics</p>
         * </li>
         * <li><p>SUBSCRIPTION: Subscription reminder</p>
         * </li>
         * </ul>
         * <p>Operational messages:</p>
         * <ul>
         * <li><p>NEWS: News</p>
         * </li>
         * <li><p>CONTENT: Content recommendation</p>
         * </li>
         * <li><p>MARKETING: Operational activity</p>
         * </li>
         * <li><p>SOCIAL: Social updates</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For more information, see <a href="https://dev.vivo.com.cn/documentCenter/doc/359#s-ef3qugc3">Classification Description</a></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TODO</p>
         */
        @NameInMap("AndroidMessageVivoCategory")
        public String androidMessageVivoCategory;

        /**
         * <p>The notification sound for the Huawei vendor channel. Specify the name of the audio file stored in the app/src/main/res/raw/ directory of the client project. Do not include the file format suffix.</p>
         * <p>If you do not set this parameter, the default ringtone is used.</p>
         * 
         * <strong>example:</strong>
         * <p>alicloud_notification_sound</p>
         */
        @NameInMap("AndroidMusic")
        public String androidMusic;

        /**
         * <p>The priority that determines the position of the Android notification in the notification bar. Valid values: -2, -1, 0, 1, and 2.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AndroidNotificationBarPriority")
        public Integer androidNotificationBarPriority;

        /**
         * <p>The custom Android notification bar style. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AndroidNotificationBarType")
        public Integer androidNotificationBarType;

        /**
         * <p>The channel ID for the Android app. It must correspond to a channel ID in the app.</p>
         * <ul>
         * <li><p>Set the NotificationChannel parameter. For more information about its use, see <a href="https://help.aliyun.com/document_detail/67398.html">FAQ: Why are notifications not received on devices with Android 8.0 or later?</a>.</p>
         * </li>
         * <li><p>Because the channel_id for the OPPO private message channel is the same as the app\&quot;s channelId, this value is used for the channel_id when pushing through the OPPO channel.</p>
         * </li>
         * <li><p>For pushes through Huawei, FCM, and Alibaba Cloud\&quot;s proprietary channels, this value is used for the channel_id.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidNotificationChannel")
        public String androidNotificationChannel;

        /**
         * <p>Message grouping. For messages in the same group, the notification bar displays only the latest message and the total number of messages received for that group. It does not display all messages and cannot be expanded. Currently supported on:</p>
         * <ul>
         * <li><p>Huawei vendor channel</p>
         * </li>
         * <li><p>Honor vendor channel</p>
         * </li>
         * <li><p>Alibaba Cloud\&quot;s proprietary channel with Android SDK 3.9.1 and earlier</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is not supported by Alibaba Cloud\&quot;s proprietary channel on Android SDK 3.9.2 and later.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>group-1</p>
         */
        @NameInMap("AndroidNotificationGroup")
        public String androidNotificationGroup;

        /**
         * <p>Sets the importance parameter for Honor notification message classification, which determines the notification behavior on the user\&quot;s device. Valid values:</p>
         * <ul>
         * <li><p>LOW: Marketing messages</p>
         * </li>
         * <li><p>NORMAL: Service and communication messages</p>
         * </li>
         * </ul>
         * <p>Apply for this on the Honor platform. <a href="https://developer.honor.com/cn/docs/11002/guides/notification-class#%E8%87%AA%E5%88%86%E7%B1%BB%E6%9D%83%E7%9B%8A%E7%94%B3%E8%AF%B7">Application Link</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>LOW</p>
         */
        @NameInMap("AndroidNotificationHonorChannel")
        public String androidNotificationHonorChannel;

        /**
         * <p>Sets the importance parameter for Huawei notification message classification, which determines the notification behavior on the user\&quot;s device. Valid values:</p>
         * <ul>
         * <li><p>LOW: Marketing messages</p>
         * </li>
         * <li><p>NORMAL: Service and communication messages</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>For the Huawei channel, use AndroidMessageHuaweiCategory for notification classification. AndroidNotificationHuaweiChannel is no longer required.</p>
         * </li>
         * <li><p>You must apply for this on the Huawei platform. <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section893184112272">Application Link</a>.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>LOW</p>
         */
        @NameInMap("AndroidNotificationHuaweiChannel")
        public String androidNotificationHuaweiChannel;

        /**
         * <p>The unique ID for each message when it is displayed as a notification. Different notification messages can have the same NotifyId to allow new notifications to overwrite old ones.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("AndroidNotificationNotifyId")
        public Integer androidNotificationNotifyId;

        /**
         * <p>Message grouping. Messages in the same group are displayed collapsed in the notification bar and can be expanded. Notifications from different groups are displayed separately. Currently supported on:</p>
         * <ul>
         * <li>Alibaba Cloud\&quot;s proprietary channel with Android SDK 3.9.2 and later</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>thread-1</p>
         */
        @NameInMap("AndroidNotificationThreadId")
        public String androidNotificationThreadId;

        /**
         * <p>Sets the vivo notification message classification. Valid values:</p>
         * <ul>
         * <li><p>0: Operational messages (default)</p>
         * </li>
         * <li><p>1: System messages</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>For the vivo channel, use AndroidMessageVivoCategory for notification classification. AndroidNotificationVivoChannel is no longer required.</p>
         * </li>
         * <li><p>Apply for this on the vivo platform. For more information, see <a href="https://dev.vivo.com.cn/documentCenter/doc/359">Application Link</a>.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AndroidNotificationVivoChannel")
        public String androidNotificationVivoChannel;

        /**
         * <p>Sets the channel ID for the Xiaomi notification type. Apply for it on the Xiaomi platform. For more information, see <a href="https://dev.mi.com/console/doc/detail?pId=2422#_4">Application Link</a>.</p>
         * <blockquote>
         * <ul>
         * <li>A single application can apply for a maximum of 8 channels on the Xiaomi platform. Plan accordingly.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>michannel</p>
         */
        @NameInMap("AndroidNotificationXiaomiChannel")
        public String androidNotificationXiaomiChannel;

        /**
         * <p>The notification reminder method. Valid values:</p>
         * <ul>
         * <li><p><strong>VIBRATE</strong>: Vibrate (default)</p>
         * </li>
         * <li><p><strong>SOUND</strong>: Sound</p>
         * </li>
         * <li><p><strong>BOTH</strong>: Sound and vibrate</p>
         * </li>
         * <li><p><strong>NONE</strong>: Silent</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VIBRATE</p>
         */
        @NameInMap("AndroidNotifyType")
        public String androidNotifyType;

        /**
         * <p>The action to take after a notification is tapped. Valid values:</p>
         * <ul>
         * <li><p>APPLICATION: Open the application (default)</p>
         * </li>
         * <li><p>ACTIVITY: Open the application\&quot;s AndroidActivity</p>
         * </li>
         * <li><p>URL: Open a URL</p>
         * </li>
         * <li><p>NONE: No action</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APPLICATION</p>
         */
        @NameInMap("AndroidOpenType")
        public String androidOpenType;

        /**
         * <p>The URL to open after the Android device receives the push. This is required only when PushTask.N.AndroidOpenType is set to &quot;URL&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx.xxx">https://xxxx.xxx</a></p>
         */
        @NameInMap("AndroidOpenUrl")
        public String androidOpenUrl;

        /**
         * <p>A JSON string of the OPPO Fluid Cloud intent deletion data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13578">data</a>. This parameter is invalid if the AndroidOppoIntelligentIntent parameter is already filled. For development and integration, see the <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud Push Guide</a>.</p>
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
         * <p>A JSON string of the OPPO Fluid Cloud intent sharing data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13565">IntelligentIntent</a>. For development and integration, see the <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud Push Guide</a>.</p>
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
         * <p>Sets the OPPO Fluid Cloud push environment</p>
         * <ul>
         * <li><p><strong>0</strong>: Production environment (default).</p>
         * </li>
         * <li><p><strong>1</strong>: Staging environment.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The OPPO Fluid Cloud staging environment needs to be set up on the client side. For more information, see <a href="https://open.oppomobile.com/documentation/page/info?id=13590">Environment Setup</a>.</p>
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
         * <p>Warning: </p>
         * </blockquote>
         * <p>The OPPO private message template feature is no longer supported by MaasPush. To use this feature, use the Push, PushV2, or MassPushV2 API instead.</p>
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
         * <p>Specifies the Activity to which the user is redirected after tapping the notification.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.cloudpushdemo.bizactivity</p>
         */
        @NameInMap("AndroidPopupActivity")
        public String androidPopupActivity;

        /**
         * <p>The body content in auxiliary pop-up mode. This parameter is required if the AndroidPopupActivity parameter is not empty.</p>
         * <p>Length limit: 200 characters. Both Chinese and English characters count as one.</p>
         * <p>If you use a vendor channel, comply with the vendor channel\&quot;s restrictions. For more information, see <a href="https://help.aliyun.com/document_detail/165253.html">Limits on auxiliary channel pushes for Android</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("AndroidPopupBody")
        public String androidPopupBody;

        /**
         * <p>The title content in auxiliary pop-up mode. This parameter is required if the AndroidPopupActivity parameter is not empty.</p>
         * <p>Length limit: 50 characters. Both Chinese and English characters count as one.</p>
         * <p>If you use a vendor channel, comply with the vendor channel\&quot;s restrictions. For more information, see <a href="https://help.aliyun.com/document_detail/165253.html">Limits on auxiliary channel pushes for Android</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("AndroidPopupTitle")
        public String androidPopupTitle;

        /**
         * <p>If the push type is MESSAGE and the device is offline, this push uses the auxiliary pop-up feature. The default value is false. This parameter takes effect only when PushType is MESSAGE.</p>
         * <p>If a message is successfully converted to a notification, the displayed notification uses the values of the AndroidPopupTitle and AndroidPopupBody parameters. When the user taps the notification, the data retrieved by the onSysNoticeOpened method of the auxiliary pop-up uses the values of the Title and Body parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AndroidRemind")
        public Boolean androidRemind;

        /**
         * <p>The notification style. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Standard mode (default)</p>
         * </li>
         * <li><p><strong>1</strong>: Long text mode (supported by Huawei, Honor, Xiaomi, OPPO, Meizu, and Alibaba Cloud\&quot;s proprietary channel)</p>
         * </li>
         * <li><p><strong>2</strong>: Big picture mode (supported by Alibaba Cloud\&quot;s proprietary channel, not supported on Xiaomi models)</p>
         * </li>
         * <li><p><strong>3</strong>: List mode (supported by Huawei, Honor, Xiaomi, OPPO, and Alibaba Cloud\&quot;s proprietary channel)</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required for non-standard modes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidRenderStyle")
        public String androidRenderStyle;

        /**
         * <p>Sets the vendor channel notification type:</p>
         * <ul>
         * <li><p><strong>0</strong>: Formal notification (default).</p>
         * </li>
         * <li><p><strong>1</strong>: Test notification.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>Configuring this parameter is equivalent to configuring the AndroidHuaweiTargetUserType, AndroidHonorTargetUserType, AndroidVivoPushMode, and AndroidOppoIntentEnv parameters at the same time. A specific vendor channel parameter can override this parameter.</p>
         * </li>
         * <li><p>Currently supported: Huawei channel, Honor channel, vivo channel, OPPO Fluid Cloud.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidTargetUserType")
        public Integer androidTargetUserType;

        /**
         * <p>A JSON string of the vivo Atomic Island data structure <a href="https://dev.vivo.com.cn/documentCenter/doc/896#s-fdagzbd4">liveMessage</a>. For development and integration, see the <a href="https://help.aliyun.com/zh/document_detail/3030718.html">vivo Atomic Island Push Guide</a>.</p>
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
         * <p>Sets the vivo channel notification type:</p>
         * <ul>
         * <li><p><strong>0</strong>: Formal push (default).</p>
         * </li>
         * <li><p><strong>1</strong>: Test push.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For test pushes, configure the test devices in the vivo console beforehand. You can obtain the test device\&quot;s RegId by searching for &quot;onReceiveRegId regId&quot; in the device startup logs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AndroidVivoPushMode")
        public Integer androidVivoPushMode;

        /**
         * <p>The receipt ID for the vivo channel. View this receipt ID in the application information of the push service on the vivo open platform.</p>
         * <blockquote>
         * <p>If the default receipt configuration on the vivo open platform is the Alibaba Cloud receipt, you do not need to provide this. If not, we recommend that you first configure the default receipt ID for the vivo channel in the Alibaba Cloud EMAS Mobile Push console.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AndroidVivoReceiptId")
        public String androidVivoReceiptId;

        /**
         * <p>This parameter is deprecated. All third-party auxiliary pop-ups are now supported by the new <strong>AndroidPopupActivity</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("AndroidXiaoMiActivity")
        @Deprecated
        public String androidXiaoMiActivity;

        /**
         * <p>This parameter is deprecated. All third-party auxiliary pop-ups are now supported by the new <strong>AndroidPopupBody</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("AndroidXiaoMiNotifyBody")
        @Deprecated
        public String androidXiaoMiNotifyBody;

        /**
         * <p>This parameter is deprecated. All third-party auxiliary pop-ups are now supported by the new <strong>AndroidPopupTitle</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("AndroidXiaoMiNotifyTitle")
        @Deprecated
        public String androidXiaoMiNotifyTitle;

        /**
         * <p>This parameter is deprecated. Since August 2023, Xiaomi no longer supports dynamically setting small icons, right-side icons, or large pictures during pushes on new devices or systems.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://f6.market.xiaomi.com/download/MiPass/aaa/bbb.png">https://f6.market.xiaomi.com/download/MiPass/aaa/bbb.png</a></p>
         */
        @NameInMap("AndroidXiaomiBigPictureUrl")
        @Deprecated
        public String androidXiaomiBigPictureUrl;

        /**
         * <p>A JSON string of the Xiaomi HyperOS Island data structure <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.param</a>. For development and integration, see the <a href="https://help.aliyun.com/zh/document_detail/3037956.html">Xiaomi HyperOS Island Push Guide</a>.</p>
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
         * <p>A JSON string of the Xiaomi HyperOS Island data image <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.pic_xxx</a>. For development and integration, see the <a href="https://help.aliyun.com/zh/document_detail/3037956.html">Xiaomi HyperOS Island Push Guide</a>.</p>
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
         * <p>This parameter is deprecated. Since August 2023, Xiaomi no longer supports dynamically setting small icons, right-side icons, or large pictures during pushes on new devices or systems.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
         */
        @NameInMap("AndroidXiaomiImageUrl")
        @Deprecated
        public String androidXiaomiImageUrl;

        @NameInMap("AndroidXiaomiTemplateId")
        public String androidXiaomiTemplateId;

        @NameInMap("AndroidXiaomiTemplateParams")
        public String androidXiaomiTemplateParams;

        /**
         * <p>The content of the notification or message for Android and HarmonyOS pushes. The content of the message or notification for iOS. The content size is limited. For more information, see <a href="https://help.aliyun.com/document_detail/92832.html">Product limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>The device type. Valid values:</p>
         * <ul>
         * <li><p>HARMONY: HarmonyOS devices</p>
         * </li>
         * <li><p>iOS: iOS devices</p>
         * </li>
         * <li><p>ANDROID: Android devices</p>
         * </li>
         * <li><p>ALL: If the AppKey is for an old version of a dual-platform application, this value indicates that pushes are sent to both Android and iOS devices. If the AppKey is for a new version of a single-platform application, the effect is the same as specifying the device type corresponding to that application type.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HARMONY</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The time-to-live (TTL) for offline messages or notifications. Use this with StoreOffline. After the TTL expires, the message or notification is no longer sent. The maximum TTL is 72 hours. The default is 72 hours.</p>
         * <p>The time must be in ISO 8601 format and in UTC: YYYY-MM-DDThh:mm:ssZ. The expiration time must be at least 3 seconds later than the current time or the scheduled push time (<code>ExpireTime &gt; PushTime + 3 seconds</code>). The 3-second buffer accounts for potential network and system latency. Set the TTL to at least 1 minute for individual pushes and at least 10 minutes for full or batch pushes.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-20T00:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The action corresponding to the in-app page ability.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>When HarmonyActionType is APP_CUSTOM_PAGE, at least one of HarmonyUri and HarmonyAction must be filled in.</p>
         * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.action</a> on the HarmonyOS website.</p>
         * 
         * <strong>example:</strong>
         * <p>com.example.action</p>
         */
        @NameInMap("HarmonyAction")
        public String harmonyAction;

        /**
         * <p>The action to take after a notification is tapped. Valid values:</p>
         * <ul>
         * <li><p>APP_HOME_PAGE: Open the application home page</p>
         * </li>
         * <li><p>APP_CUSTOM_PAGE: Open a custom application page</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APP_HOME_PAGE</p>
         */
        @NameInMap("HarmonyActionType")
        public String harmonyActionType;

        /**
         * <p>The number to add to the HarmonyOS application badge. See the <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">HarmonyOS badge addNum field description</a>.<br>
         * Supported starting from HarmonyOS SDK version 1.2.0.<br></p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HarmonyBadgeAddNum")
        public Integer harmonyBadgeAddNum;

        /**
         * <p>The number to set for the HarmonyOS application badge. See the <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">HarmonyOS badge setNum field description</a>.<br>
         * Supported starting from HarmonyOS SDK version 1.2.0.<br></p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HarmonyBadgeSetNum")
        public Integer harmonyBadgeSetNum;

        /**
         * <p>The notification message category. After applying for notification message self-classification permissions, use this to identify the message type. Different notification message types affect how messages are displayed and reminded. Valid values:</p>
         * <ul>
         * <li><p>IM: Instant messaging</p>
         * </li>
         * <li><p>VOIP: Video call</p>
         * </li>
         * <li><p>SUBSCRIPTION: Subscription</p>
         * </li>
         * <li><p>TRAVEL: Travel</p>
         * </li>
         * <li><p>HEALTH: Health</p>
         * </li>
         * <li><p>WORK: Work item reminder</p>
         * </li>
         * <li><p>ACCOUNT: Account updates</p>
         * </li>
         * <li><p>EXPRESS: Order &amp; logistics</p>
         * </li>
         * <li><p>FINANCE: Finance</p>
         * </li>
         * <li><p>DEVICE_REMINDER: Device reminder</p>
         * </li>
         * <li><p>MAIL: Email</p>
         * </li>
         * <li><p>CUSTOMER_SERVICE: Customer service message</p>
         * </li>
         * <li><p>MARKETING: News, content recommendations, social updates, product promotions, financial updates, lifestyle information, surveys, feature recommendations, and operational activities (only identifies content, does not expedite message sending), collectively referred to as marketing messages.</p>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.category</a> on the HarmonyOS website.</p>
         * 
         * <strong>example:</strong>
         * <p>IM</p>
         */
        @NameInMap("HarmonyCategory")
        public String harmonyCategory;

        /**
         * <p>Sets the extended properties of the notification. This parameter does not take effect when the push type PushType is set to MESSAGE.</p>
         * <p>This parameter must be passed in JSON map format, or it will fail to parse.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;api_name&quot;:&quot;PushNoticeToAndroidRequest&quot;}</p>
         */
        @NameInMap("HarmonyExtParameters")
        public String harmonyExtParameters;

        /**
         * <p>Extra data for the extended notification message.<br>
         * Effective when sending HarmonyOS extended notification messages.<br>
         * Conceptually equivalent to the extraData field of a HarmonyOS extended notification message. For a detailed definition, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section161192514234">HarmonyOS ExtensionPayload Description</a>.<br>
         * Supported starting from HarmonyOS SDK version 1.2.0.<br><br><br></p>
         * 
         * <strong>example:</strong>
         * <p>示例额外数据</p>
         */
        @NameInMap("HarmonyExtensionExtraData")
        public String harmonyExtensionExtraData;

        /**
         * <p>When PushType is NOTICE, specifies whether it is a HarmonyOS extended notification message.</p>
         * <ul>
         * <li><p>true: Send an extended notification message</p>
         * </li>
         * <li><p>false: Send a normal notification (default)</p>
         * </li>
         * </ul>
         * <p>You must apply for permission on the HarmonyOS side before sending extended notification messages. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-guides-V5/push-send-extend-noti-V5">Send Extended Notification Messages</a> in the HarmonyOS documentation.<br>
         * Supported starting from HarmonyOS SDK version 1.2.0.<br></p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HarmonyExtensionPush")
        public Boolean harmonyExtensionPush;

        /**
         * <p>The URL for the large icon on the right of the notification. The URL must use the HTTPS protocol.</p>
         * <blockquote>
         * <p>Supported image formats are png, jpg, jpeg, heif, gif, and bmp. The image length × width must be less than 25,000 pixels.</p>
         * </blockquote>
         * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.image</a> on the HarmonyOS website.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/xxx.png">https://example.com/xxx.png</a></p>
         */
        @NameInMap("HarmonyImageUrl")
        public String harmonyImageUrl;

        /**
         * <p>The content for the multi-line text style. This field is required when HarmonyRenderStyle is MULTI_LINE. A maximum of 3 content entries are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1.content1&quot;,&quot;2.content2&quot;,&quot;3.content3&quot;]</p>
         */
        @NameInMap("HarmonyInboxContent")
        public String harmonyInboxContent;

        /**
         * <p>A JSON string of the HarmonyOS Live Window data structure <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V13/push-scenariozed-api-request-param-V13#section66881469306">LiveViewPayload</a>. For development and integration, see the <a href="https://help.aliyun.com/document_detail/2982112.html">HarmonyOS Live Window Push Guide</a>.</p>
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
         * <p>Uses the specified type of notification channel. This is effective only when the Alibaba Cloud proprietary channel is online.</p>
         * <ul>
         * <li><p>SOCIAL_COMMUNICATION: Social communication.</p>
         * </li>
         * <li><p>SERVICE_INFORMATION: Service reminder.</p>
         * </li>
         * <li><p>CONTENT_INFORMATION: Content information.</p>
         * </li>
         * <li><p>CUSTOMER_SERVICE: Customer service message. This type is used for customer service messages between users and businesses and must be initiated by the user.</p>
         * </li>
         * <li><p>OTHER_TYPES: Other.</p>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/js-apis-notificationmanager-V5#slottype">SlotType</a> on the HarmonyOS website.</p>
         * 
         * <strong>example:</strong>
         * <p>SOCIAL_COMMUNICATION</p>
         */
        @NameInMap("HarmonyNotificationSlotType")
        public String harmonyNotificationSlotType;

        /**
         * <p>The unique ID for each message when it is displayed as a notification. If not included, the push service automatically generates a unique ID for each message. Different notification messages can have the same notifyId to allow new messages to overwrite old ones.</p>
         * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.notifyId</a> on the HarmonyOS website.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HarmonyNotifyId")
        public Integer harmonyNotifyId;

        /**
         * <p>The receipt ID for the HarmonyOS channel. View this receipt ID in the receipt parameter configuration on the HarmonyOS Push operations platform.</p>
         * <blockquote>
         * <p>If the default receipt configuration on the HarmonyOS Push operations platform is the Alibaba Cloud receipt, you do not need to provide this. If not, we recommend that you first configure the default receipt ID for the HarmonyOS channel in the Alibaba Cloud EMAS Mobile Push console.</p>
         * </blockquote>
         * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">pushOptions.receiptId</a> on the HarmonyOS website.</p>
         * 
         * <strong>example:</strong>
         * <p>RCPB***DFD5</p>
         */
        @NameInMap("HarmonyReceiptId")
        public String harmonyReceiptId;

        /**
         * <p>If the push type is MESSAGE and the device is offline, this push uses the auxiliary pop-up feature. The default value is false. This parameter is effective only when PushType is set to MESSAGE.</p>
         * <p>If a message is successfully converted to a notification, the data displayed in the notification is the value of the server-side HarmonyRemindTitle and HarmonyRemindBody parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HarmonyRemind")
        public Boolean harmonyRemind;

        /**
         * <p>The HarmonyOS notification content used when a message is converted to a notification. This is effective only when HarmonyRemind is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>您有一条新消息，请查收</p>
         */
        @NameInMap("HarmonyRemindBody")
        public String harmonyRemindBody;

        /**
         * <p>The HarmonyOS notification title used when a message is converted to a notification. This is effective only when HarmonyRemind is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>新消息</p>
         */
        @NameInMap("HarmonyRemindTitle")
        public String harmonyRemindTitle;

        /**
         * <p>The notification message style:</p>
         * <ul>
         * <li><p>NORMAL: Normal notification (default)</p>
         * </li>
         * <li><p>MULTI_LINE: Multi-line text style</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("HarmonyRenderStyle")
        public String harmonyRenderStyle;

        /**
         * <p>The test message flag:</p>
         * <ul>
         * <li><p>false: Normal message (default)</p>
         * </li>
         * <li><p>true: Test message</p>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">pushOptions.testMessage</a> on the HarmonyOS website.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HarmonyTestMessage")
        public Boolean harmonyTestMessage;

        /**
         * <p>The URI corresponding to the in-app page ability.</p>
         * <blockquote>
         * <p>Notice: When HarmonyActionType is APP_CUSTOM_PAGE, at least one of HarmonyUri and HarmonyAction must be filled in. When there are multiple Abilities, fill in the action and URI for each Ability separately. The action is used with priority to find the corresponding in-app page.</p>
         * </blockquote>
         * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.uri</a> on the HarmonyOS website.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com:8080/push/example">https://www.example.com:8080/push/example</a></p>
         */
        @NameInMap("HarmonyUri")
        public String harmonyUri;

        /**
         * <p>A custom ID for the push task. If JobKey is not empty, this field is included in the receipt logs. For more information about how to view receipt logs, see <a href="https://help.aliyun.com/document_detail/434651.html">Receipt logs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("JobKey")
        public String jobKey;

        /**
         * <p>Specifies the time for a scheduled push. If you do not set this parameter, the push is sent immediately.</p>
         * <p>The time must be in ISO 8601 format and in UTC: YYYY-MM-DDThh:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-20T00:00:00Z</p>
         */
        @NameInMap("PushTime")
        public String pushTime;

        /**
         * <p>The push type. Valid values:</p>
         * <ul>
         * <li><p>MESSAGE: a message.</p>
         * </li>
         * <li><p>NOTICE: a notification.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MESSAGE</p>
         */
        @NameInMap("PushType")
        public String pushType;

        /**
         * <p>Specifies the sending channels. Valid values:</p>
         * <ul>
         * <li><p>accs: Alibaba Cloud\&quot;s proprietary channel</p>
         * </li>
         * <li><p>huawei: Huawei channel</p>
         * </li>
         * <li><p>honor: Honor channel</p>
         * </li>
         * <li><p>xiaomi: Xiaomi channel</p>
         * </li>
         * <li><p>oppo: OPPO channel</p>
         * </li>
         * <li><p>vivo: vivo channel</p>
         * </li>
         * <li><p>meizu: Meizu channel</p>
         * </li>
         * <li><p>gcm: Google GCM channel (legacy HTTP)</p>
         * </li>
         * <li><p>fcm: Google Firebase channel (HTTP v1 API)</p>
         * </li>
         * <li><p>apns: APNs channel</p>
         * </li>
         * <li><p>harmony: HarmonyOS channel</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>If you do not configure this parameter, all channels can be used.</p>
         * </li>
         * <li><p>If you configure this parameter, only the specified channels are used.</p>
         * </li>
         * <li><p>If the configured channels conflict with the sending policy (for example, iOS notifications are sent only through the APNs channel, but this parameter does not include apns), the push is not sent.</p>
         * </li>
         * <li><p>If you configure gcm, both Google GCM and FCM channels can be used. If you configure fcm, only the Google FCM channel can be used.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>accs,huawei,xiaomi</p>
         */
        @NameInMap("SendChannels")
        public String sendChannels;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SendSpeed")
        @Deprecated
        public Integer sendSpeed;

        /**
         * <p>Specifies whether to save offline messages or notifications. The default value is false.</p>
         * <p>If you save them, and a user is offline, the message or notification is resent when the user comes online before the time-to-live (TTL) specified by ExpireTime expires. The default TTL is 72 hours. iOS notifications are sent through the APNs channel and are not affected by this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StoreOffline")
        public Boolean storeOffline;

        /**
         * <p>The push target. Valid values:</p>
         * <ul>
         * <li><p>DEVICE: Push by device.</p>
         * </li>
         * <li><p>ACCOUNT: Push by account.</p>
         * </li>
         * <li><p>ALIAS: Push by alias.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEVICE</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>Set this parameter based on the value of Target. To specify multiple values, separate them with commas. If you exceed the limit, send multiple pushes.</p>
         * <ul>
         * <li><p>If you set Target to DEVICE, specify device IDs, such as <code>deviceid1,deviceid2</code>. You can specify up to 1,000 device IDs.</p>
         * </li>
         * <li><p>If you set Target to ACCOUNT, specify accounts, such as <code>account1,account2</code>. You can specify up to 1,000 accounts.</p>
         * </li>
         * <li><p>If you set Target to ALIAS, specify aliases, such as <code>alias1,alias2</code>. You can specify up to 1,000 aliases.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>deviceid1,deviceid2</p>
         */
        @NameInMap("TargetValue")
        public String targetValue;

        /**
         * <p>The title of the notification or message. The length is limited to 200 bytes.
         * This parameter is required for Android and HarmonyOS pushes. It is optional for iOS notification pushes. If you specify it for iOS:</p>
         * <ul>
         * <li><p>For iOS 10 and later, the notification title is displayed.</p>
         * </li>
         * <li><p>For iOS versions from 8.2 to 10, it replaces the application name in the notification.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>Specifies whether to automatically truncate titles and content that are too long.
         * Note: This applies only to vendor channels that have explicit limits on title and content length. It does not apply to channels such as APNs, Huawei, and Honor, which limit the total request body size instead of the title and content length.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Trim")
        public Boolean trim;

        /**
         * <p>iOS notifications are sent through APNs. Specify the environment information.</p>
         * <ul>
         * <li><p>DEV: The development environment. This applies to applications installed and debugged directly from Xcode.</p>
         * </li>
         * <li><p>PRODUCT: The production environment. This applies to applications distributed through the App Store, TestFlight, Ad Hoc, or enterprise distribution.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("iOSApnsEnv")
        public String iOSApnsEnv;

        /**
         * <p>The badge number on the top-right corner of the iOS application icon.</p>
         * <blockquote>
         * <p>If iOSBadgeAutoIncrement is set to true, this parameter must be empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("iOSBadge")
        public Integer iOSBadge;

        /**
         * <p>Specifies whether to enable the auto-increment badge feature. The default value is false.</p>
         * <blockquote>
         * <p>When this is set to true, iOSBadge must be empty.</p>
         * </blockquote>
         * <p>The auto-increment badge feature is maintained by the push server, which keeps a badge count for each device. To use this feature, use SDK version 1.9.5 or later and actively sync the badge number to the server.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("iOSBadgeAutoIncrement")
        public Boolean iOSBadgeAutoIncrement;

        /**
         * <p>The extended properties for iOS notifications.</p>
         * <p>For iOS 10 and later, specify the resource URL for a rich push notification, such as <code>{&quot;attachment&quot;: &quot;https://xxxx.xxx/notification_pic.png&quot;}</code>. This parameter must be passed in JSON map format, or it will fail to parse.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;attachment&quot;: &quot;<a href="https://xxxx.xxx/notification_pic.png%22%7D">https://xxxx.xxx/notification_pic.png&quot;}</a></p>
         */
        @NameInMap("iOSExtParameters")
        public String iOSExtParameters;

        /**
         * <p>The interruption level. Valid values:</p>
         * <ul>
         * <li><p>passive: The system adds the notification to the notification list without lighting up the screen or playing a sound.</p>
         * </li>
         * <li><p>active: The system immediately displays the notification, lights up the screen, and can play a sound.</p>
         * </li>
         * <li><p>time-sensitive: The system immediately presents the notification, lights up the screen, and can play a sound, but does not break through system notification controls.</p>
         * </li>
         * <li><p>critical: The system immediately displays the notification, lights up the screen, and plays a sound, bypassing the mute switch.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("iOSInterruptionLevel")
        public String iOSInterruptionLevel;

        /**
         * <p>A JSON string for the static pass-through parameters of a Dynamic Island push. It contains static, user-defined information, such as product numbers and order information.</p>
         * <blockquote>
         * <p>Required when iOSLiveActivityEvent is set to start.</p>
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
         * <p>Required when iOSLiveActivityEvent is set to start.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>OrderActivityAttributes</p>
         */
        @NameInMap("iOSLiveActivityAttributesType")
        public String iOSLiveActivityAttributesType;

        /**
         * <p>The dynamic pass-through parameters for a Dynamic Island push. It contains real-time updated information, such as price or inventory changes.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;status&quot;: &quot;delivered&quot;, &quot;estimatedArrival&quot;: &quot;2023-12-31T12:00:00Z&quot;}</p>
         */
        @NameInMap("iOSLiveActivityContentState")
        public String iOSLiveActivityContentState;

        /**
         * <p>The time until which an ended Live Activity remains on the lock screen. The maximum duration is 4 hours.</p>
         * 
         * <strong>example:</strong>
         * <p>1743131967</p>
         */
        @NameInMap("iOSLiveActivityDismissalDate")
        public Long iOSLiveActivityDismissalDate;

        /**
         * <p>Starts, updates, or ends a Live Activity.</p>
         * <ul>
         * <li>Enumeration: start | update | end</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        @NameInMap("iOSLiveActivityEvent")
        public String iOSLiveActivityEvent;

        /**
         * <p>The Live Activity ID reported by the device to your server. This is the unique identifier for a Live Activity.</p>
         * 
         * <strong>example:</strong>
         * <p>66B94673-B32E-4CA7-863C-3E523054FD46</p>
         */
        @NameInMap("iOSLiveActivityId")
        public String iOSLiveActivityId;

        /**
         * <p>A UNIX timestamp in seconds that marks the content of the activity as outdated.</p>
         * 
         * <strong>example:</strong>
         * <p>1743131967</p>
         */
        @NameInMap("iOSLiveActivityStaleDate")
        public Long iOSLiveActivityStaleDate;

        /**
         * <p>The sound for the iOS notification. Specify the name of the audio file stored in the app bundle or the Library/Sounds directory of the sandbox. For more information, see How to set notification sounds for iOS pushes.</p>
         * <p>If you specify an empty string (&quot;&quot;), the notification is silent. If you do not set this parameter, the default value is \&quot;default\&quot;, which is the system alert sound.</p>
         * 
         * <strong>example:</strong>
         * <p>””</p>
         */
        @NameInMap("iOSMusic")
        public String iOSMusic;

        /**
         * <p>The mutable content flag for iOS notifications (for iOS 10 and later). If set to true, notifications pushed through APNs can be processed by an extension before being displayed. For silent notifications, this must be set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("iOSMutableContent")
        public Boolean iOSMutableContent;

        /**
         * <p>Specifies the iOS notification category (for iOS 10 and later).</p>
         * 
         * <strong>example:</strong>
         * <p>ios</p>
         */
        @NameInMap("iOSNotificationCategory")
        public String iOSNotificationCategory;

        /**
         * <p>If a device receives messages with the same CollapseId, they are merged into one. If the device is offline and receives multiple messages with the same CollapseId, only one is displayed in the notification bar. This parameter is supported on iOS 10 and later.</p>
         * 
         * <strong>example:</strong>
         * <p>ZD2011</p>
         */
        @NameInMap("iOSNotificationCollapseId")
        public String iOSNotificationCollapseId;

        /**
         * <p>Groups iOS remote notifications using this property. It marks the identifier for a collapsed group. This is supported only on iOS 12.0 and later.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("iOSNotificationThreadId")
        public String iOSNotificationThreadId;

        /**
         * <p>The score for highlighting the summary. The value must be a floating-point number from 0 to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("iOSRelevanceScore")
        public Double iOSRelevanceScore;

        /**
         * <p>If a device is offline when a message is pushed (meaning the persistent connection to the Mobile Push server is unavailable), this push is sent once as a notification through the Apple APNs channel.</p>
         * <blockquote>
         * <p>Converting offline messages to notifications is only applicable to the production environment.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("iOSRemind")
        public Boolean iOSRemind;

        /**
         * <p>The content of the iOS notification when an iOS message is converted to a notification. This parameter is valid only when iOSApnsEnv is set to PRODUCT and iOSRemind is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>ios通知body</p>
         */
        @NameInMap("iOSRemindBody")
        public String iOSRemindBody;

        /**
         * <p>Specifies whether to enable iOS silent notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("iOSSilentNotification")
        public Boolean iOSSilentNotification;

        /**
         * <p>The subtitle of the iOS notification (for iOS 10 and later).</p>
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
