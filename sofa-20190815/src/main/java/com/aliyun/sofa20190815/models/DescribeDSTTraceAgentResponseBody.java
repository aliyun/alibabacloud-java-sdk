// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTTraceAgentResponseBody extends TeaModel {
    @NameInMap("StartStatus")
    public String startStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeDSTTraceAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTTraceAgentResponseBody self = new DescribeDSTTraceAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDSTTraceAgentResponseBody setStartStatus(String startStatus) {
        this.startStatus = startStatus;
        return this;
    }
    public String getStartStatus() {
        return this.startStatus;
    }

    public DescribeDSTTraceAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDSTTraceAgentResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeDSTTraceAgentResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
