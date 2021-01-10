// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXAppsRecoveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDTXAppsRecoveryResponseBody body;

    public static CreateDTXAppsRecoveryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXAppsRecoveryResponse self = new CreateDTXAppsRecoveryResponse();
        return TeaModel.build(map, self);
    }

    public CreateDTXAppsRecoveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDTXAppsRecoveryResponse setBody(CreateDTXAppsRecoveryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDTXAppsRecoveryResponseBody getBody() {
        return this.body;
    }

}
