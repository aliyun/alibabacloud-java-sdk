// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ReduceAmountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReduceAmountResponseBody body;

    public static ReduceAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        ReduceAmountResponse self = new ReduceAmountResponse();
        return TeaModel.build(map, self);
    }

    public ReduceAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReduceAmountResponse setBody(ReduceAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public ReduceAmountResponseBody getBody() {
        return this.body;
    }

}
