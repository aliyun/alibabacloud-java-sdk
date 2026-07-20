// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetSecurityCheckBaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecurityCheckBaseInfoResponseBody body;

    public static GetSecurityCheckBaseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityCheckBaseInfoResponse self = new GetSecurityCheckBaseInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSecurityCheckBaseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecurityCheckBaseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecurityCheckBaseInfoResponse setBody(GetSecurityCheckBaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecurityCheckBaseInfoResponseBody getBody() {
        return this.body;
    }

}
