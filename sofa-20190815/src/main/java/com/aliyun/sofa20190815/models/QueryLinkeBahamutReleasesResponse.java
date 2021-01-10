// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutReleasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutReleasesResponseBody body;

    public static QueryLinkeBahamutReleasesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutReleasesResponse self = new QueryLinkeBahamutReleasesResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutReleasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutReleasesResponse setBody(QueryLinkeBahamutReleasesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutReleasesResponseBody getBody() {
        return this.body;
    }

}
