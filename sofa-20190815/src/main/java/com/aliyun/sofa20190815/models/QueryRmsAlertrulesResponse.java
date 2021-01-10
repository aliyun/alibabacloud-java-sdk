// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlertrulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsAlertrulesResponseBody body;

    public static QueryRmsAlertrulesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlertrulesResponse self = new QueryRmsAlertrulesResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlertrulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsAlertrulesResponse setBody(QueryRmsAlertrulesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsAlertrulesResponseBody getBody() {
        return this.body;
    }

}
