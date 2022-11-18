// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateSagExpressConnectInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public CreateSagExpressConnectInterfaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSagExpressConnectInterfaceResponse setBody(CreateSagExpressConnectInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSagExpressConnectInterfaceResponseBody getBody() {
        return this.body;
    }

}
