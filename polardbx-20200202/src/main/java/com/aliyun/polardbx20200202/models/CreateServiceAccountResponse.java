// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateServiceAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceAccountResponseBody body;

    public static CreateServiceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceAccountResponse self = new CreateServiceAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceAccountResponse setBody(CreateServiceAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceAccountResponseBody getBody() {
        return this.body;
    }

}
