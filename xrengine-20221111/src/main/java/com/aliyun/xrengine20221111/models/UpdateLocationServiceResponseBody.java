// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class UpdateLocationServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("ErrorName")
    public String errorName;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateLocationServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLocationServiceResponseBody self = new UpdateLocationServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLocationServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateLocationServiceResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateLocationServiceResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public UpdateLocationServiceResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public UpdateLocationServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLocationServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLocationServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
