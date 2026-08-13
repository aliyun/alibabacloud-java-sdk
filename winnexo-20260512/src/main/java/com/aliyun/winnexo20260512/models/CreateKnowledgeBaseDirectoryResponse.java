// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKnowledgeBaseDirectoryResponseBody body;

    public static CreateKnowledgeBaseDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseDirectoryResponse self = new CreateKnowledgeBaseDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKnowledgeBaseDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKnowledgeBaseDirectoryResponse setBody(CreateKnowledgeBaseDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKnowledgeBaseDirectoryResponseBody getBody() {
        return this.body;
    }

}
