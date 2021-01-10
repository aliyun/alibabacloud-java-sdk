// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCASSlsLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCASSlsLogResponseBody body;

    public static QueryCASSlsLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCASSlsLogResponse self = new QueryCASSlsLogResponse();
        return TeaModel.build(map, self);
    }

    public QueryCASSlsLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCASSlsLogResponse setBody(QueryCASSlsLogResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCASSlsLogResponseBody getBody() {
        return this.body;
    }

}
