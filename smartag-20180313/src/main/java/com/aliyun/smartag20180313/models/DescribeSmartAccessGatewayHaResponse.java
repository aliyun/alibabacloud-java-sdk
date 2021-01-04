// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSmartAccessGatewayHaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSmartAccessGatewayHaResponseBody body;

    public static DescribeSmartAccessGatewayHaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartAccessGatewayHaResponse self = new DescribeSmartAccessGatewayHaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmartAccessGatewayHaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSmartAccessGatewayHaResponse setBody(DescribeSmartAccessGatewayHaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmartAccessGatewayHaResponseBody getBody() {
        return this.body;
    }

}
