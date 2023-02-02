// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTraceQueryByMsgKeyResponseBody extends TeaModel {
    /**
     * <p>The ID of the query task. You can call the [OnsTraceGetResult](~~59832~~) operation to query the details of the message trace based on the task ID.</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
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
