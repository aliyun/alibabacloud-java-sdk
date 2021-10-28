// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayStatisticsResponseBody body;

    public static DescribeGatewayStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayStatisticsResponse self = new DescribeGatewayStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayStatisticsResponse setBody(DescribeGatewayStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayStatisticsResponseBody getBody() {
        return this.body;
    }

}
