// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKnowledgeBaseJobResponseBody body;

    public static UpdateKnowledgeBaseJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseJobResponse self = new UpdateKnowledgeBaseJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKnowledgeBaseJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKnowledgeBaseJobResponse setBody(UpdateKnowledgeBaseJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKnowledgeBaseJobResponseBody getBody() {
        return this.body;
    }

}
