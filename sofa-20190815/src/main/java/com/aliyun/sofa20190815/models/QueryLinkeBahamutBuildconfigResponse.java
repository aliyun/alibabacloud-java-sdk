// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutBuildconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutBuildconfigResponseBody body;

    public static QueryLinkeBahamutBuildconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutBuildconfigResponse self = new QueryLinkeBahamutBuildconfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutBuildconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutBuildconfigResponse setBody(QueryLinkeBahamutBuildconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutBuildconfigResponseBody getBody() {
        return this.body;
    }

}
