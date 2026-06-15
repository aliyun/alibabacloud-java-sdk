// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushShrinkRequest extends TeaModel {
    /**
     * <p>Specifies the activity to open when the notification is tapped.</p>
     * <p>This is required only when \<code>AndroidOpenType\\</code> is \<code>Activity\\</code>. For example: \<code>com.alibaba.cloudpushdemo.bizactivity\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>com.alibaba.cloudpushdemo.bizactivity</p>
     */
    @NameInMap("AndroidActivity")
    public String androidActivity;

    /**
     * <p>Sets the value to add to the badge number. This value is added to the original badge number. The value must be between 1 and 99.</p>
     * <blockquote>
     * <p>This is effective only for pushes through Huawei/Honor vendor channels. If both \<code>AndroidBadgeAddNum\\</code> and \<code>AndroidBadgeSetNum\\</code> are present, \<code>AndroidBadgeSetNum\\</code> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AndroidBadgeAddNum")
    public Integer androidBadgeAddNum;

    /**
     * <p>The fully qualified class name of the app\&quot;s entry Activity for badge setting.</p>
     * <blockquote>
     * <p>This is effective only for pushes through Huawei/Honor vendor channels.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>com.alibaba.cloudpushdemo.bizactivity</p>
     */
    @NameInMap("AndroidBadgeClass")
    public String androidBadgeClass;

    /**
     * <p>Sets a fixed number for the badge. The value must be between 0 and 99.</p>
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
     * <p>The body in long text mode. Length limit: 1,000 bytes (1 Chinese character is counted as 3 bytes). The actual limit depends on the specific vendor channel.</p>
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
     * <li><p>Proprietary channel: Android SDK 3.6.0 and later</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not provided in long text mode, the system uses the first non-empty value from \<code>Body\\</code> or \<code>AndroidPopupBody\\</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>示例长文本</p>
     */
    @NameInMap("AndroidBigBody")
    public String androidBigBody;

    /**
     * <p>The image URL for big picture mode. Currently supported by the proprietary channel on Android SDK 3.6.0 and later.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
     */
    @NameInMap("AndroidBigPictureUrl")
    public String androidBigPictureUrl;

    /**
     * <p>The title in long text mode. Length limit: 200 bytes (1 Chinese character is counted as 3 bytes).</p>
     * <ul>
     * <li><p>Currently, this is only supported by Honor channels and Huawei channels on EMUI 11 and later.</p>
     * </li>
     * <li><p>If this parameter is not provided in long text mode, the system uses the first non-empty value from \<code>Title\\</code> or \<code>AndroidPopupTitle\\</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>示例长标题</p>
     */
    @NameInMap("AndroidBigTitle")
    public String androidBigTitle;

    /**
     * <p>Sets the extended properties of the notification. This property is not effective when \<code>PushType\\</code> is \<code>MESSAGE\\</code>.</p>
     * <p>This parameter must be in JSON map format to avoid parsing errors.</p>
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
     * <p>Each app can send 1,000 test notifications per day. These are not subject to the daily push limit per device.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AndroidHonorTargetUserType")
    public Integer androidHonorTargetUserType;

    /**
     * <p>Sets the Huawei quick notification parameter.</p>
     * <ul>
     * <li><p><strong>0</strong>: Send a standard Huawei notification (default).</p>
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
     * <p>A JSON string of the Huawei Android Live Notification data structure <a href="https://developer.huawei.com/consumer/cn/doc/HMSCore-References/rest-live-0000001562939968#ZH-CN_TOPIC_0000001700850537__p195121620102511">LiveNotificationPayload</a>. For development and integration, see <a href="https://help.aliyun.com/document_detail/2983768.html">Huawei Live Notification Push Guide</a>.</p>
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
     * <p>The receipt ID for the Huawei channel. You can find this ID in the receipt parameter configuration on the Huawei Push service platform.</p>
     * <blockquote>
     * <p>If the default receipt configuration on the Huawei Push service platform is the Alibaba Cloud receipt, do not provide this. If not, first configure the default Huawei channel receipt ID in the Alibaba Cloud EMAS Mobile Push console.</p>
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
     * <p>Each app can send 500 test notifications per day. These are not subject to the daily push limit per device.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AndroidHuaweiTargetUserType")
    public Integer androidHuaweiTargetUserType;

    /**
     * <p>The URL for the right-side icon.
     * Currently supported on:</p>
     * <ul>
     * <li><p>Huawei EMUI (only in long text and inbox modes).</p>
     * </li>
     * <li><p>Honor Magic UI (only in long text mode).</p>
     * </li>
     * <li><p>Proprietary channel: Android SDK 3.5.0 and later.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
     */
    @NameInMap("AndroidImageUrl")
    public String androidImageUrl;

    /**
     * <p>The body content for inbox mode. The content must be a valid JSON array with no more than 5 elements. Currently supported on:</p>
     * <ul>
     * <li><p>Huawei: EMUI 9 and later</p>
     * </li>
     * <li><p>Honor: Magic UI 4.0 and later</p>
     * </li>
     * <li><p>Xiaomi: MIUI 10 and later</p>
     * </li>
     * <li><p>OPPO: ColorOS 5.0 and later</p>
     * </li>
     * <li><p>Proprietary channel: Android SDK 3.6.0 and later</p>
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
     * <p>true</p>
     */
    @NameInMap("AndroidMeizuNoticeMsgType")
    public Integer androidMeizuNoticeMsgType;

    /**
     * <p>Function 1: After applying for <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835?#section3410731125514">self-classification rights</a>, this is used to identify the message type and determine the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#ZH-CN_TOPIC_0000001149358835__p3850133955718">message alert method</a>. It accelerates the sending of specific message types. For valid values, refer to the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section1076611477914">message classification standards</a> in the official Huawei Push documentation. Fill in the \&quot;Cloud notification category value\&quot; or \&quot;Local notification category value\&quot; from the document\&quot;s table.</p>
     * <p>Function 2: After applying for <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">special permissions</a>, this is used to identify high-priority pass-through scenarios. Valid values:</p>
     * <ul>
     * <li><p>VOIP: Voice and video calls</p>
     * </li>
     * <li><p>PLAY_VOICE: Voice playback</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the \&quot;Cloud notification category value\&quot; is \&quot;Not applicable\&quot;, the push is sent through Alibaba Cloud\&quot;s proprietary channel. If the \&quot;Local notification category value\&quot; is \&quot;Not applicable\&quot;, the push is sent through the Huawei channel.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VOIP</p>
     */
    @NameInMap("AndroidMessageHuaweiCategory")
    public String androidMessageHuaweiCategory;

    /**
     * <p>The delivery priority for notifications on the Huawei channel. Valid values:</p>
     * <ul>
     * <li><p><strong>HIGH</strong></p>
     * </li>
     * <li><p><strong>NORMAL</strong></p>
     * </li>
     * </ul>
     * <p>Apply for permission. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">Application link</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>HIGH</p>
     */
    @NameInMap("AndroidMessageHuaweiUrgency")
    public String androidMessageHuaweiUrgency;

    /**
     * <p>OPPO classifies and manages messages in two categories: Communication &amp; Service, and Content &amp; Marketing.</p>
     * <p>Communication &amp; Service (requires permission):</p>
     * <ul>
     * <li><p>IM: Instant messaging, audio, and video calls</p>
     * </li>
     * <li><p>ACCOUNT: Personal account and asset changes</p>
     * </li>
     * <li><p>DEVICE_REMINDER: Personal device reminders</p>
     * </li>
     * <li><p>ORDER: Personal order/logistics status changes</p>
     * </li>
     * <li><p>TODO: Personal schedule/to-do items</p>
     * </li>
     * <li><p>SUBSCRIPTION: Personal subscriptions</p>
     * </li>
     * </ul>
     * <p>Content &amp; Marketing:</p>
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
     * <p>For more information, see <a href="https://open.oppomobile.com/new/developmentDoc/info?id=13189">OPUSH Message Classification Rules</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>MARKETING</p>
     */
    @NameInMap("AndroidMessageOppoCategory")
    public String androidMessageOppoCategory;

    /**
     * <p>The alert level for notification bar messages on the OPPO channel. Valid values:</p>
     * <ul>
     * <li><p>1: Notification bar</p>
     * </li>
     * <li><p>2: Notification bar, lock screen, ringtone, vibration (default level for Communication &amp; Service messages)</p>
     * </li>
     * <li><p>16: Notification bar, lock screen, ringtone, vibration, banner (requires permission)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When using the \<code>AndroidMessageOppoNotifyLevel\\</code> parameter, you must also pass the \<code>AndroidMessageOppoCategory\\</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AndroidMessageOppoNotifyLevel")
    public Integer androidMessageOppoNotifyLevel;

    /**
     * <p>vivo classifies and manages messages in two categories: System messages and Operational messages.
     * System messages:</p>
     * <ul>
     * <li><p>IM: Instant messages</p>
     * </li>
     * <li><p>ACCOUNT: Account and assets</p>
     * </li>
     * <li><p>TODO: Schedule and to-do</p>
     * </li>
     * <li><p>DEVICE_REMINDER: Device information</p>
     * </li>
     * <li><p>ORDER: Orders and logistics</p>
     * </li>
     * <li><p>SUBSCRIPTION: Subscription reminders</p>
     * </li>
     * </ul>
     * <p>Operational messages:</p>
     * <ul>
     * <li><p>NEWS: News</p>
     * </li>
     * <li><p>CONTENT: Content recommendations</p>
     * </li>
     * <li><p>MARKETING: Operational activities</p>
     * </li>
     * <li><p>SOCIAL: Social updates</p>
     * </li>
     * </ul>
     * <p>For more information, see <a href="https://dev.vivo.com.cn/documentCenter/doc/359#s-ef3qugc3">Classification description</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>TODO</p>
     */
    @NameInMap("AndroidMessageVivoCategory")
    public String androidMessageVivoCategory;

    /**
     * <p>The notification sound for the Huawei vendor channel. Specify the name of the audio file located in the \<code>app/src/main/res/raw/\\</code> directory of the client project. Do not include the file format suffix.</p>
     * <p>If this is not set, the default ringtone is used.</p>
     * 
     * <strong>example:</strong>
     * <p>alicloud_notification_sound</p>
     */
    @NameInMap("AndroidMusic")
    public String androidMusic;

    /**
     * <p>The priority for arranging the Android notification in the notification bar. Valid values: -2, -1, 0, 1, 2.</p>
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
     * <p>The \<code>channelId\\</code> for the Android app. This must correspond to a \<code>channelId\\</code> in the app.</p>
     * <ul>
     * <li><p>Set the \<code>NotificationChannel\\</code> parameter. For more information about its usage, see <a href="https://help.aliyun.com/document_detail/67398.html">FAQ: Why are notifications not received on devices running Android 8.0 or later?</a>.</p>
     * </li>
     * <li><p>Because the \<code>channel_id\\</code> for the OPPO private message channel is the same as the app\&quot;s \<code>channelId\\</code>, this value is used for pushes through the OPPO channel.</p>
     * </li>
     * <li><p>This value is used for pushes through Huawei, FCM, and Alibaba Cloud\&quot;s proprietary channels.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AndroidNotificationChannel")
    public String androidNotificationChannel;

    /**
     * <p>Message grouping. For messages in the same group, the notification bar shows only the latest message and the total number of messages received for that group. It does not display all messages and cannot be expanded. Currently supported on:</p>
     * <ul>
     * <li><p>Huawei vendor channel</p>
     * </li>
     * <li><p>Honor vendor channel</p>
     * </li>
     * <li><p>Proprietary channel for Android SDK 3.9.1 and earlier</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is no longer supported by the proprietary channel for Android SDK 3.9.2 and later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>group-1</p>
     */
    @NameInMap("AndroidNotificationGroup")
    public String androidNotificationGroup;

    /**
     * <p>Sets the \<code>importance\\</code> parameter for Honor notification message classification. This determines the notification behavior on the user\&quot;s device. Valid values:</p>
     * <ul>
     * <li><p><strong>LOW</strong>: For informational and marketing messages.</p>
     * </li>
     * <li><p><strong>NORMAL</strong>: For service and communication messages.</p>
     * </li>
     * </ul>
     * <p>Apply for this on the Honor platform. <a href="https://developer.honor.com/cn/docs/11002/guides/notification-class#%E8%87%AA%E5%88%86%E7%B1%BB%E6%9D%83%E7%9B%8A%E7%94%B3%E8%AF%B7">Application link</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>LOW</p>
     */
    @NameInMap("AndroidNotificationHonorChannel")
    public String androidNotificationHonorChannel;

    /**
     * <p>Sets the \<code>importance\\</code> parameter for Huawei notification message classification. This determines the notification behavior on the user\&quot;s device. Valid values:</p>
     * <ul>
     * <li><p>LOW: For informational and marketing messages.</p>
     * </li>
     * <li><p>NORMAL: For service and communication messages.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>For the Huawei channel, use \<code>AndroidMessageHuaweiCategory\\</code> for notification classification. You may no longer need to use \<code>AndroidNotificationHuaweiChannel\\</code>.</p>
     * </li>
     * <li><p>Apply for this on the Huawei platform. <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section893184112272">Application link</a>.</p>
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
     * <p>A unique identifier for each message when it is displayed as a notification. Different notifications can have the same \<code>NotifyId\\</code>, which allows a new notification to overwrite an old one.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("AndroidNotificationNotifyId")
    public Integer androidNotificationNotifyId;

    /**
     * <p>Message grouping. Messages in the same group are displayed in a collapsed state in the notification bar and can be expanded. Notifications from different groups are displayed separately. Currently supported on:</p>
     * <ul>
     * <li>Proprietary channel for Android SDK 3.9.2 and later</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>thread-1</p>
     */
    @NameInMap("AndroidNotificationThreadId")
    public String androidNotificationThreadId;

    /**
     * <p>Sets the classification for vivo notification messages. Valid values:</p>
     * <ul>
     * <li><p>0: Operational messages (default)</p>
     * </li>
     * <li><p>1: System messages</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>For the vivo channel, use \<code>AndroidMessageVivoCategory\\</code> for notification classification. You may no longer need to use \<code>AndroidNotificationVivoChannel\\</code>.</p>
     * </li>
     * <li><p>Apply for this on the vivo platform. For more information, see <a href="https://dev.vivo.com.cn/documentCenter/doc/359">Application link</a>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>classification</p>
     */
    @NameInMap("AndroidNotificationVivoChannel")
    public String androidNotificationVivoChannel;

    /**
     * <p>Sets the \<code>channelId\\</code> for the Xiaomi notification type. Apply for this on the Xiaomi platform. For more information, see <a href="https://dev.mi.com/console/doc/detail?pId=2422#_4">Application link</a>.</p>
     * <blockquote>
     * <ul>
     * <li>A single app can apply for a maximum of 8 channels through the Xiaomi channel. Plan accordingly.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>michannel</p>
     */
    @NameInMap("AndroidNotificationXiaomiChannel")
    public String androidNotificationXiaomiChannel;

    /**
     * <p>The notification alert type. Valid values:</p>
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
     * <p>BOTH</p>
     */
    @NameInMap("AndroidNotifyType")
    public String androidNotifyType;

    /**
     * <p>The action to take after a notification is tapped. Valid values:</p>
     * <ul>
     * <li><p><strong>APPLICATION</strong>: Open the application (default).</p>
     * </li>
     * <li><p><strong>ACTIVITY</strong>: Open a specific Android Activity.</p>
     * </li>
     * <li><p><strong>URL</strong>: Open a URL.</p>
     * </li>
     * <li><p><strong>NONE</strong>: No action.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>APPLICATION</p>
     */
    @NameInMap("AndroidOpenType")
    public String androidOpenType;

    /**
     * <p>The URL to open after the Android device receives the push.</p>
     * <p>This is required only when \<code>AndroidOpenType\\</code> is \<code>URL\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxx.xxx">https://xxxx.xxx</a></p>
     */
    @NameInMap("AndroidOpenUrl")
    public String androidOpenUrl;

    /**
     * <p>A JSON string of the OPPO Fluid Cloud intent deletion data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13578">data</a>. This parameter is invalid if the \<code>AndroidOppoIntelligentIntent\\</code> parameter is filled. For development and integration, see <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud Push Guide</a>.</p>
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
     * <p>A JSON string of the OPPO Fluid Cloud intent sharing data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13565">IntelligentIntent</a>. For development and integration, see <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud Push Guide</a>.</p>
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
     * <p>Sets the OPPO Fluid Cloud push environment.</p>
     * <ul>
     * <li><p><strong>0</strong>: Production environment (default).</p>
     * </li>
     * <li><p><strong>1</strong>: Staging environment.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The OPPO Fluid Cloud staging environment must be set up on the client side. For more information, see <a href="https://open.oppomobile.com/documentation/page/info?id=13590">Environment setup</a>.</p>
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
    public String androidOppoPrivateContentParametersShrink;

    /**
     * <p>OPPO private message template ID</p>
     * 
     * <strong>example:</strong>
     * <p>687557242b1634hzefs3d5013</p>
     */
    @NameInMap("AndroidOppoPrivateMsgTemplateId")
    public String androidOppoPrivateMsgTemplateId;

    /**
     * <p>OPPO private message template title parameters</p>
     */
    @NameInMap("AndroidOppoPrivateTitleParameters")
    public String androidOppoPrivateTitleParametersShrink;

    /**
     * <p>Specifies the Activity to launch after the notification is tapped.</p>
     * 
     * <strong>example:</strong>
     * <p>com.alibaba.cloudpushdemo.bizactivity</p>
     */
    @NameInMap("AndroidPopupActivity")
    public String androidPopupActivity;

    /**
     * <p>The body content in auxiliary pop-up mode. This parameter is required if \<code>AndroidPopupActivity\\</code> is not empty.</p>
     * <p>Length limit: 200 characters. Both Chinese and English characters count as one.</p>
     * <p>If you use a vendor channel, comply with its restrictions. For more information, see <a href="https://help.aliyun.com/document_detail/165253.html">Limits on pushes through auxiliary channels on Android</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("AndroidPopupBody")
    public String androidPopupBody;

    /**
     * <p>The title content in auxiliary pop-up mode. This parameter is required if \<code>AndroidPopupActivity\\</code> is not empty.</p>
     * <p>Length limit: 50 characters. Both Chinese and English characters count as one.</p>
     * <p>If you use a vendor channel, comply with its restrictions. For more information, see <a href="https://help.aliyun.com/document_detail/165253.html">Limits on pushes through auxiliary channels on Android</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("AndroidPopupTitle")
    public String androidPopupTitle;

    /**
     * <p>If the device is offline when a message is pushed, this push uses the auxiliary pop-up feature. The default value is \<code>false\\</code>. This is effective only when \<code>PushType\\</code> is \<code>MESSAGE\\</code>.</p>
     * <p>If the message is successfully converted to a notification, the data displayed in the notification is the value of the \<code>AndroidPopupTitle\\</code> and \<code>AndroidPopupBody\\</code> parameters set on the server. When the notification is tapped, the data obtained in the \<code>onSysNoticeOpened\\</code> method of the auxiliary pop-up is the value of the \<code>Title\\</code> and \<code>Body\\</code> parameters set on the server.</p>
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
     * <li><p><strong>1</strong>: Long text mode (supported by Huawei, Honor, Xiaomi, OPPO, Meizu, and proprietary channels)</p>
     * </li>
     * <li><p><strong>2</strong>: Big picture mode (supported by proprietary channels, but not by Xiaomi models)</p>
     * </li>
     * <li><p><strong>3</strong>: List mode (supported by Huawei, Honor, Xiaomi, OPPO, and proprietary channels)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required if you use a non-standard mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AndroidRenderStyle")
    public Integer androidRenderStyle;

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
     * <li><p>Configuring this parameter is equivalent to configuring \<code>AndroidHuaweiTargetUserType\\</code>, \<code>AndroidHonorTargetUserType\\</code>, \<code>AndroidVivoPushMode\\</code>, and \<code>AndroidOppoIntentEnv\\</code> simultaneously. Specific vendor channel parameters can override this setting.</p>
     * </li>
     * <li><p>Currently supported by: Huawei channel, Honor channel, vivo channel, and OPPO Fluid Cloud.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AndroidTargetUserType")
    public Integer androidTargetUserType;

    /**
     * <p>A JSON string of the vivo Atomic Island data structure <a href="https://dev.vivo.com.cn/documentCenter/doc/896#s-fdagzbd4">liveMessage</a>. For development and integration, see <a href="https://help.aliyun.com/zh/document_detail/3030718.html">vivo Atomic Island Push Guide</a>.</p>
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
     * <p>For test pushes, configure test devices in the vivo console beforehand. Find the test device\&quot;s \<code>RegId\\</code> by searching for &quot;onReceiveRegId regId&quot; in the device startup logs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AndroidVivoPushMode")
    public Integer androidVivoPushMode;

    /**
     * <p>The receipt ID for the vivo channel. You can find this ID in the application information section of the vivo open platform\&quot;s push service.</p>
     * <blockquote>
     * <p>If the default receipt configuration on the vivo open platform is the Alibaba Cloud receipt, do not provide this. If not, first configure the default vivo channel receipt ID in the Alibaba Cloud EMAS Mobile Push console.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("AndroidVivoReceiptId")
    public String androidVivoReceiptId;

    /**
     * <p>This parameter is deprecated. All third-party auxiliary pop-ups are now supported by the new parameter <strong>AndroidPopupActivity</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("AndroidXiaoMiActivity")
    @Deprecated
    public String androidXiaoMiActivity;

    /**
     * <p>This parameter is deprecated. All third-party auxiliary pop-ups are now supported by the new parameter <strong>AndroidPopupBody</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("AndroidXiaoMiNotifyBody")
    @Deprecated
    public String androidXiaoMiNotifyBody;

    /**
     * <p>This parameter is deprecated. All third-party auxiliary pop-ups are now supported by the new parameter <strong>AndroidPopupTitle</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("AndroidXiaoMiNotifyTitle")
    @Deprecated
    public String androidXiaoMiNotifyTitle;

    /**
     * <p>This parameter is deprecated. Starting from August 2023, Xiaomi no longer supports dynamically setting small icons, right-side icons, or large pictures during pushes on new devices/systems.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://f6.market.xiaomi.com/download/MiPass/aaa/bbb.png">https://f6.market.xiaomi.com/download/MiPass/aaa/bbb.png</a></p>
     */
    @NameInMap("AndroidXiaomiBigPictureUrl")
    @Deprecated
    public String androidXiaomiBigPictureUrl;

    /**
     * <p>A JSON string of the Xiaomi Super Island data structure <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.param</a>. For development and integration, see <a href="https://help.aliyun.com/zh/document_detail/3037956.html">Xiaomi Super Island Push Guide</a>.</p>
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
     * <p>A JSON string of the Xiaomi Super Island data images <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.pic_xxx</a>. For development and integration, see <a href="https://help.aliyun.com/zh/document_detail/3037956.html">Xiaomi Super Island Push Guide</a>.</p>
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
     * <p>This parameter is deprecated. Starting from August 2023, Xiaomi no longer supports dynamically setting small icons, right-side icons, or large pictures during pushes on new devices/systems.</p>
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
     * <p>The AppKey.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>The content of the notification or message for Android and HarmonyOS pushes. The content of the message or notification for iOS. The size of the push content is limited. For more information, see <a href="https://help.aliyun.com/document_detail/434629.html">Product limits</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("Body")
    public String body;

    /**
     * <p>The device type. Valid values:</p>
     * <ul>
     * <li><p><strong>HARMONY</strong>: A HarmonyOS device.</p>
     * </li>
     * <li><p><strong>iOS</strong>: An iOS device.</p>
     * </li>
     * <li><p><strong>ANDROID</strong>: An Android device.</p>
     * </li>
     * <li><p><strong>ALL</strong>: For older dual-platform apps, this sends pushes to both Android and iOS devices. For newer single-platform apps, this has the same effect as specifying the device type for that app.</p>
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
     * <p>The expiration time for offline messages or notifications. Use this with \<code>StoreOffline\\</code>. The message is not sent after this time. The maximum retention period is 72 hours, which is also the default.</p>
     * <p>The time must be in ISO 8601 format and in UTC: \<code>YYYY-MM-DDThh:mm:ssZ\\</code>. The expiration time must be at least 3 seconds after the current time or the scheduled push time (\<code>ExpireTime\\</code> &gt; \<code>PushTime\\</code> + 3 seconds). The 3-second buffer accounts for network and system delays. For single pushes, use a value of at least 1 minute. For batch pushes or pushes to all devices, use a value of at least 10 minutes.</p>
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
     * <p>When \<code>HarmonyActionType\\</code> is \<code>APP_CUSTOM_PAGE\\</code>, fill in at least one of \<code>HarmonyUri\\</code> or \<code>HarmonyAction\\</code>.</p>
     * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.action</a> in the HarmonyOS documentation.</p>
     * 
     * <strong>example:</strong>
     * <p>com.example.action</p>
     */
    @NameInMap("HarmonyAction")
    public String harmonyAction;

    /**
     * <p>The action to take after a notification is tapped. Valid values:</p>
     * <ul>
     * <li><p>APP_HOME_PAGE: Open the app\&quot;s home page.</p>
     * </li>
     * <li><p>APP_CUSTOM_PAGE: Open a custom page in the app.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>APP_HOME_PAGE</p>
     */
    @NameInMap("HarmonyActionType")
    public String harmonyActionType;

    /**
     * <p>The number to add to the HarmonyOS app badge. See the description of the <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">HarmonyOS badge addNum field</a>.<br>
     * Supported starting from HarmonyOS SDK version 1.2.0.<br></p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HarmonyBadgeAddNum")
    public Integer harmonyBadgeAddNum;

    /**
     * <p>The number to set for the HarmonyOS app badge. See the description of the <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">HarmonyOS badge setNum field</a>.
     * Supported starting from HarmonyOS SDK version 1.2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HarmonyBadgeSetNum")
    public Integer harmonyBadgeSetNum;

    /**
     * <p>The notification message category. After you apply for notification message self-classification rights, this is used to identify the message type. Different notification message types affect how messages are displayed and alerted. Valid values:</p>
     * <ul>
     * <li><p>IM: Instant messaging</p>
     * </li>
     * <li><p>VOIP: Voice and video calls</p>
     * </li>
     * <li><p>SUBSCRIPTION: Subscriptions</p>
     * </li>
     * <li><p>TRAVEL: Travel</p>
     * </li>
     * <li><p>HEALTH: Health</p>
     * </li>
     * <li><p>WORK: Work reminders</p>
     * </li>
     * <li><p>ACCOUNT: Account updates</p>
     * </li>
     * <li><p>EXPRESS: Orders &amp; logistics</p>
     * </li>
     * <li><p>FINANCE: Finance</p>
     * </li>
     * <li><p>DEVICE_REMINDER: Device reminders</p>
     * </li>
     * <li><p>MAIL: Mail</p>
     * </li>
     * <li><p>CUSTOMER_SERVICE: Customer service messages</p>
     * </li>
     * <li><p>MARKETING: News, content recommendations, social updates, product promotions, financial updates, lifestyle information, surveys, feature recommendations, and operational activities. This only identifies the content and does not speed up message delivery. These are collectively known as informational and marketing messages.</p>
     * </li>
     * </ul>
     * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.category</a> in the HarmonyOS documentation.</p>
     * 
     * <strong>example:</strong>
     * <p>IM</p>
     */
    @NameInMap("HarmonyCategory")
    public String harmonyCategory;

    /**
     * <p>Sets the extended properties of the notification. This property is not effective when \<code>PushType\\</code> is \<code>MESSAGE\\</code>.</p>
     * <p>This parameter must be in JSON map format to avoid parsing errors.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;api_name&quot;:&quot;PushNoticeToAndroidRequest&quot;}</p>
     */
    @NameInMap("HarmonyExtParameters")
    public String harmonyExtParameters;

    /**
     * <p>The extra data for the extended notification message.<br>
     * This is effective when sending a HarmonyOS extended notification message.<br>
     * Conceptually, this is equivalent to the \<code>extraData\\</code> field of a HarmonyOS extended notification message. For the specific definition, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section161192514234">HarmonyOS ExtensionPayload Description</a>.<br>
     * Supported starting from HarmonyOS SDK version 1.2.0.<br><br><br></p>
     * 
     * <strong>example:</strong>
     * <p>示例额外数据</p>
     */
    @NameInMap("HarmonyExtensionExtraData")
    public String harmonyExtensionExtraData;

    /**
     * <p>When \<code>PushType\\</code> is \<code>NOTICE\\</code>, specifies whether this is a HarmonyOS extended notification message.</p>
     * <ul>
     * <li><p>true: Send an extended notification message.</p>
     * </li>
     * <li><p>false: Send a normal notification (default).</p>
     * </li>
     * </ul>
     * <p>Apply for permission on the HarmonyOS side before you can send extended notification messages. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-guides-V5/push-send-extend-noti-V5">Send Extended Notification Messages</a> in the HarmonyOS documentation.<br>
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
     * <p>Supported image formats are PNG, JPG, JPEG, HEIF, GIF, and BMP. The image dimensions (height × width) must be less than 25,000 pixels.</p>
     * </blockquote>
     * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.image</a> in the HarmonyOS documentation.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/xxx.png">https://example.com/xxx.png</a></p>
     */
    @NameInMap("HarmonyImageUrl")
    public String harmonyImageUrl;

    /**
     * <p>The content for the multi-line text style. This field is required when \<code>HarmonyRenderStyle\\</code> is \<code>MULTI_LINE\\</code>. It supports up to 3 lines of content.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1.content1&quot;,&quot;2.content2&quot;,&quot;3.content3&quot;]</p>
     */
    @NameInMap("HarmonyInboxContent")
    public String harmonyInboxContent;

    /**
     * <p>A JSON string of the HarmonyOS Live Window data structure <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V13/push-scenariozed-api-request-param-V13#section66881469306">LiveViewPayload</a>. For development and integration, see <a href="https://help.aliyun.com/document_detail/2982112.html">HarmonyOS Live Window Push Guide</a>.</p>
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
     * <li><p>SERVICE_INFORMATION: Service reminders.</p>
     * </li>
     * <li><p>CONTENT_INFORMATION: Content information.</p>
     * </li>
     * <li><p>CUSTOMER_SERVICE: Customer service messages. This type is for messages between users and businesses and must be initiated by the user.</p>
     * </li>
     * <li><p>OTHER_TYPES: Others.</p>
     * </li>
     * </ul>
     * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/js-apis-notificationmanager-V5#slottype">SlotType</a> in the HarmonyOS documentation.</p>
     * 
     * <strong>example:</strong>
     * <p>SOCIAL_COMMUNICATION</p>
     */
    @NameInMap("HarmonyNotificationSlotType")
    public String harmonyNotificationSlotType;

    /**
     * <p>A unique identifier for each message when it is displayed as a notification. If not provided, the push service automatically generates a unique ID for each message. Different notifications can have the same \<code>notifyId\\</code>, which allows a new message to overwrite an old one.</p>
     * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.notifyId</a> in the HarmonyOS documentation.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HarmonyNotifyId")
    public Integer harmonyNotifyId;

    /**
     * <p>The receipt ID for the HarmonyOS channel. You can find this ID in the receipt parameter configuration on the HarmonyOS Push service platform.</p>
     * <blockquote>
     * <p>If the default receipt configuration on the HarmonyOS Push service platform is the Alibaba Cloud receipt, do not provide this. If not, first configure the default HarmonyOS channel receipt ID in the Alibaba Cloud EMAS Mobile Push console.</p>
     * </blockquote>
     * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">pushOptions.receiptId</a> in the HarmonyOS documentation.</p>
     * 
     * <strong>example:</strong>
     * <p>RCPB***DFD5</p>
     */
    @NameInMap("HarmonyReceiptId")
    public String harmonyReceiptId;

    /**
     * <p>If the device is offline when a message is pushed, this push uses the auxiliary pop-up feature. The default value is \<code>false\\</code>. This is effective only when \<code>PushType\\</code> is \<code>MESSAGE\\</code>.</p>
     * <p>If the message is successfully converted to a notification, the data displayed in the notification is the value of the \<code>HarmonyRemindTitle\\</code> and \<code>HarmonyRemindBody\\</code> parameters set on the server.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HarmonyRemind")
    public Boolean harmonyRemind;

    /**
     * <p>The HarmonyOS notification content used when a message is converted to a notification. This is effective only when \<code>HarmonyRemind\\</code> is \<code>true\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>您有一条新消息，请查收</p>
     */
    @NameInMap("HarmonyRemindBody")
    public String harmonyRemindBody;

    /**
     * <p>The HarmonyOS notification title used when a message is converted to a notification. This is effective only when \<code>HarmonyRemind\\</code> is \<code>true\\</code>.</p>
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
     * <p>Test message flag:</p>
     * <ul>
     * <li><p>false: Normal message (default)</p>
     * </li>
     * <li><p>true: Test message</p>
     * </li>
     * </ul>
     * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">pushOptions.testMessage</a> in the HarmonyOS documentation.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HarmonyTestMessage")
    public Boolean harmonyTestMessage;

    /**
     * <p>The URI corresponding to the in-app page ability.</p>
     * <blockquote>
     * <p>Notice: When \<code>HarmonyActionType\\</code> is \<code>APP_CUSTOM_PAGE\\</code>, fill in at least one of \<code>HarmonyUri\\</code> or \<code>HarmonyAction\\</code>. If there are multiple abilities, fill in the action and URI for each. The action is used with priority to find the corresponding in-app page.</p>
     * </blockquote>
     * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.uri</a> in the HarmonyOS documentation.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.example.com:8080/push/example">https://www.example.com:8080/push/example</a></p>
     */
    @NameInMap("HarmonyUri")
    public String harmonyUri;

    /**
     * <p>An idempotent parameter to prevent duplicate pushes caused by API call retries. If you make a call with the same \<code>IdempotentToken\\</code> within 15 minutes, only one push is sent. Subsequent calls return the result of the first successful push.</p>
     * <blockquote>
     * <ul>
     * <li><p>The parameter must be a standard 36-character UUID (8-4-4-4-12). Each valid character must be a hexadecimal digit from 0-9 or a-f, case-insensitive.</p>
     * </li>
     * <li><p>This parameter only prevents duplicate pushes from retries. It cannot prevent duplicate pushes from concurrent calls.</p>
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
     * <p>A custom ID for the push task. If \<code>JobKey\\</code> is not empty, this field is included in the receipt logs. For more information about receipt logs, see <a href="https://help.aliyun.com/document_detail/434651.html">Receipt logs</a>.</p>
     * <blockquote>
     * <p>The format must consist of letters, numbers, underscores (_), or hyphens (-). The length cannot exceed 32 characters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("JobKey")
    public String jobKey;

    /**
     * <p>Used for scheduled sending. If you do not set this parameter, the push is sent immediately.
     * The scheduled time can be no more than 7 days in the future.</p>
     * <p>The time must be in ISO 8601 format and in UTC: \<code>YYYY-MM-DDThh:mm:ssZ\\</code>.</p>
     * <blockquote>
     * <p>Scheduled sending is not supported when \<code>Target\\</code> is \<code>TBD\\</code> (continuous push).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-02-20T00:00:00Z</p>
     */
    @NameInMap("PushTime")
    public String pushTime;

    /**
     * <p>The push type. Valid values:</p>
     * <ul>
     * <li><p><strong>NOTICE</strong>: A notification. Notifications are sent to devices through vendor channels, such as APNs, Huawei, Xiaomi, and HarmonyOS, and appear directly in the device\&quot;s notification bar. When an Android device is online (the app process is active), the notification is preferentially sent through Alibaba Cloud\&quot;s proprietary channel. The Push software development kit (SDK) then constructs and displays the notification. This improves push performance and can save on vendor channel message quotas in some scenarios.</p>
     * </li>
     * <li><p><strong>MESSAGE</strong>: A message. Messages are sent through Alibaba Cloud\&quot;s proprietary online channel. They do not appear in the notification bar by default. Instead, the app must be active to receive and process them. Your business logic determines whether to trigger any actions. If a device is offline (the app process is inactive), it cannot receive messages immediately. In this case, use the \<code>iOSRemind\\</code> or \<code>AndroidRemind\\</code> parameter to convert the message into a notification. Alternatively, set the \<code>StoreOffline\\</code> parameter to have the push system save the message. The system then delivers the message automatically when the device comes back online.</p>
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
     * <li><p>If you do not set this parameter, all channels can be used.</p>
     * </li>
     * <li><p>If you set this parameter, only the specified channels are used.</p>
     * </li>
     * <li><p>If the specified channels conflict with the sending policy, the push is not sent. For example, if an iOS notification can only be sent through the APNs channel, but \<code>apns\\</code> is not included in this parameter, the push will fail.</p>
     * </li>
     * <li><p>If you specify \<code>gcm\\</code>, pushes can be sent through both Google GCM and FCM channels. If you specify \<code>fcm\\</code>, pushes can only be sent through the Google FCM channel.</p>
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
     * <p>The delay time in seconds before triggering the text message.</p>
     * <p>This must be set if using SMS filter interaction. Set it to 15 seconds or more, with a maximum of 3 days, to avoid duplicate pushes and text messages.</p>
     * <blockquote>
     * <p>When using SMS filter interaction, the \<code>ExpireTime\\</code> parameter is invalid. The notification expiration time is calculated based on the \<code>SmsDelaySecs\\</code> parameter. The expiration time is the current time plus the \<code>SmsDelaySecs\\</code> time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("SmsDelaySecs")
    public Integer smsDelaySecs;

    /**
     * <p>The key-value pairs for the variables in the SMS template. Format: <code>key1=value1&amp;key2=value2</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>key1=value1</p>
     */
    @NameInMap("SmsParams")
    public String smsParams;

    /**
     * <p>The condition for triggering the text message. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Triggered when the push is not received.</p>
     * </li>
     * <li><p><strong>1</strong>: Triggered when the user does not open the push.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SmsSendPolicy")
    public Integer smsSendPolicy;

    /**
     * <p>The signature for the supplementary text message.</p>
     * 
     * <strong>example:</strong>
     * <p>短信签名</p>
     */
    @NameInMap("SmsSignName")
    public String smsSignName;

    /**
     * <p>The name of the SMS template for supplementary sending. Get this from the SMS template management interface. This is the system-assigned name, not the name set by the developer.</p>
     * 
     * <strong>example:</strong>
     * <p>短信模板名称</p>
     */
    @NameInMap("SmsTemplateName")
    public String smsTemplateName;

    /**
     * <p>Specifies whether to save offline messages and notifications. The default value is <strong>false</strong>.</p>
     * <p>If set to true, and a user is offline, the message is sent again when the user comes online before the \<code>ExpireTime\\</code>. The default \<code>ExpireTime\\</code> is 72 hours. iOS notifications are sent through APNs and are not affected by this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("StoreOffline")
    public Boolean storeOffline;

    /**
     * <p>The push target. Valid values:</p>
     * <ul>
     * <li><p><strong>DEVICE</strong>: Push to devices.</p>
     * </li>
     * <li><p><strong>ACCOUNT</strong>: Push to accounts.</p>
     * </li>
     * <li><p><strong>ALIAS</strong>: Push to aliases.</p>
     * </li>
     * <li><p><strong>TAG</strong>: Push to tags.</p>
     * </li>
     * <li><p><strong>ALL</strong>: Push to all devices. The interval between two consecutive pushes to all devices of the same \<code>DeviceType\\</code> must be at least 1 second.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When pushing to all iOS devices, the push is sent to devices that have been active in the last 24 months and have not uninstalled the app. A push is considered delivered once the Apple Push Notification service (APNs) receives the request and does not return an error. This can cause a sharp increase in the number of active devices and lead to significant costs. Use this feature with caution.</p>
     * </blockquote>
     * <ul>
     * <li><strong>TBD</strong>: Initializes a continuous push. The target is specified by a subsequent call to the <a href="https://help.aliyun.com/document_detail/2249917.html">ContinuouslyPush</a> API.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>Set this based on the \<code>Target\\</code> type. Use commas to separate multiple values. If you exceed the limit, send multiple pushes.</p>
     * <ul>
     * <li><p>If \<code>Target\\</code> is \<code>DEVICE\\</code>, provide device IDs, such as \<code>deviceid1,deviceid2\\</code>. You can specify up to 1,000 device IDs.</p>
     * </li>
     * <li><p>If \<code>Target\\</code> is \<code>ACCOUNT\\</code>, provide account IDs, such as \<code>account1,account2\\</code>. You can specify up to 1,000 account IDs.</p>
     * </li>
     * <li><p>If \<code>Target\\</code> is \<code>ALIAS\\</code>, provide aliases, such as \<code>alias1,alias2\\</code>. You can specify up to 1,000 aliases.</p>
     * </li>
     * <li><p>If \<code>Target\\</code> is \<code>TAG\\</code>, you can use single or multiple tags. For more information about the format, see <a href="https://help.aliyun.com/document_detail/434847.html">Tag format</a>.</p>
     * </li>
     * <li><p>If \<code>Target\\</code> is \<code>ALL\\</code>, set the value to <strong>ALL</strong>. This is a fixed parameter combination for pushing to all devices.</p>
     * </li>
     * <li><p>If \<code>Target\\</code> is \<code>TBD\\</code>, set the value to <strong>TBD</strong>. This is a fixed parameter combination for continuous pushes.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("TargetValue")
    public String targetValue;

    /**
     * <p>The title of the notification or message. The maximum length is 200 bytes.</p>
     * <p>This is required for pushes to Android and HarmonyOS. It is optional for iOS notifications. If you provide a title for an iOS notification:</p>
     * <ul>
     * <li><p>For iOS 10 and later, the notification displays the title.</p>
     * </li>
     * <li><p>For iOS 8.2 to iOS 9.x, the title replaces the app name in the notification.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>Specifies whether to automatically truncate titles and content that are too long.</p>
     * <blockquote>
     * <p>This only applies to vendor channels that have explicit limits on title and content length. It does not apply to channels like APNs, Huawei, and Honor, which only limit the total request body size.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Trim")
    public Boolean trim;

    /**
     * <p>iOS notifications are sent through APNs. Specify the environment.</p>
     * <ul>
     * <li><p><strong>DEV</strong>: The development environment. Use this for apps installed and debugged directly from Xcode.</p>
     * </li>
     * <li><p><strong>PRODUCT</strong>: The production environment. Use this for apps distributed through the App Store, TestFlight, Ad Hoc, or enterprise distribution.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DEV</p>
     */
    @NameInMap("iOSApnsEnv")
    public String iOSApnsEnv;

    /**
     * <p>The badge number on the top-right corner of the app icon on iOS.</p>
     * <blockquote>
     * <p>If \<code>iOSBadgeAutoIncrement\\</code> is set to \<code>true\\</code>, this parameter must be empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("iOSBadge")
    public Integer iOSBadge;

    /**
     * <p>Specifies whether to enable the auto-increment feature for the badge number. The default value is \<code>false\\</code>.</p>
     * <blockquote>
     * <p>When this is \<code>true\\</code>, \<code>iOSBadge\\</code> must be empty.</p>
     * </blockquote>
     * <p>The auto-increment feature is managed by the push server, which maintains a badge count for each device. This requires SDK version 1.9.5 or later. The user must also actively sync the badge number to the server.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("iOSBadgeAutoIncrement")
    public Boolean iOSBadgeAutoIncrement;

    /**
     * <p>The extended properties of the iOS notification.</p>
     * <p>For iOS 10 and later, specify the resource URL for a rich push notification, such as \<code>{&quot;attachment&quot;: &quot;https\\://xxxx.xxx/notification_pic.png&quot;}\\</code>. This parameter must be in JSON map format to avoid parsing errors.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;attachment&quot;: &quot;<a href="https://xxxx.xxx/notification_pic.png%22%7D">https://xxxx.xxx/notification_pic.png&quot;}</a></p>
     */
    @NameInMap("iOSExtParameters")
    public String iOSExtParameters;

    /**
     * <p>The interruption level. Valid values:</p>
     * <ul>
     * <li><p><strong>passive</strong>: The system adds the notification to the notification list without lighting up the screen or playing a sound.</p>
     * </li>
     * <li><p><strong>active</strong>: The system displays the notification immediately, lights up the screen, and can play a sound.</p>
     * </li>
     * <li><p><strong>time-sensitive</strong>: The system presents the notification immediately, lights up the screen, and can play a sound, but it does not break through system notification controls.</p>
     * </li>
     * <li><p><strong>critical</strong>: The system displays the notification immediately, lights up the screen, and plays a sound, bypassing the mute switch.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("iOSInterruptionLevel")
    public String iOSInterruptionLevel;

    /**
     * <p>A JSON string containing static pass-through parameters for Dynamic Island pushes. It includes static, custom user information, such as product numbers and order details.</p>
     * <blockquote>
     * <p>This is required when \<code>iOSLiveActivityEvent\\</code> is \<code>start\\</code>.</p>
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
     * <p>This is required when \<code>iOSLiveActivityEvent\\</code> is \<code>start\\</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>OrderActivityAttributes</p>
     */
    @NameInMap("iOSLiveActivityAttributesType")
    public String iOSLiveActivityAttributesType;

    /**
     * <p>Dynamic pass-through parameters for Dynamic Island pushes. It includes real-time updates, such as price or inventory changes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;status&quot;: &quot;delivered&quot;, &quot;estimatedArrival&quot;: &quot;2023-12-31T12:00:00Z&quot;}</p>
     */
    @NameInMap("iOSLiveActivityContentState")
    public String iOSLiveActivityContentState;

    /**
     * <p>A UNIX timestamp in seconds. The ended Live Activity remains on the lock screen until this specified time. The maximum duration is 4 hours.</p>
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
     * <p>The Live Activity ID reported by the device to your server. This is the unique identifier for the Live Activity.</p>
     * 
     * <strong>example:</strong>
     * <p>66B94673-B32E-4CA7-863C-3E523054FD46</p>
     */
    @NameInMap("iOSLiveActivityId")
    public String iOSLiveActivityId;

    /**
     * <p>A UNIX timestamp in seconds. Marks the time when the activity\&quot;s content becomes outdated.</p>
     * 
     * <strong>example:</strong>
     * <p>1743131967</p>
     */
    @NameInMap("iOSLiveActivityStaleDate")
    public Long iOSLiveActivityStaleDate;

    /**
     * <p>The sound for an iOS notification. Specify the name of an audio file located in the app bundle or the \<code>Library/Sounds\\</code> directory of the sandbox. For more information, see <a href="https://help.aliyun.com/document_detail/48906.html">How to set notification sounds for iOS pushes</a>.</p>
     * <p>If you specify an empty string (&quot;&quot;), the notification is silent. If you do not set this parameter, the default system sound is used.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("iOSMusic")
    public String iOSMusic;

    /**
     * <p>The flag for the iOS notification content extension (iOS 10+). If set to \<code>true\\</code>, an APNs notification can be processed by the extension before it is displayed. This must be set to \<code>true\\</code> for silent notifications.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("iOSMutableContent")
    public Boolean iOSMutableContent;

    /**
     * <p>Specifies the iOS notification category (iOS 10+).</p>
     * 
     * <strong>example:</strong>
     * <p>ios</p>
     */
    @NameInMap("iOSNotificationCategory")
    public String iOSNotificationCategory;

    /**
     * <p>If a device receives multiple notifications with the same \<code>CollapseId\\</code>, they are merged into a single notification. If the device is offline and receives consecutive notifications with the same \<code>CollapseId\\</code>, only one is shown in the notification bar. This parameter is supported on iOS 10 and later.</p>
     * 
     * <strong>example:</strong>
     * <p>ZD2011</p>
     */
    @NameInMap("iOSNotificationCollapseId")
    public String iOSNotificationCollapseId;

    /**
     * <p>Groups iOS remote notifications using this property. It marks the identifier for the collapsed group.
     * This is supported only on iOS 12.0 and later.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("iOSNotificationThreadId")
    public String iOSNotificationThreadId;

    /**
     * <p>The score for highlighting the summary. The value must be a floating-point number between 0 and 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0.01</p>
     */
    @NameInMap("iOSRelevanceScore")
    public Double iOSRelevanceScore;

    /**
     * <p>If a device is offline when a message is pushed (meaning the persistent connection to the Mobile Push server is down), the push is sent once as a notification through Apple\&quot;s APNs channel.</p>
     * <blockquote>
     * <p>Converting offline messages to notifications is only supported in the production environment.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("iOSRemind")
    public Boolean iOSRemind;

    /**
     * <p>The content of the iOS notification used when a message is converted to a notification. This is valid only when \<code>iOSApnsEnv\\</code> is \<code>PRODUCT\\</code> and \<code>iOSRemind\\</code> is \<code>true\\</code>.</p>
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
     * <p>The subtitle of the iOS notification (iOS 10+).</p>
     * 
     * <strong>example:</strong>
     * <p>su\&quot;b</p>
     */
    @NameInMap("iOSSubtitle")
    public String iOSSubtitle;

    public static PushShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PushShrinkRequest self = new PushShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PushShrinkRequest setAndroidActivity(String androidActivity) {
        this.androidActivity = androidActivity;
        return this;
    }
    public String getAndroidActivity() {
        return this.androidActivity;
    }

    public PushShrinkRequest setAndroidBadgeAddNum(Integer androidBadgeAddNum) {
        this.androidBadgeAddNum = androidBadgeAddNum;
        return this;
    }
    public Integer getAndroidBadgeAddNum() {
        return this.androidBadgeAddNum;
    }

    public PushShrinkRequest setAndroidBadgeClass(String androidBadgeClass) {
        this.androidBadgeClass = androidBadgeClass;
        return this;
    }
    public String getAndroidBadgeClass() {
        return this.androidBadgeClass;
    }

    public PushShrinkRequest setAndroidBadgeSetNum(Integer androidBadgeSetNum) {
        this.androidBadgeSetNum = androidBadgeSetNum;
        return this;
    }
    public Integer getAndroidBadgeSetNum() {
        return this.androidBadgeSetNum;
    }

    public PushShrinkRequest setAndroidBigBody(String androidBigBody) {
        this.androidBigBody = androidBigBody;
        return this;
    }
    public String getAndroidBigBody() {
        return this.androidBigBody;
    }

    public PushShrinkRequest setAndroidBigPictureUrl(String androidBigPictureUrl) {
        this.androidBigPictureUrl = androidBigPictureUrl;
        return this;
    }
    public String getAndroidBigPictureUrl() {
        return this.androidBigPictureUrl;
    }

    public PushShrinkRequest setAndroidBigTitle(String androidBigTitle) {
        this.androidBigTitle = androidBigTitle;
        return this;
    }
    public String getAndroidBigTitle() {
        return this.androidBigTitle;
    }

    public PushShrinkRequest setAndroidExtParameters(String androidExtParameters) {
        this.androidExtParameters = androidExtParameters;
        return this;
    }
    public String getAndroidExtParameters() {
        return this.androidExtParameters;
    }

    public PushShrinkRequest setAndroidHonorTargetUserType(Integer androidHonorTargetUserType) {
        this.androidHonorTargetUserType = androidHonorTargetUserType;
        return this;
    }
    public Integer getAndroidHonorTargetUserType() {
        return this.androidHonorTargetUserType;
    }

    public PushShrinkRequest setAndroidHuaweiBusinessType(Integer androidHuaweiBusinessType) {
        this.androidHuaweiBusinessType = androidHuaweiBusinessType;
        return this;
    }
    public Integer getAndroidHuaweiBusinessType() {
        return this.androidHuaweiBusinessType;
    }

    public PushShrinkRequest setAndroidHuaweiLiveNotificationPayload(String androidHuaweiLiveNotificationPayload) {
        this.androidHuaweiLiveNotificationPayload = androidHuaweiLiveNotificationPayload;
        return this;
    }
    public String getAndroidHuaweiLiveNotificationPayload() {
        return this.androidHuaweiLiveNotificationPayload;
    }

    public PushShrinkRequest setAndroidHuaweiReceiptId(String androidHuaweiReceiptId) {
        this.androidHuaweiReceiptId = androidHuaweiReceiptId;
        return this;
    }
    public String getAndroidHuaweiReceiptId() {
        return this.androidHuaweiReceiptId;
    }

    public PushShrinkRequest setAndroidHuaweiTargetUserType(Integer androidHuaweiTargetUserType) {
        this.androidHuaweiTargetUserType = androidHuaweiTargetUserType;
        return this;
    }
    public Integer getAndroidHuaweiTargetUserType() {
        return this.androidHuaweiTargetUserType;
    }

    public PushShrinkRequest setAndroidImageUrl(String androidImageUrl) {
        this.androidImageUrl = androidImageUrl;
        return this;
    }
    public String getAndroidImageUrl() {
        return this.androidImageUrl;
    }

    public PushShrinkRequest setAndroidInboxBody(String androidInboxBody) {
        this.androidInboxBody = androidInboxBody;
        return this;
    }
    public String getAndroidInboxBody() {
        return this.androidInboxBody;
    }

    public PushShrinkRequest setAndroidMeizuNoticeMsgType(Integer androidMeizuNoticeMsgType) {
        this.androidMeizuNoticeMsgType = androidMeizuNoticeMsgType;
        return this;
    }
    public Integer getAndroidMeizuNoticeMsgType() {
        return this.androidMeizuNoticeMsgType;
    }

    public PushShrinkRequest setAndroidMessageHuaweiCategory(String androidMessageHuaweiCategory) {
        this.androidMessageHuaweiCategory = androidMessageHuaweiCategory;
        return this;
    }
    public String getAndroidMessageHuaweiCategory() {
        return this.androidMessageHuaweiCategory;
    }

    public PushShrinkRequest setAndroidMessageHuaweiUrgency(String androidMessageHuaweiUrgency) {
        this.androidMessageHuaweiUrgency = androidMessageHuaweiUrgency;
        return this;
    }
    public String getAndroidMessageHuaweiUrgency() {
        return this.androidMessageHuaweiUrgency;
    }

    public PushShrinkRequest setAndroidMessageOppoCategory(String androidMessageOppoCategory) {
        this.androidMessageOppoCategory = androidMessageOppoCategory;
        return this;
    }
    public String getAndroidMessageOppoCategory() {
        return this.androidMessageOppoCategory;
    }

    public PushShrinkRequest setAndroidMessageOppoNotifyLevel(Integer androidMessageOppoNotifyLevel) {
        this.androidMessageOppoNotifyLevel = androidMessageOppoNotifyLevel;
        return this;
    }
    public Integer getAndroidMessageOppoNotifyLevel() {
        return this.androidMessageOppoNotifyLevel;
    }

    public PushShrinkRequest setAndroidMessageVivoCategory(String androidMessageVivoCategory) {
        this.androidMessageVivoCategory = androidMessageVivoCategory;
        return this;
    }
    public String getAndroidMessageVivoCategory() {
        return this.androidMessageVivoCategory;
    }

    public PushShrinkRequest setAndroidMusic(String androidMusic) {
        this.androidMusic = androidMusic;
        return this;
    }
    public String getAndroidMusic() {
        return this.androidMusic;
    }

    public PushShrinkRequest setAndroidNotificationBarPriority(Integer androidNotificationBarPriority) {
        this.androidNotificationBarPriority = androidNotificationBarPriority;
        return this;
    }
    public Integer getAndroidNotificationBarPriority() {
        return this.androidNotificationBarPriority;
    }

    public PushShrinkRequest setAndroidNotificationBarType(Integer androidNotificationBarType) {
        this.androidNotificationBarType = androidNotificationBarType;
        return this;
    }
    public Integer getAndroidNotificationBarType() {
        return this.androidNotificationBarType;
    }

    public PushShrinkRequest setAndroidNotificationChannel(String androidNotificationChannel) {
        this.androidNotificationChannel = androidNotificationChannel;
        return this;
    }
    public String getAndroidNotificationChannel() {
        return this.androidNotificationChannel;
    }

    public PushShrinkRequest setAndroidNotificationGroup(String androidNotificationGroup) {
        this.androidNotificationGroup = androidNotificationGroup;
        return this;
    }
    public String getAndroidNotificationGroup() {
        return this.androidNotificationGroup;
    }

    public PushShrinkRequest setAndroidNotificationHonorChannel(String androidNotificationHonorChannel) {
        this.androidNotificationHonorChannel = androidNotificationHonorChannel;
        return this;
    }
    public String getAndroidNotificationHonorChannel() {
        return this.androidNotificationHonorChannel;
    }

    public PushShrinkRequest setAndroidNotificationHuaweiChannel(String androidNotificationHuaweiChannel) {
        this.androidNotificationHuaweiChannel = androidNotificationHuaweiChannel;
        return this;
    }
    public String getAndroidNotificationHuaweiChannel() {
        return this.androidNotificationHuaweiChannel;
    }

    public PushShrinkRequest setAndroidNotificationNotifyId(Integer androidNotificationNotifyId) {
        this.androidNotificationNotifyId = androidNotificationNotifyId;
        return this;
    }
    public Integer getAndroidNotificationNotifyId() {
        return this.androidNotificationNotifyId;
    }

    public PushShrinkRequest setAndroidNotificationThreadId(String androidNotificationThreadId) {
        this.androidNotificationThreadId = androidNotificationThreadId;
        return this;
    }
    public String getAndroidNotificationThreadId() {
        return this.androidNotificationThreadId;
    }

    public PushShrinkRequest setAndroidNotificationVivoChannel(String androidNotificationVivoChannel) {
        this.androidNotificationVivoChannel = androidNotificationVivoChannel;
        return this;
    }
    public String getAndroidNotificationVivoChannel() {
        return this.androidNotificationVivoChannel;
    }

    public PushShrinkRequest setAndroidNotificationXiaomiChannel(String androidNotificationXiaomiChannel) {
        this.androidNotificationXiaomiChannel = androidNotificationXiaomiChannel;
        return this;
    }
    public String getAndroidNotificationXiaomiChannel() {
        return this.androidNotificationXiaomiChannel;
    }

    public PushShrinkRequest setAndroidNotifyType(String androidNotifyType) {
        this.androidNotifyType = androidNotifyType;
        return this;
    }
    public String getAndroidNotifyType() {
        return this.androidNotifyType;
    }

    public PushShrinkRequest setAndroidOpenType(String androidOpenType) {
        this.androidOpenType = androidOpenType;
        return this;
    }
    public String getAndroidOpenType() {
        return this.androidOpenType;
    }

    public PushShrinkRequest setAndroidOpenUrl(String androidOpenUrl) {
        this.androidOpenUrl = androidOpenUrl;
        return this;
    }
    public String getAndroidOpenUrl() {
        return this.androidOpenUrl;
    }

    public PushShrinkRequest setAndroidOppoDeleteIntentData(String androidOppoDeleteIntentData) {
        this.androidOppoDeleteIntentData = androidOppoDeleteIntentData;
        return this;
    }
    public String getAndroidOppoDeleteIntentData() {
        return this.androidOppoDeleteIntentData;
    }

    public PushShrinkRequest setAndroidOppoIntelligentIntent(String androidOppoIntelligentIntent) {
        this.androidOppoIntelligentIntent = androidOppoIntelligentIntent;
        return this;
    }
    public String getAndroidOppoIntelligentIntent() {
        return this.androidOppoIntelligentIntent;
    }

    public PushShrinkRequest setAndroidOppoIntentEnv(Integer androidOppoIntentEnv) {
        this.androidOppoIntentEnv = androidOppoIntentEnv;
        return this;
    }
    public Integer getAndroidOppoIntentEnv() {
        return this.androidOppoIntentEnv;
    }

    public PushShrinkRequest setAndroidOppoPrivateContentParametersShrink(String androidOppoPrivateContentParametersShrink) {
        this.androidOppoPrivateContentParametersShrink = androidOppoPrivateContentParametersShrink;
        return this;
    }
    public String getAndroidOppoPrivateContentParametersShrink() {
        return this.androidOppoPrivateContentParametersShrink;
    }

    public PushShrinkRequest setAndroidOppoPrivateMsgTemplateId(String androidOppoPrivateMsgTemplateId) {
        this.androidOppoPrivateMsgTemplateId = androidOppoPrivateMsgTemplateId;
        return this;
    }
    public String getAndroidOppoPrivateMsgTemplateId() {
        return this.androidOppoPrivateMsgTemplateId;
    }

    public PushShrinkRequest setAndroidOppoPrivateTitleParametersShrink(String androidOppoPrivateTitleParametersShrink) {
        this.androidOppoPrivateTitleParametersShrink = androidOppoPrivateTitleParametersShrink;
        return this;
    }
    public String getAndroidOppoPrivateTitleParametersShrink() {
        return this.androidOppoPrivateTitleParametersShrink;
    }

    public PushShrinkRequest setAndroidPopupActivity(String androidPopupActivity) {
        this.androidPopupActivity = androidPopupActivity;
        return this;
    }
    public String getAndroidPopupActivity() {
        return this.androidPopupActivity;
    }

    public PushShrinkRequest setAndroidPopupBody(String androidPopupBody) {
        this.androidPopupBody = androidPopupBody;
        return this;
    }
    public String getAndroidPopupBody() {
        return this.androidPopupBody;
    }

    public PushShrinkRequest setAndroidPopupTitle(String androidPopupTitle) {
        this.androidPopupTitle = androidPopupTitle;
        return this;
    }
    public String getAndroidPopupTitle() {
        return this.androidPopupTitle;
    }

    public PushShrinkRequest setAndroidRemind(Boolean androidRemind) {
        this.androidRemind = androidRemind;
        return this;
    }
    public Boolean getAndroidRemind() {
        return this.androidRemind;
    }

    public PushShrinkRequest setAndroidRenderStyle(Integer androidRenderStyle) {
        this.androidRenderStyle = androidRenderStyle;
        return this;
    }
    public Integer getAndroidRenderStyle() {
        return this.androidRenderStyle;
    }

    public PushShrinkRequest setAndroidTargetUserType(Integer androidTargetUserType) {
        this.androidTargetUserType = androidTargetUserType;
        return this;
    }
    public Integer getAndroidTargetUserType() {
        return this.androidTargetUserType;
    }

    public PushShrinkRequest setAndroidVivoLiveMessage(String androidVivoLiveMessage) {
        this.androidVivoLiveMessage = androidVivoLiveMessage;
        return this;
    }
    public String getAndroidVivoLiveMessage() {
        return this.androidVivoLiveMessage;
    }

    public PushShrinkRequest setAndroidVivoPushMode(Integer androidVivoPushMode) {
        this.androidVivoPushMode = androidVivoPushMode;
        return this;
    }
    public Integer getAndroidVivoPushMode() {
        return this.androidVivoPushMode;
    }

    public PushShrinkRequest setAndroidVivoReceiptId(String androidVivoReceiptId) {
        this.androidVivoReceiptId = androidVivoReceiptId;
        return this;
    }
    public String getAndroidVivoReceiptId() {
        return this.androidVivoReceiptId;
    }

    @Deprecated
    public PushShrinkRequest setAndroidXiaoMiActivity(String androidXiaoMiActivity) {
        this.androidXiaoMiActivity = androidXiaoMiActivity;
        return this;
    }
    public String getAndroidXiaoMiActivity() {
        return this.androidXiaoMiActivity;
    }

    @Deprecated
    public PushShrinkRequest setAndroidXiaoMiNotifyBody(String androidXiaoMiNotifyBody) {
        this.androidXiaoMiNotifyBody = androidXiaoMiNotifyBody;
        return this;
    }
    public String getAndroidXiaoMiNotifyBody() {
        return this.androidXiaoMiNotifyBody;
    }

    @Deprecated
    public PushShrinkRequest setAndroidXiaoMiNotifyTitle(String androidXiaoMiNotifyTitle) {
        this.androidXiaoMiNotifyTitle = androidXiaoMiNotifyTitle;
        return this;
    }
    public String getAndroidXiaoMiNotifyTitle() {
        return this.androidXiaoMiNotifyTitle;
    }

    @Deprecated
    public PushShrinkRequest setAndroidXiaomiBigPictureUrl(String androidXiaomiBigPictureUrl) {
        this.androidXiaomiBigPictureUrl = androidXiaomiBigPictureUrl;
        return this;
    }
    public String getAndroidXiaomiBigPictureUrl() {
        return this.androidXiaomiBigPictureUrl;
    }

    public PushShrinkRequest setAndroidXiaomiFocusParam(String androidXiaomiFocusParam) {
        this.androidXiaomiFocusParam = androidXiaomiFocusParam;
        return this;
    }
    public String getAndroidXiaomiFocusParam() {
        return this.androidXiaomiFocusParam;
    }

    public PushShrinkRequest setAndroidXiaomiFocusPics(String androidXiaomiFocusPics) {
        this.androidXiaomiFocusPics = androidXiaomiFocusPics;
        return this;
    }
    public String getAndroidXiaomiFocusPics() {
        return this.androidXiaomiFocusPics;
    }

    @Deprecated
    public PushShrinkRequest setAndroidXiaomiImageUrl(String androidXiaomiImageUrl) {
        this.androidXiaomiImageUrl = androidXiaomiImageUrl;
        return this;
    }
    public String getAndroidXiaomiImageUrl() {
        return this.androidXiaomiImageUrl;
    }

    public PushShrinkRequest setAndroidXiaomiTemplateId(String androidXiaomiTemplateId) {
        this.androidXiaomiTemplateId = androidXiaomiTemplateId;
        return this;
    }
    public String getAndroidXiaomiTemplateId() {
        return this.androidXiaomiTemplateId;
    }

    public PushShrinkRequest setAndroidXiaomiTemplateParams(String androidXiaomiTemplateParams) {
        this.androidXiaomiTemplateParams = androidXiaomiTemplateParams;
        return this;
    }
    public String getAndroidXiaomiTemplateParams() {
        return this.androidXiaomiTemplateParams;
    }

    public PushShrinkRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public PushShrinkRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PushShrinkRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public PushShrinkRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public PushShrinkRequest setHarmonyAction(String harmonyAction) {
        this.harmonyAction = harmonyAction;
        return this;
    }
    public String getHarmonyAction() {
        return this.harmonyAction;
    }

    public PushShrinkRequest setHarmonyActionType(String harmonyActionType) {
        this.harmonyActionType = harmonyActionType;
        return this;
    }
    public String getHarmonyActionType() {
        return this.harmonyActionType;
    }

    public PushShrinkRequest setHarmonyBadgeAddNum(Integer harmonyBadgeAddNum) {
        this.harmonyBadgeAddNum = harmonyBadgeAddNum;
        return this;
    }
    public Integer getHarmonyBadgeAddNum() {
        return this.harmonyBadgeAddNum;
    }

    public PushShrinkRequest setHarmonyBadgeSetNum(Integer harmonyBadgeSetNum) {
        this.harmonyBadgeSetNum = harmonyBadgeSetNum;
        return this;
    }
    public Integer getHarmonyBadgeSetNum() {
        return this.harmonyBadgeSetNum;
    }

    public PushShrinkRequest setHarmonyCategory(String harmonyCategory) {
        this.harmonyCategory = harmonyCategory;
        return this;
    }
    public String getHarmonyCategory() {
        return this.harmonyCategory;
    }

    public PushShrinkRequest setHarmonyExtParameters(String harmonyExtParameters) {
        this.harmonyExtParameters = harmonyExtParameters;
        return this;
    }
    public String getHarmonyExtParameters() {
        return this.harmonyExtParameters;
    }

    public PushShrinkRequest setHarmonyExtensionExtraData(String harmonyExtensionExtraData) {
        this.harmonyExtensionExtraData = harmonyExtensionExtraData;
        return this;
    }
    public String getHarmonyExtensionExtraData() {
        return this.harmonyExtensionExtraData;
    }

    public PushShrinkRequest setHarmonyExtensionPush(Boolean harmonyExtensionPush) {
        this.harmonyExtensionPush = harmonyExtensionPush;
        return this;
    }
    public Boolean getHarmonyExtensionPush() {
        return this.harmonyExtensionPush;
    }

    public PushShrinkRequest setHarmonyImageUrl(String harmonyImageUrl) {
        this.harmonyImageUrl = harmonyImageUrl;
        return this;
    }
    public String getHarmonyImageUrl() {
        return this.harmonyImageUrl;
    }

    public PushShrinkRequest setHarmonyInboxContent(String harmonyInboxContent) {
        this.harmonyInboxContent = harmonyInboxContent;
        return this;
    }
    public String getHarmonyInboxContent() {
        return this.harmonyInboxContent;
    }

    public PushShrinkRequest setHarmonyLiveViewPayload(String harmonyLiveViewPayload) {
        this.harmonyLiveViewPayload = harmonyLiveViewPayload;
        return this;
    }
    public String getHarmonyLiveViewPayload() {
        return this.harmonyLiveViewPayload;
    }

    public PushShrinkRequest setHarmonyNotificationSlotType(String harmonyNotificationSlotType) {
        this.harmonyNotificationSlotType = harmonyNotificationSlotType;
        return this;
    }
    public String getHarmonyNotificationSlotType() {
        return this.harmonyNotificationSlotType;
    }

    public PushShrinkRequest setHarmonyNotifyId(Integer harmonyNotifyId) {
        this.harmonyNotifyId = harmonyNotifyId;
        return this;
    }
    public Integer getHarmonyNotifyId() {
        return this.harmonyNotifyId;
    }

    public PushShrinkRequest setHarmonyReceiptId(String harmonyReceiptId) {
        this.harmonyReceiptId = harmonyReceiptId;
        return this;
    }
    public String getHarmonyReceiptId() {
        return this.harmonyReceiptId;
    }

    public PushShrinkRequest setHarmonyRemind(Boolean harmonyRemind) {
        this.harmonyRemind = harmonyRemind;
        return this;
    }
    public Boolean getHarmonyRemind() {
        return this.harmonyRemind;
    }

    public PushShrinkRequest setHarmonyRemindBody(String harmonyRemindBody) {
        this.harmonyRemindBody = harmonyRemindBody;
        return this;
    }
    public String getHarmonyRemindBody() {
        return this.harmonyRemindBody;
    }

    public PushShrinkRequest setHarmonyRemindTitle(String harmonyRemindTitle) {
        this.harmonyRemindTitle = harmonyRemindTitle;
        return this;
    }
    public String getHarmonyRemindTitle() {
        return this.harmonyRemindTitle;
    }

    public PushShrinkRequest setHarmonyRenderStyle(String harmonyRenderStyle) {
        this.harmonyRenderStyle = harmonyRenderStyle;
        return this;
    }
    public String getHarmonyRenderStyle() {
        return this.harmonyRenderStyle;
    }

    public PushShrinkRequest setHarmonyTestMessage(Boolean harmonyTestMessage) {
        this.harmonyTestMessage = harmonyTestMessage;
        return this;
    }
    public Boolean getHarmonyTestMessage() {
        return this.harmonyTestMessage;
    }

    public PushShrinkRequest setHarmonyUri(String harmonyUri) {
        this.harmonyUri = harmonyUri;
        return this;
    }
    public String getHarmonyUri() {
        return this.harmonyUri;
    }

    public PushShrinkRequest setIdempotentToken(String idempotentToken) {
        this.idempotentToken = idempotentToken;
        return this;
    }
    public String getIdempotentToken() {
        return this.idempotentToken;
    }

    public PushShrinkRequest setJobKey(String jobKey) {
        this.jobKey = jobKey;
        return this;
    }
    public String getJobKey() {
        return this.jobKey;
    }

    public PushShrinkRequest setPushTime(String pushTime) {
        this.pushTime = pushTime;
        return this;
    }
    public String getPushTime() {
        return this.pushTime;
    }

    public PushShrinkRequest setPushType(String pushType) {
        this.pushType = pushType;
        return this;
    }
    public String getPushType() {
        return this.pushType;
    }

    public PushShrinkRequest setSendChannels(String sendChannels) {
        this.sendChannels = sendChannels;
        return this;
    }
    public String getSendChannels() {
        return this.sendChannels;
    }

    @Deprecated
    public PushShrinkRequest setSendSpeed(Integer sendSpeed) {
        this.sendSpeed = sendSpeed;
        return this;
    }
    public Integer getSendSpeed() {
        return this.sendSpeed;
    }

    public PushShrinkRequest setSmsDelaySecs(Integer smsDelaySecs) {
        this.smsDelaySecs = smsDelaySecs;
        return this;
    }
    public Integer getSmsDelaySecs() {
        return this.smsDelaySecs;
    }

    public PushShrinkRequest setSmsParams(String smsParams) {
        this.smsParams = smsParams;
        return this;
    }
    public String getSmsParams() {
        return this.smsParams;
    }

    public PushShrinkRequest setSmsSendPolicy(Integer smsSendPolicy) {
        this.smsSendPolicy = smsSendPolicy;
        return this;
    }
    public Integer getSmsSendPolicy() {
        return this.smsSendPolicy;
    }

    public PushShrinkRequest setSmsSignName(String smsSignName) {
        this.smsSignName = smsSignName;
        return this;
    }
    public String getSmsSignName() {
        return this.smsSignName;
    }

    public PushShrinkRequest setSmsTemplateName(String smsTemplateName) {
        this.smsTemplateName = smsTemplateName;
        return this;
    }
    public String getSmsTemplateName() {
        return this.smsTemplateName;
    }

    public PushShrinkRequest setStoreOffline(Boolean storeOffline) {
        this.storeOffline = storeOffline;
        return this;
    }
    public Boolean getStoreOffline() {
        return this.storeOffline;
    }

    public PushShrinkRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public PushShrinkRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

    public PushShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public PushShrinkRequest setTrim(Boolean trim) {
        this.trim = trim;
        return this;
    }
    public Boolean getTrim() {
        return this.trim;
    }

    public PushShrinkRequest setIOSApnsEnv(String iOSApnsEnv) {
        this.iOSApnsEnv = iOSApnsEnv;
        return this;
    }
    public String getIOSApnsEnv() {
        return this.iOSApnsEnv;
    }

    public PushShrinkRequest setIOSBadge(Integer iOSBadge) {
        this.iOSBadge = iOSBadge;
        return this;
    }
    public Integer getIOSBadge() {
        return this.iOSBadge;
    }

    public PushShrinkRequest setIOSBadgeAutoIncrement(Boolean iOSBadgeAutoIncrement) {
        this.iOSBadgeAutoIncrement = iOSBadgeAutoIncrement;
        return this;
    }
    public Boolean getIOSBadgeAutoIncrement() {
        return this.iOSBadgeAutoIncrement;
    }

    public PushShrinkRequest setIOSExtParameters(String iOSExtParameters) {
        this.iOSExtParameters = iOSExtParameters;
        return this;
    }
    public String getIOSExtParameters() {
        return this.iOSExtParameters;
    }

    public PushShrinkRequest setIOSInterruptionLevel(String iOSInterruptionLevel) {
        this.iOSInterruptionLevel = iOSInterruptionLevel;
        return this;
    }
    public String getIOSInterruptionLevel() {
        return this.iOSInterruptionLevel;
    }

    public PushShrinkRequest setIOSLiveActivityAttributes(String iOSLiveActivityAttributes) {
        this.iOSLiveActivityAttributes = iOSLiveActivityAttributes;
        return this;
    }
    public String getIOSLiveActivityAttributes() {
        return this.iOSLiveActivityAttributes;
    }

    public PushShrinkRequest setIOSLiveActivityAttributesType(String iOSLiveActivityAttributesType) {
        this.iOSLiveActivityAttributesType = iOSLiveActivityAttributesType;
        return this;
    }
    public String getIOSLiveActivityAttributesType() {
        return this.iOSLiveActivityAttributesType;
    }

    public PushShrinkRequest setIOSLiveActivityContentState(String iOSLiveActivityContentState) {
        this.iOSLiveActivityContentState = iOSLiveActivityContentState;
        return this;
    }
    public String getIOSLiveActivityContentState() {
        return this.iOSLiveActivityContentState;
    }

    public PushShrinkRequest setIOSLiveActivityDismissalDate(Long iOSLiveActivityDismissalDate) {
        this.iOSLiveActivityDismissalDate = iOSLiveActivityDismissalDate;
        return this;
    }
    public Long getIOSLiveActivityDismissalDate() {
        return this.iOSLiveActivityDismissalDate;
    }

    public PushShrinkRequest setIOSLiveActivityEvent(String iOSLiveActivityEvent) {
        this.iOSLiveActivityEvent = iOSLiveActivityEvent;
        return this;
    }
    public String getIOSLiveActivityEvent() {
        return this.iOSLiveActivityEvent;
    }

    public PushShrinkRequest setIOSLiveActivityId(String iOSLiveActivityId) {
        this.iOSLiveActivityId = iOSLiveActivityId;
        return this;
    }
    public String getIOSLiveActivityId() {
        return this.iOSLiveActivityId;
    }

    public PushShrinkRequest setIOSLiveActivityStaleDate(Long iOSLiveActivityStaleDate) {
        this.iOSLiveActivityStaleDate = iOSLiveActivityStaleDate;
        return this;
    }
    public Long getIOSLiveActivityStaleDate() {
        return this.iOSLiveActivityStaleDate;
    }

    public PushShrinkRequest setIOSMusic(String iOSMusic) {
        this.iOSMusic = iOSMusic;
        return this;
    }
    public String getIOSMusic() {
        return this.iOSMusic;
    }

    public PushShrinkRequest setIOSMutableContent(Boolean iOSMutableContent) {
        this.iOSMutableContent = iOSMutableContent;
        return this;
    }
    public Boolean getIOSMutableContent() {
        return this.iOSMutableContent;
    }

    public PushShrinkRequest setIOSNotificationCategory(String iOSNotificationCategory) {
        this.iOSNotificationCategory = iOSNotificationCategory;
        return this;
    }
    public String getIOSNotificationCategory() {
        return this.iOSNotificationCategory;
    }

    public PushShrinkRequest setIOSNotificationCollapseId(String iOSNotificationCollapseId) {
        this.iOSNotificationCollapseId = iOSNotificationCollapseId;
        return this;
    }
    public String getIOSNotificationCollapseId() {
        return this.iOSNotificationCollapseId;
    }

    public PushShrinkRequest setIOSNotificationThreadId(String iOSNotificationThreadId) {
        this.iOSNotificationThreadId = iOSNotificationThreadId;
        return this;
    }
    public String getIOSNotificationThreadId() {
        return this.iOSNotificationThreadId;
    }

    public PushShrinkRequest setIOSRelevanceScore(Double iOSRelevanceScore) {
        this.iOSRelevanceScore = iOSRelevanceScore;
        return this;
    }
    public Double getIOSRelevanceScore() {
        return this.iOSRelevanceScore;
    }

    public PushShrinkRequest setIOSRemind(Boolean iOSRemind) {
        this.iOSRemind = iOSRemind;
        return this;
    }
    public Boolean getIOSRemind() {
        return this.iOSRemind;
    }

    public PushShrinkRequest setIOSRemindBody(String iOSRemindBody) {
        this.iOSRemindBody = iOSRemindBody;
        return this;
    }
    public String getIOSRemindBody() {
        return this.iOSRemindBody;
    }

    public PushShrinkRequest setIOSSilentNotification(Boolean iOSSilentNotification) {
        this.iOSSilentNotification = iOSSilentNotification;
        return this;
    }
    public Boolean getIOSSilentNotification() {
        return this.iOSSilentNotification;
    }

    public PushShrinkRequest setIOSSubtitle(String iOSSubtitle) {
        this.iOSSubtitle = iOSSubtitle;
        return this;
    }
    public String getIOSSubtitle() {
        return this.iOSSubtitle;
    }

}
