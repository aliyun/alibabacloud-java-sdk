// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeResourceConstraintsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceConstraintsResponseBody body;

    public static DescribeResourceConstraintsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceConstraintsResponse self = new DescribeResourceConstraintsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceConstraintsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceConstraintsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceConstraintsResponse setBody(DescribeResourceConstraintsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceConstraintsResponseBody getBody() {
        return this.body;
    }

}
