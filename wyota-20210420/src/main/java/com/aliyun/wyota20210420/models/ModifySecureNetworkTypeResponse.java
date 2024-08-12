// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ModifySecureNetworkTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySecureNetworkTypeResponseBody body;

    public static ModifySecureNetworkTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecureNetworkTypeResponse self = new ModifySecureNetworkTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecureNetworkTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySecureNetworkTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySecureNetworkTypeResponse setBody(ModifySecureNetworkTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecureNetworkTypeResponseBody getBody() {
        return this.body;
    }

}
