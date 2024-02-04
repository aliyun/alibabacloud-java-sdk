// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsOpenAPIProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOmsOpenAPIProjectResponseBody body;

    public static DescribeOmsOpenAPIProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsOpenAPIProjectResponse self = new DescribeOmsOpenAPIProjectResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOmsOpenAPIProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOmsOpenAPIProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOmsOpenAPIProjectResponse setBody(DescribeOmsOpenAPIProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOmsOpenAPIProjectResponseBody getBody() {
        return this.body;
    }

}
