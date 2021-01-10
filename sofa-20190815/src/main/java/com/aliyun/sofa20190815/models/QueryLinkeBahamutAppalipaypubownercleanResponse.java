// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppalipaypubownercleanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAppalipaypubownercleanResponseBody body;

    public static QueryLinkeBahamutAppalipaypubownercleanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppalipaypubownercleanResponse self = new QueryLinkeBahamutAppalipaypubownercleanResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppalipaypubownercleanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAppalipaypubownercleanResponse setBody(QueryLinkeBahamutAppalipaypubownercleanResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAppalipaypubownercleanResponseBody getBody() {
        return this.body;
    }

}
