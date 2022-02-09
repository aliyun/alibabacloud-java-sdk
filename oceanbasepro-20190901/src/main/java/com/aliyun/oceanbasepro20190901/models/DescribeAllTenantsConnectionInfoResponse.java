// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAllTenantsConnectionInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAllTenantsConnectionInfoResponseBody body;

    public static DescribeAllTenantsConnectionInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllTenantsConnectionInfoResponse self = new DescribeAllTenantsConnectionInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllTenantsConnectionInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllTenantsConnectionInfoResponse setBody(DescribeAllTenantsConnectionInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllTenantsConnectionInfoResponseBody getBody() {
        return this.body;
    }

}
