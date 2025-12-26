// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKnowledgeBaseResponseBody body;

    public static CreateKnowledgeBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseResponse self = new CreateKnowledgeBaseResponse();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKnowledgeBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKnowledgeBaseResponse setBody(CreateKnowledgeBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKnowledgeBaseResponseBody getBody() {
        return this.body;
    }

}
