// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutDeployenvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutDeployenvResponseBody body;

    public static QueryLinkeBahamutDeployenvResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutDeployenvResponse self = new QueryLinkeBahamutDeployenvResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutDeployenvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutDeployenvResponse setBody(QueryLinkeBahamutDeployenvResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutDeployenvResponseBody getBody() {
        return this.body;
    }

}
