// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class CreateModelInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateModelInstanceResponseBody body;

    public static CreateModelInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelInstanceResponse self = new CreateModelInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModelInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModelInstanceResponse setBody(CreateModelInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModelInstanceResponseBody getBody() {
        return this.body;
    }

}
