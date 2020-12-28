// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTraceQueryByMsgKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("QueryId")
    public String queryId;

    public static OnsTraceQueryByMsgKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTraceQueryByMsgKeyResponseBody self = new OnsTraceQueryByMsgKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTraceQueryByMsgKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsTraceQueryByMsgKeyResponseBody setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
