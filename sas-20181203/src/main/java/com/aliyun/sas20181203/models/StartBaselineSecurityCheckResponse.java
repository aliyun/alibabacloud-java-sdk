// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartBaselineSecurityCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartBaselineSecurityCheckResponseBody body;

    public static StartBaselineSecurityCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        StartBaselineSecurityCheckResponse self = new StartBaselineSecurityCheckResponse();
        return TeaModel.build(map, self);
    }

    public StartBaselineSecurityCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartBaselineSecurityCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartBaselineSecurityCheckResponse setBody(StartBaselineSecurityCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public StartBaselineSecurityCheckResponseBody getBody() {
        return this.body;
    }

}
