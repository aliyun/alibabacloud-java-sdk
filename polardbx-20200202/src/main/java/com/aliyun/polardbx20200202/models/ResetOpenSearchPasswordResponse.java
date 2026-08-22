// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ResetOpenSearchPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetOpenSearchPasswordResponseBody body;

    public static ResetOpenSearchPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetOpenSearchPasswordResponse self = new ResetOpenSearchPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetOpenSearchPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetOpenSearchPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetOpenSearchPasswordResponse setBody(ResetOpenSearchPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetOpenSearchPasswordResponseBody getBody() {
        return this.body;
    }

}
