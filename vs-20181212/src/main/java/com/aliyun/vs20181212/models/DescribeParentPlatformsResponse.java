// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeParentPlatformsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeParentPlatformsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeParentPlatformsResponse setBody(DescribeParentPlatformsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParentPlatformsResponseBody getBody() {
        return this.body;
    }

}
