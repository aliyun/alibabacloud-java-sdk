// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckStsTokenAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckStsTokenAuthResponseBody body;

    public static CheckStsTokenAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckStsTokenAuthResponse self = new CheckStsTokenAuthResponse();
        return TeaModel.build(map, self);
    }

    public CheckStsTokenAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckStsTokenAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckStsTokenAuthResponse setBody(CheckStsTokenAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckStsTokenAuthResponseBody getBody() {
        return this.body;
    }

}
