// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateCycleTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCycleTaskResponseBody body;

    public static CreateCycleTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCycleTaskResponse self = new CreateCycleTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateCycleTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCycleTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCycleTaskResponse setBody(CreateCycleTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCycleTaskResponseBody getBody() {
        return this.body;
    }

}
