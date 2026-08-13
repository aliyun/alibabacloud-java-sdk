// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseSourceContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKnowledgeBaseSourceContentResponseBody body;

    public static UpdateKnowledgeBaseSourceContentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseSourceContentResponse self = new UpdateKnowledgeBaseSourceContentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseSourceContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKnowledgeBaseSourceContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKnowledgeBaseSourceContentResponse setBody(UpdateKnowledgeBaseSourceContentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKnowledgeBaseSourceContentResponseBody getBody() {
        return this.body;
    }

}
