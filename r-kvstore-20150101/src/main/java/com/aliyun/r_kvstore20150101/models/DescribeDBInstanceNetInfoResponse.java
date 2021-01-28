// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceNetInfoResponseBody body;

    public static DescribeDBInstanceNetInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceNetInfoResponse self = new DescribeDBInstanceNetInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceNetInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceNetInfoResponse setBody(DescribeDBInstanceNetInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceNetInfoResponseBody getBody() {
        return this.body;
    }

}
