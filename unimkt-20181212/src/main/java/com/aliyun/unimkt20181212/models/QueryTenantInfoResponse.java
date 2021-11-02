// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryTenantInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTenantInfoResponseBody body;

    public static QueryTenantInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantInfoResponse self = new QueryTenantInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryTenantInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTenantInfoResponse setBody(QueryTenantInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTenantInfoResponseBody getBody() {
        return this.body;
    }

}
