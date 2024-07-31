// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCloudResourceAccessedPortsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudResourceAccessedPortsResponseBody body;

    public static DescribeCloudResourceAccessedPortsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudResourceAccessedPortsResponse self = new DescribeCloudResourceAccessedPortsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudResourceAccessedPortsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudResourceAccessedPortsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudResourceAccessedPortsResponse setBody(DescribeCloudResourceAccessedPortsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudResourceAccessedPortsResponseBody getBody() {
        return this.body;
    }

}
