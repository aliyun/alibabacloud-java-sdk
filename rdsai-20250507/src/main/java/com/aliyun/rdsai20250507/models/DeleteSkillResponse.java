// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSkillResponseBody body;

    public static DeleteSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSkillResponse self = new DeleteSkillResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSkillResponse setBody(DeleteSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSkillResponseBody getBody() {
        return this.body;
    }

}
