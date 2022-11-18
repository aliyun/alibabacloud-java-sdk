// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagExpressConnectInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySagExpressConnectInterfaceResponseBody body;

    public static ModifySagExpressConnectInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySagExpressConnectInterfaceResponse self = new ModifySagExpressConnectInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public ModifySagExpressConnectInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySagExpressConnectInterfaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySagExpressConnectInterfaceResponse setBody(ModifySagExpressConnectInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySagExpressConnectInterfaceResponseBody getBody() {
        return this.body;
    }

}
