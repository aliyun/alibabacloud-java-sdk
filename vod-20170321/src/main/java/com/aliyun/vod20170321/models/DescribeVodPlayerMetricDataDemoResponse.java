// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodPlayerMetricDataDemoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodPlayerMetricDataDemoResponseBody body;

    public static DescribeVodPlayerMetricDataDemoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodPlayerMetricDataDemoResponse self = new DescribeVodPlayerMetricDataDemoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodPlayerMetricDataDemoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodPlayerMetricDataDemoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodPlayerMetricDataDemoResponse setBody(DescribeVodPlayerMetricDataDemoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodPlayerMetricDataDemoResponseBody getBody() {
        return this.body;
    }

}
