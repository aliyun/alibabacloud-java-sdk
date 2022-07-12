// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkDetailByApplyNumberRequest extends TeaModel {
    @NameInMap("ApplyNumber")
    public String applyNumber;

    @NameInMap("Env")
    public String env;

    public static QueryTrademarkDetailByApplyNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkDetailByApplyNumberRequest self = new QueryTrademarkDetailByApplyNumberRequest();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkDetailByApplyNumberRequest setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber;
        return this;
    }
    public String getApplyNumber() {
        return this.applyNumber;
    }

    public QueryTrademarkDetailByApplyNumberRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

}
