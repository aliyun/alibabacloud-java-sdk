// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXRecoveryConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDTXRecoveryConfigurationResponseBody body;

    public static CreateDTXRecoveryConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXRecoveryConfigurationResponse self = new CreateDTXRecoveryConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public CreateDTXRecoveryConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDTXRecoveryConfigurationResponse setBody(CreateDTXRecoveryConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDTXRecoveryConfigurationResponseBody getBody() {
        return this.body;
    }

}
