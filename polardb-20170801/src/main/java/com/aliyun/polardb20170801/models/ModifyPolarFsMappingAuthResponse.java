// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyPolarFsMappingAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPolarFsMappingAuthResponseBody body;

    public static ModifyPolarFsMappingAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolarFsMappingAuthResponse self = new ModifyPolarFsMappingAuthResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPolarFsMappingAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPolarFsMappingAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPolarFsMappingAuthResponse setBody(ModifyPolarFsMappingAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPolarFsMappingAuthResponseBody getBody() {
        return this.body;
    }

}
