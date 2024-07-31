// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCloudResourceAccessPortDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudResourceAccessPortDetailsResponseBody body;

    public static DescribeCloudResourceAccessPortDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudResourceAccessPortDetailsResponse self = new DescribeCloudResourceAccessPortDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudResourceAccessPortDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudResourceAccessPortDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudResourceAccessPortDetailsResponse setBody(DescribeCloudResourceAccessPortDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudResourceAccessPortDetailsResponseBody getBody() {
        return this.body;
    }

}
