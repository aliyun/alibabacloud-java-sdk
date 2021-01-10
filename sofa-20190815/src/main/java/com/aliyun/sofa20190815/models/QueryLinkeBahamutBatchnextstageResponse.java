// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutBatchnextstageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutBatchnextstageResponseBody body;

    public static QueryLinkeBahamutBatchnextstageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutBatchnextstageResponse self = new QueryLinkeBahamutBatchnextstageResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutBatchnextstageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutBatchnextstageResponse setBody(QueryLinkeBahamutBatchnextstageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutBatchnextstageResponseBody getBody() {
        return this.body;
    }

}
