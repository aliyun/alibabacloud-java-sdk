// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityStatInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSecurityStatInfoResponseBody body;

    public static DescribeSecurityStatInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityStatInfoResponse self = new DescribeSecurityStatInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityStatInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityStatInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityStatInfoResponse setBody(DescribeSecurityStatInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityStatInfoResponseBody getBody() {
        return this.body;
    }

}
