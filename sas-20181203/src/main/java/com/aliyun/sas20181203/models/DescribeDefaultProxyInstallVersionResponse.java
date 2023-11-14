// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDefaultProxyInstallVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDefaultProxyInstallVersionResponseBody body;

    public static DescribeDefaultProxyInstallVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefaultProxyInstallVersionResponse self = new DescribeDefaultProxyInstallVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefaultProxyInstallVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefaultProxyInstallVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefaultProxyInstallVersionResponse setBody(DescribeDefaultProxyInstallVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefaultProxyInstallVersionResponseBody getBody() {
        return this.body;
    }

}
