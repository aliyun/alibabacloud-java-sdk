// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class UnbindTagRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("ClientKey")
    public String clientKey;

    @NameInMap("KeyType")
    public String keyType;

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
