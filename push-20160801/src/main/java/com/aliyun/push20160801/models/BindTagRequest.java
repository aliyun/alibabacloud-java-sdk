// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class BindTagRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("ClientKey")
    public String clientKey;

    @NameInMap("KeyType")
    public String keyType;

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
