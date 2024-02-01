// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVSwitchAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVSwitchAttributeResponseBody body;

    public static ModifyVSwitchAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVSwitchAttributeResponse self = new ModifyVSwitchAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVSwitchAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVSwitchAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVSwitchAttributeResponse setBody(ModifyVSwitchAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVSwitchAttributeResponseBody getBody() {
        return this.body;
    }

}
