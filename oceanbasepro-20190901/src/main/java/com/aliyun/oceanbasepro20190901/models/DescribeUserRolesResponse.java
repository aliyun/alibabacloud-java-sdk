// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeUserRolesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserRolesResponseBody body;

    public static DescribeUserRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserRolesResponse self = new DescribeUserRolesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserRolesResponse setBody(DescribeUserRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserRolesResponseBody getBody() {
        return this.body;
    }

}
