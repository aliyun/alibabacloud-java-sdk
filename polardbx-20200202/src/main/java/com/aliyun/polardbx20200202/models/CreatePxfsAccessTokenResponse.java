// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreatePxfsAccessTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePxfsAccessTokenResponseBody body;

    public static CreatePxfsAccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePxfsAccessTokenResponse self = new CreatePxfsAccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreatePxfsAccessTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePxfsAccessTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePxfsAccessTokenResponse setBody(CreatePxfsAccessTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePxfsAccessTokenResponseBody getBody() {
        return this.body;
    }

}
