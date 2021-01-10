// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMqSofamqTraceByMsgIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("QueryId")
    public String queryId;

    public static GetMqSofamqTraceByMsgIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMqSofamqTraceByMsgIdResponseBody self = new GetMqSofamqTraceByMsgIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMqSofamqTraceByMsgIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMqSofamqTraceByMsgIdResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMqSofamqTraceByMsgIdResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetMqSofamqTraceByMsgIdResponseBody setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
