// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantSecurityIpGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTenantSecurityIpGroupsResponseBody body;

    public static DescribeTenantSecurityIpGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantSecurityIpGroupsResponse self = new DescribeTenantSecurityIpGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTenantSecurityIpGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTenantSecurityIpGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTenantSecurityIpGroupsResponse setBody(DescribeTenantSecurityIpGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTenantSecurityIpGroupsResponseBody getBody() {
        return this.body;
    }

}
