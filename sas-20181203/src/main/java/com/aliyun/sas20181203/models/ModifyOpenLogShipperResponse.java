// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyOpenLogShipperResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyOpenLogShipperResponseBody body;

    public static ModifyOpenLogShipperResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOpenLogShipperResponse self = new ModifyOpenLogShipperResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOpenLogShipperResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOpenLogShipperResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOpenLogShipperResponse setBody(ModifyOpenLogShipperResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOpenLogShipperResponseBody getBody() {
        return this.body;
    }

}
