// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteODPSqlAuditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteODPSqlAuditResponseBody body;

    public static DeleteODPSqlAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteODPSqlAuditResponse self = new DeleteODPSqlAuditResponse();
        return TeaModel.build(map, self);
    }

    public DeleteODPSqlAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteODPSqlAuditResponse setBody(DeleteODPSqlAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteODPSqlAuditResponseBody getBody() {
        return this.body;
    }

}
