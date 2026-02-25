// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyChargeTypeResponseBody body;

    public static ModifyChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyChargeTypeResponse self = new ModifyChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyChargeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyChargeTypeResponse setBody(ModifyChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyChargeTypeResponseBody getBody() {
        return this.body;
    }

}
