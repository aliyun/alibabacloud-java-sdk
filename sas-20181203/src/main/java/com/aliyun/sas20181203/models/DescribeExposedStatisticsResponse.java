// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExposedStatisticsResponseBody body;

    public static DescribeExposedStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedStatisticsResponse self = new DescribeExposedStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExposedStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExposedStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExposedStatisticsResponse setBody(DescribeExposedStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExposedStatisticsResponseBody getBody() {
        return this.body;
    }

}
