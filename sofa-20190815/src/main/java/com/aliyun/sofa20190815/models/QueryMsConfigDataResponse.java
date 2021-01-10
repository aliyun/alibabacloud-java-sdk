// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsConfigDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsConfigDataResponseBody body;

    public static QueryMsConfigDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsConfigDataResponse self = new QueryMsConfigDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsConfigDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsConfigDataResponse setBody(QueryMsConfigDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsConfigDataResponseBody getBody() {
        return this.body;
    }

}
