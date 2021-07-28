// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceStatusResponseBody body;

    public static DescribeDBInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceStatusResponse self = new DescribeDBInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceStatusResponse setBody(DescribeDBInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceStatusResponseBody getBody() {
        return this.body;
    }

}
