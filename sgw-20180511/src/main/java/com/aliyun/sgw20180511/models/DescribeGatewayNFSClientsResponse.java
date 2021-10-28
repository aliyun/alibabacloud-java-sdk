// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayNFSClientsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayNFSClientsResponseBody body;

    public static DescribeGatewayNFSClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayNFSClientsResponse self = new DescribeGatewayNFSClientsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayNFSClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayNFSClientsResponse setBody(DescribeGatewayNFSClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayNFSClientsResponseBody getBody() {
        return this.body;
    }

}
