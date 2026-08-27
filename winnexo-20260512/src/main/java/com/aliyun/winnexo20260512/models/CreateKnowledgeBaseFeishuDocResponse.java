// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseFeishuDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKnowledgeBaseFeishuDocResponseBody body;

    public static CreateKnowledgeBaseFeishuDocResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseFeishuDocResponse self = new CreateKnowledgeBaseFeishuDocResponse();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseFeishuDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKnowledgeBaseFeishuDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKnowledgeBaseFeishuDocResponse setBody(CreateKnowledgeBaseFeishuDocResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKnowledgeBaseFeishuDocResponseBody getBody() {
        return this.body;
    }

}
