// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListKnowledgeBaseDirectoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKnowledgeBaseDirectoriesResponseBody body;

    public static ListKnowledgeBaseDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBaseDirectoriesResponse self = new ListKnowledgeBaseDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBaseDirectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKnowledgeBaseDirectoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKnowledgeBaseDirectoriesResponse setBody(ListKnowledgeBaseDirectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKnowledgeBaseDirectoriesResponseBody getBody() {
        return this.body;
    }

}
