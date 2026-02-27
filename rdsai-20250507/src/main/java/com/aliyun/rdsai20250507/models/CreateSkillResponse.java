// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSkillResponseBody body;

    public static CreateSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillResponse self = new CreateSkillResponse();
        return TeaModel.build(map, self);
    }

    public CreateSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSkillResponse setBody(CreateSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSkillResponseBody getBody() {
        return this.body;
    }

}
