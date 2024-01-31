// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterVulStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterVulStatisticsResponseBody body;

    public static DescribeClusterVulStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterVulStatisticsResponse self = new DescribeClusterVulStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterVulStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterVulStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterVulStatisticsResponse setBody(DescribeClusterVulStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterVulStatisticsResponseBody getBody() {
        return this.body;
    }

}
