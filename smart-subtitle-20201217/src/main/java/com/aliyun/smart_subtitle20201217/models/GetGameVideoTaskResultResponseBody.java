// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smart_subtitle20201217.models;

import com.aliyun.tea.*;

public class GetGameVideoTaskResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public Boolean successResponse;

    public static GetGameVideoTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGameVideoTaskResultResponseBody self = new GetGameVideoTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGameVideoTaskResultResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetGameVideoTaskResultResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetGameVideoTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGameVideoTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGameVideoTaskResultResponseBody setSuccessResponse(Boolean successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public Boolean getSuccessResponse() {
        return this.successResponse;
    }

}
