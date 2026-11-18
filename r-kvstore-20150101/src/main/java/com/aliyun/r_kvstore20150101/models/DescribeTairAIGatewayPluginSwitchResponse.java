// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairAIGatewayPluginSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTairAIGatewayPluginSwitchResponseBody body;

    public static DescribeTairAIGatewayPluginSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairAIGatewayPluginSwitchResponse self = new DescribeTairAIGatewayPluginSwitchResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTairAIGatewayPluginSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTairAIGatewayPluginSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTairAIGatewayPluginSwitchResponse setBody(DescribeTairAIGatewayPluginSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTairAIGatewayPluginSwitchResponseBody getBody() {
        return this.body;
    }

}
