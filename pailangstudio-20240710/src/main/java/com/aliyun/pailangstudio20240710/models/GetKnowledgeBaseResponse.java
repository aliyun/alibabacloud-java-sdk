// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class GetKnowledgeBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKnowledgeBaseResponseBody body;

    public static GetKnowledgeBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBaseResponse self = new GetKnowledgeBaseResponse();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKnowledgeBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKnowledgeBaseResponse setBody(GetKnowledgeBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKnowledgeBaseResponseBody getBody() {
        return this.body;
    }

}
