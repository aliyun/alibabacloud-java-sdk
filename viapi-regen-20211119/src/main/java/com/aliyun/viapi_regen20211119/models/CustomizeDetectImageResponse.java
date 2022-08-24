// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CustomizeDetectImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CustomizeDetectImageResponseBody body;

    public static CustomizeDetectImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CustomizeDetectImageResponse self = new CustomizeDetectImageResponse();
        return TeaModel.build(map, self);
    }

    public CustomizeDetectImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CustomizeDetectImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CustomizeDetectImageResponse setBody(CustomizeDetectImageResponseBody body) {
        this.body = body;
        return this;
    }
    public CustomizeDetectImageResponseBody getBody() {
        return this.body;
    }

}
