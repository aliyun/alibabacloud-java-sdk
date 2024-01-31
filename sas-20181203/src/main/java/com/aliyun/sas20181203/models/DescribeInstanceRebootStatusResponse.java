// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceRebootStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceRebootStatusResponseBody body;

    public static DescribeInstanceRebootStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRebootStatusResponse self = new DescribeInstanceRebootStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRebootStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceRebootStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceRebootStatusResponse setBody(DescribeInstanceRebootStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceRebootStatusResponseBody getBody() {
        return this.body;
    }

}
