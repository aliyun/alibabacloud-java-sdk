// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewaysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewaysResponseBody body;

    public static DescribeGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewaysResponse self = new DescribeGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewaysResponse setBody(DescribeGatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewaysResponseBody getBody() {
        return this.body;
    }

}
