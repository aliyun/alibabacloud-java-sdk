// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyOpenLogShipperResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyOpenLogShipperResponse setBody(ModifyOpenLogShipperResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOpenLogShipperResponseBody getBody() {
        return this.body;
    }

}
