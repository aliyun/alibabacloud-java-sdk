// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKnowledgeBaseResponseBody body;

    public static DeleteKnowledgeBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeBaseResponse self = new DeleteKnowledgeBaseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKnowledgeBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKnowledgeBaseResponse setBody(DeleteKnowledgeBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKnowledgeBaseResponseBody getBody() {
        return this.body;
    }

}
