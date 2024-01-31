// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstallCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstallCodeResponseBody body;

    public static DescribeInstallCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstallCodeResponse self = new DescribeInstallCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstallCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstallCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstallCodeResponse setBody(DescribeInstallCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstallCodeResponseBody getBody() {
        return this.body;
    }

}
