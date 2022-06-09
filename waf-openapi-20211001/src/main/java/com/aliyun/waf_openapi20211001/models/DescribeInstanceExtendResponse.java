// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeInstanceExtendResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceExtendResponseBody body;

    public static DescribeInstanceExtendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceExtendResponse self = new DescribeInstanceExtendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceExtendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceExtendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceExtendResponse setBody(DescribeInstanceExtendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceExtendResponseBody getBody() {
        return this.body;
    }

}
