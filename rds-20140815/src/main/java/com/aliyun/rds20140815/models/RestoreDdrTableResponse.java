// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RestoreDdrTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestoreDdrTableResponseBody body;

    public static RestoreDdrTableResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreDdrTableResponse self = new RestoreDdrTableResponse();
        return TeaModel.build(map, self);
    }

    public RestoreDdrTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreDdrTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestoreDdrTableResponse setBody(RestoreDdrTableResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreDdrTableResponseBody getBody() {
        return this.body;
    }

}
