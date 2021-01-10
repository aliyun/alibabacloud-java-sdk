// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXRecoveryInitiatorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDTXRecoveryInitiatorResponseBody body;

    public static CreateDTXRecoveryInitiatorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXRecoveryInitiatorResponse self = new CreateDTXRecoveryInitiatorResponse();
        return TeaModel.build(map, self);
    }

    public CreateDTXRecoveryInitiatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDTXRecoveryInitiatorResponse setBody(CreateDTXRecoveryInitiatorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDTXRecoveryInitiatorResponseBody getBody() {
        return this.body;
    }

}
