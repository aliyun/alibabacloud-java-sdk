// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyFlowLogAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyFlowLogAttributeResponseBody body;

    public static ModifyFlowLogAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowLogAttributeResponse self = new ModifyFlowLogAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFlowLogAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFlowLogAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFlowLogAttributeResponse setBody(ModifyFlowLogAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFlowLogAttributeResponseBody getBody() {
        return this.body;
    }

}
