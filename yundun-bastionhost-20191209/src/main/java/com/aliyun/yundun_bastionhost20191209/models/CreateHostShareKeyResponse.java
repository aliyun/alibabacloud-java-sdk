// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateHostShareKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHostShareKeyResponseBody body;

    public static CreateHostShareKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHostShareKeyResponse self = new CreateHostShareKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateHostShareKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHostShareKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHostShareKeyResponse setBody(CreateHostShareKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHostShareKeyResponseBody getBody() {
        return this.body;
    }

}
