// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ResetApplicationAccountPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetApplicationAccountPasswordResponseBody body;

    public static ResetApplicationAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetApplicationAccountPasswordResponse self = new ResetApplicationAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetApplicationAccountPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetApplicationAccountPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetApplicationAccountPasswordResponse setBody(ResetApplicationAccountPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetApplicationAccountPasswordResponseBody getBody() {
        return this.body;
    }

}
