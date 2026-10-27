// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class RevokePxfsAccessTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokePxfsAccessTokenResponseBody body;

    public static RevokePxfsAccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokePxfsAccessTokenResponse self = new RevokePxfsAccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public RevokePxfsAccessTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokePxfsAccessTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokePxfsAccessTokenResponse setBody(RevokePxfsAccessTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokePxfsAccessTokenResponseBody getBody() {
        return this.body;
    }

}
