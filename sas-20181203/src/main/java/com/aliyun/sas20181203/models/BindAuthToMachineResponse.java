// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BindAuthToMachineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindAuthToMachineResponseBody body;

    public static BindAuthToMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAuthToMachineResponse self = new BindAuthToMachineResponse();
        return TeaModel.build(map, self);
    }

    public BindAuthToMachineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAuthToMachineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindAuthToMachineResponse setBody(BindAuthToMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAuthToMachineResponseBody getBody() {
        return this.body;
    }

}
