// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppquerypullrequestsettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAppquerypullrequestsettingsResponseBody body;

    public static QueryLinkeBahamutAppquerypullrequestsettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppquerypullrequestsettingsResponse self = new QueryLinkeBahamutAppquerypullrequestsettingsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppquerypullrequestsettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAppquerypullrequestsettingsResponse setBody(QueryLinkeBahamutAppquerypullrequestsettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAppquerypullrequestsettingsResponseBody getBody() {
        return this.body;
    }

}
