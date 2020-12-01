// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class AbortAndRollbackChangeOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AbortAndRollbackChangeOrderResponseBody body;

    public static AbortAndRollbackChangeOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        AbortAndRollbackChangeOrderResponse self = new AbortAndRollbackChangeOrderResponse();
        return TeaModel.build(map, self);
    }

    public AbortAndRollbackChangeOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbortAndRollbackChangeOrderResponse setBody(AbortAndRollbackChangeOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public AbortAndRollbackChangeOrderResponseBody getBody() {
        return this.body;
    }

}
