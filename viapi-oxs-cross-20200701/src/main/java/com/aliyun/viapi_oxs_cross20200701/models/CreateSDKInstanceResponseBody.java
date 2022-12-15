// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_oxs_cross20200701.models;

import com.aliyun.tea.*;

public class CreateSDKInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Ok")
    public Boolean ok;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSDKInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSDKInstanceResponseBody self = new CreateSDKInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSDKInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSDKInstanceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateSDKInstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateSDKInstanceResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public CreateSDKInstanceResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public CreateSDKInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
