// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateASMGatewayImportedServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateASMGatewayImportedServicesResponseBody body;

    public static UpdateASMGatewayImportedServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateASMGatewayImportedServicesResponse self = new UpdateASMGatewayImportedServicesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateASMGatewayImportedServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateASMGatewayImportedServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateASMGatewayImportedServicesResponse setBody(UpdateASMGatewayImportedServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateASMGatewayImportedServicesResponseBody getBody() {
        return this.body;
    }

}
