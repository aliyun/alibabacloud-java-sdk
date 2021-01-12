// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDBInstanceDetailResponse setBody(DescribeDBInstanceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceDetailResponseBody getBody() {
        return this.body;
    }

}
