// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenHostStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScreenHostStatisticsResponseBody body;

    public static DescribeScreenHostStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenHostStatisticsResponse self = new DescribeScreenHostStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScreenHostStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScreenHostStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScreenHostStatisticsResponse setBody(DescribeScreenHostStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScreenHostStatisticsResponseBody getBody() {
        return this.body;
    }

}
