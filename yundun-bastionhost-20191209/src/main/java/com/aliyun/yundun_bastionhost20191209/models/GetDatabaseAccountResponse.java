// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetDatabaseAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDatabaseAccountResponseBody body;

    public static GetDatabaseAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseAccountResponse self = new GetDatabaseAccountResponse();
        return TeaModel.build(map, self);
    }

    public GetDatabaseAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatabaseAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDatabaseAccountResponse setBody(GetDatabaseAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatabaseAccountResponseBody getBody() {
        return this.body;
    }

}
