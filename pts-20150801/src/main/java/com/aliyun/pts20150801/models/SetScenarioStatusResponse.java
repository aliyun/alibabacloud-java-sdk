// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class SetScenarioStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetScenarioStatusResponseBody body;

    public static SetScenarioStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetScenarioStatusResponse self = new SetScenarioStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetScenarioStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetScenarioStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetScenarioStatusResponse setBody(SetScenarioStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetScenarioStatusResponseBody getBody() {
        return this.body;
    }

}
