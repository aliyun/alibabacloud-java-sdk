// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeAuditLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuditLogsResponseBody body;

    public static DescribeAuditLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditLogsResponse self = new DescribeAuditLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuditLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuditLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuditLogsResponse setBody(DescribeAuditLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditLogsResponseBody getBody() {
        return this.body;
    }

}
