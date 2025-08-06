// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodPlayerDimensionDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodPlayerDimensionDataResponseBody body;

    public static DescribeVodPlayerDimensionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodPlayerDimensionDataResponse self = new DescribeVodPlayerDimensionDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodPlayerDimensionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodPlayerDimensionDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodPlayerDimensionDataResponse setBody(DescribeVodPlayerDimensionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodPlayerDimensionDataResponseBody getBody() {
        return this.body;
    }

}
