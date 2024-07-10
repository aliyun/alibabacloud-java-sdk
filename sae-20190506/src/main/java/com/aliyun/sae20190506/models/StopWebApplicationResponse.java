// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class StopWebApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebApplicationBody body;

    public static StopWebApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        StopWebApplicationResponse self = new StopWebApplicationResponse();
        return TeaModel.build(map, self);
    }

    public StopWebApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopWebApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopWebApplicationResponse setBody(WebApplicationBody body) {
        this.body = body;
        return this;
    }
    public WebApplicationBody getBody() {
        return this.body;
    }

}
