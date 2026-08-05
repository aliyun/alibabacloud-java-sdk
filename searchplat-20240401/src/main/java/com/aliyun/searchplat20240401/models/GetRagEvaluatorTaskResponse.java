// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetRagEvaluatorTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRagEvaluatorTaskResponseBody body;

    public static GetRagEvaluatorTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRagEvaluatorTaskResponse self = new GetRagEvaluatorTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetRagEvaluatorTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRagEvaluatorTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRagEvaluatorTaskResponse setBody(GetRagEvaluatorTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRagEvaluatorTaskResponseBody getBody() {
        return this.body;
    }

}
