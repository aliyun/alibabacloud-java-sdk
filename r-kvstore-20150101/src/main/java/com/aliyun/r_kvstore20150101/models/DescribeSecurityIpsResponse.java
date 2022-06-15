// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeSecurityIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSecurityIpsResponseBody body;

    public static DescribeSecurityIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityIpsResponse self = new DescribeSecurityIpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityIpsResponse setBody(DescribeSecurityIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityIpsResponseBody getBody() {
        return this.body;
    }

}
