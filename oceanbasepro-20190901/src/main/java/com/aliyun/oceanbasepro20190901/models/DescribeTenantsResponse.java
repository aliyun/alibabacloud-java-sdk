// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTenantsResponseBody body;

    public static DescribeTenantsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantsResponse self = new DescribeTenantsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTenantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTenantsResponse setBody(DescribeTenantsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTenantsResponseBody getBody() {
        return this.body;
    }

}
