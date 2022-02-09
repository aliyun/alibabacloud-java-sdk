// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceNodesResponseBody body;

    public static DescribeInstanceNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceNodesResponse self = new DescribeInstanceNodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceNodesResponse setBody(DescribeInstanceNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceNodesResponseBody getBody() {
        return this.body;
    }

}
