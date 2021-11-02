// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryTenantUserByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTenantUserByUserIdResponseBody body;

    public static QueryTenantUserByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantUserByUserIdResponse self = new QueryTenantUserByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryTenantUserByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTenantUserByUserIdResponse setBody(QueryTenantUserByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTenantUserByUserIdResponseBody getBody() {
        return this.body;
    }

}
