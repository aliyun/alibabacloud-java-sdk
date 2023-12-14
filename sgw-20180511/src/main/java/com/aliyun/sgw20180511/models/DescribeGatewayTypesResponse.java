// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayTypesResponseBody body;

    public static DescribeGatewayTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayTypesResponse self = new DescribeGatewayTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayTypesResponse setBody(DescribeGatewayTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayTypesResponseBody getBody() {
        return this.body;
    }

}
