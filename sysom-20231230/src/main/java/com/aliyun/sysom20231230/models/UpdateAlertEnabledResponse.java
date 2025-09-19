// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateAlertEnabledResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAlertEnabledResponseBody body;

    public static UpdateAlertEnabledResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertEnabledResponse self = new UpdateAlertEnabledResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlertEnabledResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlertEnabledResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAlertEnabledResponse setBody(UpdateAlertEnabledResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlertEnabledResponseBody getBody() {
        return this.body;
    }

}
