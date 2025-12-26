// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKnowledgeBaseJobResponseBody body;

    public static CreateKnowledgeBaseJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseJobResponse self = new CreateKnowledgeBaseJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKnowledgeBaseJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKnowledgeBaseJobResponse setBody(CreateKnowledgeBaseJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKnowledgeBaseJobResponseBody getBody() {
        return this.body;
    }

}
