// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CheckAppVerifyCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckAppVerifyCodeResponseBody body;

    public static CheckAppVerifyCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAppVerifyCodeResponse self = new CheckAppVerifyCodeResponse();
        return TeaModel.build(map, self);
    }

    public CheckAppVerifyCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAppVerifyCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAppVerifyCodeResponse setBody(CheckAppVerifyCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAppVerifyCodeResponseBody getBody() {
        return this.body;
    }

}
