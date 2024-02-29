// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAlgorithmResponseBody body;

    public static CreateAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlgorithmResponse self = new CreateAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlgorithmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAlgorithmResponse setBody(CreateAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlgorithmResponseBody getBody() {
        return this.body;
    }

}
