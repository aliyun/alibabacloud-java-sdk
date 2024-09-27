// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DescribeReplicationJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeReplicationJobsResponseBody body;

    public static DescribeReplicationJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicationJobsResponse self = new DescribeReplicationJobsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReplicationJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReplicationJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReplicationJobsResponse setBody(DescribeReplicationJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReplicationJobsResponseBody getBody() {
        return this.body;
    }

}
