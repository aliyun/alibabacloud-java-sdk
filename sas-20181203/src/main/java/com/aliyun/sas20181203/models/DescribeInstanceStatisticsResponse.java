// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceStatisticsResponseBody body;

    public static DescribeInstanceStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatisticsResponse self = new DescribeInstanceStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceStatisticsResponse setBody(DescribeInstanceStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceStatisticsResponseBody getBody() {
        return this.body;
    }

}
