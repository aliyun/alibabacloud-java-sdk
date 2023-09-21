// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateClientAlertModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateClientAlertModeResponseBody body;

    public static UpdateClientAlertModeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClientAlertModeResponse self = new UpdateClientAlertModeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClientAlertModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClientAlertModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateClientAlertModeResponse setBody(UpdateClientAlertModeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClientAlertModeResponseBody getBody() {
        return this.body;
    }

}
