// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCloudResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudResourcesResponseBody body;

    public static DescribeCloudResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudResourcesResponse self = new DescribeCloudResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudResourcesResponse setBody(DescribeCloudResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudResourcesResponseBody getBody() {
        return this.body;
    }

}
