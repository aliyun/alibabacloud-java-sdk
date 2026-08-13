// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetTokenInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTokenInfoResponseBody body;

    public static GetTokenInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTokenInfoResponse self = new GetTokenInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetTokenInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTokenInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTokenInfoResponse setBody(GetTokenInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTokenInfoResponseBody getBody() {
        return this.body;
    }

}
