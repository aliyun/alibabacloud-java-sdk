// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class DeleteMemorySkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMemorySkillResponseBody body;

    public static DeleteMemorySkillResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemorySkillResponse self = new DeleteMemorySkillResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMemorySkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMemorySkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMemorySkillResponse setBody(DeleteMemorySkillResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMemorySkillResponseBody getBody() {
        return this.body;
    }

}
