// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTraceQueryByMsgIdResponseBody extends TeaModel {
    /**
     * <p>The ID of the query task. You can call the [OnsTraceGetResult](~~59832~~) operation to query the details of the message trace based on the task ID.</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    /**
     * <p>The ID of the request. The system generates a unique ID for each request. You can troubleshoot issues based on the request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsTraceQueryByMsgIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTraceQueryByMsgIdResponseBody self = new OnsTraceQueryByMsgIdResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTraceQueryByMsgIdResponseBody setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public OnsTraceQueryByMsgIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
