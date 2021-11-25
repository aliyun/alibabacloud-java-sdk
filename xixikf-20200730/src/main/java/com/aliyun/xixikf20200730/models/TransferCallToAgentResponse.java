// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class TransferCallToAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TransferCallToAgentResponseBody body;

    public static TransferCallToAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferCallToAgentResponse self = new TransferCallToAgentResponse();
        return TeaModel.build(map, self);
    }

    public TransferCallToAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferCallToAgentResponse setBody(TransferCallToAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferCallToAgentResponseBody getBody() {
        return this.body;
    }

}
