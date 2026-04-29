// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetUnknownThreatDetectStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUnknownThreatDetectStatisticResponseBody body;

    public static GetUnknownThreatDetectStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUnknownThreatDetectStatisticResponse self = new GetUnknownThreatDetectStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetUnknownThreatDetectStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUnknownThreatDetectStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUnknownThreatDetectStatisticResponse setBody(GetUnknownThreatDetectStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUnknownThreatDetectStatisticResponseBody getBody() {
        return this.body;
    }

}
