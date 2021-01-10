// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsSgServiceRateLimitRuleStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Result")
    public Long result;

    public static UpdateMsSgServiceRateLimitRuleStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsSgServiceRateLimitRuleStatusResponseBody self = new UpdateMsSgServiceRateLimitRuleStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMsSgServiceRateLimitRuleStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMsSgServiceRateLimitRuleStatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateMsSgServiceRateLimitRuleStatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateMsSgServiceRateLimitRuleStatusResponseBody setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

}
