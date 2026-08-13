// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListUserVisibleKnowledgeBasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserVisibleKnowledgeBasesResponseBody body;

    public static ListUserVisibleKnowledgeBasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserVisibleKnowledgeBasesResponse self = new ListUserVisibleKnowledgeBasesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserVisibleKnowledgeBasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserVisibleKnowledgeBasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserVisibleKnowledgeBasesResponse setBody(ListUserVisibleKnowledgeBasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserVisibleKnowledgeBasesResponseBody getBody() {
        return this.body;
    }

}
