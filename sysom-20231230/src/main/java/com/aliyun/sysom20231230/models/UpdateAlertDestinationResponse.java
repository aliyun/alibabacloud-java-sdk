// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateAlertDestinationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAlertDestinationResponseBody body;

    public static UpdateAlertDestinationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertDestinationResponse self = new UpdateAlertDestinationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlertDestinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlertDestinationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAlertDestinationResponse setBody(UpdateAlertDestinationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlertDestinationResponseBody getBody() {
        return this.body;
    }

}
