// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class LaunchProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LaunchProductResponseBody body;

    public static LaunchProductResponse build(java.util.Map<String, ?> map) throws Exception {
        LaunchProductResponse self = new LaunchProductResponse();
        return TeaModel.build(map, self);
    }

    public LaunchProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LaunchProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LaunchProductResponse setBody(LaunchProductResponseBody body) {
        this.body = body;
        return this;
    }
    public LaunchProductResponseBody getBody() {
        return this.body;
    }

}
