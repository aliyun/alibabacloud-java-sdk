// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestartDBNodeZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartDBNodeZonalResponseBody body;

    public static RestartDBNodeZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartDBNodeZonalResponse self = new RestartDBNodeZonalResponse();
        return TeaModel.build(map, self);
    }

    public RestartDBNodeZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartDBNodeZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartDBNodeZonalResponse setBody(RestartDBNodeZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartDBNodeZonalResponseBody getBody() {
        return this.body;
    }

}
