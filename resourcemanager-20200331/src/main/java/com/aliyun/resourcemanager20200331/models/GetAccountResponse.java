// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccountResponseBody body;

    public static GetAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountResponse self = new GetAccountResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountResponse setBody(GetAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountResponseBody getBody() {
        return this.body;
    }

}
