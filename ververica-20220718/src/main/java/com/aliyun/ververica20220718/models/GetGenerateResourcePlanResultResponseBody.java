// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetGenerateResourcePlanResultResponseBody extends TeaModel {
    @NameInMap("data")
    public AsyncResourcePlanOperationResult data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("httpCode")
    public Integer httpCode;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetGenerateResourcePlanResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGenerateResourcePlanResultResponseBody self = new GetGenerateResourcePlanResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGenerateResourcePlanResultResponseBody setData(AsyncResourcePlanOperationResult data) {
        this.data = data;
        return this;
    }
    public AsyncResourcePlanOperationResult getData() {
        return this.data;
    }

    public GetGenerateResourcePlanResultResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetGenerateResourcePlanResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetGenerateResourcePlanResultResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetGenerateResourcePlanResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGenerateResourcePlanResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
