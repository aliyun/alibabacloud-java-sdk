// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBBranchLineageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAgenticDBBranchLineageResponseBody body;

    public static DescribeAgenticDBBranchLineageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBBranchLineageResponse self = new DescribeAgenticDBBranchLineageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBBranchLineageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAgenticDBBranchLineageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAgenticDBBranchLineageResponse setBody(DescribeAgenticDBBranchLineageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAgenticDBBranchLineageResponseBody getBody() {
        return this.body;
    }

}
