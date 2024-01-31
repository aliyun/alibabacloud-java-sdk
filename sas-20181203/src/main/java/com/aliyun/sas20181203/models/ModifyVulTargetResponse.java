// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVulTargetResponseBody body;

    public static ModifyVulTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVulTargetResponse self = new ModifyVulTargetResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVulTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVulTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVulTargetResponse setBody(ModifyVulTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVulTargetResponseBody getBody() {
        return this.body;
    }

}
