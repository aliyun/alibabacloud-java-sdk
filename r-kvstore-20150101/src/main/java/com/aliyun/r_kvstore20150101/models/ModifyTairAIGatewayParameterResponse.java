// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyTairAIGatewayParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTairAIGatewayParameterResponseBody body;

    public static ModifyTairAIGatewayParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTairAIGatewayParameterResponse self = new ModifyTairAIGatewayParameterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTairAIGatewayParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTairAIGatewayParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTairAIGatewayParameterResponse setBody(ModifyTairAIGatewayParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTairAIGatewayParameterResponseBody getBody() {
        return this.body;
    }

}
