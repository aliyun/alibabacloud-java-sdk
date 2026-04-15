// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAlertDestinationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlertDestinationResponseBody body;

    public static GetAlertDestinationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlertDestinationResponse self = new GetAlertDestinationResponse();
        return TeaModel.build(map, self);
    }

    public GetAlertDestinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlertDestinationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlertDestinationResponse setBody(GetAlertDestinationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlertDestinationResponseBody getBody() {
        return this.body;
    }

}
