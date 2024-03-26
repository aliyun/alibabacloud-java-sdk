// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RegisterMediaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterMediaResponseBody body;

    public static RegisterMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaResponse self = new RegisterMediaResponse();
        return TeaModel.build(map, self);
    }

    public RegisterMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterMediaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterMediaResponse setBody(RegisterMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterMediaResponseBody getBody() {
        return this.body;
    }

}
