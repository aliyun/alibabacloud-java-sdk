// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RetryStartDeployResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Code")
    public String code;

    public static RetryStartDeployResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryStartDeployResponseBody self = new RetryStartDeployResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryStartDeployResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetryStartDeployResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RetryStartDeployResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
