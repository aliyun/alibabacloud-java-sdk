// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulTargetConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyVulTargetConfigResponseBody body;

    public static ModifyVulTargetConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVulTargetConfigResponse self = new ModifyVulTargetConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVulTargetConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVulTargetConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVulTargetConfigResponse setBody(ModifyVulTargetConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVulTargetConfigResponseBody getBody() {
        return this.body;
    }

}
