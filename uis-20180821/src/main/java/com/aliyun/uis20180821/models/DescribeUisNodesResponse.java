// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeUisNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUisNodesResponseBody body;

    public static DescribeUisNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUisNodesResponse self = new DescribeUisNodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUisNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUisNodesResponse setBody(DescribeUisNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUisNodesResponseBody getBody() {
        return this.body;
    }

}
