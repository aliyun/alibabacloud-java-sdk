// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class SubmitAutoAuditUnblockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAutoAuditUnblockResponseBody body;

    public static SubmitAutoAuditUnblockResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAutoAuditUnblockResponse self = new SubmitAutoAuditUnblockResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAutoAuditUnblockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAutoAuditUnblockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAutoAuditUnblockResponse setBody(SubmitAutoAuditUnblockResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAutoAuditUnblockResponseBody getBody() {
        return this.body;
    }

}
