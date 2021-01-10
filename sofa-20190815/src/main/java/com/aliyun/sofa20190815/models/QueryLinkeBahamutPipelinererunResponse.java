// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutPipelinererunResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutPipelinererunResponseBody body;

    public static QueryLinkeBahamutPipelinererunResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutPipelinererunResponse self = new QueryLinkeBahamutPipelinererunResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutPipelinererunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutPipelinererunResponse setBody(QueryLinkeBahamutPipelinererunResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutPipelinererunResponseBody getBody() {
        return this.body;
    }

}
