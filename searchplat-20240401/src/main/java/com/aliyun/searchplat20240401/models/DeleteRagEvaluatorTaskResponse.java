// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class DeleteRagEvaluatorTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRagEvaluatorTaskResponseBody body;

    public static DeleteRagEvaluatorTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRagEvaluatorTaskResponse self = new DeleteRagEvaluatorTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRagEvaluatorTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRagEvaluatorTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRagEvaluatorTaskResponse setBody(DeleteRagEvaluatorTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRagEvaluatorTaskResponseBody getBody() {
        return this.body;
    }

}
