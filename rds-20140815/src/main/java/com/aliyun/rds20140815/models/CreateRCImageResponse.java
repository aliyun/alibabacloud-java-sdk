// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateRCImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRCImageResponseBody body;

    public static CreateRCImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRCImageResponse self = new CreateRCImageResponse();
        return TeaModel.build(map, self);
    }

    public CreateRCImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRCImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRCImageResponse setBody(CreateRCImageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRCImageResponseBody getBody() {
        return this.body;
    }

}
