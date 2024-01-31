// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RebootMachineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebootMachineResponseBody body;

    public static RebootMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootMachineResponse self = new RebootMachineResponse();
        return TeaModel.build(map, self);
    }

    public RebootMachineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootMachineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebootMachineResponse setBody(RebootMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootMachineResponseBody getBody() {
        return this.body;
    }

}
