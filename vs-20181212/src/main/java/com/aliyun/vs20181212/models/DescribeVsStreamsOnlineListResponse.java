// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsStreamsOnlineListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeVsStreamsOnlineListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsStreamsOnlineListResponse setBody(DescribeVsStreamsOnlineListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsStreamsOnlineListResponseBody getBody() {
        return this.body;
    }

}
