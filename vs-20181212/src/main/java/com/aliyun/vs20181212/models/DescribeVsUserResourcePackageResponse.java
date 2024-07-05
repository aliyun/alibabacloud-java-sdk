// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsUserResourcePackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsUserResourcePackageResponseBody body;

    public static DescribeVsUserResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsUserResourcePackageResponse self = new DescribeVsUserResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsUserResourcePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsUserResourcePackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsUserResourcePackageResponse setBody(DescribeVsUserResourcePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsUserResourcePackageResponseBody getBody() {
        return this.body;
    }

}
