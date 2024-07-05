// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyDeviceChannelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDeviceChannelsResponseBody body;

    public static ModifyDeviceChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceChannelsResponse self = new ModifyDeviceChannelsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDeviceChannelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDeviceChannelsResponse setBody(ModifyDeviceChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDeviceChannelsResponseBody getBody() {
        return this.body;
    }

}
