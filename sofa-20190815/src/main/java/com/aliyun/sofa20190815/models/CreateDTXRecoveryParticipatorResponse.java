// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXRecoveryParticipatorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDTXRecoveryParticipatorResponseBody body;

    public static CreateDTXRecoveryParticipatorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXRecoveryParticipatorResponse self = new CreateDTXRecoveryParticipatorResponse();
        return TeaModel.build(map, self);
    }

    public CreateDTXRecoveryParticipatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDTXRecoveryParticipatorResponse setBody(CreateDTXRecoveryParticipatorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDTXRecoveryParticipatorResponseBody getBody() {
        return this.body;
    }

}
