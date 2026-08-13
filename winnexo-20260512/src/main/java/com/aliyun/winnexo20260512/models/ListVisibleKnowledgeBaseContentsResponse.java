// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListVisibleKnowledgeBaseContentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVisibleKnowledgeBaseContentsResponseBody body;

    public static ListVisibleKnowledgeBaseContentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVisibleKnowledgeBaseContentsResponse self = new ListVisibleKnowledgeBaseContentsResponse();
        return TeaModel.build(map, self);
    }

    public ListVisibleKnowledgeBaseContentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVisibleKnowledgeBaseContentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVisibleKnowledgeBaseContentsResponse setBody(ListVisibleKnowledgeBaseContentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVisibleKnowledgeBaseContentsResponseBody getBody() {
        return this.body;
    }

}
