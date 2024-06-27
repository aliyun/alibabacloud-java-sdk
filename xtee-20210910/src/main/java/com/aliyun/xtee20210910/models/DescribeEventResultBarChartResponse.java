// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventResultBarChartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventResultBarChartResponseBody body;

    public static DescribeEventResultBarChartResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventResultBarChartResponse self = new DescribeEventResultBarChartResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventResultBarChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventResultBarChartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventResultBarChartResponse setBody(DescribeEventResultBarChartResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventResultBarChartResponseBody getBody() {
        return this.body;
    }

}
