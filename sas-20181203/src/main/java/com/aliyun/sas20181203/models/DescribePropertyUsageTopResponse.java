// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUsageTopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePropertyUsageTopResponseBody body;

    public static DescribePropertyUsageTopResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyUsageTopResponse self = new DescribePropertyUsageTopResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyUsageTopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyUsageTopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePropertyUsageTopResponse setBody(DescribePropertyUsageTopResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyUsageTopResponseBody getBody() {
        return this.body;
    }

}
