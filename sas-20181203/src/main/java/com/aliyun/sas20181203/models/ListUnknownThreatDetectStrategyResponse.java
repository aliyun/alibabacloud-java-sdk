// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnknownThreatDetectStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUnknownThreatDetectStrategyResponseBody body;

    public static ListUnknownThreatDetectStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUnknownThreatDetectStrategyResponse self = new ListUnknownThreatDetectStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ListUnknownThreatDetectStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUnknownThreatDetectStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUnknownThreatDetectStrategyResponse setBody(ListUnknownThreatDetectStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUnknownThreatDetectStrategyResponseBody getBody() {
        return this.body;
    }

}
