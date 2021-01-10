// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OpenODPSqlAuditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenODPSqlAuditResponseBody body;

    public static OpenODPSqlAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenODPSqlAuditResponse self = new OpenODPSqlAuditResponse();
        return TeaModel.build(map, self);
    }

    public OpenODPSqlAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenODPSqlAuditResponse setBody(OpenODPSqlAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenODPSqlAuditResponseBody getBody() {
        return this.body;
    }

}
