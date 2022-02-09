// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTopologyTenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTopologyTenantResponseBody body;

    public static DescribeTopologyTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopologyTenantResponse self = new DescribeTopologyTenantResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTopologyTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTopologyTenantResponse setBody(DescribeTopologyTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTopologyTenantResponseBody getBody() {
        return this.body;
    }

}
