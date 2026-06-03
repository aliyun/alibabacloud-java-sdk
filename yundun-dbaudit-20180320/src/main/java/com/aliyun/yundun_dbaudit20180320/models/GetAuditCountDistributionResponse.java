// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetAuditCountDistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuditCountDistributionResponseBody body;

    public static GetAuditCountDistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuditCountDistributionResponse self = new GetAuditCountDistributionResponse();
        return TeaModel.build(map, self);
    }

    public GetAuditCountDistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuditCountDistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuditCountDistributionResponse setBody(GetAuditCountDistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuditCountDistributionResponseBody getBody() {
        return this.body;
    }

}
