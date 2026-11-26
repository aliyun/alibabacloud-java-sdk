// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListKnowledgeBaseSourcesByObjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKnowledgeBaseSourcesByObjectResponseBody body;

    public static ListKnowledgeBaseSourcesByObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBaseSourcesByObjectResponse self = new ListKnowledgeBaseSourcesByObjectResponse();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBaseSourcesByObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKnowledgeBaseSourcesByObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKnowledgeBaseSourcesByObjectResponse setBody(ListKnowledgeBaseSourcesByObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKnowledgeBaseSourcesByObjectResponseBody getBody() {
        return this.body;
    }

}
