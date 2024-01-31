// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeReadDBInstanceDelayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeReadDBInstanceDelayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReadDBInstanceDelayResponse setBody(DescribeReadDBInstanceDelayResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReadDBInstanceDelayResponseBody getBody() {
        return this.body;
    }

}
