// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutReleaseexternalidcodediffsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutReleaseexternalidcodediffsResponseBody body;

    public static QueryLinkeBahamutReleaseexternalidcodediffsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutReleaseexternalidcodediffsResponse self = new QueryLinkeBahamutReleaseexternalidcodediffsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutReleaseexternalidcodediffsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutReleaseexternalidcodediffsResponse setBody(QueryLinkeBahamutReleaseexternalidcodediffsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutReleaseexternalidcodediffsResponseBody getBody() {
        return this.body;
    }

}
