// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeMarkApplicationLogsRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static QueryTradeMarkApplicationLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeMarkApplicationLogsRequest self = new QueryTradeMarkApplicationLogsRequest();
        return TeaModel.build(map, self);
    }

    public QueryTradeMarkApplicationLogsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
