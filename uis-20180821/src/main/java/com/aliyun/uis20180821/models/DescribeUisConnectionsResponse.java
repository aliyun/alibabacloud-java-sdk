// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeUisConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUisConnectionsResponseBody body;

    public static DescribeUisConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUisConnectionsResponse self = new DescribeUisConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUisConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUisConnectionsResponse setBody(DescribeUisConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUisConnectionsResponseBody getBody() {
        return this.body;
    }

}
