// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeNetworkOptimizationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNetworkOptimizationsResponseBody body;

    public static DescribeNetworkOptimizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkOptimizationsResponse self = new DescribeNetworkOptimizationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkOptimizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkOptimizationsResponse setBody(DescribeNetworkOptimizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkOptimizationsResponseBody getBody() {
        return this.body;
    }

}
