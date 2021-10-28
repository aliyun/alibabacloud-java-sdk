// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayModificationClassesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayModificationClassesResponseBody body;

    public static DescribeGatewayModificationClassesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayModificationClassesResponse self = new DescribeGatewayModificationClassesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayModificationClassesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayModificationClassesResponse setBody(DescribeGatewayModificationClassesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayModificationClassesResponseBody getBody() {
        return this.body;
    }

}
