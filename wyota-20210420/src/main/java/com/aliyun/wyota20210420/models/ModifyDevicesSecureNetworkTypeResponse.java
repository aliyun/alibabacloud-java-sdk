// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ModifyDevicesSecureNetworkTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDevicesSecureNetworkTypeResponseBody body;

    public static ModifyDevicesSecureNetworkTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDevicesSecureNetworkTypeResponse self = new ModifyDevicesSecureNetworkTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDevicesSecureNetworkTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDevicesSecureNetworkTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDevicesSecureNetworkTypeResponse setBody(ModifyDevicesSecureNetworkTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDevicesSecureNetworkTypeResponseBody getBody() {
        return this.body;
    }

}
