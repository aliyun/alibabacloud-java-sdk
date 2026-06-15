// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushNoticeToiOSRequest extends TeaModel {
    /**
     * <p>iOS notifications use Apple’s APNs service. Specify the environment.</p>
     * <ul>
     * <li><p>DEV: Development environment.</p>
     * </li>
     * <li><p>PRODUCT: Production environment.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEV</p>
     */
    @NameInMap("ApnsEnv")
    public String apnsEnv;

    /**
     * <p>Your AppKey.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>24780725</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>The body text of the notification.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello World</p>
     */
    @NameInMap("Body")
    public String body;

    /**
     * <p>A custom key-value map for developer extensions.</p>
     * <blockquote>
     * <p>For iOS devices, pass this parameter as a JSON object. Otherwise, parsing fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;k1&quot;:&quot;ios&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
     */
    @NameInMap("ExtParameters")
    public String extParameters;

    /**
     * <p>A custom ID for the push task. If you specify a JobKey, the delivery log includes this field. For more information, see <a href="https://help.aliyun.com/document_detail/434651.html">Delivery logs</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("JobKey")
    public String jobKey;

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
     * <p>Values depend on the Target value. Separate multiple values with commas. If you exceed the limit, send multiple requests.</p>
     * <ul>
     * <li><p>If Target=DEVICE, use values such as <code>deviceid111,deviceid1111</code>. Maximum: 1000.</p>
     * </li>
     * <li><p>If Target=ACCOUNT, use values such as <code>account111,account222</code>. Maximum: 1000.</p>
     * </li>
     * <li><p>If Target=ALIAS, use values such as <code>alias111,alias222</code>. Maximum: 1000.</p>
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
     * <ul>
     * <li><p>iOS 10 and later: Displays as the notification title.</p>
     * </li>
     * <li><p>iOS 8.2 through iOS 9.x: Replaces the app name in the notification.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("Title")
    public String title;

    public static PushNoticeToiOSRequest build(java.util.Map<String, ?> map) throws Exception {
        PushNoticeToiOSRequest self = new PushNoticeToiOSRequest();
        return TeaModel.build(map, self);
    }

    public PushNoticeToiOSRequest setApnsEnv(String apnsEnv) {
        this.apnsEnv = apnsEnv;
        return this;
    }
    public String getApnsEnv() {
        return this.apnsEnv;
    }

    public PushNoticeToiOSRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public PushNoticeToiOSRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PushNoticeToiOSRequest setExtParameters(String extParameters) {
        this.extParameters = extParameters;
        return this;
    }
    public String getExtParameters() {
        return this.extParameters;
    }

    public PushNoticeToiOSRequest setJobKey(String jobKey) {
        this.jobKey = jobKey;
        return this;
    }
    public String getJobKey() {
        return this.jobKey;
    }

    public PushNoticeToiOSRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public PushNoticeToiOSRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

    public PushNoticeToiOSRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
