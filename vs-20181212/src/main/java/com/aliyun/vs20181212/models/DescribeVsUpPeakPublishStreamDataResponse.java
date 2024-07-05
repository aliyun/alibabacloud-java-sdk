// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsUpPeakPublishStreamDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsUpPeakPublishStreamDataResponseBody body;

    public static DescribeVsUpPeakPublishStreamDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsUpPeakPublishStreamDataResponse self = new DescribeVsUpPeakPublishStreamDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsUpPeakPublishStreamDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsUpPeakPublishStreamDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsUpPeakPublishStreamDataResponse setBody(DescribeVsUpPeakPublishStreamDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsUpPeakPublishStreamDataResponseBody getBody() {
        return this.body;
    }

}
