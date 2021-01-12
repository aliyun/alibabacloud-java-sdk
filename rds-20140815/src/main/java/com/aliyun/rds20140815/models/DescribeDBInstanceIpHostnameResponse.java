// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIpHostnameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceIpHostnameResponseBody body;

    public static DescribeDBInstanceIpHostnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceIpHostnameResponse self = new DescribeDBInstanceIpHostnameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceIpHostnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceIpHostnameResponse setBody(DescribeDBInstanceIpHostnameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceIpHostnameResponseBody getBody() {
        return this.body;
    }

}
