// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class DescribeAuditLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeAuditLogsResponse setBody(DescribeAuditLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditLogsResponseBody getBody() {
        return this.body;
    }

}
