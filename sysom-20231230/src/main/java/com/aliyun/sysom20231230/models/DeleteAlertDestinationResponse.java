// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class DeleteAlertDestinationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAlertDestinationResponseBody body;

    public static DeleteAlertDestinationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertDestinationResponse self = new DeleteAlertDestinationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertDestinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlertDestinationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlertDestinationResponse setBody(DeleteAlertDestinationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertDestinationResponseBody getBody() {
        return this.body;
    }

}
