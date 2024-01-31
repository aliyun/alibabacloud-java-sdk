// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSecurityEventOperationStatusResponseBody body;

    public static DescribeSecurityEventOperationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventOperationStatusResponse self = new DescribeSecurityEventOperationStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventOperationStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityEventOperationStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityEventOperationStatusResponse setBody(DescribeSecurityEventOperationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityEventOperationStatusResponseBody getBody() {
        return this.body;
    }

}
