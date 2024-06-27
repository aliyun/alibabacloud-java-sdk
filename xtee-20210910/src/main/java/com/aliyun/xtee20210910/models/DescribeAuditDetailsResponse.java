// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAuditDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuditDetailsResponseBody body;

    public static DescribeAuditDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditDetailsResponse self = new DescribeAuditDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuditDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuditDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuditDetailsResponse setBody(DescribeAuditDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditDetailsResponseBody getBody() {
        return this.body;
    }

}
