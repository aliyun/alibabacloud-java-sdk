// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkItemAuditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkItemAuditResponseBody body;

    public static GetWorkItemAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkItemAuditResponse self = new GetWorkItemAuditResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkItemAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkItemAuditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkItemAuditResponse setBody(GetWorkItemAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkItemAuditResponseBody getBody() {
        return this.body;
    }

}
