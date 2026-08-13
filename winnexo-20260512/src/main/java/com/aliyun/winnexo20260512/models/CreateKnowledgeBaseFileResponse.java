// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKnowledgeBaseFileResponseBody body;

    public static CreateKnowledgeBaseFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseFileResponse self = new CreateKnowledgeBaseFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKnowledgeBaseFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKnowledgeBaseFileResponse setBody(CreateKnowledgeBaseFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKnowledgeBaseFileResponseBody getBody() {
        return this.body;
    }

}
