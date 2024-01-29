// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateCacheAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCacheAnalysisTaskResponseBody body;

    public static CreateCacheAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCacheAnalysisTaskResponse self = new CreateCacheAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateCacheAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCacheAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCacheAnalysisTaskResponse setBody(CreateCacheAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCacheAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
