// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventMarkMissListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSecurityEventMarkMissListResponseBody body;

    public static DescribeSecurityEventMarkMissListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventMarkMissListResponse self = new DescribeSecurityEventMarkMissListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventMarkMissListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityEventMarkMissListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityEventMarkMissListResponse setBody(DescribeSecurityEventMarkMissListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityEventMarkMissListResponseBody getBody() {
        return this.body;
    }

}
