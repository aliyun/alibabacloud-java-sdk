// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceVulStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceVulStatisticsResponseBody body;

    public static DescribeInstanceVulStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceVulStatisticsResponse self = new DescribeInstanceVulStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceVulStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceVulStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceVulStatisticsResponse setBody(DescribeInstanceVulStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceVulStatisticsResponseBody getBody() {
        return this.body;
    }

}
