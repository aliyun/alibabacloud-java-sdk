// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkDetailByApplyNumberEspRequest extends TeaModel {
    @NameInMap("ApplyNumber")
    public String applyNumber;

    @NameInMap("BizType")
    public String bizType;

    public static QueryTrademarkDetailByApplyNumberEspRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkDetailByApplyNumberEspRequest self = new QueryTrademarkDetailByApplyNumberEspRequest();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkDetailByApplyNumberEspRequest setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber;
        return this;
    }
    public String getApplyNumber() {
        return this.applyNumber;
    }

    public QueryTrademarkDetailByApplyNumberEspRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
