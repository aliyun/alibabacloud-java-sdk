// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTenantUsersResponseBody body;

    public static DescribeTenantUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantUsersResponse self = new DescribeTenantUsersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTenantUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTenantUsersResponse setBody(DescribeTenantUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTenantUsersResponseBody getBody() {
        return this.body;
    }

}
