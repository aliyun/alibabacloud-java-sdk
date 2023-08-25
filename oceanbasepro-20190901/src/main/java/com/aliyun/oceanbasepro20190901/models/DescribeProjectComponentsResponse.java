// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProjectComponentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeProjectComponentsResponseBody body;

    public static DescribeProjectComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectComponentsResponse self = new DescribeProjectComponentsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProjectComponentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProjectComponentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProjectComponentsResponse setBody(DescribeProjectComponentsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProjectComponentsResponseBody getBody() {
        return this.body;
    }

}
