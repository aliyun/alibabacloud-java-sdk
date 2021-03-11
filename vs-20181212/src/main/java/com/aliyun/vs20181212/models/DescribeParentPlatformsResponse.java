// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeParentPlatformsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeParentPlatformsResponseBody body;

    public static DescribeParentPlatformsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParentPlatformsResponse self = new DescribeParentPlatformsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParentPlatformsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParentPlatformsResponse setBody(DescribeParentPlatformsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParentPlatformsResponseBody getBody() {
        return this.body;
    }

}
