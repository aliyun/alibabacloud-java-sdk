// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QuerySlotTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySlotTemplateResponseBody body;

    public static QuerySlotTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySlotTemplateResponse self = new QuerySlotTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QuerySlotTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySlotTemplateResponse setBody(QuerySlotTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySlotTemplateResponseBody getBody() {
        return this.body;
    }

}
