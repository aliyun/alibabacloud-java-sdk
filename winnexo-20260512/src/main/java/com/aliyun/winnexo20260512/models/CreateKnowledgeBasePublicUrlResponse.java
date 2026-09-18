// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBasePublicUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKnowledgeBasePublicUrlResponseBody body;

    public static CreateKnowledgeBasePublicUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBasePublicUrlResponse self = new CreateKnowledgeBasePublicUrlResponse();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBasePublicUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKnowledgeBasePublicUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKnowledgeBasePublicUrlResponse setBody(CreateKnowledgeBasePublicUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKnowledgeBasePublicUrlResponseBody getBody() {
        return this.body;
    }

}
