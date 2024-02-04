// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestartDBNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartDBNodeResponseBody body;

    public static RestartDBNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartDBNodeResponse self = new RestartDBNodeResponse();
        return TeaModel.build(map, self);
    }

    public RestartDBNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartDBNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartDBNodeResponse setBody(RestartDBNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartDBNodeResponseBody getBody() {
        return this.body;
    }

}
