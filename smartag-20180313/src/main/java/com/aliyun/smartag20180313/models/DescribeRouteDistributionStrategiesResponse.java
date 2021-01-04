// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeRouteDistributionStrategiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRouteDistributionStrategiesResponseBody body;

    public static DescribeRouteDistributionStrategiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteDistributionStrategiesResponse self = new DescribeRouteDistributionStrategiesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRouteDistributionStrategiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRouteDistributionStrategiesResponse setBody(DescribeRouteDistributionStrategiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRouteDistributionStrategiesResponseBody getBody() {
        return this.body;
    }

}
