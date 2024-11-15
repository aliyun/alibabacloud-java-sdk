// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetEmbeddingTuningResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEmbeddingTuningResponseBody body;

    public static GetEmbeddingTuningResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEmbeddingTuningResponse self = new GetEmbeddingTuningResponse();
        return TeaModel.build(map, self);
    }

    public GetEmbeddingTuningResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEmbeddingTuningResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEmbeddingTuningResponse setBody(GetEmbeddingTuningResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEmbeddingTuningResponseBody getBody() {
        return this.body;
    }

}
