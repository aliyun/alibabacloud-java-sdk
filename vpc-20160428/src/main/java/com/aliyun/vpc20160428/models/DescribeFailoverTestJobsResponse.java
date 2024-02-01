// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeFailoverTestJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFailoverTestJobsResponseBody body;

    public static DescribeFailoverTestJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFailoverTestJobsResponse self = new DescribeFailoverTestJobsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFailoverTestJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFailoverTestJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFailoverTestJobsResponse setBody(DescribeFailoverTestJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFailoverTestJobsResponseBody getBody() {
        return this.body;
    }

}
