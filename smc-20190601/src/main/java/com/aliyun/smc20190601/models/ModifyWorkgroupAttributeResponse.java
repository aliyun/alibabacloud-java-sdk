// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class ModifyWorkgroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWorkgroupAttributeResponseBody body;

    public static ModifyWorkgroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWorkgroupAttributeResponse self = new ModifyWorkgroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWorkgroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWorkgroupAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWorkgroupAttributeResponse setBody(ModifyWorkgroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWorkgroupAttributeResponseBody getBody() {
        return this.body;
    }

}
