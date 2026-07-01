// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBBranchEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAgenticDBBranchEndpointsResponseBody body;

    public static DescribeAgenticDBBranchEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBBranchEndpointsResponse self = new DescribeAgenticDBBranchEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBBranchEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAgenticDBBranchEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAgenticDBBranchEndpointsResponse setBody(DescribeAgenticDBBranchEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAgenticDBBranchEndpointsResponseBody getBody() {
        return this.body;
    }

}
