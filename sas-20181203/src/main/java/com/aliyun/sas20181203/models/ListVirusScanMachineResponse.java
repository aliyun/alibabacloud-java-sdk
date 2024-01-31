// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVirusScanMachineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVirusScanMachineResponseBody body;

    public static ListVirusScanMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanMachineResponse self = new ListVirusScanMachineResponse();
        return TeaModel.build(map, self);
    }

    public ListVirusScanMachineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVirusScanMachineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVirusScanMachineResponse setBody(ListVirusScanMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVirusScanMachineResponseBody getBody() {
        return this.body;
    }

}
