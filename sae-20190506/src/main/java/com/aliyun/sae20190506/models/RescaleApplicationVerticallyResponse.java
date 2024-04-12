// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RescaleApplicationVerticallyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RescaleApplicationVerticallyResponseBody body;

    public static RescaleApplicationVerticallyResponse build(java.util.Map<String, ?> map) throws Exception {
        RescaleApplicationVerticallyResponse self = new RescaleApplicationVerticallyResponse();
        return TeaModel.build(map, self);
    }

    public RescaleApplicationVerticallyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RescaleApplicationVerticallyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RescaleApplicationVerticallyResponse setBody(RescaleApplicationVerticallyResponseBody body) {
        this.body = body;
        return this;
    }
    public RescaleApplicationVerticallyResponseBody getBody() {
        return this.body;
    }

}
