// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSmartAccessGatewayVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSmartAccessGatewayVersionsResponseBody body;

    public static DescribeSmartAccessGatewayVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartAccessGatewayVersionsResponse self = new DescribeSmartAccessGatewayVersionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmartAccessGatewayVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSmartAccessGatewayVersionsResponse setBody(DescribeSmartAccessGatewayVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmartAccessGatewayVersionsResponseBody getBody() {
        return this.body;
    }

}
