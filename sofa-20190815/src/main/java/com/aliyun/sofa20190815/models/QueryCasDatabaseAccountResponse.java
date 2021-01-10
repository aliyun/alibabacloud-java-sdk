// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasDatabaseAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCasDatabaseAccountResponseBody body;

    public static QueryCasDatabaseAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCasDatabaseAccountResponse self = new QueryCasDatabaseAccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryCasDatabaseAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCasDatabaseAccountResponse setBody(QueryCasDatabaseAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCasDatabaseAccountResponseBody getBody() {
        return this.body;
    }

}
