// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class CreateConfigurationOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateConfigurationOrderResponseBody body;

    public static CreateConfigurationOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigurationOrderResponse self = new CreateConfigurationOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateConfigurationOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConfigurationOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConfigurationOrderResponse setBody(CreateConfigurationOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConfigurationOrderResponseBody getBody() {
        return this.body;
    }

}
