// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodPlayerDimensionDataDemoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodPlayerDimensionDataDemoResponseBody body;

    public static DescribeVodPlayerDimensionDataDemoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodPlayerDimensionDataDemoResponse self = new DescribeVodPlayerDimensionDataDemoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodPlayerDimensionDataDemoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodPlayerDimensionDataDemoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodPlayerDimensionDataDemoResponse setBody(DescribeVodPlayerDimensionDataDemoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodPlayerDimensionDataDemoResponseBody getBody() {
        return this.body;
    }

}
