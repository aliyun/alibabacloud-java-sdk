// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterSSLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBClusterSSLResponseBody body;

    public static DescribeDBClusterSSLResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterSSLResponse self = new DescribeDBClusterSSLResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterSSLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterSSLResponse setBody(DescribeDBClusterSSLResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterSSLResponseBody getBody() {
        return this.body;
    }

}
