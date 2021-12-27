// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAccessKeyLeakDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccessKeyLeakDetailResponseBody body;

    public static DescribeAccessKeyLeakDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessKeyLeakDetailResponse self = new DescribeAccessKeyLeakDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessKeyLeakDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessKeyLeakDetailResponse setBody(DescribeAccessKeyLeakDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessKeyLeakDetailResponseBody getBody() {
        return this.body;
    }

}
