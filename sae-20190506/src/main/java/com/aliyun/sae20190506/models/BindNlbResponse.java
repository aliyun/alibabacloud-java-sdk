// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BindNlbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindNlbResponseBody body;

    public static BindNlbResponse build(java.util.Map<String, ?> map) throws Exception {
        BindNlbResponse self = new BindNlbResponse();
        return TeaModel.build(map, self);
    }

    public BindNlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindNlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindNlbResponse setBody(BindNlbResponseBody body) {
        this.body = body;
        return this;
    }
    public BindNlbResponseBody getBody() {
        return this.body;
    }

}
