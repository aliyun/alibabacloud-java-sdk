// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeHealthStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHealthStatusResponseBody body;

    public static DescribeHealthStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthStatusResponse self = new DescribeHealthStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHealthStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHealthStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHealthStatusResponse setBody(DescribeHealthStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHealthStatusResponseBody getBody() {
        return this.body;
    }

}
