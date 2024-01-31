// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHoneyPotAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHoneyPotAuthResponseBody body;

    public static DescribeHoneyPotAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHoneyPotAuthResponse self = new DescribeHoneyPotAuthResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHoneyPotAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHoneyPotAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHoneyPotAuthResponse setBody(DescribeHoneyPotAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHoneyPotAuthResponseBody getBody() {
        return this.body;
    }

}
