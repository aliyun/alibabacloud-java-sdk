// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeSubConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSubConnectionsResponseBody body;

    public static DescribeSubConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubConnectionsResponse self = new DescribeSubConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubConnectionsResponse setBody(DescribeSubConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubConnectionsResponseBody getBody() {
        return this.body;
    }

}
