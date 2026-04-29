// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteUnknownThreatDetectProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUnknownThreatDetectProcessResponseBody body;

    public static DeleteUnknownThreatDetectProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUnknownThreatDetectProcessResponse self = new DeleteUnknownThreatDetectProcessResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUnknownThreatDetectProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUnknownThreatDetectProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUnknownThreatDetectProcessResponse setBody(DeleteUnknownThreatDetectProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUnknownThreatDetectProcessResponseBody getBody() {
        return this.body;
    }

}
