// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeFieldStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFieldStatisticsResponseBody body;

    public static DescribeFieldStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFieldStatisticsResponse self = new DescribeFieldStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFieldStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFieldStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFieldStatisticsResponse setBody(DescribeFieldStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFieldStatisticsResponseBody getBody() {
        return this.body;
    }

}
