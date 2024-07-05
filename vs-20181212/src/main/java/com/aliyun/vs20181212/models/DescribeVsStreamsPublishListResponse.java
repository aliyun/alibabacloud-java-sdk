// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsStreamsPublishListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsStreamsPublishListResponseBody body;

    public static DescribeVsStreamsPublishListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsStreamsPublishListResponse self = new DescribeVsStreamsPublishListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsStreamsPublishListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsStreamsPublishListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsStreamsPublishListResponse setBody(DescribeVsStreamsPublishListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsStreamsPublishListResponseBody getBody() {
        return this.body;
    }

}
