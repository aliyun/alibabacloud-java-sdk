// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetKnowledgeBaseSmartIndexConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKnowledgeBaseSmartIndexConfigurationResponseBody body;

    public static GetKnowledgeBaseSmartIndexConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBaseSmartIndexConfigurationResponse self = new GetKnowledgeBaseSmartIndexConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBaseSmartIndexConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKnowledgeBaseSmartIndexConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKnowledgeBaseSmartIndexConfigurationResponse setBody(GetKnowledgeBaseSmartIndexConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKnowledgeBaseSmartIndexConfigurationResponseBody getBody() {
        return this.body;
    }

}
