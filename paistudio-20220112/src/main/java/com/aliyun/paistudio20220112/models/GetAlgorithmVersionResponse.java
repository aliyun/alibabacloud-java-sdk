// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetAlgorithmVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlgorithmVersionResponseBody body;

    public static GetAlgorithmVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmVersionResponse self = new GetAlgorithmVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlgorithmVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlgorithmVersionResponse setBody(GetAlgorithmVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlgorithmVersionResponseBody getBody() {
        return this.body;
    }

}
