// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class MoveKnowledgeBaseResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveKnowledgeBaseResourceResponseBody body;

    public static MoveKnowledgeBaseResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveKnowledgeBaseResourceResponse self = new MoveKnowledgeBaseResourceResponse();
        return TeaModel.build(map, self);
    }

    public MoveKnowledgeBaseResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveKnowledgeBaseResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveKnowledgeBaseResourceResponse setBody(MoveKnowledgeBaseResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveKnowledgeBaseResourceResponseBody getBody() {
        return this.body;
    }

}
