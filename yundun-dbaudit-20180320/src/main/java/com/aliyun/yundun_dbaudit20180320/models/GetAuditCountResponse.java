// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetAuditCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAuditCountResponseBody body;

    public static GetAuditCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuditCountResponse self = new GetAuditCountResponse();
        return TeaModel.build(map, self);
    }

    public GetAuditCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuditCountResponse setBody(GetAuditCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuditCountResponseBody getBody() {
        return this.body;
    }

}
