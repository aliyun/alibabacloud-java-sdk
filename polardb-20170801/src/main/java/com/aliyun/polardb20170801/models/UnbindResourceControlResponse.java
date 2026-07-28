// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UnbindResourceControlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindResourceControlResponseBody body;

    public static UnbindResourceControlResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindResourceControlResponse self = new UnbindResourceControlResponse();
        return TeaModel.build(map, self);
    }

    public UnbindResourceControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindResourceControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindResourceControlResponse setBody(UnbindResourceControlResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindResourceControlResponseBody getBody() {
        return this.body;
    }

}
