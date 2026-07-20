// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetSecurityCheckResultBaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecurityCheckResultBaseInfoResponseBody body;

    public static GetSecurityCheckResultBaseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityCheckResultBaseInfoResponse self = new GetSecurityCheckResultBaseInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSecurityCheckResultBaseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecurityCheckResultBaseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecurityCheckResultBaseInfoResponse setBody(GetSecurityCheckResultBaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecurityCheckResultBaseInfoResponseBody getBody() {
        return this.body;
    }

}
