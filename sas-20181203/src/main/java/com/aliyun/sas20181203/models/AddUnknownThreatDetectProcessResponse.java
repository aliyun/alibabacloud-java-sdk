// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddUnknownThreatDetectProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddUnknownThreatDetectProcessResponseBody body;

    public static AddUnknownThreatDetectProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUnknownThreatDetectProcessResponse self = new AddUnknownThreatDetectProcessResponse();
        return TeaModel.build(map, self);
    }

    public AddUnknownThreatDetectProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUnknownThreatDetectProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUnknownThreatDetectProcessResponse setBody(AddUnknownThreatDetectProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUnknownThreatDetectProcessResponseBody getBody() {
        return this.body;
    }

}
