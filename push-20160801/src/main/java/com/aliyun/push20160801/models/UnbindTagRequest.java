// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class UnbindTagRequest extends TeaModel {
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
     * <p>The ID of the device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e2ba19de97604f55b16557673****</p>
     */
    @NameInMap("ClientKey")
    public String clientKey;

    /**
     * <p>The type of the ClientKey. Valid value:</p>
     * <ul>
     * <li><strong>DEVICE</strong>: The key is a device ID.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEVICE</p>
     */
    @NameInMap("KeyType")
    public String keyType;

    /**
     * <p>Specifies the tag to unbind. To unbind multiple tags, separate them with commas. A maximum of 10 tags, each up to 128 characters long, can be unbound per request. The system supports a total of 10,000 tags.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_tag1,test_tag2</p>
     */
    @NameInMap("TagName")
    public String tagName;

    public static UnbindTagRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindTagRequest self = new UnbindTagRequest();
        return TeaModel.build(map, self);
    }

    public UnbindTagRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public UnbindTagRequest setClientKey(String clientKey) {
        this.clientKey = clientKey;
        return this;
    }
    public String getClientKey() {
        return this.clientKey;
    }

    public UnbindTagRequest setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }
    public String getKeyType() {
        return this.keyType;
    }

    public UnbindTagRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
