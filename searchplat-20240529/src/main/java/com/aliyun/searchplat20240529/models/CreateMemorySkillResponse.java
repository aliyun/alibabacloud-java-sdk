// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateMemorySkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMemorySkillResponseBody body;

    public static CreateMemorySkillResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMemorySkillResponse self = new CreateMemorySkillResponse();
        return TeaModel.build(map, self);
    }

    public CreateMemorySkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMemorySkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMemorySkillResponse setBody(CreateMemorySkillResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMemorySkillResponseBody getBody() {
        return this.body;
    }

}
