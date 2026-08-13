// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseSourceTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKnowledgeBaseSourceTagsResponseBody body;

    public static UpdateKnowledgeBaseSourceTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseSourceTagsResponse self = new UpdateKnowledgeBaseSourceTagsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseSourceTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKnowledgeBaseSourceTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKnowledgeBaseSourceTagsResponse setBody(UpdateKnowledgeBaseSourceTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKnowledgeBaseSourceTagsResponseBody getBody() {
        return this.body;
    }

}
