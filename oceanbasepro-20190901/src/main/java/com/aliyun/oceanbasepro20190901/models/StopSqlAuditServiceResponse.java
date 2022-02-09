// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StopSqlAuditServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopSqlAuditServiceResponseBody body;

    public static StopSqlAuditServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopSqlAuditServiceResponse self = new StopSqlAuditServiceResponse();
        return TeaModel.build(map, self);
    }

    public StopSqlAuditServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopSqlAuditServiceResponse setBody(StopSqlAuditServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopSqlAuditServiceResponseBody getBody() {
        return this.body;
    }

}
