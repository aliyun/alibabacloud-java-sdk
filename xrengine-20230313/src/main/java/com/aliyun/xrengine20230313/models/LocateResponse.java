// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class LocateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LocateResponseBody body;

    public static LocateResponse build(java.util.Map<String, ?> map) throws Exception {
        LocateResponse self = new LocateResponse();
        return TeaModel.build(map, self);
    }

    public LocateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LocateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LocateResponse setBody(LocateResponseBody body) {
        this.body = body;
        return this;
    }
    public LocateResponseBody getBody() {
        return this.body;
    }

}
