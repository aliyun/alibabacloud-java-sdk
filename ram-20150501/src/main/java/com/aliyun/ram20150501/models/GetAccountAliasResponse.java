// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetAccountAliasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccountAliasResponseBody body;

    public static GetAccountAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountAliasResponse self = new GetAccountAliasResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountAliasResponse setBody(GetAccountAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountAliasResponseBody getBody() {
        return this.body;
    }

}
