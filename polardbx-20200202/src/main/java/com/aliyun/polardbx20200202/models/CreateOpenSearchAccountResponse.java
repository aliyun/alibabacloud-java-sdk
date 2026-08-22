// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateOpenSearchAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOpenSearchAccountResponseBody body;

    public static CreateOpenSearchAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOpenSearchAccountResponse self = new CreateOpenSearchAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateOpenSearchAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOpenSearchAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOpenSearchAccountResponse setBody(CreateOpenSearchAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOpenSearchAccountResponseBody getBody() {
        return this.body;
    }

}
