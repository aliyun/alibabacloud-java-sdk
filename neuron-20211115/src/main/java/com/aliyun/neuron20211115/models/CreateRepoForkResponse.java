// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateRepoForkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRepoForkResponseBody body;

    public static CreateRepoForkResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoForkResponse self = new CreateRepoForkResponse();
        return TeaModel.build(map, self);
    }

    public CreateRepoForkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRepoForkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRepoForkResponse setBody(CreateRepoForkResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRepoForkResponseBody getBody() {
        return this.body;
    }

}
