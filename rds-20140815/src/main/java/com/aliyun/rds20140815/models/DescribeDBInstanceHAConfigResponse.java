// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceHAConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceHAConfigResponseBody body;

    public static DescribeDBInstanceHAConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceHAConfigResponse self = new DescribeDBInstanceHAConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceHAConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceHAConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceHAConfigResponse setBody(DescribeDBInstanceHAConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceHAConfigResponseBody getBody() {
        return this.body;
    }

}
