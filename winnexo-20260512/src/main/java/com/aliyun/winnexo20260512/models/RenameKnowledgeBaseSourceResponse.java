// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RenameKnowledgeBaseSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenameKnowledgeBaseSourceResponseBody body;

    public static RenameKnowledgeBaseSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameKnowledgeBaseSourceResponse self = new RenameKnowledgeBaseSourceResponse();
        return TeaModel.build(map, self);
    }

    public RenameKnowledgeBaseSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameKnowledgeBaseSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenameKnowledgeBaseSourceResponse setBody(RenameKnowledgeBaseSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameKnowledgeBaseSourceResponseBody getBody() {
        return this.body;
    }

}
