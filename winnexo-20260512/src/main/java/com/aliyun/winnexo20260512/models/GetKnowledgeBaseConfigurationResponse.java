// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetKnowledgeBaseConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKnowledgeBaseConfigurationResponseBody body;

    public static GetKnowledgeBaseConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBaseConfigurationResponse self = new GetKnowledgeBaseConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBaseConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKnowledgeBaseConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKnowledgeBaseConfigurationResponse setBody(GetKnowledgeBaseConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKnowledgeBaseConfigurationResponseBody getBody() {
        return this.body;
    }

}
