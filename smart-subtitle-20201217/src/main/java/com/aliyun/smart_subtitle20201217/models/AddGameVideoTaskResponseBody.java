// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smart_subtitle20201217.models;

import com.aliyun.tea.*;

public class AddGameVideoTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public Long data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public Boolean successResponse;

    public static AddGameVideoTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddGameVideoTaskResponseBody self = new AddGameVideoTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public AddGameVideoTaskResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public AddGameVideoTaskResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public AddGameVideoTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddGameVideoTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddGameVideoTaskResponseBody setSuccessResponse(Boolean successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public Boolean getSuccessResponse() {
        return this.successResponse;
    }

}
