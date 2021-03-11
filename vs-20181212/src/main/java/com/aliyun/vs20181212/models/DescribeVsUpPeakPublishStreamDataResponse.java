// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsUpPeakPublishStreamDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVsUpPeakPublishStreamDataResponse setBody(DescribeVsUpPeakPublishStreamDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsUpPeakPublishStreamDataResponseBody getBody() {
        return this.body;
    }

}
