// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceTDEStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceTDEStatusResponseBody body;

    public static DescribeInstanceTDEStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTDEStatusResponse self = new DescribeInstanceTDEStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTDEStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceTDEStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceTDEStatusResponse setBody(DescribeInstanceTDEStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceTDEStatusResponseBody getBody() {
        return this.body;
    }

}
