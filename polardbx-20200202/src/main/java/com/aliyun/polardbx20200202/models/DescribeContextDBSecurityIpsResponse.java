// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeContextDBSecurityIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContextDBSecurityIpsResponseBody body;

    public static DescribeContextDBSecurityIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContextDBSecurityIpsResponse self = new DescribeContextDBSecurityIpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContextDBSecurityIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContextDBSecurityIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContextDBSecurityIpsResponse setBody(DescribeContextDBSecurityIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContextDBSecurityIpsResponseBody getBody() {
        return this.body;
    }

}
