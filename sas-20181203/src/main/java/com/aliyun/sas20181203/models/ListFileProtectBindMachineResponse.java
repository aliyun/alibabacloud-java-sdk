// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectBindMachineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFileProtectBindMachineResponseBody body;

    public static ListFileProtectBindMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectBindMachineResponse self = new ListFileProtectBindMachineResponse();
        return TeaModel.build(map, self);
    }

    public ListFileProtectBindMachineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFileProtectBindMachineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFileProtectBindMachineResponse setBody(ListFileProtectBindMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFileProtectBindMachineResponseBody getBody() {
        return this.body;
    }

}
