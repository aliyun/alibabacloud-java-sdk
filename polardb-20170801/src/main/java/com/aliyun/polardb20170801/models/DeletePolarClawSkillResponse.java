// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeletePolarClawSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePolarClawSkillResponseBody body;

    public static DeletePolarClawSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolarClawSkillResponse self = new DeletePolarClawSkillResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolarClawSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolarClawSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePolarClawSkillResponse setBody(DeletePolarClawSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolarClawSkillResponseBody getBody() {
        return this.body;
    }

}
