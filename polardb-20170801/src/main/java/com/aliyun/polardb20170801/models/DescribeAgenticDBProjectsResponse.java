// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAgenticDBProjectsResponseBody body;

    public static DescribeAgenticDBProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBProjectsResponse self = new DescribeAgenticDBProjectsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAgenticDBProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAgenticDBProjectsResponse setBody(DescribeAgenticDBProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAgenticDBProjectsResponseBody getBody() {
        return this.body;
    }

}
