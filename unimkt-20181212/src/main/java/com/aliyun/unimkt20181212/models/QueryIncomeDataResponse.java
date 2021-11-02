// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryIncomeDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryIncomeDataResponseBody body;

    public static QueryIncomeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIncomeDataResponse self = new QueryIncomeDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryIncomeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIncomeDataResponse setBody(QueryIncomeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIncomeDataResponseBody getBody() {
        return this.body;
    }

}
