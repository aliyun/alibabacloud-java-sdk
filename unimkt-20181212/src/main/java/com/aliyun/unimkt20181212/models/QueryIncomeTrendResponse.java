// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryIncomeTrendResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryIncomeTrendResponseBody body;

    public static QueryIncomeTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIncomeTrendResponse self = new QueryIncomeTrendResponse();
        return TeaModel.build(map, self);
    }

    public QueryIncomeTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIncomeTrendResponse setBody(QueryIncomeTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIncomeTrendResponseBody getBody() {
        return this.body;
    }

}
