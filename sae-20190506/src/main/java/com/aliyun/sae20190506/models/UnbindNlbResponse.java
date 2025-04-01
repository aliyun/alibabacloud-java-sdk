// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UnbindNlbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindNlbResponseBody body;

    public static UnbindNlbResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindNlbResponse self = new UnbindNlbResponse();
        return TeaModel.build(map, self);
    }

    public UnbindNlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindNlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindNlbResponse setBody(UnbindNlbResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindNlbResponseBody getBody() {
        return this.body;
    }

}
