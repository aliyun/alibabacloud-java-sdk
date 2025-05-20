// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetMultiModalEmbeddingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMultiModalEmbeddingResponseBody body;

    public static GetMultiModalEmbeddingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultiModalEmbeddingResponse self = new GetMultiModalEmbeddingResponse();
        return TeaModel.build(map, self);
    }

    public GetMultiModalEmbeddingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMultiModalEmbeddingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMultiModalEmbeddingResponse setBody(GetMultiModalEmbeddingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultiModalEmbeddingResponseBody getBody() {
        return this.body;
    }

}
