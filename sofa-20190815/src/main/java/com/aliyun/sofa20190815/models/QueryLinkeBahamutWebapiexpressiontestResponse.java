// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWebapiexpressiontestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutWebapiexpressiontestResponseBody body;

    public static QueryLinkeBahamutWebapiexpressiontestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWebapiexpressiontestResponse self = new QueryLinkeBahamutWebapiexpressiontestResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWebapiexpressiontestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutWebapiexpressiontestResponse setBody(QueryLinkeBahamutWebapiexpressiontestResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutWebapiexpressiontestResponseBody getBody() {
        return this.body;
    }

}
