// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAuditLogCollectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterAuditLogCollectorResponseBody body;

    public static DescribeDBClusterAuditLogCollectorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAuditLogCollectorResponse self = new DescribeDBClusterAuditLogCollectorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAuditLogCollectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterAuditLogCollectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterAuditLogCollectorResponse setBody(DescribeDBClusterAuditLogCollectorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterAuditLogCollectorResponseBody getBody() {
        return this.body;
    }

}
