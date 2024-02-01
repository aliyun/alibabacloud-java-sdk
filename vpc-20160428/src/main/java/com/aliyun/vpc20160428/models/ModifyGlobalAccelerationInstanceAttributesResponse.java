// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyGlobalAccelerationInstanceAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyGlobalAccelerationInstanceAttributesResponseBody body;

    public static ModifyGlobalAccelerationInstanceAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalAccelerationInstanceAttributesResponse self = new ModifyGlobalAccelerationInstanceAttributesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalAccelerationInstanceAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGlobalAccelerationInstanceAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGlobalAccelerationInstanceAttributesResponse setBody(ModifyGlobalAccelerationInstanceAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGlobalAccelerationInstanceAttributesResponseBody getBody() {
        return this.body;
    }

}
