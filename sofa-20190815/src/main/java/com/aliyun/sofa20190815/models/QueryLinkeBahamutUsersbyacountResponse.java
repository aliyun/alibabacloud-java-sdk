// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutUsersbyacountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutUsersbyacountResponseBody body;

    public static QueryLinkeBahamutUsersbyacountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutUsersbyacountResponse self = new QueryLinkeBahamutUsersbyacountResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutUsersbyacountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutUsersbyacountResponse setBody(QueryLinkeBahamutUsersbyacountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutUsersbyacountResponseBody getBody() {
        return this.body;
    }

}
