// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyCustomEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCustomEndpointResponseBody body;

    public static ModifyCustomEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomEndpointResponse self = new ModifyCustomEndpointResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCustomEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCustomEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCustomEndpointResponse setBody(ModifyCustomEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCustomEndpointResponseBody getBody() {
        return this.body;
    }

}
