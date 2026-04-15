// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateAlertDestinationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAlertDestinationResponseBody body;

    public static CreateAlertDestinationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertDestinationResponse self = new CreateAlertDestinationResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlertDestinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlertDestinationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAlertDestinationResponse setBody(CreateAlertDestinationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlertDestinationResponseBody getBody() {
        return this.body;
    }

}
