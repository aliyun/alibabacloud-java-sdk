// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateIpv4GatewayAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIpv4GatewayAttributeResponseBody body;

    public static UpdateIpv4GatewayAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpv4GatewayAttributeResponse self = new UpdateIpv4GatewayAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIpv4GatewayAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIpv4GatewayAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIpv4GatewayAttributeResponse setBody(UpdateIpv4GatewayAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIpv4GatewayAttributeResponseBody getBody() {
        return this.body;
    }

}
