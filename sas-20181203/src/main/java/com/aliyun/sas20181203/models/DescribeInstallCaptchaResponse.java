// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstallCaptchaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeInstallCaptchaResponse setBody(DescribeInstallCaptchaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstallCaptchaResponseBody getBody() {
        return this.body;
    }

}
