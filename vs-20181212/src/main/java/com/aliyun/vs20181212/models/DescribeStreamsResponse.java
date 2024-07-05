// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeStreamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStreamsResponseBody body;

    public static DescribeStreamsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamsResponse self = new DescribeStreamsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStreamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStreamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStreamsResponse setBody(DescribeStreamsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStreamsResponseBody getBody() {
        return this.body;
    }

}
