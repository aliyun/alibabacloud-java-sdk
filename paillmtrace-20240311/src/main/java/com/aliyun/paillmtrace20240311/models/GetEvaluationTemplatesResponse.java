// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class GetEvaluationTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEvaluationTemplatesResponseBody body;

    public static GetEvaluationTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEvaluationTemplatesResponse self = new GetEvaluationTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public GetEvaluationTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEvaluationTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEvaluationTemplatesResponse setBody(GetEvaluationTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEvaluationTemplatesResponseBody getBody() {
        return this.body;
    }

}
