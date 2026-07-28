// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateResourceControlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateResourceControlResponseBody body;

    public static CreateResourceControlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceControlResponse self = new CreateResourceControlResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateResourceControlResponse setBody(CreateResourceControlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceControlResponseBody getBody() {
        return this.body;
    }

}
