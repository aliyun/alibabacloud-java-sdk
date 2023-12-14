// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayADInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayADInfoResponseBody body;

    public static DescribeGatewayADInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayADInfoResponse self = new DescribeGatewayADInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayADInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayADInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayADInfoResponse setBody(DescribeGatewayADInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayADInfoResponseBody getBody() {
        return this.body;
    }

}
