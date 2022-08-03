// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class CreateResourceAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateResourceAccountResponseBody body;

    public static CreateResourceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceAccountResponse self = new CreateResourceAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateResourceAccountResponse setBody(CreateResourceAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceAccountResponseBody getBody() {
        return this.body;
    }

}
