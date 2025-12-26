// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class GetKnowledgeBaseJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKnowledgeBaseJobResponseBody body;

    public static GetKnowledgeBaseJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBaseJobResponse self = new GetKnowledgeBaseJobResponse();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBaseJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKnowledgeBaseJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKnowledgeBaseJobResponse setBody(GetKnowledgeBaseJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKnowledgeBaseJobResponseBody getBody() {
        return this.body;
    }

}
