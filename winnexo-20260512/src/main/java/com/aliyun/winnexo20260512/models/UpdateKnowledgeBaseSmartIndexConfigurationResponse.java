// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseSmartIndexConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKnowledgeBaseSmartIndexConfigurationResponseBody body;

    public static UpdateKnowledgeBaseSmartIndexConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseSmartIndexConfigurationResponse self = new UpdateKnowledgeBaseSmartIndexConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseSmartIndexConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKnowledgeBaseSmartIndexConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKnowledgeBaseSmartIndexConfigurationResponse setBody(UpdateKnowledgeBaseSmartIndexConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKnowledgeBaseSmartIndexConfigurationResponseBody getBody() {
        return this.body;
    }

}
