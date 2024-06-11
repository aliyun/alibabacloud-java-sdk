// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulDefendCountStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVulDefendCountStatisticsResponseBody body;

    public static DescribeVulDefendCountStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulDefendCountStatisticsResponse self = new DescribeVulDefendCountStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulDefendCountStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVulDefendCountStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVulDefendCountStatisticsResponse setBody(DescribeVulDefendCountStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVulDefendCountStatisticsResponseBody getBody() {
        return this.body;
    }

}
