// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBody body;

    public static QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse self = new QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse setBody(QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBody getBody() {
        return this.body;
    }

}
