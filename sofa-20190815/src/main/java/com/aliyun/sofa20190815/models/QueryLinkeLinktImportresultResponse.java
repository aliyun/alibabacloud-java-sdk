// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktImportresultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktImportresultResponseBody body;

    public static QueryLinkeLinktImportresultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktImportresultResponse self = new QueryLinkeLinktImportresultResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktImportresultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktImportresultResponse setBody(QueryLinkeLinktImportresultResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktImportresultResponseBody getBody() {
        return this.body;
    }

}
