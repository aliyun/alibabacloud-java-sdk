// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckPolarClawSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckPolarClawSkillResponseBody body;

    public static CheckPolarClawSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckPolarClawSkillResponse self = new CheckPolarClawSkillResponse();
        return TeaModel.build(map, self);
    }

    public CheckPolarClawSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckPolarClawSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckPolarClawSkillResponse setBody(CheckPolarClawSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckPolarClawSkillResponseBody getBody() {
        return this.body;
    }

}
