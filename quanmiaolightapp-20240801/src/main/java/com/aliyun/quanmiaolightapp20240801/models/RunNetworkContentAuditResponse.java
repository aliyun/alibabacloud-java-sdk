// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunNetworkContentAuditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunNetworkContentAuditResponseBody body;

    public static RunNetworkContentAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        RunNetworkContentAuditResponse self = new RunNetworkContentAuditResponse();
        return TeaModel.build(map, self);
    }

    public RunNetworkContentAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunNetworkContentAuditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunNetworkContentAuditResponse setBody(RunNetworkContentAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public RunNetworkContentAuditResponseBody getBody() {
        return this.body;
    }

}
