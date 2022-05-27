// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDdrInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDdrInstanceResponseBody body;

    public static CreateDdrInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDdrInstanceResponse self = new CreateDdrInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDdrInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDdrInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDdrInstanceResponse setBody(CreateDdrInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDdrInstanceResponseBody getBody() {
        return this.body;
    }

}
