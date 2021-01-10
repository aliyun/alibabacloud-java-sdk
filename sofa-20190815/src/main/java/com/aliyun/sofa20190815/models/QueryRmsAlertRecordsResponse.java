// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlertRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsAlertRecordsResponseBody body;

    public static QueryRmsAlertRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlertRecordsResponse self = new QueryRmsAlertRecordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlertRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsAlertRecordsResponse setBody(QueryRmsAlertRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsAlertRecordsResponseBody getBody() {
        return this.body;
    }

}
