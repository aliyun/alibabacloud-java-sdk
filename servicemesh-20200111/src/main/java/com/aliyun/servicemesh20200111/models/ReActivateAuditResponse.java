// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ReActivateAuditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReActivateAuditResponseBody body;

    public static ReActivateAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        ReActivateAuditResponse self = new ReActivateAuditResponse();
        return TeaModel.build(map, self);
    }

    public ReActivateAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReActivateAuditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReActivateAuditResponse setBody(ReActivateAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public ReActivateAuditResponseBody getBody() {
        return this.body;
    }

}
