// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAuditLogCollectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDBClusterAuditLogCollectorResponse setBody(DescribeDBClusterAuditLogCollectorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterAuditLogCollectorResponseBody getBody() {
        return this.body;
    }

}
