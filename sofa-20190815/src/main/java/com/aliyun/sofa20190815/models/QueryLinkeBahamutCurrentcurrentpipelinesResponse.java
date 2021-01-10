// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutCurrentcurrentpipelinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutCurrentcurrentpipelinesResponseBody body;

    public static QueryLinkeBahamutCurrentcurrentpipelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutCurrentcurrentpipelinesResponse self = new QueryLinkeBahamutCurrentcurrentpipelinesResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutCurrentcurrentpipelinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutCurrentcurrentpipelinesResponse setBody(QueryLinkeBahamutCurrentcurrentpipelinesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutCurrentcurrentpipelinesResponseBody getBody() {
        return this.body;
    }

}
