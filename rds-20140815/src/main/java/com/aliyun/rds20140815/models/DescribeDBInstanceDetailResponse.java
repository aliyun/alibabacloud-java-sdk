// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceDetailResponseBody body;

    public static DescribeDBInstanceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceDetailResponse self = new DescribeDBInstanceDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceDetailResponse setBody(DescribeDBInstanceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceDetailResponseBody getBody() {
        return this.body;
    }

}
