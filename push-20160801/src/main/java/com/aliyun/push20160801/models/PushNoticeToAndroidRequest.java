// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushNoticeToAndroidRequest extends TeaModel {
    /**
     * <p>Your AppKey.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>The body of the notification.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>body</p>
     */
    @NameInMap("Body")
    public String body;

    /**
     * <p>Custom key-value pairs for Android-specific extensions. Pass this as a JSON object.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;api_name&quot;:&quot;PushNoticeToAndroidRequest&quot;}</p>
     */
    @NameInMap("ExtParameters")
    public String extParameters;

    /**
     * <p>A custom ID for the push task. If you specify a non-empty JobKey, it appears in the delivery receipt log. For more information, see <a href="https://help.aliyun.com/document_detail/434651.html">Delivery receipt logs</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("JobKey")
    public String jobKey;

    /**
     * <p>Whether to store the notification for offline delivery. Default: false.</p>
     * <p>If enabled, the notification is redelivered when the user comes online within the time-to-live (TTL) period. Default TTL: 72 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StoreOffline")
    public Boolean storeOffline;

    /**
     * <p>The target of the push. Valid values:</p>
     * <ul>
     * <li><p><strong>DEVICE</strong>: Push to specific devices.</p>
     * </li>
     * <li><p><strong>ACCOUNT</strong>: Push to specific accounts.</p>
     * </li>
     * <li><p><strong>ALIAS</strong>: Push to users with specific aliases.</p>
     * </li>
     * <li><p><strong>TAG</strong>: Push to users with specific tags.</p>
     * </li>
     * <li><p><strong>ALL</strong>: Push to all devices.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>Set this based on the Target value. Separate multiple values with commas. If you exceed the limit, send multiple requests.</p>
     * <ul>
     * <li><p>If Target=DEVICE, use values such as <code>deviceid111,deviceid1111</code>. Maximum: 1000 devices.</p>
     * </li>
     * <li><p>If Target=ACCOUNT, use values such as <code>account111,account222</code>. Maximum: 1000 accounts.</p>
     * </li>
     * <li><p>If Target=ALIAS, use values such as <code>alias111,alias222</code>. Maximum: 1000 aliases.</p>
     * </li>
     * <li><p>If Target=TAG, support single or multiple tags. For format details, see <a href="https://help.aliyun.com/document_detail/434847.html">Tag format</a>.</p>
     * </li>
     * <li><p>If Target=ALL, set this to <strong>ALL</strong>.</p>
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
     * <p>The title of the notification.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("Title")
    public String title;

    public static PushNoticeToAndroidRequest build(java.util.Map<String, ?> map) throws Exception {
        PushNoticeToAndroidRequest self = new PushNoticeToAndroidRequest();
        return TeaModel.build(map, self);
    }

    public PushNoticeToAndroidRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public PushNoticeToAndroidRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PushNoticeToAndroidRequest setExtParameters(String extParameters) {
        this.extParameters = extParameters;
        return this;
    }
    public String getExtParameters() {
        return this.extParameters;
    }

    public PushNoticeToAndroidRequest setJobKey(String jobKey) {
        this.jobKey = jobKey;
        return this;
    }
    public String getJobKey() {
        return this.jobKey;
    }

    public PushNoticeToAndroidRequest setStoreOffline(Boolean storeOffline) {
        this.storeOffline = storeOffline;
        return this;
    }
    public Boolean getStoreOffline() {
        return this.storeOffline;
    }

    public PushNoticeToAndroidRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public PushNoticeToAndroidRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

    public PushNoticeToAndroidRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
