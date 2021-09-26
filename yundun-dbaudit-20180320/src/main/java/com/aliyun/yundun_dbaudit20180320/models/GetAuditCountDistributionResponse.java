// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetAuditCountDistributionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetAuditCountDistributionResponse setBody(GetAuditCountDistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuditCountDistributionResponseBody getBody() {
        return this.body;
    }

}
