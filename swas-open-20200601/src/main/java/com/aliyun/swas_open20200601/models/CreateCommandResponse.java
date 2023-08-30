// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateCommandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCommandResponseBody body;

    public static CreateCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCommandResponse self = new CreateCommandResponse();
        return TeaModel.build(map, self);
    }

    public CreateCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCommandResponse setBody(CreateCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCommandResponseBody getBody() {
        return this.body;
    }

}
