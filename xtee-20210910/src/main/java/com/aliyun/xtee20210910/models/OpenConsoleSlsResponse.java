// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class OpenConsoleSlsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenConsoleSlsResponseBody body;

    public static OpenConsoleSlsResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenConsoleSlsResponse self = new OpenConsoleSlsResponse();
        return TeaModel.build(map, self);
    }

    public OpenConsoleSlsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenConsoleSlsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenConsoleSlsResponse setBody(OpenConsoleSlsResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenConsoleSlsResponseBody getBody() {
        return this.body;
    }

}
