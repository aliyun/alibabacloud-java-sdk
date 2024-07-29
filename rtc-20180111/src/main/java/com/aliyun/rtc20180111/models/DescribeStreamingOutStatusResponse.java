// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeStreamingOutStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStreamingOutStatusResponseBody body;

    public static DescribeStreamingOutStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamingOutStatusResponse self = new DescribeStreamingOutStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStreamingOutStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStreamingOutStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStreamingOutStatusResponse setBody(DescribeStreamingOutStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStreamingOutStatusResponseBody getBody() {
        return this.body;
    }

}
