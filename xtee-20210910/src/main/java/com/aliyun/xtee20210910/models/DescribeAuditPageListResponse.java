// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAuditPageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuditPageListResponseBody body;

    public static DescribeAuditPageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditPageListResponse self = new DescribeAuditPageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuditPageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuditPageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuditPageListResponse setBody(DescribeAuditPageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditPageListResponseBody getBody() {
        return this.body;
    }

}
