// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryTenantBizConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTenantBizConfigResponseBody body;

    public static QueryTenantBizConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantBizConfigResponse self = new QueryTenantBizConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryTenantBizConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTenantBizConfigResponse setBody(QueryTenantBizConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTenantBizConfigResponseBody getBody() {
        return this.body;
    }

}
