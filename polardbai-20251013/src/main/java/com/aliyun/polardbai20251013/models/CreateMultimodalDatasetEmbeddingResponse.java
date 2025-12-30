// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class CreateMultimodalDatasetEmbeddingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMultimodalDatasetEmbeddingResponseBody body;

    public static CreateMultimodalDatasetEmbeddingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMultimodalDatasetEmbeddingResponse self = new CreateMultimodalDatasetEmbeddingResponse();
        return TeaModel.build(map, self);
    }

    public CreateMultimodalDatasetEmbeddingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMultimodalDatasetEmbeddingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMultimodalDatasetEmbeddingResponse setBody(CreateMultimodalDatasetEmbeddingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMultimodalDatasetEmbeddingResponseBody getBody() {
        return this.body;
    }

}
