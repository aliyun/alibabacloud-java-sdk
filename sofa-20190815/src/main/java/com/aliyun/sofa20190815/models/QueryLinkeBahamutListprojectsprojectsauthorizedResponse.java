// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutListprojectsprojectsauthorizedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBody body;

    public static QueryLinkeBahamutListprojectsprojectsauthorizedResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutListprojectsprojectsauthorizedResponse self = new QueryLinkeBahamutListprojectsprojectsauthorizedResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutListprojectsprojectsauthorizedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutListprojectsprojectsauthorizedResponse setBody(QueryLinkeBahamutListprojectsprojectsauthorizedResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBody getBody() {
        return this.body;
    }

}
