// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutGetmvnrepoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutGetmvnrepoResponseBody body;

    public static QueryLinkeBahamutGetmvnrepoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutGetmvnrepoResponse self = new QueryLinkeBahamutGetmvnrepoResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutGetmvnrepoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutGetmvnrepoResponse setBody(QueryLinkeBahamutGetmvnrepoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutGetmvnrepoResponseBody getBody() {
        return this.body;
    }

}
