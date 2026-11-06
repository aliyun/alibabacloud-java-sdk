// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDataProcessJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataProcessJobsResponseBody body;

    public static DescribeDataProcessJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataProcessJobsResponse self = new DescribeDataProcessJobsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataProcessJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataProcessJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataProcessJobsResponse setBody(DescribeDataProcessJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataProcessJobsResponseBody getBody() {
        return this.body;
    }

}
