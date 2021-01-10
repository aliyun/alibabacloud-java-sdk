// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutIterationaddunitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutIterationaddunitResponseBody body;

    public static QueryLinkeBahamutIterationaddunitResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutIterationaddunitResponse self = new QueryLinkeBahamutIterationaddunitResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutIterationaddunitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutIterationaddunitResponse setBody(QueryLinkeBahamutIterationaddunitResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutIterationaddunitResponseBody getBody() {
        return this.body;
    }

}
