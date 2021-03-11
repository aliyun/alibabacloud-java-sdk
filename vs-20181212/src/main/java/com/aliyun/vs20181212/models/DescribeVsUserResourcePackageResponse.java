// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsUserResourcePackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVsUserResourcePackageResponse setBody(DescribeVsUserResourcePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsUserResourcePackageResponseBody getBody() {
        return this.body;
    }

}
