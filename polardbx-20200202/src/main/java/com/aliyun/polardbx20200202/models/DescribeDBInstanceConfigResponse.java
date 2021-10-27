// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceConfigResponseBody body;

    public static DescribeDBInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceConfigResponse self = new DescribeDBInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceConfigResponse setBody(DescribeDBInstanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceConfigResponseBody getBody() {
        return this.body;
    }

}
