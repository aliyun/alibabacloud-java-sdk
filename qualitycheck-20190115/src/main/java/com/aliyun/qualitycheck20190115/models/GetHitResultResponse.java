// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetHitResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHitResultResponseBody body;

    public static GetHitResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHitResultResponse self = new GetHitResultResponse();
        return TeaModel.build(map, self);
    }

    public GetHitResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHitResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHitResultResponse setBody(GetHitResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHitResultResponseBody getBody() {
        return this.body;
    }

}
