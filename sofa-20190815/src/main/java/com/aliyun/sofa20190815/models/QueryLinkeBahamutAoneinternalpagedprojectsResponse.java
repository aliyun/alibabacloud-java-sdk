// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAoneinternalpagedprojectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAoneinternalpagedprojectsResponseBody body;

    public static QueryLinkeBahamutAoneinternalpagedprojectsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAoneinternalpagedprojectsResponse self = new QueryLinkeBahamutAoneinternalpagedprojectsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAoneinternalpagedprojectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAoneinternalpagedprojectsResponse setBody(QueryLinkeBahamutAoneinternalpagedprojectsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAoneinternalpagedprojectsResponseBody getBody() {
        return this.body;
    }

}
