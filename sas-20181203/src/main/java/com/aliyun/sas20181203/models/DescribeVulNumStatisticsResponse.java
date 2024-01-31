// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulNumStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVulNumStatisticsResponseBody body;

    public static DescribeVulNumStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulNumStatisticsResponse self = new DescribeVulNumStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulNumStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVulNumStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVulNumStatisticsResponse setBody(DescribeVulNumStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVulNumStatisticsResponseBody getBody() {
        return this.body;
    }

}
