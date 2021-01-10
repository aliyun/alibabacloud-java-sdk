// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXRecoveryInitiatorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDTXRecoveryInitiatorsResponseBody body;

    public static CreateDTXRecoveryInitiatorsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXRecoveryInitiatorsResponse self = new CreateDTXRecoveryInitiatorsResponse();
        return TeaModel.build(map, self);
    }

    public CreateDTXRecoveryInitiatorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDTXRecoveryInitiatorsResponse setBody(CreateDTXRecoveryInitiatorsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDTXRecoveryInitiatorsResponseBody getBody() {
        return this.body;
    }

}
