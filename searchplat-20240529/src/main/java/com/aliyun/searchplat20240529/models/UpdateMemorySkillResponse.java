// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class UpdateMemorySkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMemorySkillResponseBody body;

    public static UpdateMemorySkillResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemorySkillResponse self = new UpdateMemorySkillResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMemorySkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMemorySkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMemorySkillResponse setBody(UpdateMemorySkillResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMemorySkillResponseBody getBody() {
        return this.body;
    }

}
