// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetAuditCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetAuditCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuditCountResponse setBody(GetAuditCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuditCountResponseBody getBody() {
        return this.body;
    }

}
