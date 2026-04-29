// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateUnknownThreatDetectMachineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateUnknownThreatDetectMachineResponseBody body;

    public static OperateUnknownThreatDetectMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateUnknownThreatDetectMachineResponse self = new OperateUnknownThreatDetectMachineResponse();
        return TeaModel.build(map, self);
    }

    public OperateUnknownThreatDetectMachineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateUnknownThreatDetectMachineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateUnknownThreatDetectMachineResponse setBody(OperateUnknownThreatDetectMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateUnknownThreatDetectMachineResponseBody getBody() {
        return this.body;
    }

}
