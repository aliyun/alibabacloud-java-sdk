// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayDNSResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayDNSResponseBody body;

    public static DescribeGatewayDNSResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayDNSResponse self = new DescribeGatewayDNSResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayDNSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayDNSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayDNSResponse setBody(DescribeGatewayDNSResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayDNSResponseBody getBody() {
        return this.body;
    }

}
