// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateUnknownThreatDetectStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUnknownThreatDetectStrategyResponseBody body;

    public static UpdateUnknownThreatDetectStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUnknownThreatDetectStrategyResponse self = new UpdateUnknownThreatDetectStrategyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUnknownThreatDetectStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUnknownThreatDetectStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUnknownThreatDetectStrategyResponse setBody(UpdateUnknownThreatDetectStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUnknownThreatDetectStrategyResponseBody getBody() {
        return this.body;
    }

}
