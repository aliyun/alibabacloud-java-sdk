// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesForCloneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstancesForCloneResponseBody body;

    public static DescribeDBInstancesForCloneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesForCloneResponse self = new DescribeDBInstancesForCloneResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesForCloneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstancesForCloneResponse setBody(DescribeDBInstancesForCloneResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstancesForCloneResponseBody getBody() {
        return this.body;
    }

}
