// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkModelEspDetailRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizType")
    public String bizType;

    public static QueryTrademarkModelEspDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkModelEspDetailRequest self = new QueryTrademarkModelEspDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkModelEspDetailRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryTrademarkModelEspDetailRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
