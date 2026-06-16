// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetAliYunSafeCenterResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAliYunSafeCenterResultResponseBody body;

    public static GetAliYunSafeCenterResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAliYunSafeCenterResultResponse self = new GetAliYunSafeCenterResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAliYunSafeCenterResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAliYunSafeCenterResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAliYunSafeCenterResultResponse setBody(GetAliYunSafeCenterResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAliYunSafeCenterResultResponseBody getBody() {
        return this.body;
    }

}
