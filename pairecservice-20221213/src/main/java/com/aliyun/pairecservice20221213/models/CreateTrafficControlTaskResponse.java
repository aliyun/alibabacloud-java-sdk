// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateTrafficControlTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTrafficControlTaskResponseBody body;

    public static CreateTrafficControlTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficControlTaskResponse self = new CreateTrafficControlTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrafficControlTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrafficControlTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrafficControlTaskResponse setBody(CreateTrafficControlTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrafficControlTaskResponseBody getBody() {
        return this.body;
    }

}
