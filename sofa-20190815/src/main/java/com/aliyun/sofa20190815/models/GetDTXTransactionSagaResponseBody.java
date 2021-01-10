// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDTXTransactionSagaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("StatemachineInstJson")
    public String statemachineInstJson;

    public static GetDTXTransactionSagaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDTXTransactionSagaResponseBody self = new GetDTXTransactionSagaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDTXTransactionSagaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDTXTransactionSagaResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDTXTransactionSagaResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDTXTransactionSagaResponseBody setStatemachineInstJson(String statemachineInstJson) {
        this.statemachineInstJson = statemachineInstJson;
        return this;
    }
    public String getStatemachineInstJson() {
        return this.statemachineInstJson;
    }

}
