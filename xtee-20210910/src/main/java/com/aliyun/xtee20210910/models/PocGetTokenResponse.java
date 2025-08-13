// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class PocGetTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PocGetTokenResponseBody body;

    public static PocGetTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        PocGetTokenResponse self = new PocGetTokenResponse();
        return TeaModel.build(map, self);
    }

    public PocGetTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PocGetTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PocGetTokenResponse setBody(PocGetTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public PocGetTokenResponseBody getBody() {
        return this.body;
    }

}
