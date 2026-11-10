// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushShrinkRequest extends TeaModel {
    /**
     * <p>The activity to be opened by the notification.</p>
     * <p>This parameter is passed only when AndroidOpenType is set to ACTIVITY. Example: <code>com.alibaba.cloudpushdemo.bizactivity</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>com.alibaba.cloudpushdemo.bizactivity</p>
     */
    @NameInMap("AndroidActivity")
    public String androidActivity;

    /**
     * <p>The increment value for the badge. The value is added to the current badge number. Valid values: 1 to 99.</p>
     * <blockquote>
     * <p>This parameter is valid only for push notifications sent through the Huawei or Honor vendor channel. If both AndroidBadgeAddNum and AndroidBadgeSetNum are specified, AndroidBadgeSetNum takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AndroidBadgeAddNum")
    public Integer androidBadgeAddNum;

    /**
     * <p>The fully qualified class name of the entry Activity for badge settings.</p>
     * <blockquote>
     * <p>This parameter is valid only for push notifications sent through the Huawei or Honor vendor channel.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>com.alibaba.cloudpushdemo.bizactivity</p>
     */
    @NameInMap("AndroidBadgeClass")
    public String androidBadgeClass;

    /**
     * <p>The fixed number for the badge. Valid values: 0 to 99.</p>
     * <blockquote>
     * <p>This parameter takes effect only on the Huawei and Honor channels when push notifications are sent through vendor channels. When push notifications are sent through the Alibaba Cloud proprietary channel, this parameter takes effect only on Huawei, Honor, and vivo devices.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("AndroidBadgeSetNum")
    public Integer androidBadgeSetNum;

    /**
     * <p>The body in long text mode. Maximum length: 1,000 bytes. One Chinese character counts as 3 bytes. The actual limit is subject to the specific vendor channel during delivery.</p>
     * <p>Currently supported by:</p>
     * <ul>
     * <li><p>Huawei: EMUI 10 and later.</p>
     * </li>
     * <li><p>Honor: Magic UI 4.0 and later.</p>
     * </li>
     * <li><p>Xiaomi: MIUI 10 and later.</p>
     * </li>
     * <li><p>OPPO: ColorOS 5.0 and later.</p>
     * </li>
     * <li><p>Meizu: Flyme. </p>
     * </li>
     * <li><p>Proprietary channel: Android SDK 3.6.0 and later.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not provided in long text mode, the first non-empty value from Body and AndroidPopupBody is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Sample long text</p>
     */
    @NameInMap("AndroidBigBody")
    public String androidBigBody;

    /**
     * <p>The image URL in big image mode. Currently supported by the proprietary channel for Android SDK 3.6.0 and later.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
     */
    @NameInMap("AndroidBigPictureUrl")
    public String androidBigPictureUrl;

    /**
     * <p>The title in long text mode. Maximum length: 200 bytes. One Chinese character counts as 3 bytes.</p>
     * <ul>
     * <li><p>This parameter is currently supported only by the Honor channel and the Huawei channel for EMUI 11 and later.</p>
     * </li>
     * <li><p>If this parameter is not provided in long text mode, the first non-empty value from Title and AndroidPopupTitle is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Sample long title</p>
     */
    @NameInMap("AndroidBigTitle")
    public String androidBigTitle;

    /**
     * <p>The extended attributes of the notification. This attribute does not take effect when the push type PushType is set to MESSAGE.</p>
     * <p>This parameter must be passed in JSON map format. Otherwise, a parsing error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;api_name&quot;:&quot;PushNoticeToAndroidRequest&quot;}</p>
     */
    @NameInMap("AndroidExtParameters")
    public String androidExtParameters;

    /**
     * <p>The notification type for the Honor channel. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Formal notification. This is the default value.</li>
     * <li><strong>1</strong>: Test notification.</li>
     * </ul>
     * <blockquote>
     * <p>Each app can send 1,000 test notifications per day, which is not subject to the daily push limit per device.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AndroidHonorTargetUserType")
    public Integer androidHonorTargetUserType;

    /**
     * <p>The Huawei fast notification parameter. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Send Huawei standard notifications. This is the default value.</li>
     * <li><strong>1</strong>: Send Huawei fast notifications.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AndroidHuaweiBusinessType")
    public Integer androidHuaweiBusinessType;

    /**
     * <p>The JSON string of the Huawei Android Live Notification data structure <a href="https://developer.huawei.com/consumer/cn/doc/HMSCore-References/rest-live-0000001562939968#ZH-CN_TOPIC_0000001700850537__p195121620102511">LiveNotificationPayload</a>. For development and integration, refer to the <a href="https://help.aliyun.com/document_detail/2983768.html">Huawei Live Notification push guide</a>.</p>
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
     * <p>The receipt ID for the Huawei channel. You can view this receipt ID in the receipt parameter settings of the Huawei push operations platform.</p>
     * <blockquote>
     * <p>If the default receipt configuration on the Huawei push operations platform is set to the Alibaba Cloud receipt, this parameter is not required. Otherwise, we recommend that you configure the default receipt ID for the Huawei channel in the Alibaba Cloud EMAS Mobile Push console first.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RCP4C123456</p>
     */
    @NameInMap("AndroidHuaweiReceiptId")
    public String androidHuaweiReceiptId;

    /**
     * <p>The notification type for the Huawei channel. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Formal notification. This is the default value.</li>
     * <li><strong>1</strong>: Test notification.</li>
     * </ul>
     * <blockquote>
     * <p>Each app can send 500 test notifications per day, which is not subject to the daily push limit per device.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AndroidHuaweiTargetUserType")
    public Integer androidHuaweiTargetUserType;

    /**
     * <p>The URL of the right-side icon. Currently supported by:</p>
     * <ul>
     * <li><p>Huawei EMUI: applicable only in long text mode and inbox mode.</p>
     * </li>
     * <li><p>Honor Magic UI: applicable only in long text mode.</p>
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
     * <p>The body in inbox mode. The content must be a valid JSON array with no more than 5 elements. Currently supported by:</p>
     * <ul>
     * <li>Huawei: EMUI 9 and later.</li>
     * <li>Honor: Magic UI 4.0 and later.</li>
     * <li>Xiaomi: MIUI 10 and later.</li>
     * <li>OPPO: ColorOS 5.0 and later.</li>
     * <li>Proprietary channel: Android SDK 3.6.0 and later.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;First line&quot;,&quot;Second line&quot;]</p>
     */
    @NameInMap("AndroidInboxBody")
    public String androidInboxBody;

    /**
     * <p>The Meizu message type. Valid values:</p>
     * <ul>
     * <li>0: Public message. This is the default value.</li>
     * <li>1: Private message.</li>
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
     * <p>Purpose 1: After you complete the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835?#section3410731125514">self-classification permission application</a>, this parameter is used to identify the message type and determine the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#ZH-CN_TOPIC_0000001149358835__p3850133955718">message reminder method</a>. It accelerates the delivery of specific types of messages. For valid values, refer to the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section1076611477914">message classification standards</a> in the official Huawei push documentation, and fill in the &quot;Cloud notification category value&quot; or &quot;Local notification category value&quot; in the documentation table.</p>
     * <p>Purpose 2: After you <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">apply for special permissions</a>, this parameter is used to identify high-priority pass-through scenarios. Valid values:</p>
     * <ul>
     * <li>VOIP: Audio and video calls.</li>
     * <li>PLAY_VOICE: Voice broadcast.</li>
     * </ul>
     * <blockquote>
     * <p>For messages whose &quot;Cloud notification category value&quot; is &quot;Not involved&quot;, the Alibaba Cloud proprietary channel is used. For messages whose &quot;Local notification category value&quot; is &quot;Not involved&quot;, the Huawei channel is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VOIP</p>
     */
    @NameInMap("AndroidMessageHuaweiCategory")
    public String androidMessageHuaweiCategory;

    /**
     * <p>The delivery priority of Huawei channel notifications. Valid values:</p>
     * <ul>
     * <li><strong>HIGH</strong></li>
     * <li><strong>NORMAL</strong></li>
     * </ul>
     * <p>You must apply for the permission. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">Application link</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>HIGH</p>
     */
    @NameInMap("AndroidMessageHuaweiUrgency")
    public String androidMessageHuaweiUrgency;

    /**
     * <p>OPPO message categorization includes two categories for management: Communication and Service, and Content and Marketing.</p>
     * <p>Communication and Service (permission application required):</p>
     * <ul>
     * <li>IM: Instant chat, audio, and video calls.</li>
     * <li>ACCOUNT: Individual account and asset changes.</li>
     * <li>DEVICE_REMINDER: Personal device reminders.</li>
     * <li>ORDER: Personal order and logistics status changes.</li>
     * <li>TODO: Personal schedules and to-dos.</li>
     * <li>SUBSCRIPTION: Individual subscribe.</li>
     * </ul>
     * <p>Content and Marketing:</p>
     * <ul>
     * <li>NEWS: News and information.</li>
     * <li>CONTENT: Content recommendations.</li>
     * <li>MARKETING: Platform activities.</li>
     * <li>SOCIAL: Social updates.</li>
     * </ul>
     * <p>For more information, see <a href="https://open.oppomobile.com/new/developmentDoc/info?id=13189">OPUSH message classification rules</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>MARKETING</p>
     */
    @NameInMap("AndroidMessageOppoCategory")
    public String androidMessageOppoCategory;

    /**
     * <p>The reminder level of OPPO channel notification bar messages. Valid values:</p>
     * <ul>
     * <li>1: Notification bar.</li>
     * <li>2: Notification bar, lock screen, ringtone, and vibrate. This is the default notification level for Communication and Service messages.</li>
     * <li>16: Notification bar, lock screen, ringtone, vibrate, and banner. Permission application is required.</li>
     * </ul>
     * <blockquote>
     * <p>When you use the AndroidMessageOppoNotifyLevel parameter, you must also pass the AndroidMessageOppoCategory parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AndroidMessageOppoNotifyLevel")
    public Integer androidMessageOppoNotifyLevel;

    /**
     * <p>vivo message categorization includes two categories for management: System Messages and Operation Messages.
     * System Messages:</p>
     * <ul>
     * <li>IM: Instant messages.</li>
     * <li>ACCOUNT: Accounts and assets.</li>
     * <li>TODO: Schedules and to-dos.</li>
     * <li>DEVICE_REMINDER: Device information.</li>
     * <li>ORDER: Orders and logistics.</li>
     * <li>SUBSCRIPTION: subscribe reminders.</li>
     * </ul>
     * <p>Operation Messages:</p>
     * <ul>
     * <li>NEWS: News.</li>
     * <li>CONTENT: Content recommendations.</li>
     * <li>MARKETING: Operational activity.</li>
     * <li>SOCIAL: Social updates.</li>
     * </ul>
     * <p>For more information, see <a href="https://dev.vivo.com.cn/documentCenter/doc/359#s-ef3qugc3">Classification description</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>TODO</p>
     */
    @NameInMap("AndroidMessageVivoCategory")
    public String androidMessageVivoCategory;

    /**
     * <p>The notification sound for the Huawei vendor channel. Specify the name of the audio file stored in the <code>app/src/main/res/raw/</code> directory of the client project. Do not include the file extension.
     * If this parameter is not specified, the default ringtone is used.</p>
     * 
     * <strong>example:</strong>
     * <p>alicloud_notification_sound</p>
     */
    @NameInMap("AndroidMusic")
    public String androidMusic;

    /**
     * <p>The priority of the Android notification display position in the notification bar. Valid values: -2, -1, 0, 1, and 2.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AndroidNotificationBarPriority")
    public Integer androidNotificationBarPriority;

    /**
     * <p>The custom notification bar style for Android. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AndroidNotificationBarType")
    public Integer androidNotificationBarType;

    /**
     * <p>The channel ID of the Android app. It must correspond to the channel ID in the app.</p>
     * <ul>
     * <li>For more information about how to set the NotificationChannel parameter, see <a href="https://help.aliyun.com/document_detail/67398.html">FAQ: Notifications are not received on Android 8.0 and later devices</a>.</li>
     * <li>Because the channel_id of the OPPO private message channel is the same as the channel ID of the app, this value is used as the channel_id when pushing through the OPPO channel.</li>
     * <li>This value is used as the channel_id when pushing through the Huawei, FCM, and Alibaba Cloud proprietary channels.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AndroidNotificationChannel")
    public String androidNotificationChannel;

    /**
     * <p>The message group. For messages in the same group, only the latest message and the total number of messages received by the group are displayed in the notification bar. All messages are not displayed and cannot be expanded. Currently supported by:</p>
     * <ul>
     * <li>Huawei vendor channel.</li>
     * <li>Honor vendor channel.</li>
     * <li>Proprietary channel: Android SDK 3.9.1 and earlier.</li>
     * </ul>
     * <blockquote>
     * <p>The proprietary channel no longer supports this parameter in Android SDK 3.9.2 and later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>group-1</p>
     */
    @NameInMap("AndroidNotificationGroup")
    public String androidNotificationGroup;

    /**
     * <p>The importance parameter for Honor notification message classification, which determines the notification behavior on user devices. Valid values:</p>
     * <ul>
     * <li><strong>LOW</strong>: Information and marketing messages.</li>
     * <li><strong>NORMAL</strong>: Service and communication messages.</li>
     * </ul>
     * <p>You must apply for this permission on the Honor platform. For more information, see <a href="https://developer.honor.com/cn/docs/11002/guides/notification-class#%E8%87%AA%E5%88%86%E7%B1%BB%E6%9D%83%E7%9B%8A%E7%94%B3%E8%AF%B7">Application link</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>LOW</p>
     */
    @NameInMap("AndroidNotificationHonorChannel")
    public String androidNotificationHonorChannel;

    /**
     * <p>The importance parameter for Huawei notification message classification, which determines the notification behavior on user devices. Valid values:</p>
     * <ul>
     * <li>LOW: Information and marketing messages.</li>
     * <li>NORMAL: Service and communication messages.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Use AndroidMessageHuaweiCategory for notification classification in the Huawei channel. AndroidNotificationHuaweiChannel is no longer required.</li>
     * <li>You must apply for this permission on the Huawei platform. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section893184112272">Application link</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>LOW</p>
     */
    @NameInMap("AndroidNotificationHuaweiChannel")
    public String androidNotificationHuaweiChannel;

    /**
     * <p>The unique identifier of each message when displayed in the notification bar. Different notification bar messages can use the same NotifyId to allow new notification bar messages to overwrite old ones.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("AndroidNotificationNotifyId")
    public Integer androidNotificationNotifyId;

    /**
     * <p>The message thread ID. Messages in the same group are collapsed and can be expanded in the notification bar. Notifications in different groups are displayed separately. Currently supported by:</p>
     * <ul>
     * <li>Proprietary channel: Android SDK 3.9.2 and later.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>thread-1</p>
     */
    @NameInMap("AndroidNotificationThreadId")
    public String androidNotificationThreadId;

    /**
     * <p>The vivo notification message classification. Valid values:</p>
     * <ul>
     * <li>0: Operation messages. This is the default value.</li>
     * <li>1: System messages.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Use AndroidMessageVivoCategory for notification classification in the vivo channel. AndroidNotificationVivoChannel is no longer required.</li>
     * <li>You must apply for this permission on the vivo platform. For more information, see <a href="https://dev.vivo.com.cn/documentCenter/doc/359">Application link</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>classification</p>
     */
    @NameInMap("AndroidNotificationVivoChannel")
    public String androidNotificationVivoChannel;

    /**
     * <p>The channel ID for Xiaomi notification types. You must apply for it on the Xiaomi platform. For more information, see <a href="https://dev.mi.com/console/doc/detail?pId=2422#_4">Application link</a>.</p>
     * <blockquote>
     * <ul>
     * <li>A single app can apply for a maximum of 8 channels on the Xiaomi channel. Plan ahead.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>michannel</p>
     */
    @NameInMap("AndroidNotificationXiaomiChannel")
    public String androidNotificationXiaomiChannel;

    /**
     * <p>The reminder method of the notification. Valid values:</p>
     * <ul>
     * <li><strong>VIBRATE</strong>: Vibrate. This is the default value.</li>
     * <li><strong>SOUND</strong>: Sound.</li>
     * <li><strong>BOTH</strong>: Sound and vibrate.</li>
     * <li><strong>NONE</strong>: Silent.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BOTH</p>
     */
    @NameInMap("AndroidNotifyType")
    public String androidNotifyType;

    /**
     * <p>The action performed after the notification is clicked. Valid values:</p>
     * <ul>
     * <li><strong>APPLICATION</strong>: Open the app. This is the default value.</li>
     * <li><strong>ACTIVITY</strong>: Open the specified Android activity.</li>
     * <li><strong>URL</strong>: Open the specified URL.</li>
     * <li><strong>NONE</strong>: No redirection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>APPLICATION</p>
     */
    @NameInMap("AndroidOpenType")
    public String androidOpenType;

    /**
     * <p>The URL to be opened after the Android device receives the push.</p>
     * <p>This parameter is passed only when AndroidOpenType is set to URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.example.com">https://www.example.com</a></p>
     */
    @NameInMap("AndroidOpenUrl")
    public String androidOpenUrl;

    /**
     * <p>The JSON character string of the OPPO Fluid Cloud intent delete data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13578">data</a>. This parameter is invalid when the AndroidOppoIntelligentIntent parameter is specified. For development and integration, see References: <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud push guide</a>.</p>
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
     * <p>The JSON character string of the OPPO Fluid Cloud intent sharing data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13565">IntelligentIntent</a>. For development and integration, see References: <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud push guide</a>.</p>
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
     * <p>The push environment for OPPO Fluid Cloud. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Formal environment. This is the default value.</li>
     * <li><strong>1</strong>: Test environment.</li>
     * </ul>
     * <blockquote>
     * <p>For the OPPO Fluid Cloud test environment, refer to <a href="https://open.oppomobile.com/documentation/page/info?id=13590">Environment setup</a> to set up the client.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AndroidOppoIntentEnv")
    public Integer androidOppoIntentEnv;

    /**
     * <p>The content parameters for the OPPO private message template.</p>
     */
    @NameInMap("AndroidOppoPrivateContentParameters")
    public String androidOppoPrivateContentParametersShrink;

    /**
     * <p>The OPPO private message template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>687557242b1634hzefs3d5013</p>
     */
    @NameInMap("AndroidOppoPrivateMsgTemplateId")
    public String androidOppoPrivateMsgTemplateId;

    /**
     * <p>The title parameters for the OPPO private message template.</p>
     */
    @NameInMap("AndroidOppoPrivateTitleParameters")
    public String androidOppoPrivateTitleParametersShrink;

    /**
     * <p>The activity to which the user is redirected after the notification is clicked.</p>
     * 
     * <strong>example:</strong>
     * <p>com.alibaba.cloudpushdemo.bizactivity</p>
     */
    @NameInMap("AndroidPopupActivity")
    public String androidPopupActivity;

    /**
     * <p>The body content in auxiliary pop-up window mode. This parameter is required when the <strong>AndroidPopupActivity</strong> parameter is not empty.</p>
     * <p>Maximum length: 200 characters. Both Chinese and English characters count as one character.</p>
     * <p>If a vendor channel is used, the limits of the vendor channel must also be met. For more information, see <a href="https://help.aliyun.com/document_detail/165253.html">Limits on auxiliary channel pushes for Android</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("AndroidPopupBody")
    public String androidPopupBody;

    /**
     * <p>The title content in auxiliary pop-up window mode. This parameter is required when the <strong>AndroidPopupActivity</strong> parameter is not empty. </p>
     * <p>Maximum length: 50 characters. Both Chinese and English characters count as one character.</p>
     * <p>If a vendor channel is used, the limits of the vendor channel must also be met. For more information, see <a href="https://help.aliyun.com/document_detail/165253.html">Limits on auxiliary channel pushes for Android</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("AndroidPopupTitle")
    public String androidPopupTitle;

    /**
     * <p>Specifies whether to use the auxiliary pop-up window feature when the device is offline during a message push. Default value: false. This parameter takes effect only when PushType is set to MESSAGE.</p>
     * <p>If the message is successfully converted into a notification and pushed, the data displayed in the received notification is the values of the AndroidPopupTitle and AndroidPopupBody parameters set on the server. The data obtained in the onSysNoticeOpened method of the auxiliary pop-up window when the notification is clicked is the values of the Title and Body parameters set on the server.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AndroidRemind")
    public Boolean androidRemind;

    /**
     * <p>The notification style. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Standard mode. This is the default value.</li>
     * <li><strong>1</strong>: Long text mode. Supported by Huawei, Honor, Xiaomi, OPPO, Meizu, and the proprietary channel.</li>
     * <li><strong>2</strong>: Big image mode. Supported by the proprietary channel, but not supported by Xiaomi devices.</li>
     * <li><strong>3</strong>: Inbox mode. Supported by Huawei, Honor, Xiaomi, OPPO, and the proprietary channel.<blockquote>
     * <p>If a non-standard mode is used, this parameter must be provided.</p>
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
     * <p>Settings for the vendor channel notification type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Formal notification. This is the default value.</li>
     * <li><strong>1</strong>: Test notification.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>These parameter settings are equivalent to configuring the AndroidHuaweiTargetUserType, AndroidHonorTargetUserType, AndroidVivoPushMode, and AndroidOppoIntentEnv parameters at the same time. The corresponding parameters for specific vendor channels can overwrite this parameter.</li>
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
     * <p>The JSON character string of the vivo Atomic Island data structure <a href="https://dev.vivo.com.cn/documentCenter/doc/896#s-fdagzbd4">liveMessage</a>. For development and integration, see References: <a href="https://www.alibabacloud.com/help/en/document_detail/3030718.html">vivo Atomic Island push guide</a>.</p>
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
     * <p>The notification type for the vivo channel. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Formal push. This is the default value.</li>
     * <li><strong>1</strong>: Test push.</li>
     * </ul>
     * <blockquote>
     * <p>For test pushes, configure test devices in the vivo console in advance. You can search for &quot;onReceiveRegId regId&quot; in the device startup logs to obtain the RegId of the test device.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AndroidVivoPushMode")
    public Integer androidVivoPushMode;

    /**
     * <p>The receipt ID for the vivo channel. You can view this receipt ID in the application information of the push service on the vivo Open Platform.</p>
     * <blockquote>
     * <p>If the default receipt configuration on the vivo Open Platform is set to the Alibaba Cloud receipt, this parameter is not required. Otherwise, we recommend that you configure the default receipt ID for the vivo channel in the Alibaba Cloud EMAS Mobile Push console first.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("AndroidVivoReceiptId")
    public String androidVivoReceiptId;

    /**
     * <p>The vivo template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>t1-ge3-lq</p>
     */
    @NameInMap("AndroidVivoTemplateId")
    public String androidVivoTemplateId;

    /**
     * <p>The parameters for the vivo template. The value is a JSON object string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;keywords1&quot;:&quot;S123&quot;}</p>
     */
    @NameInMap("AndroidVivoTemplateParams")
    public String androidVivoTemplateParams;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. All third-party auxiliary pop-up windows are uniformly supported by the new <strong>AndroidPopupActivity</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AndroidXiaoMiActivity")
    @Deprecated
    public String androidXiaoMiActivity;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. All third-party auxiliary pop-up windows are uniformly supported by the new <strong>AndroidPopupBody</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AndroidXiaoMiNotifyBody")
    @Deprecated
    public String androidXiaoMiNotifyBody;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. All third-party auxiliary pop-up windows are uniformly supported by the new <strong>AndroidPopupTitle</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AndroidXiaoMiNotifyTitle")
    @Deprecated
    public String androidXiaoMiNotifyTitle;

    /**
     * <p><strong>[Deprecated]</strong> Starting from August 2023, Xiaomi officially no longer supports dynamically setting small icons, right-side icons, and big images during pushes on new devices and systems.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://f6.market.xiaomi.com/download/MiPass/aaa/bbb.png">https://f6.market.xiaomi.com/download/MiPass/aaa/bbb.png</a></p>
     */
    @NameInMap("AndroidXiaomiBigPictureUrl")
    @Deprecated
    public String androidXiaomiBigPictureUrl;

    /**
     * <p>The JSON character string of the Xiaomi Hyper Island data structure <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.param</a>. For development and integration, see References: <a href="https://www.alibabacloud.com/help/en/document_detail/3037956.html">Xiaomi Hyper Island push guide</a>.</p>
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
     * <p>The JSON character string of the Xiaomi Hyper Island image data <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.pic_xxx</a>. For development and integration, see References: <a href="https://www.alibabacloud.com/help/en/document_detail/3037956.html">Xiaomi Hyper Island push guide</a>.</p>
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
     * <p><strong>[Deprecated]</strong> Starting from August 2023, Xiaomi officially no longer supports dynamically setting small icons, right-side icons, and big images during pushes on new devices and systems.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
     */
    @NameInMap("AndroidXiaomiImageUrl")
    @Deprecated
    public String androidXiaomiImageUrl;

    /**
     * <p>The Xiaomi private message template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>P10645</p>
     */
    @NameInMap("AndroidXiaomiTemplateId")
    public String androidXiaomiTemplateId;

    /**
     * <p>The parameters for the Xiaomi private message template. The value is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;keywords1&quot;:&quot;Tom&quot;,&quot;keywords2&quot;:&quot;phone&quot;}</p>
     */
    @NameInMap("AndroidXiaomiTemplateParams")
    public String androidXiaomiTemplateParams;

    /**
     * <p>The AppKey information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>The content of the notification or message for Android and HarmonyOS pushes, or the content of the iOS message or notification. The content size is limited. For more information, see <a href="https://help.aliyun.com/document_detail/434629.html">Limits</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("Body")
    public String body;

    /**
     * <p>The device type. Valid values:</p>
     * <ul>
     * <li><strong>HARMONY</strong>: HarmonyOS devices.</li>
     * <li><strong>iOS</strong>: iOS devices.</li>
     * <li><strong>ANDROID</strong>: Android devices.</li>
     * <li><strong>ALL</strong>: If the AppKey belongs to a legacy dual-platform app, this value indicates that the push is sent to both Android and iOS devices. If the AppKey belongs to a new single-platform app, this value has the same effect as specifying the device type corresponding to the app type.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HARMONY</p>
     */
    @NameInMap("DeviceType")
    public String deviceType;

    /**
     * <p>The expiration time of offline messages and notifications. This parameter is used together with StoreOffline. Expired messages and notifications are not delivered. The maximum retention period is 72 hours. Default value: 72 hours.</p>
     * <p>The time must be in the ISO 8601 standard format and use UTC time. Format: YYYY-MM-DDThh:mm:ssZ. The expiration time cannot be earlier than the current time or the scheduled delivery time plus 3 seconds (ExpireTime &gt; PushTime + 3 seconds). The 3 seconds are reserved to compensate for network and system latency. Set the expiration time to at least 1 minute for single pushes and at least 10 minutes for full pushes and batch pushes.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-02-20T00:00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The action corresponding to the ability of the built-in page in the application.</p>
     * <blockquote>
     * <p>Notice: When HarmonyActionType is set to APP_CUSTOM_PAGE, you must specify at least one of the HarmonyUri and HarmonyAction fields.
     * For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.action</a> on the HarmonyOS official website.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>com.example.action</p>
     */
    @NameInMap("HarmonyAction")
    public String harmonyAction;

    /**
     * <p>The action to perform after the notification is tapped. Valid values:</p>
     * <ul>
     * <li>APP_HOME_PAGE: Opens the application home page.</li>
     * <li>APP_CUSTOM_PAGE: Opens a custom page in the application.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>APP_HOME_PAGE</p>
     */
    @NameInMap("HarmonyActionType")
    public String harmonyActionType;

    /**
     * <p>The increment value for the badge of the HarmonyOS application. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">Description of the addNum field for HarmonyOS badges</a>.</br>
     * This parameter is supported in HarmonyOS SDK 1.2.0 and later.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HarmonyBadgeAddNum")
    public Integer harmonyBadgeAddNum;

    /**
     * <p>The fixed number for the badge of the HarmonyOS application. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">Description of the setNum field for HarmonyOS badges</a>.
     * This parameter is supported in HarmonyOS SDK 1.2.0 and later.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HarmonyBadgeSetNum")
    public Integer harmonyBadgeSetNum;

    /**
     * <p>The category of the notification message. After you apply for the notification message auto-categorization permission, this parameter is used as the identity of the message type. Different notification message types affect the display and reminder methods of the message. Valid values:</p>
     * <ul>
     * <li>IM: Instant chat.</li>
     * <li>VOIP: Audio and video calls.</li>
     * <li>SUBSCRIPTION: subscribe.</li>
     * <li>TRAVEL: Travel.</li>
     * <li>HEALTH: Health.</li>
     * <li>WORK: Work reminders.</li>
     * <li>ACCOUNT: Account updates.</li>
     * <li>EXPRESS: Orders and logistics.</li>
     * <li>FINANCE: Finance.</li>
     * <li>DEVICE_REMINDER: Device reminders.</li>
     * <li>MAIL: Emails.</li>
     * <li>CUSTOMER_SERVICE: Customer service messages.</li>
     * <li>MARKETING: News, content recommendations, social updates, product promotions, financial updates, lifestyle information, surveys, feature recommendations, and operational activity. This category only serves as the identity for the content and does not send messages faster. These are collectively referred to as information and marketing messages.</li>
     * </ul>
     * <p>For details, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.category</a> on the HarmonyOS official website.</p>
     * 
     * <strong>example:</strong>
     * <p>IM</p>
     */
    @NameInMap("HarmonyCategory")
    public String harmonyCategory;

    /**
     * <p>The extended attributes of the notification. This attribute does not take effect when the push type PushType is set to MESSAGE.</p>
     * <p>This parameter must be passed in JSON map format. Otherwise, a parsing error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;api_name&quot;:&quot;PushNoticeToAndroidRequest&quot;}</p>
     */
    @NameInMap("HarmonyExtParameters")
    public String harmonyExtParameters;

    /**
     * <p>The extra data for the extended notification message.</br>
     * This parameter is valid when you send HarmonyOS extended notification messages.</br>
     * This parameter is conceptually equivalent to the extraData field of a HarmonyOS extended notification message. For the specific definition, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section161192514234">HarmonyOS ExtensionPayload description</a>.</br>
     * This parameter is supported in HarmonyOS SDK 1.2.0 and later.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample extra data</p>
     */
    @NameInMap("HarmonyExtensionExtraData")
    public String harmonyExtensionExtraData;

    /**
     * <p>Specifies whether to send a HarmonyOS extended notification message when PushType is set to NOTICE. Valid values:</p>
     * <ul>
     * <li>true: Sends an extended notification message.</li>
     * <li>false: Sends a normal notification message. This is the default value.
     * You must apply for the required permissions on the HarmonyOS side before you can send extended notification messages. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-guides-V5/push-send-extend-noti-V5">Sending extended notification messages</a> in the HarmonyOS documentation.</br>
     * This parameter is supported in HarmonyOS SDK 1.2.0 and later.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HarmonyExtensionPush")
    public Boolean harmonyExtensionPush;

    /**
     * <p>The URL of the large icon on the right side of the notification. The URL must use the HTTPS protocol.</p>
     * <blockquote>
     * <p>Supported image formats include PNG, JPG, JPEG, HEIF, GIF, and BMP. The product of the image width and height must be less than 25,000 pixels.
     * For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.image</a> on the HarmonyOS official website.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/xxx.png">https://example.com/xxx.png</a></p>
     */
    @NameInMap("HarmonyImageUrl")
    public String harmonyImageUrl;

    /**
     * <p>The content for the multi-line text style. This field is required when HarmonyRenderStyle is set to MULTI_LINE. A maximum of three content items are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1.content1&quot;,&quot;2.content2&quot;,&quot;3.content3&quot;]</p>
     */
    @NameInMap("HarmonyInboxContent")
    public String harmonyInboxContent;

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
    @NameInMap("HarmonyLiveViewPayload")
    public String harmonyLiveViewPayload;

    /**
     * <p>The type of the notification channel to use. This parameter is valid only when the Alibaba Cloud proprietary channel is online. Valid values:</p>
     * <ul>
     * <li>SOCIAL_COMMUNICATION: Social communication.</li>
     * <li>SERVICE_INFORMATION: Service reminders.</li>
     * <li>CONTENT_INFORMATION: Content information.</li>
     * <li>CUSTOMER_SERVICE: Customer service messages. This type is used for customer service messages between users and merchants, and must be initiated by the user.</li>
     * <li>OTHER_TYPES: Other types.
     * For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/js-apis-notificationmanager-V5#slottype">SlotType</a> on the HarmonyOS official website.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SOCIAL_COMMUNICATION</p>
     */
    @NameInMap("HarmonyNotificationSlotType")
    public String harmonyNotificationSlotType;

    /**
     * <p>The unique identifier of each message when the notification is displayed. If this parameter is not specified, the push service automatically generates a unique identifier for each message. Different notification messages can have the same notifyId to allow new messages to overwrite old ones.
     * For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.notifyId</a> on the HarmonyOS official website.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HarmonyNotifyId")
    public Integer harmonyNotifyId;

    /**
     * <p>The receipt ID for the HarmonyOS channel. You can view this receipt ID in the receipt parameter settings of the HarmonyOS push operations platform.</p>
     * <blockquote>
     * <p>If the default receipt configuration on the HarmonyOS push operations platform is set to the Alibaba Cloud receipt, this parameter is not required. Otherwise, we recommend that you configure the default receipt ID for the HarmonyOS channel in the Alibaba Cloud EMAS Mobile Push console first.
     * For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">pushOptions.receiptId</a> on the HarmonyOS official website.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RCPB***DFD5</p>
     */
    @NameInMap("HarmonyReceiptId")
    public String harmonyReceiptId;

    /**
     * <p>Specifies whether to use the auxiliary pop-up window feature when the device is offline and the push type is message. Default value: false. This parameter takes effect only when PushType is set to MESSAGE.
     * If the message-to-notification push is successful, the notification displays the data specified by the HarmonyRemindTitle and HarmonyRemindBody parameters on the server.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HarmonyRemind")
    public Boolean harmonyRemind;

    /**
     * <p>The HarmonyOS notification content used when a message is converted to a notification. This parameter is valid only when HarmonyRemind is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>You have a new message. Please check it</p>
     */
    @NameInMap("HarmonyRemindBody")
    public String harmonyRemindBody;

    /**
     * <p>The HarmonyOS notification title used when a message is converted to a notification. This parameter is valid only when HarmonyRemind is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>New message</p>
     */
    @NameInMap("HarmonyRemindTitle")
    public String harmonyRemindTitle;

    /**
     * <p>The style of the notification message. Valid values:</p>
     * <ul>
     * <li>NORMAL: Normal notification. This is the default value.</li>
     * <li>MULTI_LINE: Multi-line text style.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("HarmonyRenderStyle")
    public String harmonyRenderStyle;

    /**
     * <p>The test message identifier. Valid values:</p>
     * <ul>
     * <li>false: Normal message. This is the default value.</li>
     * <li>true: Test message.
     * For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">pushOptions.testMessage</a> on the HarmonyOS official website.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HarmonyTestMessage")
    public Boolean harmonyTestMessage;

    /**
     * <p>The URI corresponding to the ability of the built-in page in the application.</p>
     * <blockquote>
     * <p>Notice: When HarmonyActionType is set to APP_CUSTOM_PAGE, you must specify at least one of the HarmonyUri and HarmonyAction fields. If multiple abilities exist, specify the action and URI for each ability. The action is used first to find the corresponding built-in page in the application.
     * For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.uri</a> on the HarmonyOS official website.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.example.com:8080/push/example">https://www.example.com:8080/push/example</a></p>
     */
    @NameInMap("HarmonyUri")
    public String harmonyUri;

    /**
     * <p>An idempotent parameter used to prevent duplicate push notifications on the server caused by retries from the API client. If the same IdempotentToken is used for calls within 15 minutes, only one push notification is sent, and subsequent calls return the result of the first successful push.</p>
     * <blockquote>
     * <ul>
     * <li>The parameter format is a standard 36-character UUID (8-4-4-4-12). Each valid character is a hexadecimal digit in the range of 0-9 or a-f, and it is case-insensitive.</li>
     * <li>This parameter is used only to prevent duplicate push notifications caused by retries. It cannot prevent duplicate push notifications caused by concurrent calls.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c8016d13-6e76-410c-9bda-769383d11787</p>
     */
    @NameInMap("IdempotentToken")
    public String idempotentToken;

    /**
     * <p>The custom identifier of the push task. If JobKey is not empty, this field is included in the receipt log. For more information, see <a href="https://help.aliyun.com/document_detail/434651.html">Receipt logs</a>.</p>
     * <blockquote>
     * <p>Format requirements: The value can only contain letters, digits, underscores (_), and hyphens (-), and cannot exceed 32 characters in length.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("JobKey")
    public String jobKey;

    /**
     * <p>The scheduled delivery time. If this parameter is not set, the push is delivered immediately.
     * The scheduled delivery time cannot be later than 7 days from the current time.</p>
     * <p>The time must be in the ISO 8601 standard format and use UTC time. Format: YYYY-MM-DDThh:mm:ssZ.</p>
     * <blockquote>
     * <p>This parameter is not supported when Target is set to TBD (continuous push).</p>
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
     * <li><strong>NOTICE</strong>: Notification. Notifications are delivered to device endpoints through vendor channels such as APNs, Huawei, Xiaomi, and HarmonyOS, and are displayed directly in the notification bar of the device. When an Android device is online (the app process is alive), the notification is preferentially delivered through the Alibaba Cloud proprietary channel. The push SDK constructs and displays the notification to achieve better push performance and save vendor push message quotas in certain scenarios.</li>
     * <li><strong>MESSAGE</strong>: Message. Messages are delivered through the Alibaba Cloud proprietary online channel. They are not displayed in the notification bar by default. Instead, the app must receive and process them when the process is active, and the business logic determines whether to trigger specific business behaviors. When the device is offline (the app process is inactive), messages cannot be received in a timely manner. In this case, you can use the iOSRemind or AndroidRemind parameter described below to convert messages into notifications for delivery when the device is offline. Alternatively, you can set the StoreOffline parameter described below to allow the push system to save the message when the device is offline and automatically deliver it when the device comes online.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MESSAGE</p>
     */
    @NameInMap("PushType")
    public String pushType;

    /**
     * <p>The specified delivery channels. Valid values:</p>
     * <ul>
     * <li>accs: Alibaba Cloud proprietary channel.</li>
     * <li>huawei: Huawei channel.</li>
     * <li>honor: Honor channel.</li>
     * <li>xiaomi: Xiaomi channel.</li>
     * <li>oppo: OPPO channel.</li>
     * <li>vivo: vivo channel.</li>
     * <li>meizu: Meizu channel.</li>
     * <li>gcm: Google GCM channel (legacy HTTP).</li>
     * <li>fcm: Google Firebase channel (HTTP v1 API).</li>
     * <li>apns: APNs channel.</li>
     * <li>harmony: HarmonyOS channel.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If this parameter is not configured, all channels can be used.</li>
     * <li>If this parameter is configured, only the specified channels are used.</li>
     * <li>If the configured channels conflict with the delivery policy (for example, iOS notifications can only be delivered through the APNs channel, but apns is not included in this parameter), the push is not delivered.</li>
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
     * <p><strong>[Deprecated]</strong> This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SendSpeed")
    @Deprecated
    public Integer sendSpeed;

    /**
     * <p>The delay time before the SMS message is triggered. Unit: seconds.
     * This parameter is required if you use the SMS linkage feature. We recommend that you set this parameter to 15 seconds or more, and the maximum value cannot exceed 3 days. This prevents duplicate SMS and push messages.</p>
     * <blockquote>
     * <p>When the SMS linkage feature is used, the ExpireTime parameter becomes invalid. The expiration time of the notification is calculated based on the SmsDelaySecs parameter. The expiration time is the current time plus the value of SmsDelaySecs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("SmsDelaySecs")
    public Integer smsDelaySecs;

    /**
     * <p>The key-value pairs of the variables in the SMS template. Format: <code>key1=value1&amp;key2=value2</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>key1=value1</p>
     */
    @NameInMap("SmsParams")
    public String smsParams;

    /**
     * <p>The condition that triggers the SMS message. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Triggered when the push message is not received.</li>
     * <li><strong>1</strong>: Triggered when the user does not open the push message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SmsSendPolicy")
    public Integer smsSendPolicy;

    /**
     * <p>The signature for the fallback SMS message.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS signature</p>
     */
    @NameInMap("SmsSignName")
    public String smsSignName;

    /**
     * <p>The name of the SMS template used for fallback SMS messages. You can obtain this name on the SMS template management page. This is the name assigned by the system, not the name set by the developer.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS template name</p>
     */
    @NameInMap("SmsTemplateName")
    public String smsTemplateName;

    /**
     * <p>Specifies whether to save offline messages and notifications. Default value: <strong>false</strong>.</p>
     * <p>If this parameter is set to true and the user is offline during the push, the message or notification is sent again when the user comes online within the expiration time specified by ExpireTime. The default value of ExpireTime is 72 hours. iOS notifications are delivered through the APNs channel and are not affected by StoreOffline.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("StoreOffline")
    public Boolean storeOffline;

    /**
     * <p>The push target. Valid values:</p>
     * <ul>
     * <li><strong>DEVICE</strong>: Push by device.</li>
     * <li><strong>ACCOUNT</strong>: Push by account.</li>
     * <li><strong>ALIAS</strong>: Push by alias.</li>
     * <li><strong>TAG</strong>: Push by tag.</li>
     * <li><strong>ALL</strong>: Push to all devices. The interval between two full pushes of the same DeviceType must be at least 1 second.<blockquote>
     * <p>For a full push to iOS devices, the push is sent to devices that have been active within the last 24 months and have not been uninstalled. Once Apple Push Notification service (APNs) receives the push request and does not return an error message, the push is considered delivered. This may cause a surge in the number of active devices and incur high costs. Use this value with caution.</p>
     * </blockquote>
     * </li>
     * <li><strong>TBD</strong>: Initialize a continuous push. The push target is specified by the subsequent <a href="https://help.aliyun.com/document_detail/2249917.html">ContinuouslyPush</a> operation.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The target value, which is set based on the Target type. Separate multiple values with commas. If the number of values exceeds the limit, you must send the push in multiple batches.</p>
     * <ul>
     * <li>If Target is set to DEVICE, the value is in the format of <code>deviceid1,deviceid2</code>. A maximum of 1,000 devices are supported.</li>
     * <li>If Target is set to ACCOUNT, the value is in the format of <code>account1,account2</code>. A maximum of 1,000 accounts are supported.</li>
     * <li>If Target is set to ALIAS, the value is in the format of <code>alias1,alias2</code>. A maximum of 1,000 aliases are supported.</li>
     * <li>If Target is set to TAG, single or multiple tags are supported. For more information about the format, see <a href="https://help.aliyun.com/document_detail/434847.html">Tag format</a>.</li>
     * <li>If Target is set to ALL, the value is <strong>ALL</strong>, which is a fixed parameter combination for full pushes.</li>
     * <li>If Target is set to TBD, the value is <strong>TBD</strong>, which is a fixed parameter combination for continuous pushes.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("TargetValue")
    public String targetValue;

    /**
     * <p>The title of the notification or message during the push. Maximum length: 200 bytes.</p>
     * <p>This parameter is required for Android and HarmonyOS pushes. This parameter is optional for iOS notifications. If this parameter is specified:</p>
     * <ul>
     * <li><p>For iOS 10 and later, the title is displayed in the notification.</p>
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
     * <p>Specifies whether to automatically truncate excessively long titles and content.</p>
     * <blockquote>
     * <p>This parameter applies only to vendor channels that explicitly limit the length of titles and content. It does not apply to channels such as APNs, Huawei, and Honor, which do not limit the length of titles and content but only limit the total request body size.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Trim")
    public Boolean trim;

    /**
     * <p>To send iOS notifications through the APNs center, you must specify the corresponding environment context. Valid values:</p>
     * <ul>
     * <li><strong>DEV</strong>: Development environment. This value applies to apps that are directly installed and debugged by using Xcode.</li>
     * <li><strong>PRODUCT</strong>: Production environment. This value applies to apps distributed through the App Store, TestFlight, Ad Hoc, and enterprise distribution.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DEV</p>
     */
    @NameInMap("iOSApnsEnv")
    public String iOSApnsEnv;

    /**
     * <p>The badge number displayed in the upper-right corner of the iOS app icon.</p>
     * <blockquote>
     * <p>If iOSBadgeAutoIncrement is set to true, this parameter must be left empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("iOSBadge")
    public Integer iOSBadge;

    /**
     * <p>Specifies whether to enable the automatic badge increment feature. Default value: false.</p>
     * <blockquote>
     * <p>When this parameter is set to true, iOSBadge must be left empty.</p>
     * </blockquote>
     * <p>The automatic badge increment feature maintains the badge count for each device on the push server. To use this feature, you must use SDK version 1.9.5 or later and actively synchronize the badge number to the server.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("iOSBadgeAutoIncrement")
    public Boolean iOSBadgeAutoIncrement;

    /**
     * <p>The extension property of the iOS notification.</p>
     * <p>For iOS 10 and later, you can specify the resource URL for rich media push notifications in this parameter: <code>{&quot;attachment&quot;: &quot;https://www.example.com/notification_pic.png&quot;}</code>. This parameter must be passed in JSON map format. Otherwise, a parse error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;attachment&quot;: &quot;<a href="https://www.example.com/notification_pic.png%22%7D">https://www.example.com/notification_pic.png&quot;}</a></p>
     */
    @NameInMap("iOSExtParameters")
    public String iOSExtParameters;

    /**
     * <p>The interruption level. Valid values:</p>
     * <ul>
     * <li><strong>passive</strong>: The system adds the notification to the notification list without lighting up the screen or playing a sound.</li>
     * <li><strong>active</strong>: The system immediately displays the notification, lights up the screen, and can play a sound.</li>
     * <li><strong>time-sensitive</strong>: The system immediately presents the notification, lights up the screen, and can play a sound, but does not break through the system notification controls.</li>
     * <li><strong>critical</strong>: The system immediately displays the notification, lights up the screen, and plays a sound bypassing the silent switch.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("iOSInterruptionLevel")
    public String iOSInterruptionLevel;

    /**
     * <p>The JSON character string that contains the pass-through static parameter for Dynamic Island pushes. It includes static user-defined information, such as product IDs and order information.</p>
     * <blockquote>
     * <p>This parameter is required when iOSLiveActivityEvent is set to start.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;orderId&quot;: &quot;12345&quot;, &quot;product&quot;: &quot;Shoes&quot;}</p>
     */
    @NameInMap("iOSLiveActivityAttributes")
    public String iOSLiveActivityAttributes;

    /**
     * <p>The type of the Live Activity to be started.</p>
     * <blockquote>
     * <p>This parameter is required when iOSLiveActivityEvent is set to start.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>OrderActivityAttributes</p>
     */
    @NameInMap("iOSLiveActivityAttributesType")
    public String iOSLiveActivityAttributesType;

    /**
     * <p>The pass-through dynamic parameter for Dynamic Island pushes. It includes real-time update information, such as price and inventory changes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;status&quot;: &quot;delivered&quot;, &quot;estimatedArrival&quot;: &quot;2023-12-31T12:00:00Z&quot;}</p>
     */
    @NameInMap("iOSLiveActivityContentState")
    public String iOSLiveActivityContentState;

    /**
     * <p>The UNIX timestamp in seconds. The ended Live Activity is retained on the Lock Screen until the specified time. The maximum retention period is 4 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>1743131967</p>
     */
    @NameInMap("iOSLiveActivityDismissalDate")
    public Long iOSLiveActivityDismissalDate;

    /**
     * <p>The event to start, update, or end a Live Activity. Valid values: start, update, and end.</p>
     * 
     * <strong>example:</strong>
     * <p>start</p>
     */
    @NameInMap("iOSLiveActivityEvent")
    public String iOSLiveActivityEvent;

    /**
     * <p>The Live Activity ID reported by the device to the user server. It is the unique identifier of the Live Activity.</p>
     * 
     * <strong>example:</strong>
     * <p>66B94673-B32E-4CA7-863C-3E523054FD46</p>
     */
    @NameInMap("iOSLiveActivityId")
    public String iOSLiveActivityId;

    /**
     * <p>The UNIX timestamp in seconds that marks the expiration time of the activity content.</p>
     * 
     * <strong>example:</strong>
     * <p>1743131967</p>
     */
    @NameInMap("iOSLiveActivityStaleDate")
    public Long iOSLiveActivityStaleDate;

    /**
     * <p>The sound of the iOS notification. Specify the name of the audio file stored in the app bundle or the sandbox Library/Sounds directory. For more information, see <a href="https://help.aliyun.com/document_detail/48906.html">How to set the notification sound for iOS pushes</a>.</p>
     * <p>If this parameter is set to an empty string (&quot;&quot;), the notification is silent. If this parameter is not set, the default value is default, which indicates the system prompt sound.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("iOSMusic")
    public String iOSMusic;

    /**
     * <p>The iOS notification processing extension flag (iOS 10 and later). If this parameter is set to true, notifications pushed by APNs can be processed by the extension before they are displayed. This parameter must be set to true for silent notifications.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("iOSMutableContent")
    public Boolean iOSMutableContent;

    /**
     * <p>The category of the iOS notification (iOS 10 and later).</p>
     * 
     * <strong>example:</strong>
     * <p>ios</p>
     */
    @NameInMap("iOSNotificationCategory")
    public String iOSNotificationCategory;

    /**
     * <p>The collapse ID of the iOS notification. If a device receives messages with the same CollapseId, the messages are merged into one. If the device is offline and continuously receives messages with the same CollapseId, only one notification is displayed in the notification bar. This parameter is supported in iOS 10 and later.</p>
     * 
     * <strong>example:</strong>
     * <p>ZD2011</p>
     */
    @NameInMap("iOSNotificationCollapseId")
    public String iOSNotificationCollapseId;

    /**
     * <p>The thread ID used to group iOS remote notifications and mark the identifier of the collapsed group. This parameter is supported only in iOS 12.0 and later.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("iOSNotificationThreadId")
    public String iOSNotificationThreadId;

    /**
     * <p>The relevance score for summary highlighting. Valid values: a floating-point number in the range of [0,1\].</p>
     * 
     * <strong>example:</strong>
     * <p>0.01</p>
     */
    @NameInMap("iOSRelevanceScore")
    public Double iOSRelevanceScore;

    /**
     * <p>Specifies whether to convert a message into a notification and deliver it once through the Apple APNs channel when the device is offline (that is, the persistent connection channel to the Mobile Push server is disconnected) during a message push.</p>
     * <blockquote>
     * <p>Converting offline messages into notifications applies only to the production environment.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("iOSRemind")
    public Boolean iOSRemind;

    /**
     * <p>The iOS notification content used when an iOS message is converted into a notification. This parameter is valid only when iOSApnsEnv is set to PRODUCT and iOSRemind is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>iOS notification body</p>
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
     * <p>The subtitle of the iOS notification (iOS 10 and later).</p>
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

    public PushShrinkRequest setAndroidVivoTemplateId(String androidVivoTemplateId) {
        this.androidVivoTemplateId = androidVivoTemplateId;
        return this;
    }
    public String getAndroidVivoTemplateId() {
        return this.androidVivoTemplateId;
    }

    public PushShrinkRequest setAndroidVivoTemplateParams(String androidVivoTemplateParams) {
        this.androidVivoTemplateParams = androidVivoTemplateParams;
        return this;
    }
    public String getAndroidVivoTemplateParams() {
        return this.androidVivoTemplateParams;
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
