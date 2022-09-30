// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public DescribeTenantUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTenantUsersResponse setBody(DescribeTenantUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTenantUsersResponseBody getBody() {
        return this.body;
    }

}
