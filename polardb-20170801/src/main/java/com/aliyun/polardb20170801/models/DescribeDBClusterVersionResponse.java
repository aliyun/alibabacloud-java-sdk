// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBClusterVersionResponseBody body;

    public static DescribeDBClusterVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterVersionResponse self = new DescribeDBClusterVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterVersionResponse setBody(DescribeDBClusterVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterVersionResponseBody getBody() {
        return this.body;
    }

}
