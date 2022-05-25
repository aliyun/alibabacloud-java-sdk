// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class GetAsyncJobResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAsyncJobResultResponseBody body;

    public static GetAsyncJobResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncJobResultResponse self = new GetAsyncJobResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAsyncJobResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAsyncJobResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAsyncJobResultResponse setBody(GetAsyncJobResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAsyncJobResultResponseBody getBody() {
        return this.body;
    }

}
