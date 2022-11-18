// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateServiceAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateServiceAddressResponseBody body;

    public static CreateServiceAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceAddressResponse self = new CreateServiceAddressResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceAddressResponse setBody(CreateServiceAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceAddressResponseBody getBody() {
        return this.body;
    }

}
