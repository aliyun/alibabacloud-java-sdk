// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDTXTransactionSagaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDTXTransactionSagaResponseBody body;

    public static GetDTXTransactionSagaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDTXTransactionSagaResponse self = new GetDTXTransactionSagaResponse();
        return TeaModel.build(map, self);
    }

    public GetDTXTransactionSagaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDTXTransactionSagaResponse setBody(GetDTXTransactionSagaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDTXTransactionSagaResponseBody getBody() {
        return this.body;
    }

}
