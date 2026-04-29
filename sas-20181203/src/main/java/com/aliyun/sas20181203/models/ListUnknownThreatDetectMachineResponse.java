// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnknownThreatDetectMachineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUnknownThreatDetectMachineResponseBody body;

    public static ListUnknownThreatDetectMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUnknownThreatDetectMachineResponse self = new ListUnknownThreatDetectMachineResponse();
        return TeaModel.build(map, self);
    }

    public ListUnknownThreatDetectMachineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUnknownThreatDetectMachineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUnknownThreatDetectMachineResponse setBody(ListUnknownThreatDetectMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUnknownThreatDetectMachineResponseBody getBody() {
        return this.body;
    }

}
