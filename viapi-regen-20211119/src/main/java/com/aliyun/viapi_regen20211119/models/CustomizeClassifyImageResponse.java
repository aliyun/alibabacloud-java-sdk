// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CustomizeClassifyImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CustomizeClassifyImageResponseBody body;

    public static CustomizeClassifyImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CustomizeClassifyImageResponse self = new CustomizeClassifyImageResponse();
        return TeaModel.build(map, self);
    }

    public CustomizeClassifyImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CustomizeClassifyImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CustomizeClassifyImageResponse setBody(CustomizeClassifyImageResponseBody body) {
        this.body = body;
        return this;
    }
    public CustomizeClassifyImageResponseBody getBody() {
        return this.body;
    }

}
