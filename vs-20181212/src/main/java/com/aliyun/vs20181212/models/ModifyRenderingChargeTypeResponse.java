// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyRenderingChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRenderingChargeTypeResponseBody body;

    public static ModifyRenderingChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRenderingChargeTypeResponse self = new ModifyRenderingChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRenderingChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRenderingChargeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRenderingChargeTypeResponse setBody(ModifyRenderingChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRenderingChargeTypeResponseBody getBody() {
        return this.body;
    }

}
