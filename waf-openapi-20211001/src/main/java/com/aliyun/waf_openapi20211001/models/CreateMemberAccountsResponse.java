// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateMemberAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMemberAccountsResponseBody body;

    public static CreateMemberAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMemberAccountsResponse self = new CreateMemberAccountsResponse();
        return TeaModel.build(map, self);
    }

    public CreateMemberAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMemberAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMemberAccountsResponse setBody(CreateMemberAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMemberAccountsResponseBody getBody() {
        return this.body;
    }

}
