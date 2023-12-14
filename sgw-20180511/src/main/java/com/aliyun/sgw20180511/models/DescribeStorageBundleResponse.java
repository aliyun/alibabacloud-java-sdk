// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeStorageBundleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStorageBundleResponseBody body;

    public static DescribeStorageBundleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageBundleResponse self = new DescribeStorageBundleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStorageBundleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStorageBundleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStorageBundleResponse setBody(DescribeStorageBundleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStorageBundleResponseBody getBody() {
        return this.body;
    }

}
