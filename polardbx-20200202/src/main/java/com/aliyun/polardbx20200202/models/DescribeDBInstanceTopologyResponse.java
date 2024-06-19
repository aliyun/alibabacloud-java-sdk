// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTopologyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceTopologyResponseBody body;

    public static DescribeDBInstanceTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceTopologyResponse self = new DescribeDBInstanceTopologyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceTopologyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceTopologyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceTopologyResponse setBody(DescribeDBInstanceTopologyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceTopologyResponseBody getBody() {
        return this.body;
    }

}
