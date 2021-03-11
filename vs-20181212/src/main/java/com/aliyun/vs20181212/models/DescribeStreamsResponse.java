// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeStreamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeStreamsResponse setBody(DescribeStreamsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStreamsResponseBody getBody() {
        return this.body;
    }

}
