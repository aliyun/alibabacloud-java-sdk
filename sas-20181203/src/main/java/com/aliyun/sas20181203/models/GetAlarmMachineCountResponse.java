// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAlarmMachineCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlarmMachineCountResponseBody body;

    public static GetAlarmMachineCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlarmMachineCountResponse self = new GetAlarmMachineCountResponse();
        return TeaModel.build(map, self);
    }

    public GetAlarmMachineCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlarmMachineCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlarmMachineCountResponse setBody(GetAlarmMachineCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlarmMachineCountResponseBody getBody() {
        return this.body;
    }

}
