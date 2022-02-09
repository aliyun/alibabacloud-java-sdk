// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTopologyNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTopologyNodesResponseBody body;

    public static DescribeTopologyNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopologyNodesResponse self = new DescribeTopologyNodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTopologyNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTopologyNodesResponse setBody(DescribeTopologyNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTopologyNodesResponseBody getBody() {
        return this.body;
    }

}
