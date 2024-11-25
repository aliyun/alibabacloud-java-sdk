// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCClusterNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCClusterNodesResponseBody body;

    public static DescribeRCClusterNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCClusterNodesResponse self = new DescribeRCClusterNodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCClusterNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCClusterNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCClusterNodesResponse setBody(DescribeRCClusterNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCClusterNodesResponseBody getBody() {
        return this.body;
    }

}
