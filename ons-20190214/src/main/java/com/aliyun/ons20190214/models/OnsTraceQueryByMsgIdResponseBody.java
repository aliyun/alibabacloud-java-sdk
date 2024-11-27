// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTraceQueryByMsgIdResponseBody extends TeaModel {
    /**
     * <p>The ID of the query task. You can call the <a href="https://help.aliyun.com/document_detail/59832.html">OnsTraceGetResult</a> operation to query the details of the message trace based on the task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>272967562652883649157096685****</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>B93332A3-160D-404F-880F-1F8736D1****</p>
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
