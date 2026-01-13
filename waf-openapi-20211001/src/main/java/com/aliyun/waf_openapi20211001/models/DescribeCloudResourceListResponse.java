// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCloudResourceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudResourceListResponseBody body;

    public static DescribeCloudResourceListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudResourceListResponse self = new DescribeCloudResourceListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudResourceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudResourceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudResourceListResponse setBody(DescribeCloudResourceListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudResourceListResponseBody getBody() {
        return this.body;
    }

}
