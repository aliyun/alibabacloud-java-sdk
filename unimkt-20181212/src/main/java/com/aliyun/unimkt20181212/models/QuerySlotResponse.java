// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QuerySlotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySlotResponseBody body;

    public static QuerySlotResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySlotResponse self = new QuerySlotResponse();
        return TeaModel.build(map, self);
    }

    public QuerySlotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySlotResponse setBody(QuerySlotResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySlotResponseBody getBody() {
        return this.body;
    }

}
