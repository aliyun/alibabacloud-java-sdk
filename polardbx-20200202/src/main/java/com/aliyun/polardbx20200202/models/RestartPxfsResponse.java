// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class RestartPxfsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartPxfsResponseBody body;

    public static RestartPxfsResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartPxfsResponse self = new RestartPxfsResponse();
        return TeaModel.build(map, self);
    }

    public RestartPxfsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartPxfsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartPxfsResponse setBody(RestartPxfsResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartPxfsResponseBody getBody() {
        return this.body;
    }

}
