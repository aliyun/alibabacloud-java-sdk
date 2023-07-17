// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class ValidateVerifyCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateVerifyCodeResponseBody body;

    public static ValidateVerifyCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateVerifyCodeResponse self = new ValidateVerifyCodeResponse();
        return TeaModel.build(map, self);
    }

    public ValidateVerifyCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateVerifyCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateVerifyCodeResponse setBody(ValidateVerifyCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateVerifyCodeResponseBody getBody() {
        return this.body;
    }

}
