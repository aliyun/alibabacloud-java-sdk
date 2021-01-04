// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyCloudConnectNetworkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCloudConnectNetworkResponseBody body;

    public static ModifyCloudConnectNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudConnectNetworkResponse self = new ModifyCloudConnectNetworkResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCloudConnectNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCloudConnectNetworkResponse setBody(ModifyCloudConnectNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCloudConnectNetworkResponseBody getBody() {
        return this.body;
    }

}
