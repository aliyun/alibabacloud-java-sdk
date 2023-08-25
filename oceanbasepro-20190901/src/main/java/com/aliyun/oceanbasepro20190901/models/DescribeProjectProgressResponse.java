// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProjectProgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeProjectProgressResponseBody body;

    public static DescribeProjectProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectProgressResponse self = new DescribeProjectProgressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProjectProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProjectProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProjectProgressResponse setBody(DescribeProjectProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProjectProgressResponseBody getBody() {
        return this.body;
    }

}
