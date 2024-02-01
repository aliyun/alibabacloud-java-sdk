// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyGlobalAccelerationInstanceSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyGlobalAccelerationInstanceSpecResponseBody body;

    public static ModifyGlobalAccelerationInstanceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalAccelerationInstanceSpecResponse self = new ModifyGlobalAccelerationInstanceSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalAccelerationInstanceSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGlobalAccelerationInstanceSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGlobalAccelerationInstanceSpecResponse setBody(ModifyGlobalAccelerationInstanceSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGlobalAccelerationInstanceSpecResponseBody getBody() {
        return this.body;
    }

}
