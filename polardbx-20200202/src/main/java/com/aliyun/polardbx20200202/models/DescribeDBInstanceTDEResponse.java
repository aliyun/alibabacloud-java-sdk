// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTDEResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceTDEResponseBody body;

    public static DescribeDBInstanceTDEResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceTDEResponse self = new DescribeDBInstanceTDEResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceTDEResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceTDEResponse setBody(DescribeDBInstanceTDEResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceTDEResponseBody getBody() {
        return this.body;
    }

}
