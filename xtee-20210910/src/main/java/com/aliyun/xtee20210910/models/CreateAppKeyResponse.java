// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateAppKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppKeyResponseBody body;

    public static CreateAppKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppKeyResponse self = new CreateAppKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppKeyResponse setBody(CreateAppKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppKeyResponseBody getBody() {
        return this.body;
    }

}
