// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteUnknownThreatDetectStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUnknownThreatDetectStrategyResponseBody body;

    public static DeleteUnknownThreatDetectStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUnknownThreatDetectStrategyResponse self = new DeleteUnknownThreatDetectStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUnknownThreatDetectStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUnknownThreatDetectStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUnknownThreatDetectStrategyResponse setBody(DeleteUnknownThreatDetectStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUnknownThreatDetectStrategyResponseBody getBody() {
        return this.body;
    }

}
