// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAdminKnowledgeBasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAdminKnowledgeBasesResponseBody body;

    public static ListAdminKnowledgeBasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAdminKnowledgeBasesResponse self = new ListAdminKnowledgeBasesResponse();
        return TeaModel.build(map, self);
    }

    public ListAdminKnowledgeBasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAdminKnowledgeBasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAdminKnowledgeBasesResponse setBody(ListAdminKnowledgeBasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAdminKnowledgeBasesResponseBody getBody() {
        return this.body;
    }

}
