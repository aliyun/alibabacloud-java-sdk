// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTraceQueryByMsgKeyResponseBody extends TeaModel {
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
     * <p>F8654231-122A-4DBD-801F-38E35538****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsTraceQueryByMsgKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTraceQueryByMsgKeyResponseBody self = new OnsTraceQueryByMsgKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTraceQueryByMsgKeyResponseBody setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public OnsTraceQueryByMsgKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
