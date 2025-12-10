// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetAlgorithmDefResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlgorithmDefResponseBody body;

    public static GetAlgorithmDefResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDefResponse self = new GetAlgorithmDefResponse();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDefResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlgorithmDefResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlgorithmDefResponse setBody(GetAlgorithmDefResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlgorithmDefResponseBody getBody() {
        return this.body;
    }

}
