// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_oxs_cross20200701.models;

import com.aliyun.tea.*;

public class StartSDKInstanceProductionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Ok")
    public Boolean ok;

    @NameInMap("RequestId")
    public String requestId;

    public static StartSDKInstanceProductionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartSDKInstanceProductionResponseBody self = new StartSDKInstanceProductionResponseBody();
        return TeaModel.build(map, self);
    }

    public StartSDKInstanceProductionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartSDKInstanceProductionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public StartSDKInstanceProductionResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public StartSDKInstanceProductionResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public StartSDKInstanceProductionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
