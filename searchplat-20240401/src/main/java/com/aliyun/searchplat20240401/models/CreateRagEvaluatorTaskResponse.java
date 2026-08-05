// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateRagEvaluatorTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRagEvaluatorTaskResponseBody body;

    public static CreateRagEvaluatorTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRagEvaluatorTaskResponse self = new CreateRagEvaluatorTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateRagEvaluatorTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRagEvaluatorTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRagEvaluatorTaskResponse setBody(CreateRagEvaluatorTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRagEvaluatorTaskResponseBody getBody() {
        return this.body;
    }

}
