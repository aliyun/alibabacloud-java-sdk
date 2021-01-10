// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppcustomcivalidatecronResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAppcustomcivalidatecronResponseBody body;

    public static QueryLinkeBahamutAppcustomcivalidatecronResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppcustomcivalidatecronResponse self = new QueryLinkeBahamutAppcustomcivalidatecronResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppcustomcivalidatecronResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAppcustomcivalidatecronResponse setBody(QueryLinkeBahamutAppcustomcivalidatecronResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAppcustomcivalidatecronResponseBody getBody() {
        return this.body;
    }

}
