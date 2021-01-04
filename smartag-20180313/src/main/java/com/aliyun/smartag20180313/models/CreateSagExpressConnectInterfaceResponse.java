// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateSagExpressConnectInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSagExpressConnectInterfaceResponseBody body;

    public static CreateSagExpressConnectInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSagExpressConnectInterfaceResponse self = new CreateSagExpressConnectInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateSagExpressConnectInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSagExpressConnectInterfaceResponse setBody(CreateSagExpressConnectInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSagExpressConnectInterfaceResponseBody getBody() {
        return this.body;
    }

}
