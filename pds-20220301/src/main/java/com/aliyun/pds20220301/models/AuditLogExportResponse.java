// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AuditLogExportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuditLogExportResponseBody body;

    public static AuditLogExportResponse build(java.util.Map<String, ?> map) throws Exception {
        AuditLogExportResponse self = new AuditLogExportResponse();
        return TeaModel.build(map, self);
    }

    public AuditLogExportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuditLogExportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuditLogExportResponse setBody(AuditLogExportResponseBody body) {
        this.body = body;
        return this;
    }
    public AuditLogExportResponseBody getBody() {
        return this.body;
    }

}
