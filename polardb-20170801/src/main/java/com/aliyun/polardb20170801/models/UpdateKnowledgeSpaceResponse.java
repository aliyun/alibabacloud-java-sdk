// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKnowledgeSpaceResponseBody body;

    public static UpdateKnowledgeSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeSpaceResponse self = new UpdateKnowledgeSpaceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKnowledgeSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKnowledgeSpaceResponse setBody(UpdateKnowledgeSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKnowledgeSpaceResponseBody getBody() {
        return this.body;
    }

}
