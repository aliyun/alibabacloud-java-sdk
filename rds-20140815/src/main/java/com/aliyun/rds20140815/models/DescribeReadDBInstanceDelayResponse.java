// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeReadDBInstanceDelayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeReadDBInstanceDelayResponseBody body;

    public static DescribeReadDBInstanceDelayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReadDBInstanceDelayResponse self = new DescribeReadDBInstanceDelayResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReadDBInstanceDelayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReadDBInstanceDelayResponse setBody(DescribeReadDBInstanceDelayResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReadDBInstanceDelayResponseBody getBody() {
        return this.body;
    }

}
