// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsXflushDelegateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsXflushDelegateResponseBody body;

    public static QueryRmsXflushDelegateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsXflushDelegateResponse self = new QueryRmsXflushDelegateResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsXflushDelegateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsXflushDelegateResponse setBody(QueryRmsXflushDelegateResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsXflushDelegateResponseBody getBody() {
        return this.body;
    }

}
