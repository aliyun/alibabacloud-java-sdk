// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateUnknownThreatDetectProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUnknownThreatDetectProcessResponseBody body;

    public static UpdateUnknownThreatDetectProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUnknownThreatDetectProcessResponse self = new UpdateUnknownThreatDetectProcessResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUnknownThreatDetectProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUnknownThreatDetectProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUnknownThreatDetectProcessResponse setBody(UpdateUnknownThreatDetectProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUnknownThreatDetectProcessResponseBody getBody() {
        return this.body;
    }

}
