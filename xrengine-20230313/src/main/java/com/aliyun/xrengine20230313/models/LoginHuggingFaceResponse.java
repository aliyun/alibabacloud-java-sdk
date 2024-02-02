// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class LoginHuggingFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LoginHuggingFaceResponseBody body;

    public static LoginHuggingFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        LoginHuggingFaceResponse self = new LoginHuggingFaceResponse();
        return TeaModel.build(map, self);
    }

    public LoginHuggingFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LoginHuggingFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LoginHuggingFaceResponse setBody(LoginHuggingFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public LoginHuggingFaceResponseBody getBody() {
        return this.body;
    }

}
