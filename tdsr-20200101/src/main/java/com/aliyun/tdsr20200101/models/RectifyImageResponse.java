// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class RectifyImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RectifyImageResponseBody body;

    public static RectifyImageResponse build(java.util.Map<String, ?> map) throws Exception {
        RectifyImageResponse self = new RectifyImageResponse();
        return TeaModel.build(map, self);
    }

    public RectifyImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RectifyImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RectifyImageResponse setBody(RectifyImageResponseBody body) {
        this.body = body;
        return this;
    }
    public RectifyImageResponseBody getBody() {
        return this.body;
    }

}
