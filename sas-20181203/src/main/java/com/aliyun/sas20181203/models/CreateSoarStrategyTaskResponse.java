// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSoarStrategyTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSoarStrategyTaskResponseBody body;

    public static CreateSoarStrategyTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSoarStrategyTaskResponse self = new CreateSoarStrategyTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateSoarStrategyTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSoarStrategyTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSoarStrategyTaskResponse setBody(CreateSoarStrategyTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSoarStrategyTaskResponseBody getBody() {
        return this.body;
    }

}
