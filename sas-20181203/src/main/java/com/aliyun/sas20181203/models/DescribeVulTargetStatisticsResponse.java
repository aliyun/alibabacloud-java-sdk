// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulTargetStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVulTargetStatisticsResponseBody body;

    public static DescribeVulTargetStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulTargetStatisticsResponse self = new DescribeVulTargetStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulTargetStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVulTargetStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVulTargetStatisticsResponse setBody(DescribeVulTargetStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVulTargetStatisticsResponseBody getBody() {
        return this.body;
    }

}
