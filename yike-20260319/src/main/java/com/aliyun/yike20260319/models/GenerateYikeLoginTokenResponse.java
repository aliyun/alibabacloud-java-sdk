// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GenerateYikeLoginTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateYikeLoginTokenResponseBody body;

    public static GenerateYikeLoginTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateYikeLoginTokenResponse self = new GenerateYikeLoginTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateYikeLoginTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateYikeLoginTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateYikeLoginTokenResponse setBody(GenerateYikeLoginTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateYikeLoginTokenResponseBody getBody() {
        return this.body;
    }

}
