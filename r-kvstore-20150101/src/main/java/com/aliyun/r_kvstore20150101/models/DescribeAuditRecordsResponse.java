// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeAuditRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeAuditRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuditRecordsResponse setBody(DescribeAuditRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditRecordsResponseBody getBody() {
        return this.body;
    }

}
