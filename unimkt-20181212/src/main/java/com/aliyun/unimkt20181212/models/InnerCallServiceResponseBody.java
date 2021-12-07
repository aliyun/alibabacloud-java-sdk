// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class InnerCallServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Boolean code;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static InnerCallServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InnerCallServiceResponseBody self = new InnerCallServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public InnerCallServiceResponseBody setCode(Boolean code) {
        this.code = code;
        return this;
    }
    public Boolean getCode() {
        return this.code;
    }

    public InnerCallServiceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public InnerCallServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InnerCallServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InnerCallServiceResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
