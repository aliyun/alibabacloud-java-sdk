// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeResourcePackagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourcePackagesResponseBody body;

    public static DescribeResourcePackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackagesResponse self = new DescribeResourcePackagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourcePackagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourcePackagesResponse setBody(DescribeResourcePackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourcePackagesResponseBody getBody() {
        return this.body;
    }

}
