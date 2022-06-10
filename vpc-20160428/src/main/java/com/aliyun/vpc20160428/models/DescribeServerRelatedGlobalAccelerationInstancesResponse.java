// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeServerRelatedGlobalAccelerationInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServerRelatedGlobalAccelerationInstancesResponseBody body;

    public static DescribeServerRelatedGlobalAccelerationInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerRelatedGlobalAccelerationInstancesResponse self = new DescribeServerRelatedGlobalAccelerationInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServerRelatedGlobalAccelerationInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServerRelatedGlobalAccelerationInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServerRelatedGlobalAccelerationInstancesResponse setBody(DescribeServerRelatedGlobalAccelerationInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServerRelatedGlobalAccelerationInstancesResponseBody getBody() {
        return this.body;
    }

}
