// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeGatewaySecretDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewaySecretDetailsResponseBody body;

    public static DescribeGatewaySecretDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewaySecretDetailsResponse self = new DescribeGatewaySecretDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewaySecretDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewaySecretDetailsResponse setBody(DescribeGatewaySecretDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewaySecretDetailsResponseBody getBody() {
        return this.body;
    }

}
