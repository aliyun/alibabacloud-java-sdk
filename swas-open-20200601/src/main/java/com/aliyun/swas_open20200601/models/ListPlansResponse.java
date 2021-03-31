// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListPlansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPlansResponseBody body;

    public static ListPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPlansResponse self = new ListPlansResponse();
        return TeaModel.build(map, self);
    }

    public ListPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPlansResponse setBody(ListPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPlansResponseBody getBody() {
        return this.body;
    }

}
