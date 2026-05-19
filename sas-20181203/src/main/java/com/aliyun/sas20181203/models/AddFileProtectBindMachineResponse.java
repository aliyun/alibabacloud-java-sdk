// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddFileProtectBindMachineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddFileProtectBindMachineResponseBody body;

    public static AddFileProtectBindMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFileProtectBindMachineResponse self = new AddFileProtectBindMachineResponse();
        return TeaModel.build(map, self);
    }

    public AddFileProtectBindMachineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFileProtectBindMachineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFileProtectBindMachineResponse setBody(AddFileProtectBindMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFileProtectBindMachineResponseBody getBody() {
        return this.body;
    }

}
