// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushMessageToiOSRequest extends TeaModel {
    /**
     * <p>AppKey information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>24780725</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>The content of the message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my body</p>
     */
    @NameInMap("Body")
    public String body;

    /**
     * <p>The custom ID for the push Job. If JobKey is not empty, this field is included in the receipt log. For receipt logs, see <a href="https://help.aliyun.com/document_detail/434651.html">Receipt Logs</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("JobKey")
    public String jobKey;

    /**
     * <p>Whether to store the message offline. StoreOffline is set to false by default.</p>
     * <p>If stored, and the user is offline during the push, the message is sent again when the user comes online within the time-to-live (TTL). The default time-to-live (TTL) is 72 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StoreOffline")
    public Boolean storeOffline;

    /**
     * <p>Push target. Valid values:</p>
     * <ul>
     * <li><p><strong>DEVICE</strong>: Push by device</p>
     * </li>
     * <li><p><strong>ACCOUNT</strong>: Push by account</p>
     * </li>
     * <li><p><strong>ALIAS</strong>: Push by alias</p>
     * </li>
     * <li><p><strong>TAG</strong>: Push by tag</p>
     * </li>
     * <li><p><strong>ALL</strong>: Push to all devices</p>
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
     * <p>Set based on Target. Separate multiple values with commas. If the limit is exceeded, push multiple times.</p>
     * <ul>
     * <li><p>Target=DEVICE. Example values: <code>deviceid111,deviceid1111</code> (supports up to 1,000).</p>
     * </li>
     * <li><p>Target=ACCOUNT. Example values: <code>account111,account222</code> (supports up to 1,000).</p>
     * </li>
     * <li><p>Target=ALIAS. Example values: <code>alias111,alias222</code> (supports up to 1,000).</p>
     * </li>
     * <li><p>Target=TAG. Supports single and multiple tags. For format, see <a href="https://help.aliyun.com/document_detail/434847.html">Tag Format</a>.</p>
     * </li>
     * <li><p>Target=ALL. Value is <strong>all</strong>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("TargetValue")
    public String targetValue;

    /**
     * <p>The title of the message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my title</p>
     */
    @NameInMap("Title")
    public String title;

    public static PushMessageToiOSRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMessageToiOSRequest self = new PushMessageToiOSRequest();
        return TeaModel.build(map, self);
    }

    public PushMessageToiOSRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public PushMessageToiOSRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PushMessageToiOSRequest setJobKey(String jobKey) {
        this.jobKey = jobKey;
        return this;
    }
    public String getJobKey() {
        return this.jobKey;
    }

    public PushMessageToiOSRequest setStoreOffline(Boolean storeOffline) {
        this.storeOffline = storeOffline;
        return this;
    }
    public Boolean getStoreOffline() {
        return this.storeOffline;
    }

    public PushMessageToiOSRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public PushMessageToiOSRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

    public PushMessageToiOSRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
