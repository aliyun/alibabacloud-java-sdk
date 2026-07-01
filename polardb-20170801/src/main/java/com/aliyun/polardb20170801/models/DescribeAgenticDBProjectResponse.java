// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAgenticDBProjectResponseBody body;

    public static DescribeAgenticDBProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBProjectResponse self = new DescribeAgenticDBProjectResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAgenticDBProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAgenticDBProjectResponse setBody(DescribeAgenticDBProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAgenticDBProjectResponseBody getBody() {
        return this.body;
    }

}
