// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20191211.models;

import com.aliyun.tea.*;

public class QueryTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TokenStatus")
    public Boolean tokenStatus;

    public static QueryTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTokenResponseBody self = new QueryTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTokenResponseBody setTokenStatus(Boolean tokenStatus) {
        this.tokenStatus = tokenStatus;
        return this;
    }
    public Boolean getTokenStatus() {
        return this.tokenStatus;
    }

}
