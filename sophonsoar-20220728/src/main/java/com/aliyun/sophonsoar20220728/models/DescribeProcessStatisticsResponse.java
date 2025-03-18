// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeProcessStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProcessStatisticsResponseBody body;

    public static DescribeProcessStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessStatisticsResponse self = new DescribeProcessStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProcessStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProcessStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProcessStatisticsResponse setBody(DescribeProcessStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProcessStatisticsResponseBody getBody() {
        return this.body;
    }

}
