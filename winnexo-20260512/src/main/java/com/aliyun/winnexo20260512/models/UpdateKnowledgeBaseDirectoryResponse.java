// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKnowledgeBaseDirectoryResponseBody body;

    public static UpdateKnowledgeBaseDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseDirectoryResponse self = new UpdateKnowledgeBaseDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKnowledgeBaseDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKnowledgeBaseDirectoryResponse setBody(UpdateKnowledgeBaseDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKnowledgeBaseDirectoryResponseBody getBody() {
        return this.body;
    }

}
