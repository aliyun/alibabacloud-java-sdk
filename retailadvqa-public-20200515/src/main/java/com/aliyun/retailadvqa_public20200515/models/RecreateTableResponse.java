// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class RecreateTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecreateTableResponseBody body;

    public static RecreateTableResponse build(java.util.Map<String, ?> map) throws Exception {
        RecreateTableResponse self = new RecreateTableResponse();
        return TeaModel.build(map, self);
    }

    public RecreateTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecreateTableResponse setBody(RecreateTableResponseBody body) {
        this.body = body;
        return this;
    }
    public RecreateTableResponseBody getBody() {
        return this.body;
    }

}
