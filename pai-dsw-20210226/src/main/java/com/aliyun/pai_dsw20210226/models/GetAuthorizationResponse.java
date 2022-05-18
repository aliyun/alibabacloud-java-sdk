// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAuthorizationResponseBody body;

    public static GetAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationResponse self = new GetAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuthorizationResponse setBody(GetAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthorizationResponseBody getBody() {
        return this.body;
    }

}
