// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectTrafficQosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyExpressConnectTrafficQosResponseBody body;

    public static ModifyExpressConnectTrafficQosResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressConnectTrafficQosResponse self = new ModifyExpressConnectTrafficQosResponse();
        return TeaModel.build(map, self);
    }

    public ModifyExpressConnectTrafficQosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyExpressConnectTrafficQosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyExpressConnectTrafficQosResponse setBody(ModifyExpressConnectTrafficQosResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyExpressConnectTrafficQosResponseBody getBody() {
        return this.body;
    }

}
