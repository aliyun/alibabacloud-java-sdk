// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyTairAIGatewayPluginSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTairAIGatewayPluginSwitchResponseBody body;

    public static ModifyTairAIGatewayPluginSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTairAIGatewayPluginSwitchResponse self = new ModifyTairAIGatewayPluginSwitchResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTairAIGatewayPluginSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTairAIGatewayPluginSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTairAIGatewayPluginSwitchResponse setBody(ModifyTairAIGatewayPluginSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTairAIGatewayPluginSwitchResponseBody getBody() {
        return this.body;
    }

}
