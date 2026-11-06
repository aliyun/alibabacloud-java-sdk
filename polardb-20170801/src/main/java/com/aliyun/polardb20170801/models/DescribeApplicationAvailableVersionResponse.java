// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationAvailableVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationAvailableVersionResponseBody body;

    public static DescribeApplicationAvailableVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationAvailableVersionResponse self = new DescribeApplicationAvailableVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationAvailableVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationAvailableVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationAvailableVersionResponse setBody(DescribeApplicationAvailableVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationAvailableVersionResponseBody getBody() {
        return this.body;
    }

}
