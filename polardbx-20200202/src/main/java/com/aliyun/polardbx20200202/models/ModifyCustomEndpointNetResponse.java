// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyCustomEndpointNetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCustomEndpointNetResponseBody body;

    public static ModifyCustomEndpointNetResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomEndpointNetResponse self = new ModifyCustomEndpointNetResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCustomEndpointNetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCustomEndpointNetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCustomEndpointNetResponse setBody(ModifyCustomEndpointNetResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCustomEndpointNetResponseBody getBody() {
        return this.body;
    }

}
