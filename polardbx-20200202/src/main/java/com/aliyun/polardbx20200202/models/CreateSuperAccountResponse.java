// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateSuperAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSuperAccountResponseBody body;

    public static CreateSuperAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSuperAccountResponse self = new CreateSuperAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateSuperAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSuperAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSuperAccountResponse setBody(CreateSuperAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSuperAccountResponseBody getBody() {
        return this.body;
    }

}
