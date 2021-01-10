// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutOpenontrialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutOpenontrialResponseBody body;

    public static QueryLinkeBahamutOpenontrialResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutOpenontrialResponse self = new QueryLinkeBahamutOpenontrialResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutOpenontrialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutOpenontrialResponse setBody(QueryLinkeBahamutOpenontrialResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutOpenontrialResponseBody getBody() {
        return this.body;
    }

}
