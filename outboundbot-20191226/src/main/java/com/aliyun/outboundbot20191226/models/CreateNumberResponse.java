// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNumberResponseBody body;

    public static CreateNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNumberResponse self = new CreateNumberResponse();
        return TeaModel.build(map, self);
    }

    public CreateNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNumberResponse setBody(CreateNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNumberResponseBody getBody() {
        return this.body;
    }

}
