// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetTokenEnsureEnableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTokenEnsureEnableResponseBody body;

    public static GetTokenEnsureEnableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTokenEnsureEnableResponse self = new GetTokenEnsureEnableResponse();
        return TeaModel.build(map, self);
    }

    public GetTokenEnsureEnableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTokenEnsureEnableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTokenEnsureEnableResponse setBody(GetTokenEnsureEnableResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTokenEnsureEnableResponseBody getBody() {
        return this.body;
    }

}
