// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBBranchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAgenticDBBranchResponseBody body;

    public static DescribeAgenticDBBranchResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBBranchResponse self = new DescribeAgenticDBBranchResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBBranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAgenticDBBranchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAgenticDBBranchResponse setBody(DescribeAgenticDBBranchResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAgenticDBBranchResponseBody getBody() {
        return this.body;
    }

}
