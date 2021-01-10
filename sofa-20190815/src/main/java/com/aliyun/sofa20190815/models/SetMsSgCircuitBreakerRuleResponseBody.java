// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetMsSgCircuitBreakerRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Result")
    public Long result;

    public static SetMsSgCircuitBreakerRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetMsSgCircuitBreakerRuleResponseBody self = new SetMsSgCircuitBreakerRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public SetMsSgCircuitBreakerRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetMsSgCircuitBreakerRuleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SetMsSgCircuitBreakerRuleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public SetMsSgCircuitBreakerRuleResponseBody setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

}
