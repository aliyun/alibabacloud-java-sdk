// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ConfirmConfigurationOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmConfigurationOrderResponseBody body;

    public static ConfirmConfigurationOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmConfigurationOrderResponse self = new ConfirmConfigurationOrderResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmConfigurationOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmConfigurationOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmConfigurationOrderResponse setBody(ConfirmConfigurationOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmConfigurationOrderResponseBody getBody() {
        return this.body;
    }

}
