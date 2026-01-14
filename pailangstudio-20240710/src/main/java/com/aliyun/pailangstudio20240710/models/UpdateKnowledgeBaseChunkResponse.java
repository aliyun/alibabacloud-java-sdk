// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseChunkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKnowledgeBaseChunkResponseBody body;

    public static UpdateKnowledgeBaseChunkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseChunkResponse self = new UpdateKnowledgeBaseChunkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseChunkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKnowledgeBaseChunkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKnowledgeBaseChunkResponse setBody(UpdateKnowledgeBaseChunkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKnowledgeBaseChunkResponseBody getBody() {
        return this.body;
    }

}
