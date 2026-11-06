// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarClawSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePolarClawSkillResponseBody body;

    public static CreatePolarClawSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarClawSkillResponse self = new CreatePolarClawSkillResponse();
        return TeaModel.build(map, self);
    }

    public CreatePolarClawSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePolarClawSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePolarClawSkillResponse setBody(CreatePolarClawSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePolarClawSkillResponseBody getBody() {
        return this.body;
    }

}
