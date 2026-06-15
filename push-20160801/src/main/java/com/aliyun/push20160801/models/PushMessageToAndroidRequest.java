// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushMessageToAndroidRequest extends TeaModel {
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
     * <p>The content of the message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my body</p>
     */
    @NameInMap("Body")
    public String body;

    /**
     * <p>A custom ID for the push task. If \<code>JobKey\\</code> is not empty, this field is included in the receipt logs. For more information, see <a href="https://help.aliyun.com/document_detail/434651.html">Receipt logs</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("JobKey")
    public String jobKey;

    /**
     * <p>Specifies whether to store the message offline. The default value is false.</p>
     * <p>If you store the message and the user is offline, the message is sent again when the user comes online within the time-to-live (TTL) period. The default TTL is 72 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StoreOffline")
    public Boolean storeOffline;

    /**
     * <p>The push target. Valid values:</p>
     * <ul>
     * <li><p><strong>DEVICE</strong>: Pushes messages to devices.</p>
     * </li>
     * <li><p><strong>ACCOUNT</strong>: Pushes messages to accounts.</p>
     * </li>
     * <li><p><strong>ALIAS</strong>: Pushes messages to aliases.</p>
     * </li>
     * <li><p><strong>TAG</strong>: Pushes messages to tags.</p>
     * </li>
     * <li><p><strong>ALL</strong>: Pushes messages to all devices.</p>
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
     * <p>Set this parameter based on the value of \<code>Target\\</code>. Use commas (,) to separate multiple values. If you exceed the limit, send the pushes in batches.</p>
     * <ul>
     * <li><p>If \<code>Target\\</code> is set to \<code>DEVICE\\</code>, specify device IDs. Example: <code>deviceid111,deviceid1111</code>. You can specify up to 1,000 device IDs.</p>
     * </li>
     * <li><p>If \<code>Target\\</code> is set to \<code>ACCOUNT\\</code>, specify account IDs. Example: <code>account111,account222</code>. You can specify up to 1,000 account IDs.</p>
     * </li>
     * <li><p>If \<code>Target\\</code> is set to \<code>ALIAS\\</code>, specify aliases. Example: <code>alias111,alias222</code>. You can specify up to 1,000 aliases.</p>
     * </li>
     * <li><p>If \<code>Target\\</code> is set to \<code>TAG\\</code>, you can specify one or more tags. For more information about the format, see <a href="https://help.aliyun.com/document_detail/434847.html">Tag format</a>.</p>
     * </li>
     * <li><p>If \<code>Target\\</code> is set to \<code>ALL\\</code>, set the value to <strong>all</strong>.</p>
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

    public static PushMessageToAndroidRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMessageToAndroidRequest self = new PushMessageToAndroidRequest();
        return TeaModel.build(map, self);
    }

    public PushMessageToAndroidRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public PushMessageToAndroidRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PushMessageToAndroidRequest setJobKey(String jobKey) {
        this.jobKey = jobKey;
        return this;
    }
    public String getJobKey() {
        return this.jobKey;
    }

    public PushMessageToAndroidRequest setStoreOffline(Boolean storeOffline) {
        this.storeOffline = storeOffline;
        return this;
    }
    public Boolean getStoreOffline() {
        return this.storeOffline;
    }

    public PushMessageToAndroidRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public PushMessageToAndroidRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

    public PushMessageToAndroidRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
