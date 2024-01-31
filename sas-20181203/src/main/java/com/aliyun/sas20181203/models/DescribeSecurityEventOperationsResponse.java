// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSecurityEventOperationsResponseBody body;

    public static DescribeSecurityEventOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventOperationsResponse self = new DescribeSecurityEventOperationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventOperationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityEventOperationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityEventOperationsResponse setBody(DescribeSecurityEventOperationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityEventOperationsResponseBody getBody() {
        return this.body;
    }

}
