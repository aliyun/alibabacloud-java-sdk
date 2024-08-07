// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ResetSystemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetSystemResponseBody body;

    public static ResetSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetSystemResponse self = new ResetSystemResponse();
        return TeaModel.build(map, self);
    }

    public ResetSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetSystemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetSystemResponse setBody(ResetSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetSystemResponseBody getBody() {
        return this.body;
    }

}
