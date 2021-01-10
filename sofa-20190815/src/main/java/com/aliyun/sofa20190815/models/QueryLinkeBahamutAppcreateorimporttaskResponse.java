// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppcreateorimporttaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAppcreateorimporttaskResponseBody body;

    public static QueryLinkeBahamutAppcreateorimporttaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppcreateorimporttaskResponse self = new QueryLinkeBahamutAppcreateorimporttaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppcreateorimporttaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAppcreateorimporttaskResponse setBody(QueryLinkeBahamutAppcreateorimporttaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAppcreateorimporttaskResponseBody getBody() {
        return this.body;
    }

}
