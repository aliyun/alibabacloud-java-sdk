// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckItemWarningMachineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCheckItemWarningMachineResponseBody body;

    public static ListCheckItemWarningMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCheckItemWarningMachineResponse self = new ListCheckItemWarningMachineResponse();
        return TeaModel.build(map, self);
    }

    public ListCheckItemWarningMachineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCheckItemWarningMachineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCheckItemWarningMachineResponse setBody(ListCheckItemWarningMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCheckItemWarningMachineResponseBody getBody() {
        return this.body;
    }

}
