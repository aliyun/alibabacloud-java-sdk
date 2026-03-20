// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCDeploymentSetAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRCDeploymentSetAttributeResponseBody body;

    public static ModifyRCDeploymentSetAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCDeploymentSetAttributeResponse self = new ModifyRCDeploymentSetAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRCDeploymentSetAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRCDeploymentSetAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRCDeploymentSetAttributeResponse setBody(ModifyRCDeploymentSetAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRCDeploymentSetAttributeResponseBody getBody() {
        return this.body;
    }

}
