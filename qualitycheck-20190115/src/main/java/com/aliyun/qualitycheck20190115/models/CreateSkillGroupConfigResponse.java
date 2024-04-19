// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateSkillGroupConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSkillGroupConfigResponseBody body;

    public static CreateSkillGroupConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillGroupConfigResponse self = new CreateSkillGroupConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateSkillGroupConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSkillGroupConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSkillGroupConfigResponse setBody(CreateSkillGroupConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSkillGroupConfigResponseBody getBody() {
        return this.body;
    }

}
