// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnknownThreatDetectProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUnknownThreatDetectProcessResponseBody body;

    public static ListUnknownThreatDetectProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUnknownThreatDetectProcessResponse self = new ListUnknownThreatDetectProcessResponse();
        return TeaModel.build(map, self);
    }

    public ListUnknownThreatDetectProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUnknownThreatDetectProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUnknownThreatDetectProcessResponse setBody(ListUnknownThreatDetectProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUnknownThreatDetectProcessResponseBody getBody() {
        return this.body;
    }

}
