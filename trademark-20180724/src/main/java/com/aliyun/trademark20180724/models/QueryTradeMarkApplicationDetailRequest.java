// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeMarkApplicationDetailRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static QueryTradeMarkApplicationDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeMarkApplicationDetailRequest self = new QueryTradeMarkApplicationDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryTradeMarkApplicationDetailRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
