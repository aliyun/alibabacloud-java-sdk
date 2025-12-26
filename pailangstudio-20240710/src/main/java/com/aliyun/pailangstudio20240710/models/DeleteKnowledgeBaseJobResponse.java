// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeBaseJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKnowledgeBaseJobResponseBody body;

    public static DeleteKnowledgeBaseJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeBaseJobResponse self = new DeleteKnowledgeBaseJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeBaseJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKnowledgeBaseJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKnowledgeBaseJobResponse setBody(DeleteKnowledgeBaseJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKnowledgeBaseJobResponseBody getBody() {
        return this.body;
    }

}
