// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKnowledgeBaseTextResponseBody body;

    public static CreateKnowledgeBaseTextResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseTextResponse self = new CreateKnowledgeBaseTextResponse();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKnowledgeBaseTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKnowledgeBaseTextResponse setBody(CreateKnowledgeBaseTextResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKnowledgeBaseTextResponseBody getBody() {
        return this.body;
    }

}
