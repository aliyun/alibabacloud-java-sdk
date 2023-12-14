// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayLDAPInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayLDAPInfoResponseBody body;

    public static DescribeGatewayLDAPInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayLDAPInfoResponse self = new DescribeGatewayLDAPInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayLDAPInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayLDAPInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayLDAPInfoResponse setBody(DescribeGatewayLDAPInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayLDAPInfoResponseBody getBody() {
        return this.body;
    }

}
