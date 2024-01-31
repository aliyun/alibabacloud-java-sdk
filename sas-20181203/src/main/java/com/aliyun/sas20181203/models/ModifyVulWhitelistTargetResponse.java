// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulWhitelistTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVulWhitelistTargetResponseBody body;

    public static ModifyVulWhitelistTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVulWhitelistTargetResponse self = new ModifyVulWhitelistTargetResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVulWhitelistTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVulWhitelistTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVulWhitelistTargetResponse setBody(ModifyVulWhitelistTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVulWhitelistTargetResponseBody getBody() {
        return this.body;
    }

}
