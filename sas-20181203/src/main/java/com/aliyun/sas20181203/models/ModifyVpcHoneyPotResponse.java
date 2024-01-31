// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVpcHoneyPotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVpcHoneyPotResponseBody body;

    public static ModifyVpcHoneyPotResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcHoneyPotResponse self = new ModifyVpcHoneyPotResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpcHoneyPotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpcHoneyPotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVpcHoneyPotResponse setBody(ModifyVpcHoneyPotResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpcHoneyPotResponseBody getBody() {
        return this.body;
    }

}
