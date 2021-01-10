// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasDatabaseImportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCasDatabaseImportResponseBody body;

    public static QueryCasDatabaseImportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCasDatabaseImportResponse self = new QueryCasDatabaseImportResponse();
        return TeaModel.build(map, self);
    }

    public QueryCasDatabaseImportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCasDatabaseImportResponse setBody(QueryCasDatabaseImportResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCasDatabaseImportResponseBody getBody() {
        return this.body;
    }

}
