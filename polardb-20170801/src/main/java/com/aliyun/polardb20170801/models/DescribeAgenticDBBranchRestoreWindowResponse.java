// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBBranchRestoreWindowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAgenticDBBranchRestoreWindowResponseBody body;

    public static DescribeAgenticDBBranchRestoreWindowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBBranchRestoreWindowResponse self = new DescribeAgenticDBBranchRestoreWindowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBBranchRestoreWindowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAgenticDBBranchRestoreWindowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAgenticDBBranchRestoreWindowResponse setBody(DescribeAgenticDBBranchRestoreWindowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAgenticDBBranchRestoreWindowResponseBody getBody() {
        return this.body;
    }

}
