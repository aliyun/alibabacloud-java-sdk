// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClientConfStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClientConfStrategyResponseBody body;

    public static DescribeClientConfStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientConfStrategyResponse self = new DescribeClientConfStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClientConfStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClientConfStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClientConfStrategyResponse setBody(DescribeClientConfStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClientConfStrategyResponseBody getBody() {
        return this.body;
    }

}
