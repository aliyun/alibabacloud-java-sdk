// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushRequest extends TeaModel {
    /**
     * <p>Specify the activity to open from the notification.</p>
     * <p>Only pass this when AndroidOpenType=&quot;Activity&quot;, e.g.: <code>com.alibaba.cloudpushdemo.bizactivity</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>com.alibaba.cloudpushdemo.bizactivity</p>
     */
    @NameInMap("AndroidActivity")
    public String androidActivity;

    /**
     * <p>Set the badge increment value, which is added to the current badge count. Value range: [1-99].</p>
     * <blockquote>
     * <p>Only effective for Huawei/Honor vendor channel push. When both AndroidBadgeAddNum and AndroidBadgeSetNum are present, AndroidBadgeSetNum takes precedence.</p>
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
     * <p>Only effective for Huawei/Honor vendor channel push.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>com.alibaba.cloudpushdemo.bizactivity</p>
     */
    @NameInMap("AndroidBadgeClass")
    public String androidBadgeClass;

    /**
     * <p>Set a fixed badge number. Value range: [0-99].</p>
     * <blockquote>
     * <p>For vendor channel push, only effective on Huawei and Honor channels. For Alibaba Cloud proprietary channel push, only effective on Huawei, Honor, and vivo devices.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("AndroidBadgeSetNum")
    public Integer androidBadgeSetNum;

    /**
     * <p>Body in long text mode. Length limit: 1000 bytes (1 Chinese character counts as 3 bytes). Subject to specific vendor channel limits when sending.</p>
     * <p>Currently supported by:</p>
     * <ul>
     * <li><p>Huawei: EMUI 10 and above</p>
     * </li>
     * <li><p>Honor: Magic UI 4.0 and above</p>
     * </li>
     * <li><p>Xiaomi: MIUI 10 and above</p>
     * </li>
     * <li><p>OPPO: ColorOS 5.0 and above</p>
     * </li>
     * <li><p>Meizu: Flyme</p>
     * </li>
     * <li><p>Proprietary channel: Android SDK 3.6.0 and above</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If not provided in long text mode, the first non-empty value from Body or AndroidPopupBody is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>示例长文本</p>
     */
    @NameInMap("AndroidBigBody")
    public String androidBigBody;

    /**
     * <p>Image URL in big picture mode. Currently supported by: Proprietary channel: Android SDK 3.6.0 and above.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
     */
    @NameInMap("AndroidBigPictureUrl")
    public String androidBigPictureUrl;

    /**
     * <p>Title in long text mode. Length limit: 200 bytes (1 Chinese character counts as 3 bytes).</p>
     * <ul>
     * <li><p>Currently only supported by the Honor channel and Huawei channel EMUI 11 and above.</p>
     * </li>
     * <li><p>If not provided in long text mode, the first non-empty value from Title or AndroidPopupTitle is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>示例长标题</p>
     */
    @NameInMap("AndroidBigTitle")
    public String androidBigTitle;

    /**
     * <p>Set the extension attributes of the notification. This attribute does not take effect when PushType is set to MESSAGE.</p>
     * <p>This parameter must be passed in JSON map format, otherwise parsing will fail.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;api_name&quot;:&quot;PushNoticeToAndroidRequest&quot;}</p>
     */
    @NameInMap("AndroidExtParameters")
    public String androidExtParameters;

    /**
     * <p>Set Honor channel notification type:</p>
     * <ul>
     * <li><strong>0</strong>: Official notification (default).</li>
     * <li><strong>1</strong>: Test notification.</li>
     * </ul>
     * <blockquote>
     * <p>Each application can send up to 1000 test notifications per day, and these are not subject to the daily per-device push limit.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AndroidHonorTargetUserType")
    public Integer androidHonorTargetUserType;

    /**
     * <p>Set Huawei Quick Notification parameter:</p>
     * <ul>
     * <li><strong>0</strong>: Send Huawei standard notification (default).</li>
     * <li><strong>1</strong>: Send Huawei Quick Notification.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AndroidHuaweiBusinessType")
    public Integer androidHuaweiBusinessType;

    /**
     * <p>JSON string of the Huawei Android Live Notification data structure <a href="https://developer.huawei.com/consumer/cn/doc/HMSCore-References/rest-live-0000001562939968#ZH-CN_TOPIC_0000001700850537__p195121620102511">LiveNotificationPayload</a>. For development integration, refer to the documentation <a href="https://help.aliyun.com/document_detail/2983768.html">Huawei Live Notification Push Guide</a>.</p>
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
     * <p>Huawei channel receipt ID. This receipt ID can be found in the receipt parameter configuration on the Huawei channel push management platform.</p>
     * <blockquote>
     * <p>If the default receipt configuration on the Huawei channel push management platform is set to the Alibaba Cloud receipt, this is not required. If not, it is recommended to configure the Huawei channel default receipt ID in the Alibaba Cloud EMAS Mobile Push console first.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RCP4C123456</p>
     */
    @NameInMap("AndroidHuaweiReceiptId")
    public String androidHuaweiReceiptId;

    /**
     * <p>Set Huawei channel notification type:</p>
     * <ul>
     * <li><strong>0</strong>: Official notification (default).</li>
     * <li><strong>1</strong>: Test notification.</li>
     * </ul>
     * <blockquote>
     * <p>Each application can send up to 500 test notifications per day, and these are not subject to the daily per-device push limit.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AndroidHuaweiTargetUserType")
    public Integer androidHuaweiTargetUserType;

    /**
     * <p>Right-side icon URL.
     * Currently supported by:</p>
     * <ul>
     * <li><p>Huawei EMUI (only applicable in long text mode and Inbox mode).</p>
     * </li>
     * <li><p>Honor Magic UI (only applicable in long text mode).</p>
     * </li>
     * <li><p>Proprietary channel: Android SDK 3.5.0 and above.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
     */
    @NameInMap("AndroidImageUrl")
    public String androidImageUrl;

    /**
     * <p>Body content in Inbox mode. The content must be a valid JSON Array with no more than 5 elements. Currently supported by:</p>
     * <ul>
     * <li>Huawei: EMUI 9 and above</li>
     * <li>Honor: Magic UI 4.0 and above</li>
     * <li>Xiaomi: MIUI 10 and above</li>
     * <li>OPPO: ColorOS 5.0 and above</li>
     * <li>Proprietary channel: Android SDK 3.6.0 and above</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;第一行&quot;,&quot;第二行&quot;]</p>
     */
    @NameInMap("AndroidInboxBody")
    public String androidInboxBody;

    /**
     * <p>Meizu message type:</p>
     * <ul>
     * <li>0: Public message (default)</li>
     * <li>1: Private message</li>
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
     * <p>Purpose 1: After completing the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835?#section3410731125514">self-classification rights application</a>, this is used to identify the message type, determine the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#ZH-CN_TOPIC_0000001149358835__p3850133955718">message notification method</a>, and accelerate delivery for specific message types. For valid values, refer to the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section1076611477914">Message Classification Standard</a> in Huawei\&quot;s official push documentation, using the &quot;Cloud notification category value&quot; or &quot;Local notification category value&quot; from the table.</p>
     * <p>Purpose 2: After <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">applying for special permissions</a>, this is used to identify high-priority transparent transmission scenarios. Valid values:</p>
     * <ul>
     * <li>VOIP: Audio/video calls</li>
     * <li>PLAY_VOICE: Voice playback</li>
     * </ul>
     * <blockquote>
     * <p>For items where &quot;Cloud notification category value&quot; is &quot;Not applicable&quot;, they are delivered through the Alibaba Cloud proprietary channel. For items where &quot;Local notification category value&quot; is &quot;Not applicable&quot;, they are delivered through the Huawei channel.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VOIP</p>
     */
    @NameInMap("AndroidMessageHuaweiCategory")
    public String androidMessageHuaweiCategory;

    /**
     * <p>Huawei channel notification delivery priority. Valid values:</p>
     * <ul>
     * <li><strong>HIGH</strong></li>
     * <li><strong>NORMAL</strong></li>
     * </ul>
     * <p>Requires permission application. For details, see: <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">Application Link</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>HIGH</p>
     */
    @NameInMap("AndroidMessageHuaweiUrgency")
    public String androidMessageHuaweiUrgency;

    /**
     * <p>OPPO classifies messages into two categories for management: Communication &amp; Service, and Content &amp; Marketing.</p>
     * <p>Communication &amp; Service (requires permission application):</p>
     * <ul>
     * <li>IM: Instant messaging, audio, video calls</li>
     * <li>ACCOUNT: Personal account and asset changes</li>
     * <li>DEVICE_REMINDER: Personal device reminders</li>
     * <li>ORDER: Personal order/logistics status changes</li>
     * <li>TODO: Personal schedules/to-dos</li>
     * <li>SUBSCRIPTION: Personal subscriptions</li>
     * </ul>
     * <p>Content &amp; Marketing:</p>
     * <ul>
     * <li>NEWS: News and information</li>
     * <li>CONTENT: Content recommendations</li>
     * <li>MARKETING: Platform promotions</li>
     * <li>SOCIAL: Social updates</li>
     * </ul>
     * <p>For details, refer to <a href="https://open.oppomobile.com/new/developmentDoc/info?id=13189">OPUSH Message Classification Rules</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>MARKETING</p>
     */
    @NameInMap("AndroidMessageOppoCategory")
    public String androidMessageOppoCategory;

    /**
     * <p>OPPO channel notification bar message notification level. Valid values:</p>
     * <ul>
     * <li>1: Notification bar</li>
     * <li>2: Notification bar, lock screen, ringtone, vibration (default notification level for Communication &amp; Service messages)</li>
     * <li>16: Notification bar, lock screen, ringtone, vibration, banner (requires permission application)</li>
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
     * <p>vivo classifies messages into two categories for management: System messages and Operational messages.
     * System messages:</p>
     * <ul>
     * <li>IM: Instant messages</li>
     * <li>ACCOUNT: Accounts and assets</li>
     * <li>TODO: Schedules and to-dos</li>
     * <li>DEVICE_REMINDER: Device information</li>
     * <li>ORDER: Orders and logistics</li>
     * <li>SUBSCRIPTION: Subscription reminders</li>
     * </ul>
     * <p>Operational messages:</p>
     * <ul>
     * <li>NEWS: News</li>
     * <li>CONTENT: Content recommendations</li>
     * <li>MARKETING: Operational promotions</li>
     * <li>SOCIAL: Social updates</li>
     * </ul>
     * <p>For details, refer to <a href="https://dev.vivo.com.cn/documentCenter/doc/359#s-ef3qugc3">Classification Description</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>TODO</p>
     */
    @NameInMap("AndroidMessageVivoCategory")
    public String androidMessageVivoCategory;

    /**
     * <p>Huawei vendor channel notification sound. Specify the name of an audio file stored in the client project\&quot;s app/src/main/res/raw/ directory, without the file extension.</p>
     * <p>If not set, the default ringtone is used.</p>
     * 
     * <strong>example:</strong>
     * <p>alicloud_notification_sound</p>
     */
    @NameInMap("AndroidMusic")
    public String androidMusic;

    /**
     * <p>Priority of the Android notification position in the notification bar. Valid values: -2, -1, 0, 1, 2.</p>
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
     * <p>The channelId of the Android app, which must correspond to the channelId in the app.</p>
     * <ul>
     * <li>Set the NotificationChannel parameter. For specific usage, see <a href="https://help.aliyun.com/document_detail/67398.html">FAQ: Notifications Not Received on Android 8.0+ Devices</a>.</li>
     * <li>Since the OPPO private message channel\&quot;s channel_id is the same as the app\&quot;s channelId, the channel_id for OPPO channel push takes this value.</li>
     * <li>For Huawei, FCM, and Alibaba Cloud proprietary channel push, the channel_id takes this value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AndroidNotificationChannel")
    public String androidNotificationChannel;

    /**
     * <p>Message grouping. Messages in the same group are displayed as only the latest one in the notification bar along with the total count of messages received for that group. All messages are not shown and cannot be expanded. Currently supported by:</p>
     * <ul>
     * <li>Huawei vendor channel</li>
     * <li>Honor vendor channel</li>
     * <li>Proprietary channel: Android SDK 3.9.1 and below</li>
     * </ul>
     * <blockquote>
     * <p>The proprietary channel no longer supports this parameter on Android SDK 3.9.2 and above.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>group-1</p>
     */
    @NameInMap("AndroidNotificationGroup")
    public String androidNotificationGroup;

    /**
     * <p>Set the Honor notification message classification importance parameter, which determines notification behavior on user devices. Valid values:</p>
     * <ul>
     * <li><strong>LOW</strong>: Information and marketing messages</li>
     * <li><strong>NORMAL</strong>: Service and communication messages</li>
     * </ul>
     * <p>Requires application on the Honor platform. <a href="https://developer.honor.com/cn/docs/11002/guides/notification-class#%E8%87%AA%E5%88%86%E7%B1%BB%E6%9D%83%E7%9B%8A%E7%94%B3%E8%AF%B7">Application Link</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>LOW</p>
     */
    @NameInMap("AndroidNotificationHonorChannel")
    public String androidNotificationHonorChannel;

    /**
     * <p>Set the Huawei notification message classification importance parameter, which determines notification behavior on user devices. Valid values:</p>
     * <ul>
     * <li>LOW: Information and marketing messages</li>
     * <li>NORMAL: Service and communication messages</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Huawei channel currently recommends using AndroidMessageHuaweiCategory for notification classification. AndroidNotificationHuaweiChannel is no longer required.</li>
     * <li>Requires application on the Huawei platform. <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section893184112272">Application Link</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>LOW</p>
     */
    @NameInMap("AndroidNotificationHuaweiChannel")
    public String androidNotificationHuaweiChannel;

    /**
     * <p>Unique identifier for each message when displayed in the notification bar. Different notification bar messages can share the same NotifyId, allowing new notifications to replace old ones.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("AndroidNotificationNotifyId")
    public Integer androidNotificationNotifyId;

    /**
     * <p>Message grouping. Messages in the same group are collapsed in the notification bar and can be expanded. Notifications from different groups are displayed separately. Currently supported by:</p>
     * <ul>
     * <li>Proprietary channel: Android SDK 3.9.2 and above</li>
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
     * <li>vivo channel currently recommends using AndroidMessageVivoCategory for notification classification. AndroidNotificationVivoChannel is no longer required.</li>
     * <li>Requires application on the vivo platform. For details, see: <a href="https://dev.vivo.com.cn/documentCenter/doc/359">Application Link</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>classification</p>
     */
    @NameInMap("AndroidNotificationVivoChannel")
    public String androidNotificationVivoChannel;

    /**
     * <p>Set the Xiaomi notification type channelId. Requires application on the Xiaomi platform. For details, see: <a href="https://dev.mi.com/console/doc/detail?pId=2422#_4">Application Link</a>.</p>
     * <blockquote>
     * <ul>
     * <li>A single application can apply for a maximum of 8 channels on the Xiaomi channel. Please plan ahead.</li>
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
     * <p>BOTH</p>
     */
    @NameInMap("AndroidNotifyType")
    public String androidNotifyType;

    /**
     * <p>Action after clicking the notification. Valid values:</p>
     * <ul>
     * <li><strong>APPLICATION</strong>: Open the application (default)</li>
     * <li><strong>ACTIVITY</strong>: Open an Android Activity</li>
     * <li><strong>URL</strong>: Open a URL</li>
     * <li><strong>NONE</strong>: No redirect</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>APPLICATION</p>
     */
    @NameInMap("AndroidOpenType")
    public String androidOpenType;

    /**
     * <p>URL to open when Android receives the push.</p>
     * <p>Only pass this when AndroidOpenType=&quot;URL&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxx.xxx">https://xxxx.xxx</a></p>
     */
    @NameInMap("AndroidOpenUrl")
    public String androidOpenUrl;

    /**
     * <p>JSON string of the OPPO Fluid Cloud intent deletion data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13578">data</a>. When the AndroidOppoIntelligentIntent parameter is already provided, this parameter is ignored. For development integration, refer to the documentation <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud Push Guide</a>.</p>
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
     * <p>JSON string of the OPPO Fluid Cloud intent sharing data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13565">IntelligentIntent</a>. For development integration, refer to the documentation <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud Push Guide</a>.</p>
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
     * <p>Set OPPO Fluid Cloud push environment:</p>
     * <ul>
     * <li><strong>0</strong>: Production environment (default).</li>
     * <li><strong>1</strong>: Test environment.</li>
     * </ul>
     * <blockquote>
     * <p>OPPO Fluid Cloud test environment requires setting up the client environment as described in <a href="https://open.oppomobile.com/documentation/page/info?id=13590">Environment Setup</a>.</p>
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
    public java.util.Map<String, String> androidOppoPrivateContentParameters;

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
    public java.util.Map<String, String> androidOppoPrivateTitleParameters;

    /**
     * <p>Specify the Activity to navigate to after clicking the notification.</p>
     * 
     * <strong>example:</strong>
     * <p>com.alibaba.cloudpushdemo.bizactivity</p>
     */
    @NameInMap("AndroidPopupActivity")
    public String androidPopupActivity;

    /**
     * <p>Body content in supplementary popup mode. Required when the <strong>AndroidPopupActivity</strong> parameter is not empty.</p>
     * <p>Length limit: 200 characters (both Chinese and English characters count as one character).</p>
     * <p>If using vendor channels, it must also comply with vendor channel limits. For details, see: <a href="https://help.aliyun.com/document_detail/165253.html">Android Supplementary Channel Push Limits</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("AndroidPopupBody")
    public String androidPopupBody;

    /**
     * <p>Title content in supplementary popup mode. Required when the <strong>AndroidPopupActivity</strong> parameter is not empty.</p>
     * <p>Length limit: 50 characters (both Chinese and English characters count as one character).</p>
     * <p>If using vendor channels, it must also comply with vendor channel limits. For details, see: <a href="https://help.aliyun.com/document_detail/165253.html">Android Supplementary Channel Push Limits</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("AndroidPopupTitle")
    public String androidPopupTitle;

    /**
     * <p>When the push type is message and the device is offline, this push will use the supplementary popup feature. Default is false. Only effective when PushType=MESSAGE.</p>
     * <p>If the message-to-notification push is successful, the notification displays the AndroidPopupTitle and AndroidPopupBody parameter values set on the server. The data obtained in the onSysNoticeOpened method of the supplementary popup when clicking the notification is the Title and Body parameter values set on the server.</p>
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
     * <li><strong>2</strong>: Big picture mode (supported by the proprietary channel, not supported on Xiaomi devices)</li>
     * <li><strong>3</strong>: List mode (supported by Huawei, Honor, Xiaomi, OPPO, and proprietary channels)<blockquote>
     * <p>If using a non-standard mode, this parameter must be provided.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AndroidRenderStyle")
    public Integer androidRenderStyle;

    /**
     * <p>Set vendor channel notification type:</p>
     * <ul>
     * <li><strong>0</strong>: Official notification (default).</li>
     * <li><strong>1</strong>: Test notification.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>When this parameter is configured, it is equivalent to simultaneously configuring AndroidHuaweiTargetUserType, AndroidHonorTargetUserType, AndroidVivoPushMode, and AndroidOppoIntentEnv. The specific vendor channel parameters can override this parameter.</li>
     * <li>Currently supported by: Huawei channel, Honor channel, vivo channel, and OPPO Fluid Cloud.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AndroidTargetUserType")
    public Integer androidTargetUserType;

    /**
     * <p>JSON string of the vivo Atomic Island data structure <a href="https://dev.vivo.com.cn/documentCenter/doc/896#s-fdagzbd4">liveMessage</a>. For development integration, refer to the documentation <a href="https://help.aliyun.com/zh/document_detail/3030718.html">vivo Atomic Island Push Guide</a>.</p>
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
     * <p>Set vivo channel notification type:</p>
     * <ul>
     * <li><strong>0</strong>: Official push (default).</li>
     * <li><strong>1</strong>: Test push.</li>
     * </ul>
     * <blockquote>
     * <p>For test push, please configure the test device on the vivo console in advance. The test device RegId can be obtained by searching for &quot;onReceiveRegId regId&quot; in the device startup logs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AndroidVivoPushMode")
    public Integer androidVivoPushMode;

    /**
     * <p>vivo channel receipt ID. This receipt ID can be found in the application information of the push service on the vivo open platform.</p>
     * <blockquote>
     * <p>If the default receipt configuration on the vivo open platform is set to the Alibaba Cloud receipt, this is not required. If not, it is recommended to configure the vivo channel default receipt ID in the Alibaba Cloud EMAS Mobile Push console first.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("AndroidVivoReceiptId")
    public String androidVivoReceiptId;

    /**
     * <p>This parameter is deprecated. All third-party supplementary popups are now supported by the new parameter <strong>AndroidPopupActivity</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("AndroidXiaoMiActivity")
    @Deprecated
    public String androidXiaoMiActivity;

    /**
     * <p>This parameter is deprecated. All third-party supplementary popups are now supported by the new parameter <strong>AndroidPopupBody</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("AndroidXiaoMiNotifyBody")
    @Deprecated
    public String androidXiaoMiNotifyBody;

    /**
     * <p>This parameter is deprecated. All third-party supplementary popups are now supported by the new parameter <strong>AndroidPopupTitle</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("AndroidXiaoMiNotifyTitle")
    @Deprecated
    public String androidXiaoMiNotifyTitle;

    /**
     * <p>This parameter is deprecated. Starting from August 2023, Xiaomi officially no longer supports dynamically setting small icons, right-side icons, and big pictures during push on new devices/systems.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://f6.market.xiaomi.com/download/MiPass/aaa/bbb.png">https://f6.market.xiaomi.com/download/MiPass/aaa/bbb.png</a></p>
     */
    @NameInMap("AndroidXiaomiBigPictureUrl")
    @Deprecated
    public String androidXiaomiBigPictureUrl;

    /**
     * <p>JSON string of the Xiaomi Super Island data structure <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.param</a>. For development integration, refer to the documentation <a href="https://help.aliyun.com/zh/document_detail/3037956.html">Xiaomi Super Island Push Guide</a>.</p>
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
     * <p>JSON string of the Xiaomi Super Island image data <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.pic_xxx</a>. For development integration, refer to the documentation <a href="https://help.aliyun.com/zh/document_detail/3037956.html">Xiaomi Super Island Push Guide</a>.</p>
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
     * <p>This parameter is deprecated. Starting from August 2023, Xiaomi officially no longer supports dynamically setting small icons, right-side icons, and big pictures during push on new devices/systems.</p>
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
     * <p>AppKey information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>Notification content/message content for Android and HarmonyOS push; iOS message/notification content. The push content size is limited. See <a href="https://help.aliyun.com/document_detail/434629.html">Product Limits</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("Body")
    public String body;

    /**
     * <p>Device type. Valid values:</p>
     * <ul>
     * <li><strong>HARMONY</strong>: HarmonyOS device</li>
     * <li><strong>iOS</strong>: iOS device</li>
     * <li><strong>ANDROID</strong>: Android device</li>
     * <li><strong>ALL</strong>: When the AppKey is for a legacy dual-platform application, this represents pushing to both Android and iOS devices simultaneously; when the AppKey is for a new single-platform application, the effect is the same as specifying the device type corresponding to the application type.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HARMONY</p>
     */
    @NameInMap("DeviceType")
    public String deviceType;

    /**
     * <p>Expiration time for offline messages/notifications, used in conjunction with StoreOffline. Expired messages will no longer be sent. Maximum retention is 72 hours. Default is 72 hours.</p>
     * <p>The time format follows the ISO8601 standard and must use UTC time, in the format YYYY-MM-DDThh:mm:ssZ. The expiration time must be greater than the current time or the scheduled send time plus 3 seconds (<code>ExpireTime &gt; PushTime + 3 seconds</code>). The 3-second buffer accounts for network and system delay tolerance. It is recommended to set at least 1 minute for single push, and at least 10 minutes for full push or batch push.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-02-20T00:00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The action corresponding to the in-app page ability.</p>
     * <blockquote>
     * <p>Notice: When HarmonyActionType is APP_CUSTOM_PAGE, at least one of HarmonyUri and HarmonyAction must be provided.</p>
     * </blockquote>
     * <p>For details, see the HarmonyOS official documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.action</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>com.example.action</p>
     */
    @NameInMap("HarmonyAction")
    public String harmonyAction;

    /**
     * <p>Action after clicking the notification. Valid values:</p>
     * <ul>
     * <li>APP_HOME_PAGE: Open app home page</li>
     * <li>APP_CUSTOM_PAGE: Open app custom page</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>APP_HOME_PAGE</p>
     */
    @NameInMap("HarmonyActionType")
    public String harmonyActionType;

    /**
     * <p>HarmonyOS app badge increment number. Refer to <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">HarmonyOS badge addNum field description</a>.</br>
     * Supported from HarmonyOS SDK 1.2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HarmonyBadgeAddNum")
    public Integer harmonyBadgeAddNum;

    /**
     * <p>HarmonyOS app badge set number. Refer to <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">HarmonyOS badge setNum field description</a>.
     * Supported from HarmonyOS SDK 1.2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HarmonyBadgeSetNum")
    public Integer harmonyBadgeSetNum;

    /**
     * <p>Notification message category. After completing the notification message self-classification rights application, this is used to identify the message type. Different notification message types affect how messages are displayed and how alerts are triggered. Valid values:</p>
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
     * <li>MARKETING: News, content recommendations, social updates, product promotions, financial updates, lifestyle information, surveys, feature recommendations, operational promotions (only identifies content, does not accelerate message delivery), collectively referred to as information and marketing messages</li>
     * </ul>
     * <p>For details, see the HarmonyOS official documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.category</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>IM</p>
     */
    @NameInMap("HarmonyCategory")
    public String harmonyCategory;

    /**
     * <p>Set the extension attributes of the notification. This attribute does not take effect when PushType is set to MESSAGE.</p>
     * <p>This parameter must be passed in JSON map format, otherwise parsing will fail.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;api_name&quot;:&quot;PushNoticeToAndroidRequest&quot;}</p>
     */
    @NameInMap("HarmonyExtParameters")
    public String harmonyExtParameters;

    /**
     * <p>Extra data for notification extension messages.</br>
     * Effective when sending HarmonyOS notification extension messages.</br>
     * Conceptually equivalent to the extraData field of HarmonyOS notification extension messages. For the specific definition, refer to <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section161192514234">HarmonyOS ExtensionPayload Description</a>.</br>
     * Supported from HarmonyOS SDK 1.2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>示例额外数据</p>
     */
    @NameInMap("HarmonyExtensionExtraData")
    public String harmonyExtensionExtraData;

    /**
     * <p>When PushType is NOTICE, whether to send as a HarmonyOS notification extension message.</p>
     * <ul>
     * <li>true: Send notification extension message</li>
     * <li>false: Send standard notification (default)</li>
     * </ul>
     * <p>Notification extension messages require permission application on the HarmonyOS side before sending. For details, refer to the HarmonyOS documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-guides-V5/push-send-extend-noti-V5">Send Notification Extension Messages</a>.</br>
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
     * <p>Supported image formats: png, jpg, jpeg, heif, gif, bmp. Image width * height must be less than 25000 pixels.</p>
     * </blockquote>
     * <p>For details, see the HarmonyOS official documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.image</a>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/xxx.png">https://example.com/xxx.png</a></p>
     */
    @NameInMap("HarmonyImageUrl")
    public String harmonyImageUrl;

    /**
     * <p>Content for multi-line text style. Required when HarmonyRenderStyle is MULTI_LINE. Supports up to 3 items.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1.content1&quot;,&quot;2.content2&quot;,&quot;3.content3&quot;]</p>
     */
    @NameInMap("HarmonyInboxContent")
    public String harmonyInboxContent;

    /**
     * <p>JSON string of the HarmonyOS Live View data structure <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V13/push-scenariozed-api-request-param-V13#section66881469306">LiveViewPayload</a>. For development integration, refer to the documentation <a href="https://help.aliyun.com/document_detail/2982112.html">HarmonyOS Live View Push Guide</a>.</p>
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
     * <p>Use the specified notification channel type. Only effective when the Alibaba Cloud proprietary channel is online.</p>
     * <ul>
     * <li>SOCIAL_COMMUNICATION: Social communication.</li>
     * <li>SERVICE_INFORMATION: Service reminders.</li>
     * <li>CONTENT_INFORMATION: Content information.</li>
     * <li>CUSTOMER_SERVICE: Customer service messages. This type is used for customer service messages between users and merchants, and must be initiated by the user.</li>
     * <li>OTHER_TYPES: Other.</li>
     * </ul>
     * <p>For details, see the HarmonyOS official documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/js-apis-notificationmanager-V5#slottype">SlotType</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>SOCIAL_COMMUNICATION</p>
     */
    @NameInMap("HarmonyNotificationSlotType")
    public String harmonyNotificationSlotType;

    /**
     * <p>Unique identifier for each message when displayed as a notification. If not provided, the push service automatically generates a unique identifier for each message. Different notification messages can share the same notifyId, enabling the new message to replace the old one.</p>
     * <p>For details, see the HarmonyOS official documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.notifyId</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HarmonyNotifyId")
    public Integer harmonyNotifyId;

    /**
     * <p>HarmonyOS channel receipt ID. This receipt ID can be found in the receipt parameter configuration on the HarmonyOS channel push management platform.</p>
     * <blockquote>
     * <p>If the default receipt configuration on the HarmonyOS channel push management platform is set to the Alibaba Cloud receipt, this is not required. If not, it is recommended to configure the HarmonyOS channel default receipt ID in the Alibaba Cloud EMAS Mobile Push console first.</p>
     * </blockquote>
     * <p>For details, see the HarmonyOS official documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">pushOptions.receiptId</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>RCPB***DFD5</p>
     */
    @NameInMap("HarmonyReceiptId")
    public String harmonyReceiptId;

    /**
     * <p>When the push type is message and the device is offline, this push will use the supplementary popup feature. Default is false. Only effective when PushType=MESSAGE.</p>
     * <p>If the message-to-notification push is successful, the notification displays the HarmonyRemindTitle and HarmonyRemindBody parameter values set on the server.</p>
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
     * <li>false: Official message (default)</li>
     * <li>true: Test message</li>
     * </ul>
     * <p>For details, see the HarmonyOS official documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">pushOptions.testMessage</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HarmonyTestMessage")
    public Boolean harmonyTestMessage;

    /**
     * <p>The URI corresponding to the in-app page ability.</p>
     * <blockquote>
     * <p>Notice: When HarmonyActionType is APP_CUSTOM_PAGE, at least one of HarmonyUri and HarmonyAction must be provided. When multiple Abilities exist, fill in the action and uri of each Ability separately. The action is used first to find the corresponding in-app page.</p>
     * </blockquote>
     * <p>For details, see the HarmonyOS official documentation <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.uri</a>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.example.com:8080/push/example">https://www.example.com:8080/push/example</a></p>
     */
    @NameInMap("HarmonyUri")
    public String harmonyUri;

    /**
     * <p>An idempotent parameter to prevent duplicate pushes caused by API client retries. When the same IdempotentToken is used for calls within 15 minutes, only one push will be made, and subsequent calls will return the result of the first successful push.</p>
     * <blockquote>
     * <ul>
     * <li>The parameter format is a standard 36-character UUID (8-4-4-4-12). Each valid character is a hexadecimal digit in the range 0-9 or a-f, case-insensitive.</li>
     * <li>This parameter is only used to prevent duplicate pushes caused by retries. It cannot prevent duplicate pushes caused by concurrent calls.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c8016d13-6e76-410c-9bda-769383d11787</p>
     */
    @NameInMap("IdempotentToken")
    public String idempotentToken;

    /**
     * <p>Custom identifier for the push task. When JobKey is not empty, the receipt log will include this field. For viewing receipt logs, see <a href="https://help.aliyun.com/document_detail/434651.html">Receipt Logs</a>.</p>
     * <blockquote>
     * <p>Format requirements: Only letters, digits, or the symbols \&quot;_\&quot; and \&quot;-\&quot; (any combination) are allowed, and the length must not exceed 32 characters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("JobKey")
    public String jobKey;

    /**
     * <p>Used for scheduled sending. If not set, the default is immediate sending.
     * Scheduled sending must be no later than 7 days from now.</p>
     * <p>The time format follows the ISO8601 standard and must use UTC time, in the format YYYY-MM-DDThh:mm:ssZ.</p>
     * <blockquote>
     * <p>When Target is TBD (continuous push), scheduled sending is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-02-20T00:00:00Z</p>
     */
    @NameInMap("PushTime")
    public String pushTime;

    /**
     * <p>Push type. Valid values:</p>
     * <ul>
     * <li><strong>NOTICE</strong>: Notification. Notifications are delivered to devices through vendor channels such as APNs, Huawei, Xiaomi, and HarmonyOS, and are displayed directly in the device notification bar. When an Android device is online (app process is alive), the notification is preferentially delivered through the Alibaba Cloud proprietary channel, where the Push SDK constructs and displays the notification, providing better push performance and potentially saving vendor push message quotas in some scenarios.</li>
     * <li><strong>MESSAGE</strong>: Message. Messages are delivered through the Alibaba Cloud proprietary online channel. They are not displayed in the notification bar by default, but need to be received and processed by the app when the process is active, allowing the business to decide whether to trigger certain business behaviors. When the device is offline (app process is inactive), messages cannot be received in a timely manner. In this case, you can use the <code>iOSRemind</code> or <code>AndroidRemind</code> parameters below to convert messages to notifications when the device is offline; or set the <code>StoreOffline</code> parameter below so the push system saves the message when the device is offline and automatically delivers it when the device comes online.</li>
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
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SendSpeed")
    @Deprecated
    public Integer sendSpeed;

    /**
     * <p>Delay time before triggering SMS, in seconds.</p>
     * <p>Must be set when using SMS convergence. Recommended to be 15 seconds or more, with a maximum of 3 days, to avoid duplication between SMS and push notifications.</p>
     * <blockquote>
     * <p>When SMS convergence is used, the ExpireTime parameter becomes ineffective. The notification expiration time is calculated based on the SmsDelaySecs parameter, with the expiration time being the current time plus SmsDelaySecs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("SmsDelaySecs")
    public Integer smsDelaySecs;

    /**
     * <p>Variable name-value pairs for the SMS template, in the format: <code>key1=value1&amp;key2=value2</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>key1=value1</p>
     */
    @NameInMap("SmsParams")
    public String smsParams;

    /**
     * <p>Condition for triggering SMS. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Triggered when push is not received.</li>
     * <li><strong>1</strong>: Triggered when user has not opened the notification.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SmsSendPolicy")
    public Integer smsSendPolicy;

    /**
     * <p>The signature for supplementary SMS.</p>
     * 
     * <strong>example:</strong>
     * <p>短信签名</p>
     */
    @NameInMap("SmsSignName")
    public String smsSignName;

    /**
     * <p>The template name for supplementary SMS. This can be obtained from the SMS template management page and is a system-assigned name, not a developer-defined name.</p>
     * 
     * <strong>example:</strong>
     * <p>短信模板名称</p>
     */
    @NameInMap("SmsTemplateName")
    public String smsTemplateName;

    /**
     * <p>Whether to store offline messages/notifications. StoreOffline defaults to <strong>false</strong>.</p>
     * <p>If enabled, when the user is offline during push, the message will be resent when the user comes online within the expiration time (ExpireTime). ExpireTime defaults to 72 hours. iOS notifications go through the APNs channel and are not affected by StoreOffline.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("StoreOffline")
    public Boolean storeOffline;

    /**
     * <p>Push target. Valid values:</p>
     * <ul>
     * <li><strong>DEVICE</strong>: Push by device.</li>
     * <li><strong>ACCOUNT</strong>: Push by account.</li>
     * <li><strong>ALIAS</strong>: Push by alias.</li>
     * <li><strong>TAG</strong>: Push by tag.</li>
     * <li><strong>ALL</strong>: Push to all devices (the interval between two full pushes of the same DeviceType must be at least 1 second).<blockquote>
     * <p>Pushing to all iOS devices will push to devices that have been active within the last 24 months but have not uninstalled the app. Once APNs (Apple Push Notification service) receives the push request without returning an error, it is considered delivered, which may cause a surge in active device counts and generate significant costs. Please use with discretion.</p>
     * </blockquote>
     * </li>
     * <li><strong>TBD</strong>: Initialize continuous push. The push target is specified by the subsequent <a href="https://help.aliyun.com/document_detail/2249917.html">ContinuouslyPush</a> API.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>Set based on the Target type. Multiple values are separated by commas. If the limit is exceeded, split into multiple pushes.</p>
     * <ul>
     * <li>Target=DEVICE: Values such as <code>deviceid1,deviceid2</code> (up to 1000).</li>
     * <li>Target=ACCOUNT: Values such as <code>account1,account2</code> (up to 1000).</li>
     * <li>Target=ALIAS: Values such as <code>alias1,alias2</code> (up to 1000).</li>
     * <li>Target=TAG: Supports single and multiple tags. For the format, see <a href="https://help.aliyun.com/document_detail/434847.html">Tag Format</a>.</li>
     * <li>Target=ALL: Value is <strong>ALL</strong> (fixed parameter for full push).</li>
     * <li>Target=TBD: Value is <strong>TBD</strong> (fixed parameter for continuous push).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("TargetValue")
    public String targetValue;

    /**
     * <p>Title of the notification/message during push. Length limit: 200 bytes.</p>
     * <p>Required for Android and HarmonyOS push; optional for iOS notifications. If provided:</p>
     * <ul>
     * <li><p>iOS 10+: Displayed as the notification title.</p>
     * </li>
     * <li><p>iOS 8.2 &lt;= iOS version &lt; iOS 10: Replaces the notification app name.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>Whether to automatically truncate overly long titles and content.</p>
     * <blockquote>
     * <p>Only applies to vendor channels that explicitly limit title and content length. Does not apply to APNs, Huawei, Honor, and other channels that do not limit title or content individually but only limit the total request body size.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Trim")
    public Boolean trim;

    /**
     * <p>iOS notifications are sent through the APNs center, and the corresponding environment information must be provided.</p>
     * <ul>
     * <li><strong>DEV</strong>: Development environment, applicable to apps installed and debugged directly via Xcode.</li>
     * <li><strong>PRODUCT</strong>: Production environment, applicable to apps distributed via App Store, TestFlight, Ad Hoc, and enterprise distribution.</li>
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
     * <p>Whether to enable badge auto-increment. Default is false.</p>
     * <blockquote>
     * <p>When this is set to true, iOSBadge must be empty.</p>
     * </blockquote>
     * <p>The badge auto-increment feature is maintained by the push server for each device\&quot;s badge count. Users must use SDK version 1.9.5 or above and actively sync the badge count to the server.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("iOSBadgeAutoIncrement")
    public Boolean iOSBadgeAutoIncrement;

    /**
     * <p>Extension attributes for iOS notifications.</p>
     * <p>For iOS 10+, you can specify the resource URL for rich media push notifications here: <code>{&quot;attachment&quot;: &quot;https://xxxx.xxx/notification_pic.png&quot;}</code>. This parameter must be passed in JSON map format, otherwise parsing will fail.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;attachment&quot;: &quot;<a href="https://xxxx.xxx/notification_pic.png%22%7D">https://xxxx.xxx/notification_pic.png&quot;}</a></p>
     */
    @NameInMap("iOSExtParameters")
    public String iOSExtParameters;

    /**
     * <p>Interruption level. Valid values:</p>
     * <ul>
     * <li><strong>passive</strong>: The system adds the notification to the notification list without lighting up the screen or playing a sound.</li>
     * <li><strong>active</strong>: The system displays the notification immediately, lights up the screen, and can play a sound.</li>
     * <li><strong>time-sensitive</strong>: The system displays the notification immediately, lights up the screen, and can play a sound, but does not break through system notification controls.</li>
     * <li><strong>critical</strong>: The system displays the notification immediately, lights up the screen, and plays a sound bypassing the silent switch.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("iOSInterruptionLevel")
    public String iOSInterruptionLevel;

    /**
     * <p>JSON string, static parameters for Live Activity (Dynamic Island) push. Contains static user-defined information such as product IDs and order information.</p>
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
     * <p>Dynamic parameters for Live Activity (Dynamic Island) push, containing real-time update information such as price and inventory changes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;status&quot;: &quot;delivered&quot;, &quot;estimatedArrival&quot;: &quot;2023-12-31T12:00:00Z&quot;}</p>
     */
    @NameInMap("iOSLiveActivityContentState")
    public String iOSLiveActivityContentState;

    /**
     * <p>Timestamp in seconds. The ended Live Activity will remain on the lock screen until this specified time, with a maximum of 4 hours.</p>
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
     * <p>The Live Activity ID reported from the device to the user\&quot;s server. The unique identifier of the Live Activity.</p>
     * 
     * <strong>example:</strong>
     * <p>66B94673-B32E-4CA7-863C-3E523054FD46</p>
     */
    @NameInMap("iOSLiveActivityId")
    public String iOSLiveActivityId;

    /**
     * <p>Timestamp in seconds. Marks the expiration time of the activity content.</p>
     * 
     * <strong>example:</strong>
     * <p>1743131967</p>
     */
    @NameInMap("iOSLiveActivityStaleDate")
    public Long iOSLiveActivityStaleDate;

    /**
     * <p>iOS notification sound. Specify the name of an audio file stored in the app bundle or the sandbox Library/Sounds directory. See: <a href="https://help.aliyun.com/document_detail/48906.html">How to Set iOS Push Notification Sound</a>.</p>
     * <p>If set to an empty string (&quot;&quot;), the notification will be silent; if not set, it defaults to the system alert sound.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("iOSMusic")
    public String iOSMusic;

    /**
     * <p>iOS notification processing extension flag (iOS 10+). If set to true, the APNs push notification can reach the Extension for processing before being displayed. For silent notifications, this must be set to true.</p>
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
     * <p>When a device receives messages with the same CollapseId, they will be merged into one. When the device is offline and consecutive messages with the same CollapseId are sent, only the latest one is displayed in the notification bar. iOS 10+ supports this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>ZD2011</p>
     */
    @NameInMap("iOSNotificationCollapseId")
    public String iOSNotificationCollapseId;

    /**
     * <p>This attribute is used to group iOS remote notifications, identifying the group name for collapsed notifications.
     * Only supported on iOS 12.0+.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("iOSNotificationThreadId")
    public String iOSNotificationThreadId;

    /**
     * <p>Summary highlight score. Value range: floating-point number in [0,1\].</p>
     * 
     * <strong>example:</strong>
     * <p>0.01</p>
     */
    @NameInMap("iOSRelevanceScore")
    public Double iOSRelevanceScore;

    /**
     * <p>When the device is offline during message push (i.e., the persistent connection to the push server is disconnected), this push will be delivered as a notification through Apple\&quot;s APNs channel once.</p>
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
     * <p>su\&quot;b</p>
     */
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

    public PushRequest setAndroidBadgeAddNum(Integer androidBadgeAddNum) {
        this.androidBadgeAddNum = androidBadgeAddNum;
        return this;
    }
    public Integer getAndroidBadgeAddNum() {
        return this.androidBadgeAddNum;
    }

    public PushRequest setAndroidBadgeClass(String androidBadgeClass) {
        this.androidBadgeClass = androidBadgeClass;
        return this;
    }
    public String getAndroidBadgeClass() {
        return this.androidBadgeClass;
    }

    public PushRequest setAndroidBadgeSetNum(Integer androidBadgeSetNum) {
        this.androidBadgeSetNum = androidBadgeSetNum;
        return this;
    }
    public Integer getAndroidBadgeSetNum() {
        return this.androidBadgeSetNum;
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

    public PushRequest setAndroidHuaweiBusinessType(Integer androidHuaweiBusinessType) {
        this.androidHuaweiBusinessType = androidHuaweiBusinessType;
        return this;
    }
    public Integer getAndroidHuaweiBusinessType() {
        return this.androidHuaweiBusinessType;
    }

    public PushRequest setAndroidHuaweiLiveNotificationPayload(String androidHuaweiLiveNotificationPayload) {
        this.androidHuaweiLiveNotificationPayload = androidHuaweiLiveNotificationPayload;
        return this;
    }
    public String getAndroidHuaweiLiveNotificationPayload() {
        return this.androidHuaweiLiveNotificationPayload;
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

    public PushRequest setAndroidMeizuNoticeMsgType(Integer androidMeizuNoticeMsgType) {
        this.androidMeizuNoticeMsgType = androidMeizuNoticeMsgType;
        return this;
    }
    public Integer getAndroidMeizuNoticeMsgType() {
        return this.androidMeizuNoticeMsgType;
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

    public PushRequest setAndroidMessageOppoCategory(String androidMessageOppoCategory) {
        this.androidMessageOppoCategory = androidMessageOppoCategory;
        return this;
    }
    public String getAndroidMessageOppoCategory() {
        return this.androidMessageOppoCategory;
    }

    public PushRequest setAndroidMessageOppoNotifyLevel(Integer androidMessageOppoNotifyLevel) {
        this.androidMessageOppoNotifyLevel = androidMessageOppoNotifyLevel;
        return this;
    }
    public Integer getAndroidMessageOppoNotifyLevel() {
        return this.androidMessageOppoNotifyLevel;
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

    public PushRequest setAndroidNotificationThreadId(String androidNotificationThreadId) {
        this.androidNotificationThreadId = androidNotificationThreadId;
        return this;
    }
    public String getAndroidNotificationThreadId() {
        return this.androidNotificationThreadId;
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

    public PushRequest setAndroidOppoDeleteIntentData(String androidOppoDeleteIntentData) {
        this.androidOppoDeleteIntentData = androidOppoDeleteIntentData;
        return this;
    }
    public String getAndroidOppoDeleteIntentData() {
        return this.androidOppoDeleteIntentData;
    }

    public PushRequest setAndroidOppoIntelligentIntent(String androidOppoIntelligentIntent) {
        this.androidOppoIntelligentIntent = androidOppoIntelligentIntent;
        return this;
    }
    public String getAndroidOppoIntelligentIntent() {
        return this.androidOppoIntelligentIntent;
    }

    public PushRequest setAndroidOppoIntentEnv(Integer androidOppoIntentEnv) {
        this.androidOppoIntentEnv = androidOppoIntentEnv;
        return this;
    }
    public Integer getAndroidOppoIntentEnv() {
        return this.androidOppoIntentEnv;
    }

    public PushRequest setAndroidOppoPrivateContentParameters(java.util.Map<String, String> androidOppoPrivateContentParameters) {
        this.androidOppoPrivateContentParameters = androidOppoPrivateContentParameters;
        return this;
    }
    public java.util.Map<String, String> getAndroidOppoPrivateContentParameters() {
        return this.androidOppoPrivateContentParameters;
    }

    public PushRequest setAndroidOppoPrivateMsgTemplateId(String androidOppoPrivateMsgTemplateId) {
        this.androidOppoPrivateMsgTemplateId = androidOppoPrivateMsgTemplateId;
        return this;
    }
    public String getAndroidOppoPrivateMsgTemplateId() {
        return this.androidOppoPrivateMsgTemplateId;
    }

    public PushRequest setAndroidOppoPrivateTitleParameters(java.util.Map<String, String> androidOppoPrivateTitleParameters) {
        this.androidOppoPrivateTitleParameters = androidOppoPrivateTitleParameters;
        return this;
    }
    public java.util.Map<String, String> getAndroidOppoPrivateTitleParameters() {
        return this.androidOppoPrivateTitleParameters;
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

    public PushRequest setAndroidVivoLiveMessage(String androidVivoLiveMessage) {
        this.androidVivoLiveMessage = androidVivoLiveMessage;
        return this;
    }
    public String getAndroidVivoLiveMessage() {
        return this.androidVivoLiveMessage;
    }

    public PushRequest setAndroidVivoPushMode(Integer androidVivoPushMode) {
        this.androidVivoPushMode = androidVivoPushMode;
        return this;
    }
    public Integer getAndroidVivoPushMode() {
        return this.androidVivoPushMode;
    }

    public PushRequest setAndroidVivoReceiptId(String androidVivoReceiptId) {
        this.androidVivoReceiptId = androidVivoReceiptId;
        return this;
    }
    public String getAndroidVivoReceiptId() {
        return this.androidVivoReceiptId;
    }

    @Deprecated
    public PushRequest setAndroidXiaoMiActivity(String androidXiaoMiActivity) {
        this.androidXiaoMiActivity = androidXiaoMiActivity;
        return this;
    }
    public String getAndroidXiaoMiActivity() {
        return this.androidXiaoMiActivity;
    }

    @Deprecated
    public PushRequest setAndroidXiaoMiNotifyBody(String androidXiaoMiNotifyBody) {
        this.androidXiaoMiNotifyBody = androidXiaoMiNotifyBody;
        return this;
    }
    public String getAndroidXiaoMiNotifyBody() {
        return this.androidXiaoMiNotifyBody;
    }

    @Deprecated
    public PushRequest setAndroidXiaoMiNotifyTitle(String androidXiaoMiNotifyTitle) {
        this.androidXiaoMiNotifyTitle = androidXiaoMiNotifyTitle;
        return this;
    }
    public String getAndroidXiaoMiNotifyTitle() {
        return this.androidXiaoMiNotifyTitle;
    }

    @Deprecated
    public PushRequest setAndroidXiaomiBigPictureUrl(String androidXiaomiBigPictureUrl) {
        this.androidXiaomiBigPictureUrl = androidXiaomiBigPictureUrl;
        return this;
    }
    public String getAndroidXiaomiBigPictureUrl() {
        return this.androidXiaomiBigPictureUrl;
    }

    public PushRequest setAndroidXiaomiFocusParam(String androidXiaomiFocusParam) {
        this.androidXiaomiFocusParam = androidXiaomiFocusParam;
        return this;
    }
    public String getAndroidXiaomiFocusParam() {
        return this.androidXiaomiFocusParam;
    }

    public PushRequest setAndroidXiaomiFocusPics(String androidXiaomiFocusPics) {
        this.androidXiaomiFocusPics = androidXiaomiFocusPics;
        return this;
    }
    public String getAndroidXiaomiFocusPics() {
        return this.androidXiaomiFocusPics;
    }

    @Deprecated
    public PushRequest setAndroidXiaomiImageUrl(String androidXiaomiImageUrl) {
        this.androidXiaomiImageUrl = androidXiaomiImageUrl;
        return this;
    }
    public String getAndroidXiaomiImageUrl() {
        return this.androidXiaomiImageUrl;
    }

    public PushRequest setAndroidXiaomiTemplateId(String androidXiaomiTemplateId) {
        this.androidXiaomiTemplateId = androidXiaomiTemplateId;
        return this;
    }
    public String getAndroidXiaomiTemplateId() {
        return this.androidXiaomiTemplateId;
    }

    public PushRequest setAndroidXiaomiTemplateParams(String androidXiaomiTemplateParams) {
        this.androidXiaomiTemplateParams = androidXiaomiTemplateParams;
        return this;
    }
    public String getAndroidXiaomiTemplateParams() {
        return this.androidXiaomiTemplateParams;
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

    public PushRequest setHarmonyAction(String harmonyAction) {
        this.harmonyAction = harmonyAction;
        return this;
    }
    public String getHarmonyAction() {
        return this.harmonyAction;
    }

    public PushRequest setHarmonyActionType(String harmonyActionType) {
        this.harmonyActionType = harmonyActionType;
        return this;
    }
    public String getHarmonyActionType() {
        return this.harmonyActionType;
    }

    public PushRequest setHarmonyBadgeAddNum(Integer harmonyBadgeAddNum) {
        this.harmonyBadgeAddNum = harmonyBadgeAddNum;
        return this;
    }
    public Integer getHarmonyBadgeAddNum() {
        return this.harmonyBadgeAddNum;
    }

    public PushRequest setHarmonyBadgeSetNum(Integer harmonyBadgeSetNum) {
        this.harmonyBadgeSetNum = harmonyBadgeSetNum;
        return this;
    }
    public Integer getHarmonyBadgeSetNum() {
        return this.harmonyBadgeSetNum;
    }

    public PushRequest setHarmonyCategory(String harmonyCategory) {
        this.harmonyCategory = harmonyCategory;
        return this;
    }
    public String getHarmonyCategory() {
        return this.harmonyCategory;
    }

    public PushRequest setHarmonyExtParameters(String harmonyExtParameters) {
        this.harmonyExtParameters = harmonyExtParameters;
        return this;
    }
    public String getHarmonyExtParameters() {
        return this.harmonyExtParameters;
    }

    public PushRequest setHarmonyExtensionExtraData(String harmonyExtensionExtraData) {
        this.harmonyExtensionExtraData = harmonyExtensionExtraData;
        return this;
    }
    public String getHarmonyExtensionExtraData() {
        return this.harmonyExtensionExtraData;
    }

    public PushRequest setHarmonyExtensionPush(Boolean harmonyExtensionPush) {
        this.harmonyExtensionPush = harmonyExtensionPush;
        return this;
    }
    public Boolean getHarmonyExtensionPush() {
        return this.harmonyExtensionPush;
    }

    public PushRequest setHarmonyImageUrl(String harmonyImageUrl) {
        this.harmonyImageUrl = harmonyImageUrl;
        return this;
    }
    public String getHarmonyImageUrl() {
        return this.harmonyImageUrl;
    }

    public PushRequest setHarmonyInboxContent(String harmonyInboxContent) {
        this.harmonyInboxContent = harmonyInboxContent;
        return this;
    }
    public String getHarmonyInboxContent() {
        return this.harmonyInboxContent;
    }

    public PushRequest setHarmonyLiveViewPayload(String harmonyLiveViewPayload) {
        this.harmonyLiveViewPayload = harmonyLiveViewPayload;
        return this;
    }
    public String getHarmonyLiveViewPayload() {
        return this.harmonyLiveViewPayload;
    }

    public PushRequest setHarmonyNotificationSlotType(String harmonyNotificationSlotType) {
        this.harmonyNotificationSlotType = harmonyNotificationSlotType;
        return this;
    }
    public String getHarmonyNotificationSlotType() {
        return this.harmonyNotificationSlotType;
    }

    public PushRequest setHarmonyNotifyId(Integer harmonyNotifyId) {
        this.harmonyNotifyId = harmonyNotifyId;
        return this;
    }
    public Integer getHarmonyNotifyId() {
        return this.harmonyNotifyId;
    }

    public PushRequest setHarmonyReceiptId(String harmonyReceiptId) {
        this.harmonyReceiptId = harmonyReceiptId;
        return this;
    }
    public String getHarmonyReceiptId() {
        return this.harmonyReceiptId;
    }

    public PushRequest setHarmonyRemind(Boolean harmonyRemind) {
        this.harmonyRemind = harmonyRemind;
        return this;
    }
    public Boolean getHarmonyRemind() {
        return this.harmonyRemind;
    }

    public PushRequest setHarmonyRemindBody(String harmonyRemindBody) {
        this.harmonyRemindBody = harmonyRemindBody;
        return this;
    }
    public String getHarmonyRemindBody() {
        return this.harmonyRemindBody;
    }

    public PushRequest setHarmonyRemindTitle(String harmonyRemindTitle) {
        this.harmonyRemindTitle = harmonyRemindTitle;
        return this;
    }
    public String getHarmonyRemindTitle() {
        return this.harmonyRemindTitle;
    }

    public PushRequest setHarmonyRenderStyle(String harmonyRenderStyle) {
        this.harmonyRenderStyle = harmonyRenderStyle;
        return this;
    }
    public String getHarmonyRenderStyle() {
        return this.harmonyRenderStyle;
    }

    public PushRequest setHarmonyTestMessage(Boolean harmonyTestMessage) {
        this.harmonyTestMessage = harmonyTestMessage;
        return this;
    }
    public Boolean getHarmonyTestMessage() {
        return this.harmonyTestMessage;
    }

    public PushRequest setHarmonyUri(String harmonyUri) {
        this.harmonyUri = harmonyUri;
        return this;
    }
    public String getHarmonyUri() {
        return this.harmonyUri;
    }

    public PushRequest setIdempotentToken(String idempotentToken) {
        this.idempotentToken = idempotentToken;
        return this;
    }
    public String getIdempotentToken() {
        return this.idempotentToken;
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

    @Deprecated
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

    public PushRequest setIOSLiveActivityAttributes(String iOSLiveActivityAttributes) {
        this.iOSLiveActivityAttributes = iOSLiveActivityAttributes;
        return this;
    }
    public String getIOSLiveActivityAttributes() {
        return this.iOSLiveActivityAttributes;
    }

    public PushRequest setIOSLiveActivityAttributesType(String iOSLiveActivityAttributesType) {
        this.iOSLiveActivityAttributesType = iOSLiveActivityAttributesType;
        return this;
    }
    public String getIOSLiveActivityAttributesType() {
        return this.iOSLiveActivityAttributesType;
    }

    public PushRequest setIOSLiveActivityContentState(String iOSLiveActivityContentState) {
        this.iOSLiveActivityContentState = iOSLiveActivityContentState;
        return this;
    }
    public String getIOSLiveActivityContentState() {
        return this.iOSLiveActivityContentState;
    }

    public PushRequest setIOSLiveActivityDismissalDate(Long iOSLiveActivityDismissalDate) {
        this.iOSLiveActivityDismissalDate = iOSLiveActivityDismissalDate;
        return this;
    }
    public Long getIOSLiveActivityDismissalDate() {
        return this.iOSLiveActivityDismissalDate;
    }

    public PushRequest setIOSLiveActivityEvent(String iOSLiveActivityEvent) {
        this.iOSLiveActivityEvent = iOSLiveActivityEvent;
        return this;
    }
    public String getIOSLiveActivityEvent() {
        return this.iOSLiveActivityEvent;
    }

    public PushRequest setIOSLiveActivityId(String iOSLiveActivityId) {
        this.iOSLiveActivityId = iOSLiveActivityId;
        return this;
    }
    public String getIOSLiveActivityId() {
        return this.iOSLiveActivityId;
    }

    public PushRequest setIOSLiveActivityStaleDate(Long iOSLiveActivityStaleDate) {
        this.iOSLiveActivityStaleDate = iOSLiveActivityStaleDate;
        return this;
    }
    public Long getIOSLiveActivityStaleDate() {
        return this.iOSLiveActivityStaleDate;
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
