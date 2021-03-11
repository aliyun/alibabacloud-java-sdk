// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsStreamsOnlineListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVsStreamsOnlineListResponseBody body;

    public static DescribeVsStreamsOnlineListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsStreamsOnlineListResponse self = new DescribeVsStreamsOnlineListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsStreamsOnlineListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsStreamsOnlineListResponse setBody(DescribeVsStreamsOnlineListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsStreamsOnlineListResponseBody getBody() {
        return this.body;
    }

}
