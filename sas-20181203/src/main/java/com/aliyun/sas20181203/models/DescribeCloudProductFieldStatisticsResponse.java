// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudProductFieldStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudProductFieldStatisticsResponseBody body;

    public static DescribeCloudProductFieldStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudProductFieldStatisticsResponse self = new DescribeCloudProductFieldStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudProductFieldStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudProductFieldStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudProductFieldStatisticsResponse setBody(DescribeCloudProductFieldStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudProductFieldStatisticsResponseBody getBody() {
        return this.body;
    }

}
