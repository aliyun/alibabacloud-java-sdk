// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateActivationCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateActivationCodeResponseBody body;

    public static CreateActivationCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateActivationCodeResponse self = new CreateActivationCodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateActivationCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateActivationCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateActivationCodeResponse setBody(CreateActivationCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateActivationCodeResponseBody getBody() {
        return this.body;
    }

}
