// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyPolarClawSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPolarClawSkillResponseBody body;

    public static ModifyPolarClawSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolarClawSkillResponse self = new ModifyPolarClawSkillResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPolarClawSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPolarClawSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPolarClawSkillResponse setBody(ModifyPolarClawSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPolarClawSkillResponseBody getBody() {
        return this.body;
    }

}
