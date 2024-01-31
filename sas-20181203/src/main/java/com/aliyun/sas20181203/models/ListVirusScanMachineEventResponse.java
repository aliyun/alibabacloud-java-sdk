// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVirusScanMachineEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVirusScanMachineEventResponseBody body;

    public static ListVirusScanMachineEventResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanMachineEventResponse self = new ListVirusScanMachineEventResponse();
        return TeaModel.build(map, self);
    }

    public ListVirusScanMachineEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVirusScanMachineEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVirusScanMachineEventResponse setBody(ListVirusScanMachineEventResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVirusScanMachineEventResponseBody getBody() {
        return this.body;
    }

}
