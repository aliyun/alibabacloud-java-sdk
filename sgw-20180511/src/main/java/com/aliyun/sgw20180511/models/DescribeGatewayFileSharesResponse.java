// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayFileSharesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayFileSharesResponseBody body;

    public static DescribeGatewayFileSharesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayFileSharesResponse self = new DescribeGatewayFileSharesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayFileSharesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayFileSharesResponse setBody(DescribeGatewayFileSharesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayFileSharesResponseBody getBody() {
        return this.body;
    }

}
