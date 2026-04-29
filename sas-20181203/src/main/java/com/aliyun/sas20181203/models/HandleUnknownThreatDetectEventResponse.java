// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleUnknownThreatDetectEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HandleUnknownThreatDetectEventResponseBody body;

    public static HandleUnknownThreatDetectEventResponse build(java.util.Map<String, ?> map) throws Exception {
        HandleUnknownThreatDetectEventResponse self = new HandleUnknownThreatDetectEventResponse();
        return TeaModel.build(map, self);
    }

    public HandleUnknownThreatDetectEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HandleUnknownThreatDetectEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HandleUnknownThreatDetectEventResponse setBody(HandleUnknownThreatDetectEventResponseBody body) {
        this.body = body;
        return this;
    }
    public HandleUnknownThreatDetectEventResponseBody getBody() {
        return this.body;
    }

}
