// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSmartAccessGatewayClientUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSmartAccessGatewayClientUsersResponseBody body;

    public static DescribeSmartAccessGatewayClientUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartAccessGatewayClientUsersResponse self = new DescribeSmartAccessGatewayClientUsersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmartAccessGatewayClientUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSmartAccessGatewayClientUsersResponse setBody(DescribeSmartAccessGatewayClientUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmartAccessGatewayClientUsersResponseBody getBody() {
        return this.body;
    }

}
