// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodPlayerMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodPlayerMetricDataResponseBody body;

    public static DescribeVodPlayerMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodPlayerMetricDataResponse self = new DescribeVodPlayerMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodPlayerMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodPlayerMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodPlayerMetricDataResponse setBody(DescribeVodPlayerMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodPlayerMetricDataResponseBody getBody() {
        return this.body;
    }

}
