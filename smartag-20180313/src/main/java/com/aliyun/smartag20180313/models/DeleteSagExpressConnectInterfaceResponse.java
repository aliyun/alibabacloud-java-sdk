// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteSagExpressConnectInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSagExpressConnectInterfaceResponseBody body;

    public static DeleteSagExpressConnectInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSagExpressConnectInterfaceResponse self = new DeleteSagExpressConnectInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSagExpressConnectInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSagExpressConnectInterfaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSagExpressConnectInterfaceResponse setBody(DeleteSagExpressConnectInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSagExpressConnectInterfaceResponseBody getBody() {
        return this.body;
    }

}
