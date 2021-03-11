// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsStreamsPublishListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVsStreamsPublishListResponse setBody(DescribeVsStreamsPublishListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsStreamsPublishListResponseBody getBody() {
        return this.body;
    }

}
