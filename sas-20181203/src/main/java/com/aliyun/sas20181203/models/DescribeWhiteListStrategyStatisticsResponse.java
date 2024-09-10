// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWhiteListStrategyStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWhiteListStrategyStatisticsResponseBody body;

    public static DescribeWhiteListStrategyStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListStrategyStatisticsResponse self = new DescribeWhiteListStrategyStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListStrategyStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWhiteListStrategyStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWhiteListStrategyStatisticsResponse setBody(DescribeWhiteListStrategyStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWhiteListStrategyStatisticsResponseBody getBody() {
        return this.body;
    }

}
