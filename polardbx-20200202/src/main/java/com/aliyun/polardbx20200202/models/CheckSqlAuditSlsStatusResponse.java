// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CheckSqlAuditSlsStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckSqlAuditSlsStatusResponseBody body;

    public static CheckSqlAuditSlsStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSqlAuditSlsStatusResponse self = new CheckSqlAuditSlsStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckSqlAuditSlsStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSqlAuditSlsStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckSqlAuditSlsStatusResponse setBody(CheckSqlAuditSlsStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSqlAuditSlsStatusResponseBody getBody() {
        return this.body;
    }

}
