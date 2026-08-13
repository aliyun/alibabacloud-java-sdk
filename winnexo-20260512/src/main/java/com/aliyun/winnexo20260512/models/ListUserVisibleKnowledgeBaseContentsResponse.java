// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListUserVisibleKnowledgeBaseContentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserVisibleKnowledgeBaseContentsResponseBody body;

    public static ListUserVisibleKnowledgeBaseContentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserVisibleKnowledgeBaseContentsResponse self = new ListUserVisibleKnowledgeBaseContentsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserVisibleKnowledgeBaseContentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserVisibleKnowledgeBaseContentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserVisibleKnowledgeBaseContentsResponse setBody(ListUserVisibleKnowledgeBaseContentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserVisibleKnowledgeBaseContentsResponseBody getBody() {
        return this.body;
    }

}
