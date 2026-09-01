// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeBaseFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKnowledgeBaseFileResponseBody body;

    public static DeleteKnowledgeBaseFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeBaseFileResponse self = new DeleteKnowledgeBaseFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeBaseFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKnowledgeBaseFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKnowledgeBaseFileResponse setBody(DeleteKnowledgeBaseFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKnowledgeBaseFileResponseBody getBody() {
        return this.body;
    }

}
