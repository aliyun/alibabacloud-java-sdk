// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SaveExtensionAttributeRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("AttributeKey")
    public String attributeKey;

    @NameInMap("AttributeValue")
    public String attributeValue;

    public static SaveExtensionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveExtensionAttributeRequest self = new SaveExtensionAttributeRequest();
        return TeaModel.build(map, self);
    }

    public SaveExtensionAttributeRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SaveExtensionAttributeRequest setAttributeKey(String attributeKey) {
        this.attributeKey = attributeKey;
        return this;
    }
    public String getAttributeKey() {
        return this.attributeKey;
    }

    public SaveExtensionAttributeRequest setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
        return this;
    }
    public String getAttributeValue() {
        return this.attributeValue;
    }

}
