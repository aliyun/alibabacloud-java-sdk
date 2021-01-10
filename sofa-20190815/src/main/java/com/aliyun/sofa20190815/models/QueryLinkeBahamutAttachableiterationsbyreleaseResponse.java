// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAttachableiterationsbyreleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAttachableiterationsbyreleaseResponseBody body;

    public static QueryLinkeBahamutAttachableiterationsbyreleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAttachableiterationsbyreleaseResponse self = new QueryLinkeBahamutAttachableiterationsbyreleaseResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAttachableiterationsbyreleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAttachableiterationsbyreleaseResponse setBody(QueryLinkeBahamutAttachableiterationsbyreleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAttachableiterationsbyreleaseResponseBody getBody() {
        return this.body;
    }

}
