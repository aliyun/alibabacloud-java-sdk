// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UnbindAegisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindAegisResponseBody body;

    public static UnbindAegisResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindAegisResponse self = new UnbindAegisResponse();
        return TeaModel.build(map, self);
    }

    public UnbindAegisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindAegisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindAegisResponse setBody(UnbindAegisResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindAegisResponseBody getBody() {
        return this.body;
    }

}
