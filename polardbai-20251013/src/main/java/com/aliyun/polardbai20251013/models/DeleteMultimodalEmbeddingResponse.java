// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class DeleteMultimodalEmbeddingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMultimodalEmbeddingResponseBody body;

    public static DeleteMultimodalEmbeddingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultimodalEmbeddingResponse self = new DeleteMultimodalEmbeddingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMultimodalEmbeddingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMultimodalEmbeddingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMultimodalEmbeddingResponse setBody(DeleteMultimodalEmbeddingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMultimodalEmbeddingResponseBody getBody() {
        return this.body;
    }

}
