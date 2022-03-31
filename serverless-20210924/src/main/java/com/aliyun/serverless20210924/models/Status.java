// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class Status extends TeaModel {
    // A machine-readable description of why this operation is in the failure status. If this value is empty there is no information available.
    @NameInMap("code")
    public String code;

    // A human-readable description of the status of this operation.
    @NameInMap("message")
    public String message;

    // ID of the request. May be null.
    @NameInMap("requestId")
    public String requestId;

    // Whether the operation is successful.
    @NameInMap("success")
    public Boolean success;

    public static Status build(java.util.Map<String, ?> map) throws Exception {
        Status self = new Status();
        return TeaModel.build(map, self);
    }

    public Status setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Status setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Status setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Status setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
