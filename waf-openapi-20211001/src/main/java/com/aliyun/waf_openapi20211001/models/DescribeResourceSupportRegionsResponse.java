// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourceSupportRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceSupportRegionsResponseBody body;

    public static DescribeResourceSupportRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceSupportRegionsResponse self = new DescribeResourceSupportRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceSupportRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceSupportRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceSupportRegionsResponse setBody(DescribeResourceSupportRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceSupportRegionsResponseBody getBody() {
        return this.body;
    }

}
