// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AdvanceSecurityEventOperationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AdvanceSecurityEventOperationsResponseBody body;

    public static AdvanceSecurityEventOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
        AdvanceSecurityEventOperationsResponse self = new AdvanceSecurityEventOperationsResponse();
        return TeaModel.build(map, self);
    }

    public AdvanceSecurityEventOperationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AdvanceSecurityEventOperationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AdvanceSecurityEventOperationsResponse setBody(AdvanceSecurityEventOperationsResponseBody body) {
        this.body = body;
        return this;
    }
    public AdvanceSecurityEventOperationsResponseBody getBody() {
        return this.body;
    }

}
