// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBBranchesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAgenticDBBranchesResponseBody body;

    public static DescribeAgenticDBBranchesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBBranchesResponse self = new DescribeAgenticDBBranchesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBBranchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAgenticDBBranchesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAgenticDBBranchesResponse setBody(DescribeAgenticDBBranchesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAgenticDBBranchesResponseBody getBody() {
        return this.body;
    }

}
