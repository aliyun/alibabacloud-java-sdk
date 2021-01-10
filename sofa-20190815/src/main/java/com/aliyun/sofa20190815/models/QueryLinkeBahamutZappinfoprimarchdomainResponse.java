// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutZappinfoprimarchdomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutZappinfoprimarchdomainResponseBody body;

    public static QueryLinkeBahamutZappinfoprimarchdomainResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutZappinfoprimarchdomainResponse self = new QueryLinkeBahamutZappinfoprimarchdomainResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutZappinfoprimarchdomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutZappinfoprimarchdomainResponse setBody(QueryLinkeBahamutZappinfoprimarchdomainResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutZappinfoprimarchdomainResponseBody getBody() {
        return this.body;
    }

}
