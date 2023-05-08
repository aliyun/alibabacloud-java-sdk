// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class CheckSensitiveResponseBody extends TeaModel {
    @NameInMap("CheckMessage")
    public String checkMessage;

    @NameInMap("CheckResult")
    public String checkResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckSensitiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSensitiveResponseBody self = new CheckSensitiveResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSensitiveResponseBody setCheckMessage(String checkMessage) {
        this.checkMessage = checkMessage;
        return this;
    }
    public String getCheckMessage() {
        return this.checkMessage;
    }

    public CheckSensitiveResponseBody setCheckResult(String checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public String getCheckResult() {
        return this.checkResult;
    }

    public CheckSensitiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckSensitiveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
