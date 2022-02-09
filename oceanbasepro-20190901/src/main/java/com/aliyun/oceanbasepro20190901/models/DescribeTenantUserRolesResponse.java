// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantUserRolesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTenantUserRolesResponseBody body;

    public static DescribeTenantUserRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantUserRolesResponse self = new DescribeTenantUserRolesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTenantUserRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTenantUserRolesResponse setBody(DescribeTenantUserRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTenantUserRolesResponseBody getBody() {
        return this.body;
    }

}
