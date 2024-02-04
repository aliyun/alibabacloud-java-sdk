// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceTenantModesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceTenantModesResponseBody body;

    public static DescribeInstanceTenantModesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTenantModesResponse self = new DescribeInstanceTenantModesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTenantModesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceTenantModesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceTenantModesResponse setBody(DescribeInstanceTenantModesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceTenantModesResponseBody getBody() {
        return this.body;
    }

}
