// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryExtensionAttributeRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("AttributeKey")
    public String attributeKey;

    public static QueryExtensionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryExtensionAttributeRequest self = new QueryExtensionAttributeRequest();
        return TeaModel.build(map, self);
    }

    public QueryExtensionAttributeRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryExtensionAttributeRequest setAttributeKey(String attributeKey) {
        this.attributeKey = attributeKey;
        return this;
    }
    public String getAttributeKey() {
        return this.attributeKey;
    }

}
