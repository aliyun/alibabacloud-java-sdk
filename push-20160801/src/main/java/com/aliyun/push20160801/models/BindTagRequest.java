// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class BindTagRequest extends TeaModel {
    /**
     * <p>The AppKey of your application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>The ID of the target device. You can specify a maximum of 1,000 device IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e2ba19de97604f55b16557673****</p>
     */
    @NameInMap("ClientKey")
    public String clientKey;

    /**
     * <p>The type of the <code>ClientKey</code>. Valid value:</p>
     * <ul>
     * <li><strong>DEVICE</strong>: Indicates a device target.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEVICE</p>
     */
    @NameInMap("KeyType")
    public String keyType;

    /**
     * <p>The tags to bind. Separate multiple tags with commas (,). You can bind up to 10 tags per request.
     * A tag name can be up to 128 characters long (each Chinese character counts as 1 character). Each application can have up to 10,000 tags. A single device can be bound to multiple tags.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>Do not bind a single tag to more than 100,000 devices. This practice can increase push processing time and increase response time.</p>
     * <ul>
     * <li><p>Use the full push feature to send notifications to all devices.</p>
     * </li>
     * <li><p>Split the device set into multiple fine-grained tags and call the push API in batches.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>If you attempt to bind the same tag multiple times, the system automatically removes the duplicates.</p>
     * </li>
     * <li><p>When a user uninstalls the application from a device, the tags associated with that device are automatically unbound. This unbinding process may be slightly delayed.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_tag,test_tag2</p>
     */
    @NameInMap("TagName")
    public String tagName;

    public static BindTagRequest build(java.util.Map<String, ?> map) throws Exception {
        BindTagRequest self = new BindTagRequest();
        return TeaModel.build(map, self);
    }

    public BindTagRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public BindTagRequest setClientKey(String clientKey) {
        this.clientKey = clientKey;
        return this;
    }
    public String getClientKey() {
        return this.clientKey;
    }

    public BindTagRequest setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }
    public String getKeyType() {
        return this.keyType;
    }

    public BindTagRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
