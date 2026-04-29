// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateUnknownThreatDetectStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUnknownThreatDetectStrategyResponseBody body;

    public static CreateUnknownThreatDetectStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUnknownThreatDetectStrategyResponse self = new CreateUnknownThreatDetectStrategyResponse();
        return TeaModel.build(map, self);
    }

    public CreateUnknownThreatDetectStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUnknownThreatDetectStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUnknownThreatDetectStrategyResponse setBody(CreateUnknownThreatDetectStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUnknownThreatDetectStrategyResponseBody getBody() {
        return this.body;
    }

}
