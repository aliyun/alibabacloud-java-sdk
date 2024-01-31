// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateSuspiciousTargetConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateSuspiciousTargetConfigResponseBody body;

    public static OperateSuspiciousTargetConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateSuspiciousTargetConfigResponse self = new OperateSuspiciousTargetConfigResponse();
        return TeaModel.build(map, self);
    }

    public OperateSuspiciousTargetConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateSuspiciousTargetConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateSuspiciousTargetConfigResponse setBody(OperateSuspiciousTargetConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateSuspiciousTargetConfigResponseBody getBody() {
        return this.body;
    }

}
