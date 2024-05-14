// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeLogServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLogServiceStatusResponseBody body;

    public static DescribeLogServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogServiceStatusResponse self = new DescribeLogServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogServiceStatusResponse setBody(DescribeLogServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogServiceStatusResponseBody getBody() {
        return this.body;
    }

}
