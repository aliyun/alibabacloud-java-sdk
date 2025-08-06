// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodMultiUsageDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodMultiUsageDataResponseBody body;

    public static DescribeVodMultiUsageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodMultiUsageDataResponse self = new DescribeVodMultiUsageDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodMultiUsageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodMultiUsageDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodMultiUsageDataResponse setBody(DescribeVodMultiUsageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodMultiUsageDataResponseBody getBody() {
        return this.body;
    }

}
