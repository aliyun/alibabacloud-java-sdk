// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryIntentionOwnerRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static QueryIntentionOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIntentionOwnerRequest self = new QueryIntentionOwnerRequest();
        return TeaModel.build(map, self);
    }

    public QueryIntentionOwnerRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
