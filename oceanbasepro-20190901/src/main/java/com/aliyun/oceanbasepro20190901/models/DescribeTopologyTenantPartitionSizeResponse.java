// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTopologyTenantPartitionSizeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTopologyTenantPartitionSizeResponseBody body;

    public static DescribeTopologyTenantPartitionSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopologyTenantPartitionSizeResponse self = new DescribeTopologyTenantPartitionSizeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTopologyTenantPartitionSizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTopologyTenantPartitionSizeResponse setBody(DescribeTopologyTenantPartitionSizeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTopologyTenantPartitionSizeResponseBody getBody() {
        return this.body;
    }

}
