// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateAlgorithmVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAlgorithmVersionResponseBody body;

    public static CreateAlgorithmVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlgorithmVersionResponse self = new CreateAlgorithmVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlgorithmVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlgorithmVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAlgorithmVersionResponse setBody(CreateAlgorithmVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlgorithmVersionResponseBody getBody() {
        return this.body;
    }

}
