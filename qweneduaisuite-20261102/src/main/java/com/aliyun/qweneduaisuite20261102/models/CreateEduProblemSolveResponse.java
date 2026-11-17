// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102.models;

import com.aliyun.tea.*;

public class CreateEduProblemSolveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEduProblemSolveResponseBody body;

    public static CreateEduProblemSolveResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEduProblemSolveResponse self = new CreateEduProblemSolveResponse();
        return TeaModel.build(map, self);
    }

    public CreateEduProblemSolveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEduProblemSolveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEduProblemSolveResponse setBody(CreateEduProblemSolveResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEduProblemSolveResponseBody getBody() {
        return this.body;
    }

}
