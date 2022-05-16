// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.partnerintl20181227.models;

import com.aliyun.tea.*;

public class DescribeProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeProductResponseBody body;

    public static DescribeProductResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductResponse self = new DescribeProductResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProductResponse setBody(DescribeProductResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProductResponseBody getBody() {
        return this.body;
    }

}
