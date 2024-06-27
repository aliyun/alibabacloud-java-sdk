// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAuditConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuditConfigResponseBody body;

    public static DescribeAuditConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditConfigResponse self = new DescribeAuditConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuditConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuditConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuditConfigResponse setBody(DescribeAuditConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditConfigResponseBody getBody() {
        return this.body;
    }

}
