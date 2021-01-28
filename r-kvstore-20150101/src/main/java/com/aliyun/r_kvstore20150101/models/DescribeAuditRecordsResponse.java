// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeAuditRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAuditRecordsResponseBody body;

    public static DescribeAuditRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditRecordsResponse self = new DescribeAuditRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuditRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuditRecordsResponse setBody(DescribeAuditRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditRecordsResponseBody getBody() {
        return this.body;
    }

}
