// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateInstanceBindNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInstanceBindNumberResponseBody body;

    public static CreateInstanceBindNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceBindNumberResponse self = new CreateInstanceBindNumberResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceBindNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceBindNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstanceBindNumberResponse setBody(CreateInstanceBindNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceBindNumberResponseBody getBody() {
        return this.body;
    }

}
