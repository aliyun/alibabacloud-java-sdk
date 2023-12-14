// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeStorageBundlesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStorageBundlesResponseBody body;

    public static DescribeStorageBundlesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageBundlesResponse self = new DescribeStorageBundlesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStorageBundlesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStorageBundlesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStorageBundlesResponse setBody(DescribeStorageBundlesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStorageBundlesResponseBody getBody() {
        return this.body;
    }

}
