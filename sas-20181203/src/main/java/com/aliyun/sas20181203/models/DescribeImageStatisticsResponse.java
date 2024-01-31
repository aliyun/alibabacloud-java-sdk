// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageStatisticsResponseBody body;

    public static DescribeImageStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageStatisticsResponse self = new DescribeImageStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageStatisticsResponse setBody(DescribeImageStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageStatisticsResponseBody getBody() {
        return this.body;
    }

}
