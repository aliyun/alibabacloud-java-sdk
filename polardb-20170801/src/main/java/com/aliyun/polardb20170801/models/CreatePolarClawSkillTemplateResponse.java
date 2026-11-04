// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarClawSkillTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePolarClawSkillTemplateResponseBody body;

    public static CreatePolarClawSkillTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarClawSkillTemplateResponse self = new CreatePolarClawSkillTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreatePolarClawSkillTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePolarClawSkillTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePolarClawSkillTemplateResponse setBody(CreatePolarClawSkillTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePolarClawSkillTemplateResponseBody getBody() {
        return this.body;
    }

}
