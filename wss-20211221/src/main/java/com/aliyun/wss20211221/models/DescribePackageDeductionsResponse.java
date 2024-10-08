// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribePackageDeductionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePackageDeductionsResponseBody body;

    public static DescribePackageDeductionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePackageDeductionsResponse self = new DescribePackageDeductionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePackageDeductionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePackageDeductionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePackageDeductionsResponse setBody(DescribePackageDeductionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePackageDeductionsResponseBody getBody() {
        return this.body;
    }

}
