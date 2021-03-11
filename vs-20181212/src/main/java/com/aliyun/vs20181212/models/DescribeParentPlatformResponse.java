// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeParentPlatformResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeParentPlatformResponseBody body;

    public static DescribeParentPlatformResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParentPlatformResponse self = new DescribeParentPlatformResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParentPlatformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParentPlatformResponse setBody(DescribeParentPlatformResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParentPlatformResponseBody getBody() {
        return this.body;
    }

}
