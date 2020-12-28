// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTraceQueryByMsgIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("QueryId")
    public String queryId;

    public static OnsTraceQueryByMsgIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTraceQueryByMsgIdResponseBody self = new OnsTraceQueryByMsgIdResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTraceQueryByMsgIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsTraceQueryByMsgIdResponseBody setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
