// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class DescribePackageOrdersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePackageOrdersResponseBody body;

    public static DescribePackageOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePackageOrdersResponse self = new DescribePackageOrdersResponse();
        return TeaModel.build(map, self);
    }

    public DescribePackageOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePackageOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePackageOrdersResponse setBody(DescribePackageOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePackageOrdersResponseBody getBody() {
        return this.body;
    }

}
