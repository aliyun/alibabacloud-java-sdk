// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class CreateMmAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMmAppResponseBody body;

    public static CreateMmAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMmAppResponse self = new CreateMmAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateMmAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMmAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMmAppResponse setBody(CreateMmAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMmAppResponseBody getBody() {
        return this.body;
    }

}
