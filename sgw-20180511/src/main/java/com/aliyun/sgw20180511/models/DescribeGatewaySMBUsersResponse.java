// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewaySMBUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewaySMBUsersResponseBody body;

    public static DescribeGatewaySMBUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewaySMBUsersResponse self = new DescribeGatewaySMBUsersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewaySMBUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewaySMBUsersResponse setBody(DescribeGatewaySMBUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewaySMBUsersResponseBody getBody() {
        return this.body;
    }

}
