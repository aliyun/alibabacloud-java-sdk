// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class BindResourceControlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindResourceControlResponseBody body;

    public static BindResourceControlResponse build(java.util.Map<String, ?> map) throws Exception {
        BindResourceControlResponse self = new BindResourceControlResponse();
        return TeaModel.build(map, self);
    }

    public BindResourceControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindResourceControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindResourceControlResponse setBody(BindResourceControlResponseBody body) {
        this.body = body;
        return this;
    }
    public BindResourceControlResponseBody getBody() {
        return this.body;
    }

}
