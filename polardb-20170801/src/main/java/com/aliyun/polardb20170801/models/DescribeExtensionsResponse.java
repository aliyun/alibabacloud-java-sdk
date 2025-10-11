// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeExtensionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExtensionsResponseBody body;

    public static DescribeExtensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExtensionsResponse self = new DescribeExtensionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExtensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExtensionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExtensionsResponse setBody(DescribeExtensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExtensionsResponseBody getBody() {
        return this.body;
    }

}
