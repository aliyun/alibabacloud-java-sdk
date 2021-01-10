// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasLoadbalanceImportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCasLoadbalanceImportResponseBody body;

    public static QueryCasLoadbalanceImportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCasLoadbalanceImportResponse self = new QueryCasLoadbalanceImportResponse();
        return TeaModel.build(map, self);
    }

    public QueryCasLoadbalanceImportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCasLoadbalanceImportResponse setBody(QueryCasLoadbalanceImportResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCasLoadbalanceImportResponseBody getBody() {
        return this.body;
    }

}
