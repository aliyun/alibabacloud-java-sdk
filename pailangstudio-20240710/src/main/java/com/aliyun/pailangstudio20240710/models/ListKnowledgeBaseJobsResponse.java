// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class ListKnowledgeBaseJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKnowledgeBaseJobsResponseBody body;

    public static ListKnowledgeBaseJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBaseJobsResponse self = new ListKnowledgeBaseJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBaseJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKnowledgeBaseJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKnowledgeBaseJobsResponse setBody(ListKnowledgeBaseJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKnowledgeBaseJobsResponseBody getBody() {
        return this.body;
    }

}
