// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulFixStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVulFixStatisticsResponseBody body;

    public static DescribeVulFixStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulFixStatisticsResponse self = new DescribeVulFixStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulFixStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVulFixStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVulFixStatisticsResponse setBody(DescribeVulFixStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVulFixStatisticsResponseBody getBody() {
        return this.body;
    }

}
