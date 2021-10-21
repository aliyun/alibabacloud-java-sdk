// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryIntentionDetailRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static QueryIntentionDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIntentionDetailRequest self = new QueryIntentionDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryIntentionDetailRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
