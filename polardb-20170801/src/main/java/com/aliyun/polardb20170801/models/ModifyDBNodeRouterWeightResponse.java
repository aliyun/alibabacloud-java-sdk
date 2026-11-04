// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodeRouterWeightResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBNodeRouterWeightResponseBody body;

    public static ModifyDBNodeRouterWeightResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodeRouterWeightResponse self = new ModifyDBNodeRouterWeightResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodeRouterWeightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBNodeRouterWeightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBNodeRouterWeightResponse setBody(ModifyDBNodeRouterWeightResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBNodeRouterWeightResponseBody getBody() {
        return this.body;
    }

}
