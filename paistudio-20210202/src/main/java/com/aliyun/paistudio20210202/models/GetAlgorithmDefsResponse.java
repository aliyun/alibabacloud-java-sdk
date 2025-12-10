// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetAlgorithmDefsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlgorithmDefsResponseBody body;

    public static GetAlgorithmDefsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDefsResponse self = new GetAlgorithmDefsResponse();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDefsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlgorithmDefsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlgorithmDefsResponse setBody(GetAlgorithmDefsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlgorithmDefsResponseBody getBody() {
        return this.body;
    }

}
