// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateCacheAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateCacheAnalysisTaskResponse setBody(CreateCacheAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCacheAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
