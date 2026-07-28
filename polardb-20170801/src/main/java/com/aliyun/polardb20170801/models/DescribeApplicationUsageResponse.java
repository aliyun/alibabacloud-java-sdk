// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationUsageResponseBody body;

    public static DescribeApplicationUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationUsageResponse self = new DescribeApplicationUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationUsageResponse setBody(DescribeApplicationUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationUsageResponseBody getBody() {
        return this.body;
    }

}
