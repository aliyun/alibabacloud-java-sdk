// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryCredentialsInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCredentialsInfoResponseBody body;

    public static QueryCredentialsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCredentialsInfoResponse self = new QueryCredentialsInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryCredentialsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCredentialsInfoResponse setBody(QueryCredentialsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCredentialsInfoResponseBody getBody() {
        return this.body;
    }

}
