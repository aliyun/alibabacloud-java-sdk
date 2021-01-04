// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeNetworkOptimizationSagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNetworkOptimizationSagsResponseBody body;

    public static DescribeNetworkOptimizationSagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkOptimizationSagsResponse self = new DescribeNetworkOptimizationSagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkOptimizationSagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkOptimizationSagsResponse setBody(DescribeNetworkOptimizationSagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkOptimizationSagsResponseBody getBody() {
        return this.body;
    }

}
