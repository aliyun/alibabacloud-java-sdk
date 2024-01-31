// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVulConfigResponseBody body;

    public static ModifyVulConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVulConfigResponse self = new ModifyVulConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVulConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVulConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVulConfigResponse setBody(ModifyVulConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVulConfigResponseBody getBody() {
        return this.body;
    }

}
