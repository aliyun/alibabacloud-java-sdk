// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBNodesParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBNodesParametersResponseBody body;

    public static DescribeDBNodesParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBNodesParametersResponse self = new DescribeDBNodesParametersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBNodesParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBNodesParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBNodesParametersResponse setBody(DescribeDBNodesParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBNodesParametersResponseBody getBody() {
        return this.body;
    }

}
