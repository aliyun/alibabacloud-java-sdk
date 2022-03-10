// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDataServiceResponseBody body;

    public static QueryDataServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDataServiceResponse self = new QueryDataServiceResponse();
        return TeaModel.build(map, self);
    }

    public QueryDataServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDataServiceResponse setBody(QueryDataServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDataServiceResponseBody getBody() {
        return this.body;
    }

}
