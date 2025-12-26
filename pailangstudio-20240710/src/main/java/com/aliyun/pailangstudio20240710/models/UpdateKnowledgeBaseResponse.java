// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKnowledgeBaseResponseBody body;

    public static UpdateKnowledgeBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseResponse self = new UpdateKnowledgeBaseResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKnowledgeBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKnowledgeBaseResponse setBody(UpdateKnowledgeBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKnowledgeBaseResponseBody getBody() {
        return this.body;
    }

}
