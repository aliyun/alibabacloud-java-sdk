// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RegisterDeviceResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RetryInterval")
    @Validation(required = true)
    public String retryInterval;

    public static RegisterDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceResponse self = new RegisterDeviceResponse();
        return TeaModel.build(map, self);
    }

    public RegisterDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RegisterDeviceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RegisterDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RegisterDeviceResponse setRetryInterval(String retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public String getRetryInterval() {
        return this.retryInterval;
    }

}
