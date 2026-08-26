// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateKnowledgeSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKnowledgeSpaceResponseBody body;

    public static CreateKnowledgeSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeSpaceResponse self = new CreateKnowledgeSpaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKnowledgeSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKnowledgeSpaceResponse setBody(CreateKnowledgeSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKnowledgeSpaceResponseBody getBody() {
        return this.body;
    }

}
