// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class OpenProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OpenProductResponseBody body;

    public static OpenProductResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenProductResponse self = new OpenProductResponse();
        return TeaModel.build(map, self);
    }

    public OpenProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenProductResponse setBody(OpenProductResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenProductResponseBody getBody() {
        return this.body;
    }

}
