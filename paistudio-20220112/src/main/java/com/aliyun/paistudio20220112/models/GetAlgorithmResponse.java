// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlgorithmResponseBody body;

    public static GetAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmResponse self = new GetAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlgorithmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlgorithmResponse setBody(GetAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlgorithmResponseBody getBody() {
        return this.body;
    }

}
