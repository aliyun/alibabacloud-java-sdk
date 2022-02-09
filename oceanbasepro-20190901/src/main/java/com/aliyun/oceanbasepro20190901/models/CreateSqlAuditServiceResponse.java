// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateSqlAuditServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSqlAuditServiceResponseBody body;

    public static CreateSqlAuditServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlAuditServiceResponse self = new CreateSqlAuditServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateSqlAuditServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSqlAuditServiceResponse setBody(CreateSqlAuditServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSqlAuditServiceResponseBody getBody() {
        return this.body;
    }

}
