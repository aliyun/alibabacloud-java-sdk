// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstallCaptchaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstallCaptchaResponseBody body;

    public static DescribeInstallCaptchaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstallCaptchaResponse self = new DescribeInstallCaptchaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstallCaptchaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstallCaptchaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstallCaptchaResponse setBody(DescribeInstallCaptchaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstallCaptchaResponseBody getBody() {
        return this.body;
    }

}
