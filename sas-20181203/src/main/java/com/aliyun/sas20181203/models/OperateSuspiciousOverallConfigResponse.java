// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateSuspiciousOverallConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateSuspiciousOverallConfigResponseBody body;

    public static OperateSuspiciousOverallConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateSuspiciousOverallConfigResponse self = new OperateSuspiciousOverallConfigResponse();
        return TeaModel.build(map, self);
    }

    public OperateSuspiciousOverallConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateSuspiciousOverallConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateSuspiciousOverallConfigResponse setBody(OperateSuspiciousOverallConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateSuspiciousOverallConfigResponseBody getBody() {
        return this.body;
    }

}
