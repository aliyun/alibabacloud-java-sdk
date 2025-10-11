// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationsResponseBody body;

    public static DescribeApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationsResponse self = new DescribeApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationsResponse setBody(DescribeApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationsResponseBody getBody() {
        return this.body;
    }

}
