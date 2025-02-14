// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyServerlessAuthToMachineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyServerlessAuthToMachineResponseBody body;

    public static ModifyServerlessAuthToMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyServerlessAuthToMachineResponse self = new ModifyServerlessAuthToMachineResponse();
        return TeaModel.build(map, self);
    }

    public ModifyServerlessAuthToMachineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyServerlessAuthToMachineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyServerlessAuthToMachineResponse setBody(ModifyServerlessAuthToMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyServerlessAuthToMachineResponseBody getBody() {
        return this.body;
    }

}
