// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListVisibleKnowledgeBasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVisibleKnowledgeBasesResponseBody body;

    public static ListVisibleKnowledgeBasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVisibleKnowledgeBasesResponse self = new ListVisibleKnowledgeBasesResponse();
        return TeaModel.build(map, self);
    }

    public ListVisibleKnowledgeBasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVisibleKnowledgeBasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVisibleKnowledgeBasesResponse setBody(ListVisibleKnowledgeBasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVisibleKnowledgeBasesResponseBody getBody() {
        return this.body;
    }

}
