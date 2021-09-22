// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListRunsStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRunsStatusResponseBody body;

    public static ListRunsStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRunsStatusResponse self = new ListRunsStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListRunsStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRunsStatusResponse setBody(ListRunsStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRunsStatusResponseBody getBody() {
        return this.body;
    }

}
