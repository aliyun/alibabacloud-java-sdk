// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDWSOrderStepsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDWSOrderStepsResponseBody body;

    public static QueryDWSOrderStepsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDWSOrderStepsResponse self = new QueryDWSOrderStepsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDWSOrderStepsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDWSOrderStepsResponse setBody(QueryDWSOrderStepsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDWSOrderStepsResponseBody getBody() {
        return this.body;
    }

}
