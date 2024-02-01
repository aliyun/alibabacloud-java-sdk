// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeGlobalAccelerationInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGlobalAccelerationInstancesResponseBody body;

    public static DescribeGlobalAccelerationInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalAccelerationInstancesResponse self = new DescribeGlobalAccelerationInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalAccelerationInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGlobalAccelerationInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGlobalAccelerationInstancesResponse setBody(DescribeGlobalAccelerationInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGlobalAccelerationInstancesResponseBody getBody() {
        return this.body;
    }

}
