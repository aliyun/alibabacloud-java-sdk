// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterMonitorResponseBody body;

    public static DescribeDBClusterMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterMonitorResponse self = new DescribeDBClusterMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterMonitorResponse setBody(DescribeDBClusterMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterMonitorResponseBody getBody() {
        return this.body;
    }

}
