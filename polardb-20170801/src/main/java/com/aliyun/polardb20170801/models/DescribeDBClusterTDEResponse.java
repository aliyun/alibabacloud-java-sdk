// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterTDEResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBClusterTDEResponseBody body;

    public static DescribeDBClusterTDEResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterTDEResponse self = new DescribeDBClusterTDEResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterTDEResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterTDEResponse setBody(DescribeDBClusterTDEResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterTDEResponseBody getBody() {
        return this.body;
    }

}
