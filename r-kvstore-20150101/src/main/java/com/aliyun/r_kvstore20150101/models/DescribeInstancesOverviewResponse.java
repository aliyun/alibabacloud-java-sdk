// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstancesOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstancesOverviewResponseBody body;

    public static DescribeInstancesOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesOverviewResponse self = new DescribeInstancesOverviewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstancesOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstancesOverviewResponse setBody(DescribeInstancesOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstancesOverviewResponseBody getBody() {
        return this.body;
    }

}
